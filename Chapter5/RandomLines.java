// Write a method called randomLines that prints between 5 and 10 random strings of letters (between "a" and "z"), one
// per line. Each string should have random length of up to 80 characters.

import java.util.Random;

public class RandomLines {
    public static void main(String[] args) {

    }

    public static void randomLines() {
        Random r = new Random();
        int line = r.nextInt(6) + 5;
        String letters = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 1; i <= line; i++) {
            int numChars = r.nextInt(80) + 1;

            for (int j = 1; j <= numChars; j++) {
                int chars = r.nextInt(26);
                char a = letters.charAt(chars);
                System.out.print(a);
            }
            System.out.println();
        }

    }

}
