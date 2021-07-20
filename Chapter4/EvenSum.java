// Write a method named evenSum that prompts the user for many integers and print the total even sum and maximum of the
// even numbers. You may assume that the user types at least one non-negative even integer.

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {

    }

    public static void evenSum() {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int max = Integer.MIN_VALUE;

        System.out.print("how many integers? ");
        int num = console.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("next integer? ");
            int temp = console.nextInt();

            if (temp % 2 == 0) {
                sum += temp;

                if (temp > max) {
                    max = temp;
                }
            }
        }
        System.out.println("even sum = " + sum);
        System.out.println("even max = " + max);
    }
}
