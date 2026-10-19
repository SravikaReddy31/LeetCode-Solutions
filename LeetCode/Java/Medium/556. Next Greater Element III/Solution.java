class Solution {
    public int nextGreaterElement(int n) {
        int temp = n;
        int rev = 0;
        while(n != 0) {
            int rem = n % 10;
            rev = rev*10 + rem;
            n /= 10;
        }
        if(rev > temp) {
            return rev;
        } else {
            return -1;
        }
    }
}