// Write a complete program called "TheNameGame", where the user inputs a first and last name and a song in the
// following format is printed about their first, then last name. Use a method to avoid redundancy.
//
//        What is your name? Fifty Cent
//        Fifty Fifty, bo-Bifty
//        Banana-fana fo-Fifty
//        Fee-fi-mo-Mifty
//        FIFTY!
//
//        Cent Cent, bo-Bent
//        Banana-fana fo-Fent
//        Fee-fi-mo-Ment
//        CENT!

import java.util.Scanner;

public class TheNameGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your name? ");
        String firstName = console.next();
        String lastName = console.next();
        game(firstName);
        System.out.println();
        game(lastName);
    }

    public static void game(String s) {
        String g = "";

        for (int i = 1; i < s.length(); i++) {
            g += s.charAt(i);
        }

        System.out.println(s + " " + s + ", " + "bo-B" + g);
        System.out.println("Banana-fana fo-F" + g);
        System.out.println("Fee-fi-mo-M" + g);
        System.out.println(s.toUpperCase() + "!");
    }
}
