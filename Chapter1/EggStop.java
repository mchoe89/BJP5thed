// Write a Java program called EggStop that generates the following output. Use static methods to show structure and
// eliminate redundancy in your solution.
//         _______
//        /       \
//       /         \
//       \         /
//        \_______/
//       \         /
//        \_______/
//        +-------+
//         _______
//        /       \
//       /         \
//       |   STOP  |
//       \         /
//        \_______/
//         _______
//        /       \
//       /         \
//       +---------+

public class EggStop {
    public static void main(String[] args) {
        topEgg();
        botEgg();
        botEgg();
        endBar();
        topEgg();
        midEgg();
        botEgg();
        topEgg();
        midBar();
    }

    public static void topEgg() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void midEgg() {
        System.out.println("|   STOP  |");
    }

    public static void botEgg() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }

    public static void endBar() {
        System.out.println(" +-------+");
    }

    public static void midBar() {
        System.out.println("+---------+");
    }
}
