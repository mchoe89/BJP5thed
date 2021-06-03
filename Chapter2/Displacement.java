// In physics, a common useful equation for finding the position of a body in linear motion at a given time, based on
// its initial position, initial velocity, and rate of acceleration, is the following: s = s0 + v0 * t + .5 * a * t^2
// Write code to declare variables for , , , and , and then write the code to compute on the basis of these values.

public class Displacement {
    public static void main(String[] args) {
        double t = 10;
        double s0 = 12.0;
        double v0 = 3.5;
        double a = 9.8;

        double s = s0 + v0 * t + .5 * a * t * t;

        System.out.println(s);
    }
}
