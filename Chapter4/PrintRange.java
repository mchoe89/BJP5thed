// Write a method called printRange that accepts two integers as arguments and prints the sequence of numbers between
// the two arguments, separated by spaces. Print an increasing sequence if the first argument is smaller than the
// second; otherwise, print a decreasing sequence. If the two numbers are the same, that number should be printed by
// itself. Here are some sample calls to printRange:

public class PrintRange {
    public static void main(String[] args) {

    }

    public static void printRange(int start, int end) {
        if (end > start) {
            System.out.print(start);
            for (int i = start + 1; i <= end; i++) {
                System.out.print(" " + i);
            }
        } else if (start > end) {
            System.out.print(start);
            for (int i = start - 1; i >= end; i--) {
                System.out.print(" " + i);
            }
        } else {
            System.out.print(start);
        }
    }
}
