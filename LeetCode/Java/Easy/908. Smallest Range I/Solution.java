class Solution {
    public int smallestRangeI(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        int ans1 = min + k;
        int ans2 = max - k;
        int result = ans2 - ans1;
        if(result < 0) {
            return 0;
        }
        return result;
    }
}