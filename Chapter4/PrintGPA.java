// Write a method named printGPA that calculates a student's grade point average. The user will type a line of input
// containing the student's name, then a number of scores, followed by that many integer scores.

import java.util.Scanner;

public class PrintGPA {
    public static void main(String[] args) {

    }

    public static void printGPA() {
        Scanner console = new Scanner(System.in);
        double sum = 0;

        System.out.print("Enter a student record: ");
        String name = console.next();
        int numClass = console.nextInt();

        for (int i = 1; i <= numClass; i++) {
            int score = console.nextInt();
            sum += score;
        }
        double average = sum / numClass;
        System.out.println(name + "'s grade is " + average);
    }
}
