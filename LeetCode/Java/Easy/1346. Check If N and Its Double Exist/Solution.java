class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            int d = arr[i]*2;
            for(int j=0;j<arr.length;j++) {
                if(d == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}