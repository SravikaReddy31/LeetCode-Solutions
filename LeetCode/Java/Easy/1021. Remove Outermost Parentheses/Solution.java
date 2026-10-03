class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int c = 0; int n = s.length();
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                if(c > 0) {
                    ans += ch;
                }
                c++;
            } else {
                c--;
                if(c > 0) {
                    ans += ch;
                }
            }
        }
        return ans;
    }
}