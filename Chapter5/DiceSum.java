// Write a method named diceSum that prompts the user for a desired sum, then repeatedly rolls two six-sided dice until
// their sum is the desired sum.

import java.util.Random;
import java.util.Scanner;

public class DiceSum {
    public static void main(String[] args) {

    }

    public static void diceSum() {
        Scanner console = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Desired dice sum: ");
        int sum = console.nextInt();

        int x = r.nextInt(6) + 1;
        int y = r.nextInt(6) + 1;

        while (x + y != sum) {
            System.out.println(x + " and " + y + " = " + (x + y));
            x = r.nextInt(6) + 1;
            y = r.nextInt(6) + 1;
        }
        System.out.println(x + " and " + y + " = " + (x + y));
    }
}
