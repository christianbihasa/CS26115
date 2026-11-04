// Bihasa, Christian Louie A. | 4CSD
package MP3;

import javax.swing.*;
import java.awt.*;

public class BihasaCircleTrig extends JPanel {

    // Circle center and radius
    private final int xc = 500;
    private final int yc = 350;
    private final int r = 200;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Header text
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("SansSerif", Font.BOLD, 16));
        g2d.drawString("SYMMETRIC PLOTTING CIRCLE ALGORITHM", 20, 30);

        g2d.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g2d.drawString("Center: (" + xc + ", " + yc + ")", 20, 55);
        g2d.drawString("Radius: " + r, 20, 75);

        // Draw coordinate axes
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawLine(0, yc, getWidth(), yc);     // X-axis
        g2d.drawLine(xc, 0, xc, getHeight());    // Y-axis

        // Draw the circle
        g2d.setColor(Color.RED);
        trigCircle(g2d, xc, yc, r);

        // Draw center
        g2d.setColor(Color.BLUE);
        g2d.fillOval(xc - 4, yc - 4, 8, 8);
    }

    private void trigCircle(Graphics2D g2d,
                             int xc, int yc, int r) {

        // Small angle step so consecutive pixels stay connected
        double angleIncrement = 1.0 / r;

        for (double theta = 0; theta <= Math.PI / 4; theta += angleIncrement) {

            int x = (int) Math.round(r * Math.cos(theta));
            int y = (int) Math.round(r * Math.sin(theta));

            // Plot all 8 symmetric points
            plotSymmetricPoints(g2d, xc, yc, x, y);
        }
    }

    private void plotSymmetricPoints(Graphics2D g2d,
                                     int xc, int yc,
                                     int x, int y) {

        plot(g2d, xc + x, yc - y);
        plot(g2d, xc - x, yc - y);
        plot(g2d, xc + x, yc + y);
        plot(g2d, xc - x, yc + y);

        plot(g2d, xc + y, yc - x);
        plot(g2d, xc - y, yc - x);
        plot(g2d, xc + y, yc + x);
        plot(g2d, xc - y, yc + x);
    }

    // Plot one pixel
    private void plot(Graphics2D g2d, int x, int y) {
        g2d.fillRect(x, y, 2, 2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bihasa, Christian Louie A. | 4CSD");
        BihasaCircleTrig panel = new BihasaCircleTrig();
        panel.setBackground(Color.WHITE);

        frame.add(panel);
        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}