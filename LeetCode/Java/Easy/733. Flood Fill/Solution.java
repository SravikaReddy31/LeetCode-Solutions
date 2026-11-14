class Solution {
    void find(int[][] image, int i, int j, int src_color, int tar_color) {
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length)
            return;
        if(image[i][j] != src_color)
            return;
        image[i][j] = tar_color;
        find(image, i+1, j, src_color, tar_color);
        find(image, i, j+1, src_color, tar_color);
        find(image, i, j-1, src_color, tar_color);
        find(image, i-1, j, src_color, tar_color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int src_color = image[sr][sc];
        if(src_color == color)
            return image;
        find(image, sr, sc, src_color, color);
        return image;
    }
}
