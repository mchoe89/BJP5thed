// Modify your Squares2 program from the previous exercise into a new class Squares3 that draws the following figures.
// (Go back to that problem and copy/paste your code here as a starting point.) Parameterize your program so that the
// figures have the sizes shown below. The top-right figure has size 50, and the bottom-right figure has size 180.

import java.awt.*;

public class Squares3 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400, 300);
        panel.setBackground(Color.CYAN);
        Graphics g = panel.getGraphics();

        square(g, 50, 50, 100);
        square(g, 250, 10, 50);
        square(g, 180, 115, 180);
    }

    public static void square(Graphics g, int x, int y, int size) {
        g.setColor(Color.RED);
        int separation = size / 5;
        for (int i = 1; i <= 5; i++) {
            g.drawRect(x, y, separation * i, separation * i);
        }

        g.setColor(Color.BLACK);
        g.drawLine(x, y, x + size, y + size);
    }
}



