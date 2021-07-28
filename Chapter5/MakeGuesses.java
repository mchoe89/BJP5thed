// Write a method named makeGuesses that will guess numbers between 1 and 50 inclusive until it makes a guess of at
// least 48. It should report each guess and at the end should report the total number of guesses made.

import java.util.Random;

public class MakeGuesses {
    public static void main(String[] args) {
        makeGuesses();
    }

    public static void makeGuesses() {
        Random r = new Random();
        int count = 0;
        int a = r.nextInt(50) + 1;

        while (a <= 48) {
            System.out.println("guess = " + a);
            count++;
            a = r.nextInt(50) + 1;
        }
        count++;
        System.out.println("guess = " + a);
        System.out.println("total guesses = " + count);
    }
}