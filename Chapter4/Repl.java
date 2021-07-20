// Write a method named rep1 that accepts a String and a number of repetitions as parameters and returns the String
// concatenated that many times. For example, the call repl("hello", 3) returns "hellohellohello". If the number of
// repetitions is 0 or less, an empty string is returned.

public class Repl {
    public static void main(String[] args) {
    }

    public static String rep1(String s, int n) {
        String k = "";
        for (int i = 1; i <= n; i++) {
            k += s;
        }
        return k;
    }
}
