// Write a method called printAcronym that accepts a String as its parameter and prints the first letter of each word of
// the string as an acronym. For example, the call of printAcronym("Breath of the Wild") should print "BotW". You may
// assume that the string contains at least one word and does not have any surrounding whitespace at its start or end.

public class PrintAcronym {
    public static void main(String[] args) {

    }

    public static void printAcronym(String s) {
        String acronym = "";
        char firstChar = s.charAt(0);

        if (firstChar != ' ') {
            acronym += firstChar;
        }

        for (int i = 1; i < s.length(); i++) {
            char secondChar = s.charAt(i);
            if (firstChar == ' ' && secondChar != ' ') {
                acronym += secondChar;
            }
            firstChar = secondChar;
        }

        System.out.println(acronym);
    }
}
