// Write a method named hasMidpoint that accepts three integers as parameters and returns true if one of the integers
// is the midpoint between the other two integers; that is, if one integer is exactly halfway between them. Your method
// should return false if no such midpoint relationship exists.

public class HasMidpoint {
    public static void main(String[] args) {

    }

    public static boolean hasMidpoint(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        double mid = (max + min) / 2.0;

        return mid == a || mid == b || mid == c;
    }
}
