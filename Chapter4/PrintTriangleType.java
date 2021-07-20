// Write a method called printTriangleType that accepts three integer arguments representing the lengths of the sides
// of a triangle and prints what type of triangle it is. The three types are equilateral, isosceles, and scalene. An
// equilateral triangle has all three sides the same length, an isosceles triangle has two sides the same length, and a
// scalene triangle has three sides of different lengths. Here are some example calls to printTriangleType:

public class PrintTriangleType {
    public static void main(String[] args) {

    }

    public static void printTriangleType(int one, int two, int three) {
        if (one == two && one == three) {
            System.out.println("equilateral");
        } else if (one == two || one == three || two == three) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}
