// The drawing panel is now 400 by 300 pixels in size. The first figure is at the same position, (50,50). The other
// figures are at positions (250, 10) and (180, 115), respectively. Use one or more parameterized static methods to
// reduce the redundancy of your solution.


import java.awt.*;

public class Squares2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400, 300);
        panel.setBackground(Color.CYAN);
        Graphics g = panel.getGraphics();

        square(g, 50, 50);
        square(g, 250, 10);
        square(g, 180, 115);
    }

    public static void square(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        for (int i = 1; i <= 5; i++) {
            g.drawRect(x, y, 20 * i, 20 * i);
        }

        g.setColor(Color.BLACK);
        g.drawLine(x, y, x + 100, y + 100);
    }
}
