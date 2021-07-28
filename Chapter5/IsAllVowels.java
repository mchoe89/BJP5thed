// Write a method named isAllVowels that returns whether a String consists entirely of vowels (a, e, i, o, or u,
// case-insensitively). If every character of the String is a vowel, your method should return true. If any character
// of the String is a non-vowel, your method should return false. Your method should return true if passed the empty
// string, since it does not contain any non-vowel characters.

public class IsAllVowels {
    public static void main(String[] args) {

    }

    public static boolean isAllVowels(String s) {
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
