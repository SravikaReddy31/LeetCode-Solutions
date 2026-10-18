
class Solution {
    public int thirdMax(int[] arr) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max || arr[i] == secondMax || arr[i] == thirdMax) {
                continue;
            }
            if (arr[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax) {
                thirdMax = arr[i];
            }
        }
        if (thirdMax == Long.MIN_VALUE) {
            return (int) max;
        }
        return (int) thirdMax;
    }
}
