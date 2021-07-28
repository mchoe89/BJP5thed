// Write a method named hopscotch that accepts an integer parameter for a number of "hops" and prints a hopscotch board
// of that many hops. A "hop" is defined as the split into two numbers and then back together again into one.

public class Hopscotch {
    public static void main(String[] args) {
        hopscotch(3);
    }

    public static void hopscotch(int n) {
        int startNum = 1;
        System.out.println("   1");

        while (n > 0) {
            System.out.println(startNum + 1 + "     " + (startNum + 2));
            startNum += 3;
            System.out.println("   " + startNum);
            n--;
        }

    }
}
