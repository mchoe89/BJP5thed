// Write a method named randomX that keeps printing lines, where each line contains a random number of x characters
// between 5 and 19 inclusive, until it prints a line with 16 or more characters. For example, the output from your
// method might be the following. Notice that the last line has 17 x characters.

import java.util.Random;

public class RandomX {
    public static void main(String[] args) {
        randomX();
    }

    public static void randomX() {
        Random r = new Random();
        int x = r.nextInt(15) + 5;

        while (x < 16) {
            for (int i = 1; i <= x; i++) {
                System.out.print("x");
            }
            System.out.println();
            x = r.nextInt(15) + 5;
        }
        for (int i = 1; i <= x; i++) {
            System.out.print("x");
        }
    }
}
