// Write a method called stutter that accepts a string parameter and returns that string with its characters repeated
// twice. For example, stutter("Hello!") returns "HHeelllloo!!"

public class Stutter {
    public static void main(String[] args) {
        System.out.println(stutter("hello"));
    }

    public static String stutter(String s) {
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            word = word + s.charAt(i) + s.charAt(i);
        }
        return word;
    }
}
