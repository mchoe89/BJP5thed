// The Fibonacci numbers are a sequence of integers in which the first two elements are 1, and each following element
// is the sum of the two preceding elements. The first 12 Fibonacci numbers are
//        1 1 2 3 5 8 13 21 34 55 89 144
// Write a for loop that computes and prints the first 12 Fibonacci numbers.

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 0; i <= 9; i++) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}
