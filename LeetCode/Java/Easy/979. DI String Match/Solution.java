class Solution {
    public int[] diStringMatch(String s) {
        int arr[] = new int[s.length()+1];
        int i=0;
        int j=s.length();
        int k=0;
        for(int x=0;x<s.length();x++) {
            if(s.charAt(x) == 'I') {
                arr[k++] = i++;
            } else {
                arr[k++] = j--;
            }
        }
        arr[k]=i;
        return arr;
    }
}