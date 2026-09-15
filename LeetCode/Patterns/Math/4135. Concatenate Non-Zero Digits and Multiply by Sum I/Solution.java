class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long rev = 0;
        while (n != 0) {
            long rem = n % 10;
            if(rem != 0) {
                rev = rev*10+rem;
            }
            n /= 10;
        }
        long rev2 = 0;
        while (rev != 0) {
            long rem = rev % 10;
            rev2 = rev2*10 + rev % 10;
            sum = sum + rem;
            rev = rev / 10;
        }
        return rev2 * sum;
    }
}