// Write a method called vertical that accepts a String as its parameter and prints each letter of the string on
// separate lines.

public class Vertical {
    public static void main(String[] args) {
        vertical("hey now");
    }

    public static void vertical(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

}
