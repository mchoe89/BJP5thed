// Write a method called printIndexed that accepts a String as its parameter and prints the String's characters in order
// followed by their indexes in reverse order. For example, the call of printIndexed("ZELDA"); should print Z4E3L2D1A0
// to the console.

public class PrintIndexed {
    public static void main(String[] args) {
        printIndexed("ZELDA");
    }

    public static void printIndexed(String s) {
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(index));
            System.out.print(i);
            index++;
        }
    }
}
