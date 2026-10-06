class Solution {
    public String compressedString(String s) {
        String ans = "";
        int i=0, j=0;
        int count=0;
        while(j<s.length()) {
            if(s.charAt(i) == s.charAt(j) && count != 9) {
                count++;
                j++;
            } else {
                ans += ""+count+s.charAt(i);
                i=j;
                count = 0;
            }
        }
        ans += ""+count+s.charAt(i);
        return ans;
    }
}