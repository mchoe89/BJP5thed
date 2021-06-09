// Write a method called printNumbers that accepts a maximum number as an argument and prints each number from 1 up to
// that maximum, inclusive, boxed by square brackets. For example, consider the following calls:
// These calls should produce the following output:
//    printNumbers(15);
//    printNumbers(5);
//    [1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13]
//    [14] [15]
//    [1] [2] [3] [4] [5]
// You may assume that the value passed to printNumbers is 1 or greater.

public class PrintNumbers {
    public static void main(String[] args) {
        printNumbers(15);

    }

    public static void printNumbers(int maxNum) {
        for (int i = 1; i <= maxNum; i++) {
            System.out.print("[" + i + "] ");
        }
    }
}
