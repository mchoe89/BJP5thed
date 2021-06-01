// Write a program called Shining that prints the following line of output 1000 times:
//        All work and no play makes Jack a dull boy.
// You should not write a program that uses 1000 lines of source code; use methods to shorten the program. What is the
// shortest program you can write that will produce the 1000 lines of output, using only the material from this chapter?

public class Shining {
    public static void main(String[] args) {
        thousandLines();
    }

    public static void line() {
        System.out.println("All work and no play makes Jack a dull boy.");
    }

    public static void fiveLines() {
        line();
        line();
        line();
        line();
        line();
    }

    public static void tenLines() {
        fiveLines();
        fiveLines();
    }

    public static void hundredLines() {
        tenLines();
        tenLines();
        tenLines();
        tenLines();
        tenLines();
        tenLines();
        tenLines();
        tenLines();
        tenLines();
        tenLines();
    }

    public static void thousandLines() {
        hundredLines();
        hundredLines();
        hundredLines();
        hundredLines();
        hundredLines();
        hundredLines();
        hundredLines();
        hundredLines();
        hundredLines();
        hundredLines();
    }
}
