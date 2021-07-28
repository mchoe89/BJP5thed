// Write a method named hasAnOddDigit that returns whether any digit of an integer is odd. Your method should return
// true if the number has at least one odd digit and false if none of its digits are odd. 0, 2, 4, 6, and 8 are even
// digits, and 1, 3, 5, 7, 9 are odd digits.

public class HasAnOddDigit {
    public static void main(String[] args) {

    }

    public static boolean hasAnOddDigit(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return false;
        }
        while (n > 0) {
            int a = n % 10;
            if (a % 2 == 1) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}
