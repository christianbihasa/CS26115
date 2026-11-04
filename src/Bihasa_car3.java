// Bihasa, Christian Louie A. | 4CSD
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

// 3. Car on a different tracking path (M shape)
public class Bihasa_car3 extends JPanel {

    // Tilt of the diagonal lines (300 across, 600 up or down)
    static final double TILT = Math.toDegrees(Math.atan2(600, 300));

    // Tracking path A to H: {x, y, tilt of the box in degrees}
    static final double[][] PATH = {
        {150, 750, 90},     // A
        {150, 150, 90},     // B
        {300, 450, TILT},   // C
        {450, 750, TILT},   // D
        {600, 450, -TILT},  // E
        {750, 150, -TILT},  // F
        {750, 450, 90},     // G
        {750, 750, 90}      // H
    };

    // Tracking path H to A
    // To use it: comment out the A to H path above, then remove the /* */ here.
    /*
    static final double[][] PATH = {
        {750, 750, 90},     // H
        {750, 450, 90},     // G
        {750, 150, -TILT},  // F
        {600, 450, -TILT},  // E
        {450, 750, TILT},   // D
        {300, 450, TILT},   // C
        {150, 150, 90},     // B
        {150, 750, 90}      // A
    };
    */

    static final double SPEED = 3; // pixels per frame
    double traveled = 0;           // distance the car has moved along the path
    double totalLength = 0;        // length of the whole path

    public Bihasa_car3() {
        setPreferredSize(new Dimension(900, 900));
        setBackground(Color.WHITE);

        for (int i = 1; i < PATH.length; i++) {
            totalLength += segmentLength(i);
        }

        // Move the car about 60 times per second
        new Timer(16, e -> {
            traveled += SPEED;
            if (traveled > totalLength) traveled = 0; // start again at the first point
            repaint();
        }).start();
    }

    // Length of the line from point i-1 to point i
    double segmentLength(int i) {
        return Point2D.distance(PATH[i - 1][0], PATH[i - 1][1], PATH[i][0], PATH[i][1]);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );

        drawTrack(g2d);
        drawCar(g2d);
    }

    // Tracking path: the line through all points and a box on each point
    void drawTrack(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(1.5f));

        // Line
        GeneralPath line = new GeneralPath();
        line.moveTo(PATH[0][0], PATH[0][1]);
        for (int i = 1; i < PATH.length; i++) {
            line.lineTo(PATH[i][0], PATH[i][1]);
        }
        g2d.draw(line);

        // Boxes: rotate the box, then move it onto the point
        Rectangle2D box = new Rectangle2D.Double(-45, -18, 90, 36);
        for (double[] p : PATH) {
            AffineTransform t = new AffineTransform();
            t.translate(p[0], p[1]);
            t.rotate(Math.toRadians(p[2]));
            g2d.draw(t.createTransformedShape(box));
        }
    }

    // Car: a light blue box that follows the line
    void drawCar(Graphics2D g2d) {
        // Find which line the car is on
        double left = traveled;
        int i = 1;
        while (i < PATH.length - 1 && left > segmentLength(i)) {
            left -= segmentLength(i);
            i++;
        }

        double x1 = PATH[i - 1][0], y1 = PATH[i - 1][1];
        double x2 = PATH[i][0],     y2 = PATH[i][1];

        // Position on that line (f = 0 at the start, 1 at the end)
        double f = left / segmentLength(i);
        double x = x1 + (x2 - x1) * f;
        double y = y1 + (y2 - y1) * f;

        // Face the car in the direction of the line
        double angle = Math.atan2(y2 - y1, x2 - x1);

        AffineTransform t = new AffineTransform();
        t.translate(x, y);
        t.rotate(angle);
        Shape car = t.createTransformedShape(new Rectangle2D.Double(-25, -12, 50, 24));

        g2d.setColor(new Color(173, 216, 230)); // light blue
        g2d.fill(car);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bihasa, Christian Louie A. | 4CSD");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Bihasa_car3());
            frame.pack();
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
