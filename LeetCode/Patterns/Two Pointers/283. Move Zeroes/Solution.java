class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int k=0;k<nums.length;k++) {
            if(nums[k] != 0) {
                nums[i] = nums[k];
                i++;
            }
        }
        for(int j=i; j<nums.length;j++) {
            nums[j] = 0;
        }
    }
}