// Write a method called charsSorted that accepts a String as its parameter and returns true if the characters in the
// string appear in sorted alphabetical order.

public class CharsSorted {
    public static void main(String[] args) {

    }

    public static boolean charsSorted(String s) {
        s = s.toLowerCase();

        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i)) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
