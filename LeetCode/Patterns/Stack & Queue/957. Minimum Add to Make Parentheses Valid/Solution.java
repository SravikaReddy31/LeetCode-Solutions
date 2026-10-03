class Solution {
    public int minAddToMakeValid(String s) {
        int c = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                c++;
            }
        }
        return c;
    }
}