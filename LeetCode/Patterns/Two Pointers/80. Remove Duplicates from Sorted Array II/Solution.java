class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr.length <= 2) {
            return arr.length;
        }
        int i = 0, j = 1;
        int c = 1, k = 1;
        while (j < arr.length) {
            if (arr[j] == arr[i]) {
                c++;
            } else {
                c = 1;
                i = k;
            }
            if (c <= 2) {
                arr[k] = arr[j];
                k++;
            }
            j++;
        }
        return k;
    }
}