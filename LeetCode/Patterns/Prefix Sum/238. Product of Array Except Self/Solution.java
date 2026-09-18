class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix [] = new int[n];
        int sufix [] = new int[n];
        prefix[0] = 1;
        sufix[n-1] = 1;
        for(int i=1;i<n;i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i=n-2;i>=0;i--) {
            sufix[i] = sufix[i+1] * nums[i+1];
        }
        for(int i=0;i<n;i++) {
            nums[i] = prefix[i] * sufix[i];
        }
        return nums;
        /* int count = 0;
        int prod = 1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) count++;
            else prod *= nums[i];
        }
        if(count > 1) {Arrays.fill(nums, 0); return nums;}
        else if (count == 1) {
            for(int i=0;i<nums.length;i++) {
                if(nums[i] == 0) nums[i] = prod;
                else nums[i] = 0;
            }
        }
        else if(count == 0) {
            for(int i=0;i<nums.length;i++) {
                nums[i] = prod / nums[i];
            }
        }
        return nums; */
    }
}