class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int arr[] = new int[n+1];
        int i=0;
        int k=0;
        while(k<s.length()) {
            if(s.charAt(k) == 'I') {
                arr[k] = i;
                i++;
            }else {
                arr[k] = n;
                n--;
            }
            k++;
        } 
        /* for(int x=0;x<s.length();x++) {
            if(s.charAt(x) == 'I') {
                arr[k++] = i++;
            } else {
                arr[k++] = j--;
            }
        }*/
        arr[k]=i;
        return arr;
    }
}