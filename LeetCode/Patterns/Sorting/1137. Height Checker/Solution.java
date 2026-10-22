class Solution {
    public int heightChecker(int[] heights) {
        int[] arr2 = heights.clone();
        Arrays.sort(arr2);
        int count = 0;
        int i=0;
        int j=0;
        while(i<heights.length && j<arr2.length) {
            if(heights[i] != arr2[j]) {
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}