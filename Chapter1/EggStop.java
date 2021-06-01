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
        System.out.println();
        topEgg();
        botEgg();
        midBar();
        System.out.println();
        topEgg();
        midEgg();
        botEgg();
        midBar();
    }

    public static void topEgg() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void midEgg() {
        System.out.println("|  STOP  |");
    }

    public static void botEgg() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }

    public static void midBar() {
        System.out.println("+--------+");
    }
}