class Solution {
    public int addDigits(int num) {
        /* while(num >= 10) {
            int sum = 0;
            while(num > 0) {
                int rem = num % 10;
                sum = sum + rem;
                num /= 10;
            }
            num = sum;
        }
        return num; */
        if(num == 0) return 0;
        if(num % 9 == 0) return 9;
        return num % 9;
    } 
}