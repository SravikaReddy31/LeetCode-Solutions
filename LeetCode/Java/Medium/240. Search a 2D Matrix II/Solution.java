/* class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
} */
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int i = 0;
        int j = arr[0].length - 1;
        while(i < arr.length && j >= 0) {
            if(arr[i][j] == target) {
                return true;
            } else if(arr[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}




