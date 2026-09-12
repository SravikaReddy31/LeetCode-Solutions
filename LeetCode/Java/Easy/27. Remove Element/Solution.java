class Solution {
    public int removeElement(int[] num, int val) {
        int slow=0;
        for(int fast=0;fast<num.length;fast++) {
            if(num[fast] != val) {
                num[slow] = num[fast];
                slow++;
            }
        }
        return slow;
    }
}