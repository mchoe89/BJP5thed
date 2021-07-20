// Write a method called wordCount that accepts a String as its parameter and returns the number of words in the String.
// A word is a sequence of one or more nonspace characters (any character other than ' ').

public class WordCount {
    public static void main(String[] args) {

    }

    public static int wordCount(String phrase) {
        int word = 0;
        char firstChar = phrase.charAt(0);

        if (firstChar != ' ') {
            word++;
        }

        for (int i = 1; i < phrase.length(); i++) {
            char secondChar = phrase.charAt(i);
            if (firstChar == ' ' && secondChar != ' ') {
                word++;
            }
            firstChar = secondChar;
        }
        return word;
    }
}
