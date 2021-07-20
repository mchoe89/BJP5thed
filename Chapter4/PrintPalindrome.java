// Write a method called printPalindrome that accepts a Scanner for the console as a parameter, prompts the user to
// enter one or more words, and prints whether the entered String is a palindrome (i.e., reads the same forward as it
// does backward, like "abba" or "racecar "). For an added challenge, make the code case-insensitive, so that words like “Abba” and “Madam” will be considered palindromes.
import java.util.Scanner;

public class PrintPalindrome {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        printPalindrome (console);
    }

    public static void printPalindrome(Scanner console) {
        System.out.print("Type one or more words: ");
        String word = console.nextLine();

        String test = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            test += word.charAt(i);
        }

        if (word.equalsIgnoreCase(test)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
