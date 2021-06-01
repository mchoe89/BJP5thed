// Write a complete Java program called Mantra that prints the following output. Use at least one static method besides
// main .
//        There's one thing every coder must understand:
//        The System.out.println command.
//        There's one thing every coder must understand:
//        The System.out.println command.

public class Mantra {
    public static void main(String[] args) {
        twoLines();
        System.out.println();
        twoLines();
    }

    public static void twoLines() {
        System.out.println("There's one thing every coder must understand:");
        System.out.println("The System.out.println command.");
    }
}
