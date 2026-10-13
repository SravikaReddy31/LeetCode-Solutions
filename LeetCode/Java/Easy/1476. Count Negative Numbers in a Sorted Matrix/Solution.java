/* class Solution {
    public int countNegatives(int[][] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
} */

class Solution {
    public int countNegatives(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int i = 0;
        int j = n - 1;
        int count = 0;

        while (i < m && j >= 0) {
            if (arr[i][j] < 0) {
                count += m - i;
                j--;
            } else {
                i++;
            }
        }

        return count;
    }
}
