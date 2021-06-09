// Write a method named lastDigit that returns the last digit of an integer. For example, lastDigit(3572) should return
// 2. It should work for negative numbers as well. For example, lastDigit(-947) should return 7.

public class LastDigit {
    public static void main(String[] args) {
        lastDigit(3572);
    }

    public static int lastDigit(int n) {
        return Math.abs(n % 10);
    }
}
