// Bihasa, Christian Louie A. | 4CSD
package MP3;

import java.awt.*;
import javax.swing.*;

public class BihasaBresenham extends JPanel {

    // Starting and ending points
    int x1 = 150, y1 = 150;
    int x2 = 850, y2 = 550;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Header text
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("SansSerif", Font.BOLD, 16));
        g2d.drawString("BRESENHAM LINE DRAWING ALGORITHM", 20, 30);

        g2d.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g2d.drawString("Starting Point: (" + x1 + ", " + y1 + ")", 20, 55);
        g2d.drawString("Ending Point: (" + x2 + ", " + y2 + ")", 20, 75);

        drawBresenham(g2d, x1, y1, x2, y2);
    }

    public void drawBresenham(Graphics2D g2d,
                              int x1, int y1,
                              int x2, int y2) {

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        int error = dx - dy;

        g2d.setColor(Color.RED);
        while (true) {
            // Draw one pixel
            g2d.fillRect(x1, y1, 2, 2);

            // Stop when endpoint is reached
            if (x1 == x2 && y1 == y2) {
                break;
            }
            int error2 = 2 * error;
            if (error2 > -dy) {
                error -= dy;
                x1 += sx;
            }
            if (error2 < dx) {
                error += dx;
                y1 += sy;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bihasa, Christian Louie A. | 4CSD");
        BihasaBresenham panel = new BihasaBresenham();
        panel.setBackground(Color.WHITE);

        frame.add(panel);
        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
