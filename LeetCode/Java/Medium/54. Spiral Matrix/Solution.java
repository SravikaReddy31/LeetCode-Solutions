
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        int top = 0; //row
        int bottom = matrix.length - 1; //last row
        int left = 0; //col
        int right = matrix[0].length - 1; //last col
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                al.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                al.add(matrix[i][right]);
            }
            right--;
            if (top < bottom) {
                for (int i = right; i >= left; i--) {
                    al.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left < right) {
                for (int i = bottom; i >= top; i--) {
                    al.add(matrix[i][left]);
                }
                left++;
            }
        }
        return al;
    }
}
