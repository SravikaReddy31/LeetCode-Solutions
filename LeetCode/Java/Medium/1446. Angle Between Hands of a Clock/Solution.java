class Solution {
    public double angleClock(int hour, int minutes) {
        double min = 6 * minutes;
        double hours = ((hour * 60) + minutes) * 0.5;
        double ans = hours - min;
        if(ans < 0) {
            ans = ans * -1;
        }
        if(ans > 360 - ans) {
            return 360 - ans;
        }
        else {
            return ans;
        }
    }
}