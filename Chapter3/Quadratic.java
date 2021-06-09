// Write a method called quadratic that solves quadratic equations and prints their roots. Recall that a quadratic
// equation is a polynomial equation in terms of a variable x of the form a x2 + b x + c = 0.
// Your method should accept the coefficients a, b, and c as parameters and should print the roots of the equation. You
// may assume that the equation has two real roots, though mathematically this is not always the case.
// Also, there should be two roots, one the result of the addition, the other, the result of the subtraction. Print the
// root resulting from the addition first.

public class Quadratic {
    public static void main(String[] args) {
        quadratic(1, -7, 12);
    }

    public static void quadratic(int a, int b, int c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double addition = (-b + Math.sqrt(discriminant)) / (2 * a);
        double subtraction = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("First root = " + addition);
        System.out.println("Second root = " + subtraction);
    }
}
