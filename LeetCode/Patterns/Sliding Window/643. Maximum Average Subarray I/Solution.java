class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double avg = 0, sum = 0, max = 0;
        for(int i=0;i<k;i++) {
            sum += arr[i];
        }
        max = sum / k;
        for(int i=k;i<arr.length;i++) {
            sum -= arr[i-k];
            sum += arr[i];
            avg = sum / k;
            max = Math.max(max, avg);
        }
        return max;
    }
}