class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        String str = "";
        String ans = "";
        for(String s : strs) {
            if(s.length()<min) {min = s.length(); str = s;} 
        }
        for(int i=0;i<min;i++) {
            for(int j=0;j<strs.length;j++) {
                if(strs[j].charAt(i) != str.charAt(i)) return ans;
            }
            ans += str.charAt(i);
        }
        return ans;
    }
}












/* String s2 = s1[0];
        for(int i=1; i<s1.length; i++) {
            while(s1[i].indexOf(s2) != 0) {
                s2 = s2.substring(0, s2.length()-1);
            }
            if(s2.isEmpty()) {
                return "";
            }
        }
        return s2; */