// Write a method named swapDigitPairs that accepts a positive integer n as a parameter and returns a new integer whose
// value is similar to n's but with each pair of digits swapped in order. For example, the call of
// swapDigitPairs(482596) would return 845269. Notice that the 9 and 6 are swapped, as are the 2 and 5, and the 4 and 8.
// If the number contains an odd number of digits, leave the leftmost digit in its original place.

public class SwapDigitPairs {
    public static void main(String[] args) {

    }

    public static int swapDigitPairs(int n) {
        int power = 1;
        int ans = 0;

        while (n >= 10) {
            int a = n % 10;
            n /= 10;
            int b = n % 10;
            n /= 10;
            ans += a * (int)Math.pow(10, power) + b * (int)Math.pow(10, power - 1);
            power += 2;
        }
        ans += n * (int)Math.pow(10, power - 1);
        return ans;
    }
}
