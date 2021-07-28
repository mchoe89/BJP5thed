// Write a method dominant that accepts three integers as parameters and returns true if any one of the three integers
// is larger than the sum of the other two integers. The integers might be passed in any order, so the largest value
// could be any of the three. If no value is larger than the sum of the other two, your method should return false.

public class Dominant {
    public static void main(String[] args) {

    }

    public static boolean dominant(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = (a + b + c) - (max + min);

        return min + mid < max;
    }
}
