class Solution {
    public int thirdMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                thirdmax = secondMax;
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax) {
                thirdmax = secondMax;
                secondMax = arr[i];
            } else {
                thirdmax = arr[i];
            }
        }
        if (thirdmax == Integer.MIN_VALUE) {
            return max;
        }
        return thirdmax;
    }
}