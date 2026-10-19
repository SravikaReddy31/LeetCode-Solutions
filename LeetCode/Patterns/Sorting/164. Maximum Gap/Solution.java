class Solution {
    public int maximumGap(int[] nums) {
        int diff = 0, diff2 = 0;
        Arrays.sort(nums);
        if(nums.length < 2) {
            return 0;
        }
        int i=0, j=i+1;
        while(i<nums.length && j<nums.length) {
            diff = Math.abs(nums[i] - nums[j]);
            if
            i++;
            j++;
        }
        return Math.max(diff, diff2);
    }
}