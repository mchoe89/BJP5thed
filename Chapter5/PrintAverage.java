// Write a method named printAverage that accepts a Scanner for the console as a parameter and repeatedly prompts the
// user for numbers. Once any number less than zero is typed, the average of all non-negative numbers typed is
// displayed. Display the average as a double, and do not round it.

import java.util.Scanner;

public class PrintAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printAverage(console);

    }

    public static void printAverage(Scanner console) {
        System.out.print("Type a number: ");
        int n = console.nextInt();
        double sum = 0;
        int count = 0;

        if (n < 0) {
            return;
        }

        while (n >= 0) {
            count++;
            sum += n;
            System.out.print("Type a number: ");
            n = console.nextInt();
        }
        System.out.println("Average was " + (sum / count));


    }
}
