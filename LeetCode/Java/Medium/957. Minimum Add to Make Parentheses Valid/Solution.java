class Solution {
    public int minAddToMakeValid(String s) {

        int cc = 0;
        int oc = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                oc++;
            } 
            else {
                if (oc > 0) {
                    oc--;
                } 
                else {
                    cc++;
                }
            }
        }

        ans = oc + cc;

        return ans;
    }
}

/* class Solution {
    public int minAddToMakeValid(String s) {
        int cc=0; int oc=0; int ans = 0;
        for(int i = 0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                oc++;
            } else {
                cc++;
            }
        }
        if(oc > cc) {
            ans = oc - cc;
        } else {
            ans = cc - oc;
        }
        return ans;
    }
} */
