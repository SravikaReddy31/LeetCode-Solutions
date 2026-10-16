
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
        };
        int[] monthDays = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        int total = day;
        for (int i = 0; i < month - 1; i++) {
            total += monthDays[i];
        }
        if (month > 2 &&
            (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            total++;
        }
        for (int y = 1971; y < year; y++) {
            total += (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) ? 366 : 365;
        }
        return days[(total + 4) % 7];
    }
}
