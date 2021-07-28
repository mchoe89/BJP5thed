// Write a method named allDigitsOdd that returns whether every digit of a given integer is odd. Your method should
// return true if the number consists entirely of odd digits and false if any of its digits are even. 0, 2, 4, 6, and 8
// are even digits, and 1, 3, 5, 7, 9 are odd digits. Your method should work for positive and negative numbers.

public class AllDigitsOdd {
    public static void main(String[] args) {

    }

    public static boolean allDigitsOdd(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return false;
        }
        while (n > 0) {
            int a = n % 10;
            if (a % 2 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
