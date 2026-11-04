// Bihasa, Christian Louie A. | 4CSD
import java.awt.*;
import java.awt.geom.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class Bihasa_clock extends JPanel {

    // Location shown under the clock
    static final ZoneId ZONE = ZoneId.of("Asia/Manila");
    static final String LOCATION = "Caloocan, Philippines";

    // Fonts
    final Font numeralFont = new Font("SansSerif", Font.BOLD, 17);
    final Font arcFont     = new Font("SansSerif", Font.BOLD, 13);
    final Font cityFont    = new Font("SansSerif", Font.BOLD, 19);
    final Font digitFont   = pickFont(new String[] {"Consolas", "Monospaced"}, Font.BOLD, 44);
    final Font labelFont   = new Font("SansSerif", Font.BOLD, 10);
    final Font dateFont    = new Font("SansSerif", Font.PLAIN, 13);

    // Hand shapes
    final Shape hourHand = makeHourHand();
    final Shape minuteHand = makeMinuteHand();
    final Shape secondHand = makeSecondHand();

    // Transforms
    AffineTransform clockTranslation = new AffineTransform(); // moves (0,0) to the clock center
    AffineTransform handRotation     = new AffineTransform(); // rotation of one hand
    AffineTransform handTransform    = new AffineTransform(); // clockTranslation o handRotation

    public Bihasa_clock() {
        setPreferredSize(new Dimension(600, 740));
        new Timer(100, e -> repaint()).start();
    }

    static Font pickFont(String[] names, int style, int size) {
        for (String n : names) {
            Font f = new Font(n, style, size);
            if (f.getFamily().equalsIgnoreCase(n) || n.equals("Monospaced")) return f;
        }
        return new Font("Monospaced", style, size);
    }

    // Hand shapes
    // Hour hand
    static Shape makeHourHand() {
        GeneralPath stem = new GeneralPath();
        stem.moveTo(-5, 14);
        stem.lineTo(-2.5, -90);
        stem.lineTo(2.5, -90);
        stem.lineTo(5, 14);
        stem.closePath();

        Area a = new Area(stem);
        a.add(new Area(circle(0, -100, 12)));
        a.subtract(new Area(circle(0, -100, 5)));
        return a;
    }

    // Minute hand
    static Shape makeMinuteHand() {
        GeneralPath stem = new GeneralPath();
        stem.moveTo(-3.5, 18);
        stem.lineTo(-1.8, -154);
        stem.lineTo(1.8, -154);
        stem.lineTo(3.5, 18);
        stem.closePath();

        Area a = new Area(stem);
        a.add(new Area(circle(0, -160, 8)));
        return a;
    }

    // Second hand
    static Shape makeSecondHand() {
        Area a = new Area(new Rectangle2D.Double(-1, -192, 2, 220));
        a.add(new Area(circle(0, -192, 4)));
        Area tail = new Area(circle(0, 30, 6));
        tail.subtract(new Area(circle(0, 30, 3)));
        a.add(tail);
        return a;
    }

    static Ellipse2D circle(double x, double y, double r) {
        return new Ellipse2D.Double(x - r, y - r, 2 * r, 2 * r);
    }

    // Drawing
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);

        g2d.setColor(new Color(0x08193A));
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Clock center
        double cx = getWidth() / 2.0;
        double cy = 28 + 258;
        clockTranslation.setToTranslation(cx, cy);

        ZonedDateTime now = ZonedDateTime.now(ZONE);
        int hr = now.getHour();
        int min = now.getMinute();
        int sec = now.getSecond();

        // Angles in degrees, clockwise from 12 o'clock
        double secAngle = sec * 6.0;                     // 6 deg per second
        double minAngle = min * 6.0 + sec * 0.1;         // 6 deg per minute
        double hourAngle = (hr % 12) * 30.0 + min * 0.5; // 30 deg per hour

        drawBezel(g2d);
        drawFace(g2d, sec, minAngle, hourAngle);
        drawHands(g2d, hourAngle, minAngle, secAngle);
        displayLocationAndTime(g2d, now, cx, cy + 258 + 26);

        g2d.dispose();
    }

    // 12-sided bezel with an hour numeral on each corner
    void drawBezel(Graphics2D g2d) {
        // Corners around the origin: rotate (0, -258) by i * 30 degrees
        GeneralPath bezel = new GeneralPath();
        for (int i = 0; i < 12; i++) {
            Point2D p = AffineTransform.getRotateInstance(Math.toRadians(i * 30))
                .transform(new Point2D.Double(0, -258), null);
            if (i == 0) bezel.moveTo(p.getX(), p.getY());
            else bezel.lineTo(p.getX(), p.getY());
        }
        bezel.closePath();
        Shape s = clockTranslation.createTransformedShape(bezel);

        Rectangle2D b = s.getBounds2D();
        g2d.setPaint(new GradientPaint(
            (float) b.getMinX(), (float) b.getMinY(), new Color(0x3274C0),
            (float) b.getMaxX(), (float) b.getMaxY(), new Color(0x123C70)));
        g2d.fill(s);
        g2d.setColor(new Color(0x8CC2F0));
        g2d.setStroke(new BasicStroke(1.5f));
        g2d.draw(s);

        // Numerals at the corners: rotate the point (0, -239) about the center
        g2d.setFont(numeralFont);
        g2d.setColor(new Color(0xE2F1FF));
        FontMetrics fm = g2d.getFontMetrics();
        for (int n = 1; n <= 12; n++) {
            Point2D p = rotatePoint(0, -239, n * 30);
            String t = String.valueOf(n);
            g2d.drawString(t,
                (float) (p.getX() - fm.stringWidth(t) / 2.0),
                (float) (p.getY() + (fm.getAscent() - fm.getDescent()) / 2.0));
        }
    }

    void drawFace(Graphics2D g2d, int sec, double minAngle, double hourAngle) {
        // Round face
        Point2D c = rotatePoint(0, 0, 0);
        g2d.setPaint(new RadialGradientPaint(
            new Point2D.Double(c.getX(), c.getY() - 78), 289f,
            new float[] {0f, 1f}, new Color[] {new Color(0x123B6E), new Color(0x06183A)}));
        g2d.fill(circle(c.getX(), c.getY(), 222));
        g2d.setColor(new Color(0x8CC2F0));
        g2d.setStroke(new BasicStroke(2f));
        g2d.draw(circle(c.getX(), c.getY(), 222));

        // Orbit rings
        g2d.setColor(new Color(0x1E3F6C));
        g2d.setStroke(new BasicStroke(2f));
        g2d.draw(clockTranslation.createTransformedShape(circle(0, 0, 160)));
        g2d.draw(clockTranslation.createTransformedShape(circle(0, 0, 100)));

        // Trails: arc from 12 o'clock to where the hand is now
        g2d.setStroke(new BasicStroke(7f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.setColor(new Color(0x24518F));
        g2d.draw(clockTranslation.createTransformedShape(trail(100, hourAngle)));
        g2d.setStroke(new BasicStroke(4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.setColor(new Color(0x3B78BE));
        g2d.draw(clockTranslation.createTransformedShape(trail(160, minAngle)));

        // 60 second dots: one dot at 12 o'clock, rotated i * 6 degrees.
        // Dots up to the current second are lit.
        for (int i = 0; i < 60; i++) {
            boolean big = i % 5 == 0;
            Shape dot = circle(0, -202, big ? 3.4 : 1.9);
            AffineTransform t = AffineTransform.getRotateInstance(Math.toRadians(i * 6));
            t.preConcatenate(clockTranslation);
            if (i > sec) g2d.setColor(new Color(0x2C5288));  // not yet
            else if (big) g2d.setColor(new Color(0xE2F1FF)); // lit, every 5 s
            else g2d.setColor(new Color(0x8FE8FF));          // lit
            g2d.fill(t.createTransformedShape(dot));
        }

        // Curved text: name on top, city on the bottom
        g2d.setFont(arcFont);
        g2d.setColor(new Color(0x8DB4DD));
        drawArcText(g2d, "B I H A S A", 128, true);
        drawArcText(g2d, "C A L O O C A N   C I T Y", 128, false);
    }

    // Arc on a ring, from 12 o'clock going clockwise by "degrees"
    Shape trail(double r, double degrees) {
        // Arc2D: 0 deg = 3 o'clock, negative extent = clockwise on screen
        return new Arc2D.Double(-r, -r, 2 * r, 2 * r, 90, -degrees, Arc2D.OPEN);
    }

    // Writes text letter by letter along a circle. Each letter is placed
    // with its own transform: rotate about the center, then translate.
    void drawArcText(Graphics2D g2d, String text, double r, boolean top) {
        FontMetrics fm = g2d.getFontMetrics();
        double total = Math.toDegrees(fm.stringWidth(text) / r);
        double angle = -total / 2; // start so the text is centered

        AffineTransform saved = g2d.getTransform();
        for (char ch : text.toCharArray()) {
            String s = String.valueOf(ch);
            double cw = Math.toDegrees(fm.charWidth(ch) / r);
            double mid = angle + cw / 2;

            AffineTransform t = new AffineTransform();
            if (top) {
                // letters stand on the outside of the circle, reading left to right
                t.rotate(Math.toRadians(mid));
                t.translate(0, -r);
            } else {
                // letters hang below the center, upright, reading left to right
                t.rotate(Math.toRadians(-mid));
                t.translate(0, r);
            }
            t.preConcatenate(clockTranslation);
            t.preConcatenate(saved);

            g2d.setTransform(t);
            float baseline = top ? 0f : fm.getAscent() - 2f;
            g2d.drawString(s, (float) (-fm.charWidth(ch) / 2.0), baseline);
            angle += cw;
        }
        g2d.setTransform(saved);
    }

    void drawHands(Graphics2D g2d, double hourAngle, double minAngle, double secAngle) {
        g2d.setStroke(new BasicStroke(1.4f));
        drawHand(g2d, hourHand, hourAngle, new Color(0x3D7BD9), new Color(0xE2F1FF));
        drawHand(g2d, minuteHand, minAngle, new Color(0x7DB8F0), new Color(0x06183A));
        drawHand(g2d, secondHand, secAngle, new Color(0x8FE8FF), null);

        // Center hub
        Point2D c = rotatePoint(0, 0, 0);
        g2d.setColor(new Color(0xE2F1FF));
        g2d.fill(circle(c.getX(), c.getY(), 9));
        g2d.setColor(new Color(0x3D7BD9));
        g2d.fill(circle(c.getX(), c.getY(), 4));
    }

    // Rotate the hand about (0,0), then translate it to the clock center
    void drawHand(Graphics2D g2d, Shape hand, double degrees, Color fill, Color outline) {
        handRotation.setToRotation(Math.toRadians(degrees));
        handTransform.setTransform(handRotation);
        handTransform.preConcatenate(clockTranslation);

        Shape s = handTransform.createTransformedShape(hand);
        g2d.setColor(fill);
        g2d.fill(s);
        if (outline != null) {
            g2d.setColor(outline);
            g2d.draw(s);
        }
    }

    // Rotates (x, y) clockwise by "degrees" about (0,0), then moves it
    // to the clock center
    Point2D rotatePoint(double x, double y, double degrees) {
        AffineTransform t = AffineTransform.getRotateInstance(Math.toRadians(degrees));
        t.preConcatenate(clockTranslation);
        return t.transform(new Point2D.Double(x, y), null);
    }

    // Location and digital time (HH:MM:SS) under the clock
    void displayLocationAndTime(Graphics2D g2d, ZonedDateTime now, double cx, double top) {
        // Location
        g2d.setFont(cityFont);
        g2d.setColor(new Color(0xE2F1FF));
        drawCentered(g2d, LOCATION, cx, top + 20);

        // HH : MM : SS tiles
        String[] parts = now.format(DateTimeFormatter.ofPattern("HH:mm:ss")).split(":");
        String[] labels = {"HOURS", "MINUTES", "SECONDS"};
        double tileW = 96, tileH = 66, colonW = 30;
        double tilesX = cx - (3 * tileW + 2 * colonW) / 2;
        double tileY = top + 38;

        for (int i = 0; i < 3; i++) {
            double tx = tilesX + i * (tileW + colonW);
            RoundRectangle2D tile = new RoundRectangle2D.Double(tx, tileY, tileW, tileH, 16, 16);
            g2d.setColor(new Color(0x0F2E58));
            g2d.fill(tile);
            g2d.setColor(new Color(0x3B78BE));
            g2d.setStroke(new BasicStroke(1.5f));
            g2d.draw(tile);

            g2d.setFont(digitFont);
            g2d.setColor(new Color(0xE2F1FF));
            drawCentered(g2d, parts[i], tx + tileW / 2, tileY + tileH / 2 + 15);

            g2d.setFont(labelFont);
            g2d.setColor(new Color(0x8DB4DD));
            drawCentered(g2d, labels[i], tx + tileW / 2, tileY + tileH + 17);

            if (i < 2) {
                g2d.setFont(digitFont);
                g2d.setColor(new Color(0x7DB8F0));
                drawCentered(g2d, ":", tx + tileW + colonW / 2, tileY + tileH / 2 + 13);
            }
        }

        // Date and time zone
        String date = now.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy"));
        g2d.setFont(dateFont);
        g2d.setColor(new Color(0x8DB4DD));
        drawCentered(g2d, date + "   •   PHT (UTC+08:00)", cx, tileY + tileH + 46);
    }

    // Draws text centered horizontally at x, with its baseline at y
    void drawCentered(Graphics2D g2d, String s, double x, double y) {
        FontMetrics fm = g2d.getFontMetrics();
        g2d.drawString(s, (float) (x - fm.stringWidth(s) / 2.0), (float) y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bihasa - Analog Clock (Caloocan Time)");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Bihasa_clock());
            frame.pack();
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
