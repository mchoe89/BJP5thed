// Write a method named smallestLargest that asks the user to enter numbers, then prints the smallest and largest of all
// the numbers typed in by the user. You may assume the user enters a valid number greater than 0 for the number of
// numbers to read.

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {

    }

    public static void smallestLargest() {
        Scanner console = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        System.out.print("How many numbers do you want to enter? ");
        int num = console.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("Number " + i + ": ");
            int temp = console.nextInt();

            if (temp > largest) {
                largest = temp;
            }
            if (temp < smallest) {
                smallest = temp;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);

    }
}
