// Write a program called Egg that displays the following output:
//        _______
//       /       \
//      /         \
//      -"-'-"-'-"-
//      \         /
//       \_______/

public class Egg {
    public static void main(String[] args) {
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
