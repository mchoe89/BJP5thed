// Write a method named firstDigit that returns the first digit of an integer. For example, firstDigit(3572) should
// return 3. It should work for negative numbers as well.

public class FirstDigit {
    public static void main(String[] args) {

    }

    public static int firstDigit(int n) {
        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
}
