// Write a method named pow2 (a variation of the previous pow exercise) that accepts a real number base and an integer
// exponent as parameters and returns the base raised to the given power. Your code should work for both positive and
// negative exponents. For example, the call pow2(2.0, -2) returns 0.25. Do not use Math.pow in your solution.

public class Pow2 {
    public static void main(String[] args) {

    }

    public static double pow2(double base, int exp) {
        double product = 1;
        int absExp = Math.abs(exp);

        for (int i = 1; i <= absExp; i++) {
            product *= base;
        }
        if (exp < 0) {
            product = 1.0 / product;
        }
        return product;
    }
}
