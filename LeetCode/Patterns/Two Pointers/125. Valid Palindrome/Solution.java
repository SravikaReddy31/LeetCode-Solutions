class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        s = s.toLowerCase();
        String s2 = "";
        for(int i=0; i<n; i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                s2 = s2 + s.charAt(i);
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) < 'z') {
                s2 = s2 + s.charAt(i);
            }
        }
        int j = s2.length() - 1;
        for(int i=0;i<s2.length();i++) {
            if (s2.charAt(i) != s2.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}