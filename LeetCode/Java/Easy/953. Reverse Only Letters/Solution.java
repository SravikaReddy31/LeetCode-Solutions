class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a = s.toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j) {
            if(!Character.isLetter(a[i])) {
                i++;
                continue;
            }
            if(!Character.isLetter(a[j])) {
                j--;
                continue;
            }
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return new String(a);
    }
}