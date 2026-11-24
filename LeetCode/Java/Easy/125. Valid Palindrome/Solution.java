class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String s2 = "";
        for(int i=0; i<s.length(); i++) {
            if((s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i) >= 'a' && s.charAt(i) < 'z') {
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
/* class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0, right = s.length() - 1;
        while(left < right){
            char head = s.charAt(left);
            char tail = s.charAt(right);
            if(head >= 'A' && head <= 'Z') head = (char)(head + 32);
            else if(!((head >= 'a' && head <= 'z') || (head >= '0' && head <= '9'))){
                left++;
                continue;
            }
            if(tail >= 'A' && tail <= 'Z') tail = (char)(tail + 32);
            else if (!((tail >= 'a' && tail <= 'z') || (tail >= '0' && tail <='9'))){
                right--;
                continue;
            }
            if(head != tail) return false;
            left++;
            right--; 
        }

        return true;
    }
} */