// Modify the program from the previous exercise to become a new program Egg2 that displays the following output. Use
// static methods as appropriate.
//        _______
//       /       \
//      /         \
//      \         /
//       \_______/
//      -"-'-"-'-"-
//        _______
//       /       \
//      /         \
//      \         /
//       \_______/
//      -"-'-"-'-"-
//      \         /
//       \_______/
//        _______
//       /       \
//      /         \
//      -"-'-"-'-"-
//      \         /
//       \_______/

public class Egg2 {
    public static void main(String[] args) {
        topEgg();
        botEgg();
        midEgg();
        topEgg();
        botEgg();
        midEgg();
        botEgg();
        topEgg();
        midEgg();
        botEgg();
    }

    public static void topEgg() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void midEgg() {
        System.out.println("-\"-'-\"-'-\"-");
    }

    public static void botEgg() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
}
