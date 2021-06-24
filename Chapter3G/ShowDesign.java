// The window is 200 pixels wide and 200 pixels tall. The background is white and the foreground is black. There are 20
// pixels between each of the four rectangles, and the rectangles are concentric (their centers are at the same point).
// Use a loop to draw the repeated rectangles.

import java.awt.*;

public class ShowDesign {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 200);
        panel.setBackground(Color.WHITE);
        Graphics g = panel.getGraphics();
        g.setColor(Color.BLACK);

        int x = 0;
        int y = 0;
        for (int i = 1; i <= 4; i++) {
            x += 20;
            y += 20;
            g.drawRect(x, y, 200 - 2 * x, 200 - 2 * y);
        }
    }
}
