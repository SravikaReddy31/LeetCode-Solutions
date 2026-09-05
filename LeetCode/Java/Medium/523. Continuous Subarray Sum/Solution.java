class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for(int j=i;j<arr.length;j++) {
                sum += arr[j];
                if(sum == k) {
                    return true;
                }
            }
        }
        return false;
    }
}