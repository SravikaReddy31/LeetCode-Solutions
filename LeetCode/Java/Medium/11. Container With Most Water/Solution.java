class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int j = height.length-1;
        int i=0;
        while(i<=j) {
            int len = Math.min(height[i], height[j]);
            int b = j-i;
            int area = len * b;
            if(area > max) max=area;
            if(height[i]>height[j]) j--;
            else i++;
        }
        return max;
    }
}