// Write a Java program called Lanterns that generates the following output. Use static methods to show structure and
// eliminate redundancy in your solution.
//            *****
//          *********
//        *************

//            *****
//          *********
//        *************
//        * | | | | | *
//        *************
//            *****
//          *********
//        *************
//            *****
//          *********
//        *************
//            *****
//        * | | | | | *
//        * | | | | | *
//            *****
//            *****

public class Lanterns {
    public static void main(String[] args) {
        cone();
        System.out.println();
        cone();
        light();
        thirteenStars();
        cone();
        System.out.println();
        cone();
        fiveStars();
        doubleLight();
        doubleFive();
    }

    public static void fiveStars() {
        System.out.println("    *****");
    }

    public static void nineStars() {
        System.out.println("  *********");
    }

    public static void thirteenStars() {
        System.out.println("*************");
    }

    public static void light() {
        System.out.println("* | | | | | *");
    }

    public static void doubleLight() {
        light();
        light();
    }

    public static void cone() {
        fiveStars();
        nineStars();
        thirteenStars();
    }

    public static void doubleFive() {
        fiveStars();
        fiveStars();
    }
}
