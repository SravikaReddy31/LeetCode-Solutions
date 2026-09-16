class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int i;
        for(i=1;i<num/2;i++) {
            if(num % i == 0) {
                sum = sum + i;
            }
        }
        if(sum == i) return true;
        else return false;
    }
}