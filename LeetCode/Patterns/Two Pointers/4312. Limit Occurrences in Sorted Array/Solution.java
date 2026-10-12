class Solution {
    public int limitOccurrences(int[] nums, int k) {
        int count = 1;
        int index = 1;
        if (k == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= k) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}