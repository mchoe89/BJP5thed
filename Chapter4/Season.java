// Write a method named season that takes two integers as parameters representing a month and day and that returns a
// String indicating the season for that month and day. Assume that months are specified as an integer between 1 and 12
// (1 for January, 2 for February, and so on) and that the day of the month is a number between 1 and 31.
//
// If the date falls between 12/16 and 3/15, you should return "Winter". If the date falls between 3/16 and 6/15, you
// should return "Spring". If the date falls between 6/16 and 9/15, you should return "Summer". And if the date falls
// between 9/16 and 12/15, you should return "Fall".

public class Season {
    public static void main(String[] args) {

    }

    public static String season(int month, int day) {
        String s = "";
        if (month < 3 || month == 12 && day >= 16 || month == 3 && day <= 15) {
            s = "Winter";
        } else if (month > 3 && month < 6 || month == 3 && day >= 16 || month == 6 && day <= 15) {
            s = "Spring";
        } else if (month > 6 && month < 9 || month == 6 && day >= 16 || month == 9 && day <= 15) {
            s = "Summer";
        } else {
            s = "Fall";
        }

        return s;
    }
}