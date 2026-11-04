// Bihasa, Christian Louie A. | 4CSD
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class mp5_Bihasa extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2d.setStroke(new BasicStroke(2.0f));

        // 1. Transformed star
        // One section of the star (right half of the top point), centered
        // at (200, 200).
        GeneralPath star = new GeneralPath();
        star.moveTo(200, 200);
        star.lineTo(200, 25);
        star.lineTo(240, 160);
        star.closePath();

        AffineTransform reflect = new AffineTransform(-1, 0, 0, 1, 400, 0);
        Shape starMirror = reflect.createTransformedShape(star);

        // 9 points -> 360 / 9 = 40 degrees per point, 20 degrees per half.
        int points = 9;
        double angle = 360.0 / points;
        double half = angle / 2;
        
        Area starRight = new Area(star);
        starRight.intersect(new Area(new Arc2D.Double(
            0, 0, 400, 400, 90 - half, half, Arc2D.PIE
        )));

        Area starLeft = new Area(starMirror);
        starLeft.intersect(new Area(new Arc2D.Double(
            0, 0, 400, 400, 90, half, Arc2D.PIE
        )));

        // Move the star's center from (200, 200) to the middle of the
        // screen (500, 500) so the top point is not hidden by the title bar.
        AffineTransform toCenter = AffineTransform.getTranslateInstance(300, 300);

        // Rotate both halves every 40 degrees about (200, 200) -> 9 points.
        for (int i = 0; i < points; i++) {
            AffineTransform rot = AffineTransform.getRotateInstance(
                Math.toRadians(i * angle), 200, 200
            );
            rot.preConcatenate(toCenter);

            g2d.setColor(Color.BLUE);
            g2d.fill(rot.createTransformedShape(starRight));

            g2d.setColor(Color.GREEN);
            g2d.fill(rot.createTransformedShape(starLeft));
        }

        // 2. Snowflake (screen 1000 x 1000, center (500, 500))
        // One branch of the snowflake
        GeneralPath branch = new GeneralPath();

        // Main stem
        branch.moveTo(500, 500);
        branch.lineTo(500, 180);

        // Left lower branch
        branch.lineTo(470, 210);
        branch.lineTo(450, 190);
        branch.lineTo(490, 230);

        // Left middle branch
        branch.lineTo(465, 270);
        branch.lineTo(440, 250);
        branch.lineTo(485, 295);

        // Left upper branch
        branch.lineTo(470, 330);
        branch.lineTo(445, 310);
        branch.lineTo(490, 355);

        // Right upper branch
        branch.lineTo(530, 330);
        branch.lineTo(555, 310);
        branch.lineTo(510, 355);

        // Right middle branch
        branch.lineTo(535, 270);
        branch.lineTo(560, 250);
        branch.lineTo(515, 295);

        // Right lower branch
        branch.lineTo(530, 210);
        branch.lineTo(550, 190);
        branch.lineTo(510, 230);

        // Return to center
        branch.lineTo(500, 500);

        branch.closePath();

        // Complete snowflake: the branch rotated every 60 degrees about the
        // center (500, 500), six times.
        GeneralPath snowflake = new GeneralPath();
        for (int i = 0; i < 6; i++) {
            AffineTransform rot = AffineTransform.getRotateInstance(
                Math.toRadians(60 * i), 500, 500
            );
            snowflake.append(rot.createTransformedShape(branch), false);
        }

        // Scaling Sx = 0.5, Sy = 0.5 about the center (500, 500).
        AffineTransform scale = new AffineTransform();
        scale.translate(500, 500);
        scale.scale(0.5, 0.5);
        scale.translate(-500, -500);
        Shape scaledSnowflake = scale.createTransformedShape(snowflake);

        // Translation Tx = 300, Ty = 150 of the scaled snowflake.
        // New center: (500 + 300, 500 + 150) = (800, 650)
        AffineTransform translate = AffineTransform.getTranslateInstance(300, 150);
        Shape translatedSnowflake = translate.createTransformedShape(scaledSnowflake);

        // 2.1 Original - one branch (blue)
        /*
        g2d.setColor(Color.BLUE);
        g2d.fill(branch);
        g2d.draw(branch);
        */

        // 2.2 Rotation - 60 degrees x 6 (blue)
        /*
        g2d.setColor(Color.BLUE);
        g2d.fill(snowflake);
        g2d.draw(snowflake);
        */

        // 2.3 Scaling - Sx = 0.5, Sy = 0.5 about (500, 500) (blue)
        /*
        g2d.setColor(Color.BLUE);
        g2d.fill(scaledSnowflake);
        g2d.draw(scaledSnowflake);
        */

        // 2.4 Translation - Tx = 300, Ty = 150, new center (800, 650) (blue)
        /*
        g2d.setColor(Color.BLUE);
        g2d.fill(translatedSnowflake);
        g2d.draw(translatedSnowflake);
        */
    }

    public static void main(String[] args) {
        mp5_Bihasa mp5 = new mp5_Bihasa();
        mp5.setTitle("Bihasa, Christian Louie A. | 4CSD");
        mp5.setBackground(Color.WHITE);
        mp5.setSize(1000, 1000);
        mp5.setVisible(true);

        mp5.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
