// Write a complete Java program called Stewie2 that prints the following output. Use at least one static method besides
// main .
//        //////////////////////
//        || Victory is mine! ||
//        \\\\\\\\\\\\\\\\\\\\\\
//        || Victory is mine! ||
//        \\\\\\\\\\\\\\\\\\\\\\
//        || Victory is mine! ||
//        \\\\\\\\\\\\\\\\\\\\\\
//        || Victory is mine! ||
//        \\\\\\\\\\\\\\\\\\\\\\
//        || Victory is mine! ||
//        \\\\\\\\\\\\\\\\\\\\\\

public class Stewie2 {
    public static void main(String[] args) {
        System.out.println("//////////////////////");
        firstStewie();
        firstStewie();
        firstStewie();
        firstStewie();
        firstStewie();

    }

    public static void firstStewie() {
        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
