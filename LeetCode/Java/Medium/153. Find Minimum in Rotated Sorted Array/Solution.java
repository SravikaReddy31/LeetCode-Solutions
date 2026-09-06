class Solution {
    public int findMin(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int min = -1;
        int mid = left + (right-left)/2;
        if(arr[left]<=arr[right]) {
            min = arr[left];        
        }else if(arr[mid+1] <= arr[right]) {
            min = arr[mid+1];
        }
        return min;
    }
}