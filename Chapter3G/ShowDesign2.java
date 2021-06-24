// Modify your ShowDesign class from the previous exercise into a new class ShowDesign2 that has a method named
// showDesign that accepts parameters for the window width and height and displays the rectangles at the appropriate
// sizes. For example, if your showDesign method was called with values of 300 and 100, the window would look like the
// following figure.

import java.awt.*;

public class ShowDesign2 {
    public static void main(String[] args) {
        showDesign(300, 100);

    }

    public static void showDesign(int x, int y) {
        DrawingPanel panel = new DrawingPanel(x, y);
        panel.setBackground(Color.WHITE);
        Graphics g = panel.getGraphics();
        g.setColor(Color.BLACK);

        int x2 = 0;
        int y2 = 0;
        for (int i = 1; i <= 4; i++) {
            g.drawRect(x2 + (x / 10) * i, y2 + (y / 10) * i, x - 2 * (x / 10) * i, y - 2 * (y / 10) * i);
        }
    }
}
