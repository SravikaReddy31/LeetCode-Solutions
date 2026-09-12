class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i=0;
        int j=s.length() - 1;
        String vowel = "aeiouAEIOU";
        while(i<j) {
            while (i<j && vowel.indexOf(a[i]) == -1) 
                i++;
            while (i<j && vowel.indexOf(a[j]) == -1) 
                j--;
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return new String(a);
    }
}