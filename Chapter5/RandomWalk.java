// Write a method named randomWalk that performs a random one-dimensional walk, reporting each position reached and the
// maximum position reached during the walk. The random walk should begin at position 0. On each step, you should either
// increase or decrease the position by 1 (with equal probability). The walk stops when 3 or -3 is hit.

import java.util.Random;

public class RandomWalk {
    public static void main(String[] args) {
        randomWalk();
    }

    public static void randomWalk() {
        Random r = new Random();
        int max = 0;
        int position = 0;
        System.out.println("position = " + position);
        while(position < 3 && position > -3) {
            int d = r.nextBoolean() ? -1 : 1;
            position += d;
            System.out.println("position = " + position);
            if(max < position) {
                max = position;
            }
        }
        System.out.println("max position = " + max);
    }
}
