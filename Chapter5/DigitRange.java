// Write a method named digitRange that accepts an integer as a parameter and returns the range of values of its digits.
// The range is defined as 1 more than the difference between the largest and smallest digit value. For example, the
// call of digitRange(68437) would return 6 because the largest digit value is 8 and the smallest is 3, so
// 8 - 3 + 1 = 6. If the number contains only one digit, return 1.

public class DigitRange {
    public static void main(String[] args) {

    }

    public static int digitRange(int n) {
        n = Math.abs(n);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            int a = n % 10;
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
            n /= 10;
        }
        return max - min + 1;
    }
}
