// Write a method named digitSum that accepts an integer as a parameter and returns the sum of the digits of that
// number. For example, digitSum(29107) returns 2+9+1+0+7 or 19. For negative numbers, return the same value that would
// result if the number were positive.

public class DigitSum {
    public static void main(String[] args) {

    }

    public static int digitSum(int n) {
        n = Math.abs(n);
        int sum = 0;
        while(n > 0) {
            int a = n % 10;
            sum += a;
            n /= 10;
        }
        return sum;
    }
}
