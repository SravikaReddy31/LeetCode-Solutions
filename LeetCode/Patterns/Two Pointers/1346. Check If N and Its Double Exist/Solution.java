class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]*2 == arr[j]) {
                return true;
            } else 
        }
        return false;
    }
}