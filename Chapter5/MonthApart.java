// Write a method named monthApart that accepts four integer parameters representing two calendar dates. Each date
// consists of a month (1 through 12) and a day (1 through the number of days in that month [28-31]). The method returns
// whether the dates are at least a month apart. Assume that all dates in this problem occur during the same year. For
// example, the following dates are all considered to be at least a month apart from 9/19 (September 19): 2/14, 7/25,
// 8/2, 8/19, 10/19, 10/20, and 11/5. The following dates are NOT at least a month apart from 9/19: 9/20, 9/28, 10/1,
// 10/15, and 10/18. Note that the first date could come before or after (or be the same as) the second date. Assume
// that all parameter values passed are valid.

public class MonthApart {
    public static void main(String[] args) {

    }

    public static boolean monthApart(int a, int b, int c, int d) {
        if(Math.abs(a - c) > 1) {
            return true;
        } else if(Math.abs(a - c) == 1) {
            if (a < c && b <= d) {
                return true;
            } else if (a > c && b >= d) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
