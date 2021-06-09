// Write a method called cylinderSurfaceArea that accepts a radius and height (both real numbers) as parameters and
// returns the surface area of a cylinder with those dimensions. For example, the call cylinderSurfaceArea(3.0, 4.5)
// should return 141.3716694115407.
// surface area = 2πr2 + 2πrh

public class CylinderSurfaceArea {
    public static void main(String[] args) {
        cylinderSurfaceArea(3.0, 4.5);
    }

    public static double cylinderSurfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}
