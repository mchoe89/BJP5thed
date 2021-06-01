//Write a Java program called StarFigures that generates the following output. Use static methods to show structure and
// eliminate redundancy in your solution.
//        *****
//        *****
//         * *
//          *
//         * *
//
//        *****
//        *****
//         * *
//          *
//         * *
//        *****
//        *****
//
//          *
//          *
//          *
//        *****
//        *****
//         * *
//          *
//         * *

public class StarFigures {
    public static void main(String[] args) {
        complete();
        System.out.println();
        complete();
        twoLines();
        System.out.println();
        threeStars();
        complete();

    }

    public static void twoLines() {
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void twoStars() {
        System.out.println(" * *");
    }

    public static void oneStar() {
        System.out.println("  *");
    }

    public static void complete() {
        twoLines();
        twoStars();
        oneStar();
        twoStars();
    }

    public static void threeStars(){
        oneStar();
        oneStar();
        oneStar();
    }
}
