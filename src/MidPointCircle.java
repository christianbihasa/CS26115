/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author donnaacula
 */
import javax.swing.*;
import java.awt.*;

public class MidPointCircle extends JPanel {

    // Circle center and radius
    private final int xc = 150;
    private final int yc = 120;
    private final int r = 70;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // Background
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Draw coordinate axes
        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(0, yc, getWidth(), yc);     // X-axis
        g2.drawLine(xc, 0, xc, getHeight());    // Y-axis

        // Draw the circle
        g2.setColor(Color.BLUE);
        midpointCircle(g2, xc, yc, r);

        // Draw center
        g2.setColor(Color.RED);
        g2.fillOval(xc - 4, yc - 4, 8, 8);

        // Labels
        g2.setColor(Color.BLACK);
        g2.drawString("Center (150,120)", xc + 10, yc - 10);
        g2.drawString("r = 70", xc + r + 5, yc);
    }

    /*
     * MIDPOINT CIRCLE ALGORITHM
     *
     * Initial point:
     *     x = 0
     *     y = r
     *
     * Initial decision parameter:
     *     p = 5/4 - r
     *
     * If p < 0:
     *     p = p + 2x + 1
     *
     * Else:
     *     p = p + 2x - 2y + 1
     *     y = y - 1
     *
     * For every point, plot the 8 symmetric points.
     */
    private void midpointCircle(Graphics2D g2,
                                 int xc, int yc, int r) {

        int x = 0;
        int y = r;

        // Initial decision parameter
        double p = 1.25 - r;

        while (x <= y) {

            // Plot all 8 symmetric points
            plotSymmetricPoints(g2, xc, yc, x, y);

            // Calculate next point
            if (p < 0) {

                // Move to E
                p = p + 2 * x + 1;

            } else {

                // Move to SE
                p = p + 2 * x - 2 * y + 1;

                y--;
            }

            x++;
        }
    }

    /*
     * Plot the 8 symmetric points:
     *
     * ( x,  y)
     * (-x,  y)
     * ( x, -y)
     * (-x, -y)
     * ( y,  x)
     * (-y,  x)
     * ( y, -x)
     * (-y, -x)
     */
    private void plotSymmetricPoints(Graphics2D g2,
                                     int xc, int yc,
                                     int x, int y) {

        plot(g2, xc + x, yc - y);
        plot(g2, xc - x, yc - y);
        plot(g2, xc + x, yc + y);
        plot(g2, xc - x, yc + y);

        plot(g2, xc + y, yc - x);
        plot(g2, xc - y, yc - x);
        plot(g2, xc + y, yc + x);
        plot(g2, xc - y, yc + x);
    }

    // Plot one pixel
    private void plot(Graphics2D g2, int x, int y) {
        g2.fillRect(x, y, 2, 2);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Midpoint Circle Algorithm");

        MidPointCircle panel = new MidPointCircle();

        frame.add(panel);

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
