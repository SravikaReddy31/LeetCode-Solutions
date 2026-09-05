class Solution {
    public void moveZeroes(int[] arr) {
        int slow=0;
        for(int fast=0;fast<arr.length;fast++) {
            if(arr[fast] != 0) {
                arr[slow] = arr[fast];
                slow++;
            }
        }
        for (int i = slow; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}