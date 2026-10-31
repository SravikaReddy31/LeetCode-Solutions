class Solution {
    int rob(int nums[], int idx) {
        if(idx >= nums.length) return 0;
        int rob = nums[idx] + rob(nums, idx+2);
        int nrob = rob(nums, idx+1);
        return Math.max(rob, nrob);
    }
    public int rob(int[] nums) {
        return Math.max(rob(nums,0), rob(nums, 1));
    }
}