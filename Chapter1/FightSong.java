// Write a program called FightSong that produces this output. Use at least two static methods to show structure and
// eliminate redundancy in your solution.
//        Go, team, go!
//        You can do it.
//        Go, team, go!
//        You can do it.
//        You're the best,
//        In the West.
//        Go, team, go!
//        You can do it.
//        Go, team, go!
//        You can do it.
//        You're the best,
//        in the West.
//        Go, team, go!
//        You can do it.
//        Go, team, go!
//        You can do it.

public class FightSong {
    public static void main(String[] args) {
        twoLines();
        System.out.println();
        twoLines();
        nextTwoLines();
        twoLines();
        System.out.println();
        twoLines();
        nextTwoLines();
        twoLines();
        System.out.println();
        twoLines();
    }

    public static void twoLines() {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }

    public static void nextTwoLines() {
        System.out.println("You're the best,");
        System.out.println("In the West.");

    }
}