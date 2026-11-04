// Bihasa, Christian Louie A. | 4CSD
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class mp4_Bihasa extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2d.setStroke(new BasicStroke(2.0f));

        int width = getWidth();
        int height = getHeight();

        g2d.translate(width / 2, height / 2);
        g2d.scale(1, -1);

        // Background grid, 100 units per cell. Drawn first (and lighter than
        // everything else) so it stays behind the axes and the shapes instead
        // of overlapping them.
        g2d.setStroke(new BasicStroke(1.0f));
        g2d.setColor(new Color(230, 230, 230));
        for (int x = 0; x <= width / 2; x += 100) {
            g2d.drawLine(x, -height / 2, x, height / 2);
            g2d.drawLine(-x, -height / 2, -x, height / 2);
        }
        for (int y = 0; y <= height / 2; y += 100) {
            g2d.drawLine(-width / 2, y, width / 2, y);
            g2d.drawLine(-width / 2, -y, width / 2, -y);
        }
        g2d.setStroke(new BasicStroke(2.0f));

        // Cartesian plane (x and y axes).
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawLine(-width / 2, 0, width / 2, 0); // x-axis
        g2d.drawLine(0, -height / 2, 0, height / 2); // y-axis

        GeneralPath gp = new GeneralPath();

        gp.moveTo(100, 80); // Start at the upper-left corner
        gp.lineTo(120, 80); // Left underbody
        gp.quadTo(140, 60, 160, 80); // Front wheel curve
        gp.lineTo(240, 80); // Middle underbody
        gp.quadTo(260, 60, 280, 80); // Rear wheel curve
        gp.lineTo(300, 80); // Right underbody
        gp.lineTo(300, 100); // Right side
        gp.lineTo(280, 120); // Rear section
        gp.lineTo(240, 140); // Rear window/roof edge
        gp.lineTo(160, 140); // Bottom roof/window edge
        gp.lineTo(120, 120); // Front window/roof edge
        gp.lineTo(100, 100); // Left side
        gp.lineTo(100, 80); // Close the path

        g2d.setColor(Color.BLACK);
        g2d.fill(gp);

        // 1. Scaling of the car with sx = 2.5, sy = 0.7. (use blue)
        /*
        AffineTransform at1 = AffineTransform.getScaleInstance(2.5, 0.7);
        Shape car1 = at1.createTransformedShape(gp);
        g2d.setColor(Color.BLUE);
        g2d.fill(car1);
        */

        // 2. Rotation of the car -20 degrees (yellow)
        /*
        AffineTransform at2 = AffineTransform.getRotateInstance(Math.toRadians(-20));
        Shape car2 = at2.createTransformedShape(gp);
        g2d.setColor(Color.YELLOW);
        g2d.fill(car2);
        */

        // 3. Shearing of the car sx = -1, sy = 1 (red)
        /*
        AffineTransform at3 = AffineTransform.getShearInstance(-1, 1);
        Shape car3 = at3.createTransformedShape(gp);
        g2d.setColor(Color.RED);
        g2d.fill(car3);
        */

        // 4. Translating of the car dx = 120, dy = 110 (green)
        /*
        AffineTransform at4 = AffineTransform.getTranslateInstance(120, 110);
        Shape car4 = at4.createTransformedShape(gp);
        g2d.setColor(Color.GREEN);
        g2d.fill(car4);
        */

        // 5. Rotating the translated car in no. 4 by 75 degrees. (gray)
        /*
        AffineTransform at5 = AffineTransform.getRotateInstance(Math.toRadians(75));
        Shape car5 = at5.createTransformedShape(car4);
        g2d.setColor(Color.GRAY);
        g2d.fill(car5);
        */

        // 6. Translating the sheared car in no. 3 using dx = 110, dy = 120 (orange)
        /*
        AffineTransform at6 = AffineTransform.getTranslateInstance(110, 120);
        Shape car6 = at6.createTransformedShape(car3);
        g2d.setColor(Color.ORANGE);
        g2d.fill(car6);
        */

        // 7. Scaling the translated car in no. 4 using sx = sy = 3/5 (magenta)
        /*
        AffineTransform at7 = AffineTransform.getScaleInstance(3.0 / 5.0, 3.0 / 5.0);
        Shape car7 = at7.createTransformedShape(car4);
        g2d.setColor(Color.MAGENTA);
        g2d.fill(car7);
        */

        // 8. Shearing the scaled car in no. 1 using sx = 1, sy = 0. (cyan)
        /*
        AffineTransform at8 = AffineTransform.getShearInstance(1, 0);
        Shape car8 = at8.createTransformedShape(car1);
        g2d.setColor(Color.CYAN);
        g2d.fill(car8);
        */
    }

    public static void main(String[] args) {
        mp4_Bihasa car = new mp4_Bihasa();
        car.setTitle("Bihasa, Christian Louie A. | 4CSD");
        car.setBackground(Color.WHITE);
        car.setSize(1000, 1000);
        car.setVisible(true);

        car.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
