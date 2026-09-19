class Solution {
    public boolean isValid(String s) {
        int old = -1;
        int n = s.length();
        while(old!=n) {
            old = s.length();
            s=s.replace("[]", "");
            s=s.replace("()", "");
            s=s.replace("{}", "");
            n=s.length();
        }
        return s.isEmpty();
    }
}