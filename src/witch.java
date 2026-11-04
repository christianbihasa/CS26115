import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

// Portrait reconstructed automatically from the selected reference.
// Author (optional): 
public class witch extends Frame {

    static final int IMAGE_WIDTH = 800;
    static final int IMAGE_HEIGHT = 450;

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        Insets border = getInsets();
        int width = getWidth() - border.left - border.right;
        int height = getHeight() - border.top - border.bottom;
        double scale = Math.min(width / (double) IMAGE_WIDTH, height / (double) IMAGE_HEIGHT);
        g2d.translate(border.left + (width - IMAGE_WIDTH * scale) / 2,
                border.top + (height - IMAGE_HEIGHT * scale) / 2);
        g2d.scale(scale, scale);
        drawPortrait(g2d);
        g2d.dispose();
    }

    public static void drawPortrait(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.clip(new Rectangle2D.Double(0, 0, IMAGE_WIDTH, IMAGE_HEIGHT));
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, IMAGE_WIDTH, IMAGE_HEIGHT);

        witchPart1.drawPart(g2d);
        witchPart2.drawPart(g2d);
        witchPart3.drawPart(g2d);
        witchPart4.drawPart(g2d);
        witchPart5.drawPart(g2d);
        witchPart6.drawPart(g2d);
        witchPart7.drawPart(g2d);
        witchPart8.drawPart(g2d);
        witchPart9.drawPart(g2d);
    }

    public static void main(String[] argv) throws Exception {
        // Optional PNG output also works without opening a window.
        if (argv.length == 2 && argv[0].equals("--png")) {
            BufferedImage image = new BufferedImage(
                    IMAGE_WIDTH, IMAGE_HEIGHT, BufferedImage.TYPE_INT_RGB
            );
            Graphics2D g2d = image.createGraphics();
            drawPortrait(g2d);
            g2d.dispose();
            ImageIO.write(image, "png", new File(argv[1]));
            return;
        }

        witch sg = new witch();
        sg.setTitle("Generated Portrait");
        sg.setBackground(Color.white);
        sg.setForeground(Color.black);
        sg.setSize(IMAGE_WIDTH + 40, IMAGE_HEIGHT + 65);
        sg.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        sg.setVisible(true);
    }

}

class witchPart1 {

    public static void drawPart(Graphics2D g2d) {
        drawBaseColors(g2d);
        drawDetails1(g2d);
        drawDetails2(g2d);
        drawDetails3(g2d);
        drawDetails4(g2d);
        drawDetails5(g2d);
        drawDetails6(g2d);
        drawDetails7(g2d);
        drawDetails8(g2d);
        drawDetails9(g2d);
    }

    public static void drawBaseColors(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle1 = new Rectangle2D.Double(
                0, 0,
                800, 452.17
        );
        g2d.setColor(new Color(25, 37, 76));
        g2d.fill(rectangle1);

        // Square
        Rectangle2D.Double square2 = new Rectangle2D.Double(
                344.87, 117.59,
                297.67, 297.67
        );
        g2d.setColor(new Color(56, 81, 148));
        g2d.fill(square2);

        // Circle
        Ellipse2D.Double circle3 = new Ellipse2D.Double(
                -27.54, -33.19,
                285.06, 285.06
        );
        Rectangle2D bounds3 = circle3.getBounds2D();
        AffineTransform rotation3 = AffineTransform.getRotateInstance(
                Math.toRadians(281),
                bounds3.getCenterX(), bounds3.getCenterY()
        );
        Shape rotated3 = rotation3.createTransformedShape(circle3);
        g2d.setColor(new Color(8, 11, 19));
        g2d.fill(rotated3);

        // Rectangle
        Rectangle2D.Double rectangle4 = new Rectangle2D.Double(
                652.64, -21.59,
                148.56, 159.25
        );
        g2d.setColor(new Color(7, 6, 28));
        g2d.fill(rectangle4);

        // Square
        Rectangle2D.Double square5 = new Rectangle2D.Double(
                666.15, 173.79,
                159.79, 159.79
        );
        g2d.setColor(new Color(6, 8, 35));
        g2d.fill(square5);

        // Circle
        Ellipse2D.Double circle6 = new Ellipse2D.Double(
                -41.69, 280.13,
                168.5, 168.5
        );
        Rectangle2D bounds6 = circle6.getBounds2D();
        AffineTransform rotation6 = AffineTransform.getRotateInstance(
                Math.toRadians(81),
                bounds6.getCenterX(), bounds6.getCenterY()
        );
        Shape rotated6 = rotation6.createTransformedShape(circle6);
        g2d.setColor(new Color(5, 8, 28));
        g2d.fill(rotated6);

        // Ellipse
        Ellipse2D.Double ellipse7 = new Ellipse2D.Double(
                438.26, 40.82,
                23.69, 41.55
        );
        Rectangle2D bounds7 = ellipse7.getBounds2D();
        AffineTransform rotation7 = AffineTransform.getRotateInstance(
                Math.toRadians(152.92),
                bounds7.getCenterX(), bounds7.getCenterY()
        );
        Shape rotated7 = rotation7.createTransformedShape(ellipse7);
        g2d.setColor(new Color(166, 177, 172));
        g2d.fill(rotated7);

        // Line
        Line2D.Double line8 = new Line2D.Double(
                692.38, 428.45,
                861.73, 428.45
        );
        Rectangle2D bounds8 = line8.getBounds2D();
        AffineTransform rotation8 = AffineTransform.getRotateInstance(
                Math.toRadians(286),
                bounds8.getCenterX(), bounds8.getCenterY()
        );
        Shape rotated8 = rotation8.createTransformedShape(line8);
        g2d.setColor(new Color(2, 1, 25));
        BasicStroke bs8 = new BasicStroke(
                19.61f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs8);
        g2d.draw(rotated8);

        // Rectangle
        Rectangle2D.Double rectangle9 = new Rectangle2D.Double(
                668.14, 445.42,
                11.54, 4.8
        );
        g2d.setColor(new Color(13, 4, 50));
        g2d.fill(rectangle9);

        // Line
        Line2D.Double line10 = new Line2D.Double(
                322.98, 267.38,
                463.39, 267.38
        );
        Rectangle2D bounds10 = line10.getBounds2D();
        AffineTransform rotation10 = AffineTransform.getRotateInstance(
                Math.toRadians(108),
                bounds10.getCenterX(), bounds10.getCenterY()
        );
        Shape rotated10 = rotation10.createTransformedShape(line10);
        g2d.setColor(new Color(184, 205, 241));
        BasicStroke bs10 = new BasicStroke(
                23.59f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs10);
        g2d.draw(rotated10);

        // Rectangle
        Rectangle2D.Double rectangle11 = new Rectangle2D.Double(
                337.67, 101.45,
                149.86, 72.14
        );
        g2d.setColor(new Color(23, 45, 105));
        g2d.fill(rectangle11);

        // Arc
        Arc2D.Double arc12 = new Arc2D.Double(
                497.81, 153.28,
                201.75, 101.63,
                0, 134, Arc2D.PIE
        );
        Rectangle2D bounds12 = arc12.getBounds2D();
        AffineTransform rotation12 = AffineTransform.getRotateInstance(
                Math.toRadians(28),
                bounds12.getCenterX(), bounds12.getCenterY()
        );
        Shape rotated12 = rotation12.createTransformedShape(arc12);
        g2d.setColor(new Color(17, 37, 83));
        g2d.fill(rotated12);

        // Circle
        Ellipse2D.Double circle13 = new Ellipse2D.Double(
                -74.7, 166.59,
                169, 169
        );
        Rectangle2D bounds13 = circle13.getBounds2D();
        AffineTransform rotation13 = AffineTransform.getRotateInstance(
                Math.toRadians(100),
                bounds13.getCenterX(), bounds13.getCenterY()
        );
        Shape rotated13 = rotation13.createTransformedShape(circle13);
        g2d.setColor(new Color(5, 6, 16));
        g2d.fill(rotated13);

        // Ellipse
        Ellipse2D.Double ellipse14 = new Ellipse2D.Double(
                450.91, 213.13,
                26.3, 55.06
        );
        Rectangle2D bounds14 = ellipse14.getBounds2D();
        AffineTransform rotation14 = AffineTransform.getRotateInstance(
                Math.toRadians(1.42),
                bounds14.getCenterX(), bounds14.getCenterY()
        );
        Shape rotated14 = rotation14.createTransformedShape(ellipse14);
        g2d.setColor(new Color(8, 25, 77));
        g2d.fill(rotated14);

    }

    public static void drawDetails1(Graphics2D g2d) {

        // General path
        GeneralPath gp15 = new GeneralPath();
        gp15.moveTo(616.87, 330.34);
        gp15.lineTo(614.87, 331.34);
        gp15.lineTo(610.87, 336.34);
        gp15.lineTo(595.87, 349.34);
        gp15.lineTo(587.87, 357.34);
        gp15.lineTo(581.87, 365.34);
        gp15.lineTo(572.87, 380.34);
        gp15.lineTo(570.87, 385.34);
        gp15.lineTo(567.87, 394.34);
        gp15.lineTo(569.87, 399.34);
        gp15.lineTo(574.87, 390.34);
        gp15.lineTo(577.87, 389.34);
        gp15.lineTo(582.87, 379.34);
        gp15.lineTo(594.87, 367.34);
        gp15.lineTo(601.87, 360.34);
        gp15.lineTo(608.87, 352.34);
        gp15.lineTo(613.87, 343.34);
        gp15.lineTo(614.87, 337.34);
        gp15.closePath();
        g2d.setColor(new Color(167, 184, 222));
        g2d.fill(gp15);

        // Circle
        Ellipse2D.Double circle16 = new Ellipse2D.Double(
                719.81, 96.83,
                173.06, 173.06
        );
        Rectangle2D bounds16 = circle16.getBounds2D();
        AffineTransform rotation16 = AffineTransform.getRotateInstance(
                Math.toRadians(281),
                bounds16.getCenterX(), bounds16.getCenterY()
        );
        Shape rotated16 = rotation16.createTransformedShape(circle16);
        g2d.setColor(new Color(1, 1, 23));
        g2d.fill(rotated16);

        // Rectangle
        Rectangle2D.Double rectangle17 = new Rectangle2D.Double(
                568.03, -75.82,
                190.59, 156.4
        );
        g2d.setColor(new Color(13, 13, 26));
        g2d.fill(rectangle17);

        // Rectangle
        Rectangle2D.Double rectangle18 = new Rectangle2D.Double(
                715.98, 412.03,
                92.1, 40.16
        );
        g2d.setColor(new Color(1, 1, 28));
        g2d.fill(rectangle18);

        // Rectangle
        Rectangle2D.Double rectangle19 = new Rectangle2D.Double(
                329.72, 186.11,
                20.48, 8.19
        );
        Rectangle2D bounds19 = rectangle19.getBounds2D();
        AffineTransform rotation19 = AffineTransform.getRotateInstance(
                Math.toRadians(-28.3),
                bounds19.getCenterX(), bounds19.getCenterY()
        );
        Shape rotated19 = rotation19.createTransformedShape(rectangle19);
        g2d.setColor(new Color(104, 158, 220));
        g2d.fill(rotated19);

        // Ellipse
        Ellipse2D.Double ellipse20 = new Ellipse2D.Double(
                454.82, 36.62,
                24.14, 47.34
        );
        Rectangle2D bounds20 = ellipse20.getBounds2D();
        AffineTransform rotation20 = AffineTransform.getRotateInstance(
                Math.toRadians(142.14),
                bounds20.getCenterX(), bounds20.getCenterY()
        );
        Shape rotated20 = rotation20.createTransformedShape(ellipse20);
        g2d.setColor(new Color(113, 108, 115));
        g2d.fill(rotated20);

        // Circle
        Ellipse2D.Double circle21 = new Ellipse2D.Double(
                93.5, 301.15,
                8.95, 8.95
        );
        g2d.setColor(new Color(123, 138, 160));
        g2d.fill(circle21);

        // Arc
        Arc2D.Double arc22 = new Arc2D.Double(
                418.25, 50.8,
                24.58, 10.19,
                0, 78, Arc2D.PIE
        );
        Rectangle2D bounds22 = arc22.getBounds2D();
        AffineTransform rotation22 = AffineTransform.getRotateInstance(
                Math.toRadians(118),
                bounds22.getCenterX(), bounds22.getCenterY()
        );
        Shape rotated22 = rotation22.createTransformedShape(arc22);
        g2d.setColor(new Color(172, 218, 255));
        g2d.fill(rotated22);

        // General path
        GeneralPath gp23 = new GeneralPath();
        gp23.moveTo(762.65, 299.43);
        gp23.lineTo(770.87, 292.61);
        gp23.lineTo(779.09, 298.57);
        gp23.lineTo(770.87, 301.13);
        gp23.closePath();
        Rectangle2D bounds23 = gp23.getBounds2D();
        AffineTransform rotation23 = AffineTransform.getRotateInstance(
                Math.toRadians(33),
                bounds23.getCenterX(), bounds23.getCenterY()
        );
        Shape rotated23 = rotation23.createTransformedShape(gp23);
        g2d.setColor(new Color(51, 110, 137));
        g2d.fill(rotated23);

        // Quadratic curve
        QuadCurve2D.Double qc24 = new QuadCurve2D.Double(
                310.12, 263.86,
                368.68, 232.69,
                427.24, 263.86
        );
        Rectangle2D bounds24 = qc24.getBounds2D();
        AffineTransform rotation24 = AffineTransform.getRotateInstance(
                Math.toRadians(94),
                bounds24.getCenterX(), bounds24.getCenterY()
        );
        Shape rotated24 = rotation24.createTransformedShape(qc24);
        g2d.setColor(new Color(164, 183, 232));
        BasicStroke bs24 = new BasicStroke(
                20.37f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs24);
        g2d.draw(rotated24);

        // Cubic curve
        CubicCurve2D.Double cc25 = new CubicCurve2D.Double(
                149.35, 305.46,
                244.08, 148.82,
                370.39, 462.11,
                465.12, 305.46
        );
        Rectangle2D bounds25 = cc25.getBounds2D();
        AffineTransform rotation25 = AffineTransform.getRotateInstance(
                Math.toRadians(1),
                bounds25.getCenterX(), bounds25.getCenterY()
        );
        Shape rotated25 = rotation25.createTransformedShape(cc25);
        g2d.setColor(new Color(45, 55, 96));
        BasicStroke bs25 = new BasicStroke(
                20.17f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs25);
        g2d.draw(rotated25);

        // Square
        Rectangle2D.Double square26 = new Rectangle2D.Double(
                193.38, -104.2,
                234.48, 234.48
        );
        g2d.setColor(new Color(10, 20, 42));
        g2d.fill(square26);

    }

    public static void drawDetails2(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse27 = new Ellipse2D.Double(
                617.72, 91.43,
                25.3, 99.28
        );
        Rectangle2D bounds27 = ellipse27.getBounds2D();
        AffineTransform rotation27 = AffineTransform.getRotateInstance(
                Math.toRadians(134.2),
                bounds27.getCenterX(), bounds27.getCenterY()
        );
        Shape rotated27 = rotation27.createTransformedShape(ellipse27);
        g2d.setColor(new Color(114, 139, 198));
        g2d.fill(rotated27);

        // General path
        GeneralPath gp28 = new GeneralPath();
        gp28.moveTo(421.86, 145.62);
        gp28.lineTo(499.09, 78.81);
        gp28.lineTo(576.32, 137.27);
        gp28.lineTo(499.09, 162.32);
        gp28.closePath();
        Rectangle2D bounds28 = gp28.getBounds2D();
        AffineTransform rotation28 = AffineTransform.getRotateInstance(
                Math.toRadians(54),
                bounds28.getCenterX(), bounds28.getCenterY()
        );
        Shape rotated28 = rotation28.createTransformedShape(gp28);
        g2d.setColor(new Color(25, 51, 153));
        g2d.fill(rotated28);

        // Ellipse
        Ellipse2D.Double ellipse29 = new Ellipse2D.Double(
                382.77, 168.36,
                6.8, 15.16
        );
        Rectangle2D bounds29 = ellipse29.getBounds2D();
        AffineTransform rotation29 = AffineTransform.getRotateInstance(
                Math.toRadians(111.28),
                bounds29.getCenterX(), bounds29.getCenterY()
        );
        Shape rotated29 = rotation29.createTransformedShape(ellipse29);
        g2d.setColor(new Color(255, 255, 255));
        g2d.fill(rotated29);

        // Rectangle
        Rectangle2D.Double rectangle30 = new Rectangle2D.Double(
                615.43, 308.92,
                50.96, 22.95
        );
        g2d.setColor(new Color(55, 62, 81));
        g2d.fill(rectangle30);

        // Circle
        Ellipse2D.Double circle31 = new Ellipse2D.Double(
                684.66, 372.1,
                44.36, 44.36
        );
        Rectangle2D bounds31 = circle31.getBounds2D();
        AffineTransform rotation31 = AffineTransform.getRotateInstance(
                Math.toRadians(165),
                bounds31.getCenterX(), bounds31.getCenterY()
        );
        Shape rotated31 = rotation31.createTransformedShape(circle31);
        g2d.setColor(new Color(61, 73, 108));
        g2d.fill(rotated31);

        // Rectangle
        Rectangle2D.Double rectangle32 = new Rectangle2D.Double(
                549.61, -41.93,
                73.98, 90.77
        );
        g2d.setColor(new Color(41, 41, 40));
        g2d.fill(rectangle32);

        // Circle
        Ellipse2D.Double circle33 = new Ellipse2D.Double(
                462.74, 231.65,
                32.01, 32.01
        );
        g2d.setColor(new Color(3, 18, 57));
        g2d.fill(circle33);

        // Rectangle
        Rectangle2D.Double rectangle34 = new Rectangle2D.Double(
                480.56, 62.7,
                24.41, 20.05
        );
        g2d.setColor(new Color(7, 24, 108));
        g2d.fill(rectangle34);

        // Square
        Rectangle2D.Double square35 = new Rectangle2D.Double(
                757.4, 354.58,
                62.55, 62.55
        );
        g2d.setColor(new Color(9, 10, 38));
        g2d.fill(square35);

        // Ellipse
        Ellipse2D.Double ellipse36 = new Ellipse2D.Double(
                443.62, 51.09,
                17.1, 19.57
        );
        Rectangle2D bounds36 = ellipse36.getBounds2D();
        AffineTransform rotation36 = AffineTransform.getRotateInstance(
                Math.toRadians(347),
                bounds36.getCenterX(), bounds36.getCenterY()
        );
        Shape rotated36 = rotation36.createTransformedShape(ellipse36);
        g2d.setColor(new Color(175, 186, 165));
        g2d.fill(rotated36);

        // Rectangle
        Rectangle2D.Double rectangle37 = new Rectangle2D.Double(
                76.58, 281.16,
                25.67, 20.69
        );
        g2d.setColor(new Color(7, 9, 31));
        g2d.fill(rectangle37);

        // Square
        Rectangle2D.Double square38 = new Rectangle2D.Double(
                688.08, 441.47,
                28.89, 28.89
        );
        g2d.setColor(new Color(9, 10, 46));
        g2d.fill(square38);

        // Square
        Rectangle2D.Double square39 = new Rectangle2D.Double(
                625.79, 28.42,
                20.28, 20.28
        );
        g2d.setColor(new Color(32, 28, 29));
        g2d.fill(square39);

        // Rectangle
        Rectangle2D.Double rectangle40 = new Rectangle2D.Double(
                749.1, 225.68,
                16.38, 20.78
        );
        g2d.setColor(new Color(14, 15, 33));
        g2d.fill(rectangle40);

        // Circle
        Ellipse2D.Double circle41 = new Ellipse2D.Double(
                364.92, 296.88,
                52.96, 52.96
        );
        g2d.setColor(new Color(181, 176, 222));
        g2d.fill(circle41);

        // Square
        Rectangle2D.Double square42 = new Rectangle2D.Double(
                154.28, 251.89,
                143.47, 143.47
        );
        g2d.setColor(new Color(33, 54, 118));
        g2d.fill(square42);

        // Rectangle
        Rectangle2D.Double rectangle43 = new Rectangle2D.Double(
                440.62, 300.18,
                125.71, 146.3
        );
        g2d.setColor(new Color(28, 56, 121));
        g2d.fill(rectangle43);

    }

    public static void drawDetails3(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse44 = new Ellipse2D.Double(
                357.53, 219.71,
                61.06, 74.69
        );
        Rectangle2D bounds44 = ellipse44.getBounds2D();
        AffineTransform rotation44 = AffineTransform.getRotateInstance(
                Math.toRadians(309),
                bounds44.getCenterX(), bounds44.getCenterY()
        );
        Shape rotated44 = rotation44.createTransformedShape(ellipse44);
        g2d.setColor(new Color(182, 218, 252));
        g2d.fill(rotated44);

        // Square
        Rectangle2D.Double square45 = new Rectangle2D.Double(
                -10.64, -19.54,
                229.03, 229.03
        );
        g2d.setColor(new Color(7, 9, 15));
        g2d.fill(square45);

        // Ellipse
        Ellipse2D.Double ellipse46 = new Ellipse2D.Double(
                333.34, 42.1,
                30.41, 69.55
        );
        Rectangle2D bounds46 = ellipse46.getBounds2D();
        AffineTransform rotation46 = AffineTransform.getRotateInstance(
                Math.toRadians(45.16),
                bounds46.getCenterX(), bounds46.getCenterY()
        );
        Shape rotated46 = rotation46.createTransformedShape(ellipse46);
        g2d.setColor(new Color(19, 52, 95));
        g2d.fill(rotated46);

        // Rectangle
        Rectangle2D.Double rectangle47 = new Rectangle2D.Double(
                482.44, 124.23,
                20.32, 83.9
        );
        Rectangle2D bounds47 = rectangle47.getBounds2D();
        AffineTransform rotation47 = AffineTransform.getRotateInstance(
                Math.toRadians(-88.39),
                bounds47.getCenterX(), bounds47.getCenterY()
        );
        Shape rotated47 = rotation47.createTransformedShape(rectangle47);
        g2d.setColor(new Color(3, 14, 50));
        g2d.fill(rotated47);

        // Ellipse
        Ellipse2D.Double ellipse48 = new Ellipse2D.Double(
                460.89, 84.54,
                30.57, 106.57
        );
        Rectangle2D bounds48 = ellipse48.getBounds2D();
        AffineTransform rotation48 = AffineTransform.getRotateInstance(
                Math.toRadians(95.69),
                bounds48.getCenterX(), bounds48.getCenterY()
        );
        Shape rotated48 = rotation48.createTransformedShape(ellipse48);
        g2d.setColor(new Color(44, 90, 198));
        g2d.fill(rotated48);

        // Ellipse
        Ellipse2D.Double ellipse49 = new Ellipse2D.Double(
                638.47, 316.18,
                41.25, 86.65
        );
        Rectangle2D bounds49 = ellipse49.getBounds2D();
        AffineTransform rotation49 = AffineTransform.getRotateInstance(
                Math.toRadians(121.76),
                bounds49.getCenterX(), bounds49.getCenterY()
        );
        Shape rotated49 = rotation49.createTransformedShape(ellipse49);
        g2d.setColor(new Color(6, 24, 80));
        g2d.fill(rotated49);

        // Square
        Rectangle2D.Double square50 = new Rectangle2D.Double(
                412.37, -53.3,
                94.08, 94.08
        );
        g2d.setColor(new Color(8, 17, 59));
        g2d.fill(square50);

        // Rectangle
        Rectangle2D.Double rectangle51 = new Rectangle2D.Double(
                520.16, -24.42,
                41.61, 52.28
        );
        g2d.setColor(new Color(63, 64, 55));
        g2d.fill(rectangle51);

        // General path
        GeneralPath gp52 = new GeneralPath();
        gp52.moveTo(725.46, 360.62);
        gp52.lineTo(714.46, 365.62);
        gp52.lineTo(709.46, 367.62);
        gp52.lineTo(705.46, 369.62);
        gp52.lineTo(703.46, 373.62);
        gp52.lineTo(695.46, 388.62);
        gp52.lineTo(693.46, 402.62);
        gp52.lineTo(697.46, 400.62);
        gp52.lineTo(701.46, 407.62);
        gp52.lineTo(693.46, 425.62);
        gp52.lineTo(695.46, 438.62);
        gp52.lineTo(697.46, 440.62);
        gp52.lineTo(703.46, 420.62);
        gp52.lineTo(705.46, 412.62);
        gp52.lineTo(709.46, 411.62);
        gp52.lineTo(706.46, 406.62);
        gp52.lineTo(708.46, 400.62);
        gp52.lineTo(712.46, 390.62);
        gp52.closePath();
        g2d.setColor(new Color(80, 93, 123));
        g2d.fill(gp52);

        // Square
        Rectangle2D.Double square53 = new Rectangle2D.Double(
                349.84, 0.74,
                45.16, 45.16
        );
        g2d.setColor(new Color(11, 22, 66));
        g2d.fill(square53);

        // General path
        GeneralPath gp54 = new GeneralPath();
        gp54.moveTo(428.14, 99.03);
        gp54.lineTo(445.9, 71.62);
        gp54.lineTo(463.66, 95.6);
        gp54.lineTo(445.9, 105.88);
        gp54.closePath();
        Rectangle2D bounds54 = gp54.getBounds2D();
        AffineTransform rotation54 = AffineTransform.getRotateInstance(
                Math.toRadians(229),
                bounds54.getCenterX(), bounds54.getCenterY()
        );
        Shape rotated54 = rotation54.createTransformedShape(gp54);
        g2d.setColor(new Color(15, 36, 115));
        g2d.fill(rotated54);

        // Ellipse
        Ellipse2D.Double ellipse55 = new Ellipse2D.Double(
                633.77, 299.41,
                24.95, 24.19
        );
        Rectangle2D bounds55 = ellipse55.getBounds2D();
        AffineTransform rotation55 = AffineTransform.getRotateInstance(
                Math.toRadians(270),
                bounds55.getCenterX(), bounds55.getCenterY()
        );
        Shape rotated55 = rotation55.createTransformedShape(ellipse55);
        g2d.setColor(new Color(90, 87, 68));
        g2d.fill(rotated55);

        // Square
        Rectangle2D.Double square56 = new Rectangle2D.Double(
                467.54, 47.79,
                15.04, 15.04
        );
        g2d.setColor(new Color(99, 91, 111));
        g2d.fill(square56);

    }

    public static void drawDetails4(Graphics2D g2d) {

        // General path
        GeneralPath gp57 = new GeneralPath();
        gp57.moveTo(629.18, 277.99);
        gp57.lineTo(628.18, 277.99);
        gp57.lineTo(625.18, 285.99);
        gp57.lineTo(619.18, 303.99);
        gp57.lineTo(616.18, 308.99);
        gp57.lineTo(614.18, 316.99);
        gp57.lineTo(608.18, 327.99);
        gp57.lineTo(606.18, 332.99);
        gp57.lineTo(619.18, 318.99);
        gp57.lineTo(620.18, 322.99);
        gp57.lineTo(621.18, 324.99);
        gp57.lineTo(623.18, 319.99);
        gp57.lineTo(627.18, 313.99);
        gp57.lineTo(630.18, 308.99);
        gp57.lineTo(625.18, 313.99);
        gp57.lineTo(626.18, 309.99);
        gp57.lineTo(623.18, 311.99);
        gp57.lineTo(625.18, 296.99);
        gp57.closePath();
        g2d.setColor(new Color(0, 30, 102));
        g2d.fill(gp57);

        // Circle
        Ellipse2D.Double circle58 = new Ellipse2D.Double(
                573.48, 26.4,
                8.63, 8.63
        );
        Rectangle2D bounds58 = circle58.getBounds2D();
        AffineTransform rotation58 = AffineTransform.getRotateInstance(
                Math.toRadians(51),
                bounds58.getCenterX(), bounds58.getCenterY()
        );
        Shape rotated58 = rotation58.createTransformedShape(circle58);
        g2d.setColor(new Color(89, 91, 101));
        g2d.fill(rotated58);

        // Square
        Rectangle2D.Double square59 = new Rectangle2D.Double(
                617.86, 7.22,
                26.04, 26.04
        );
        g2d.setColor(new Color(23, 19, 20));
        g2d.fill(square59);

        // Circle
        Ellipse2D.Double circle60 = new Ellipse2D.Double(
                699.89, 430.84,
                26.3, 26.3
        );
        Rectangle2D bounds60 = circle60.getBounds2D();
        AffineTransform rotation60 = AffineTransform.getRotateInstance(
                Math.toRadians(289),
                bounds60.getCenterX(), bounds60.getCenterY()
        );
        Shape rotated60 = rotation60.createTransformedShape(circle60);
        g2d.setColor(new Color(4, 7, 44));
        g2d.fill(rotated60);

        // Quadratic curve
        QuadCurve2D.Double qc61 = new QuadCurve2D.Double(
                83.98, 309,
                96.18, 293.64,
                108.38, 309
        );
        Rectangle2D bounds61 = qc61.getBounds2D();
        AffineTransform rotation61 = AffineTransform.getRotateInstance(
                Math.toRadians(13),
                bounds61.getCenterX(), bounds61.getCenterY()
        );
        Shape rotated61 = rotation61.createTransformedShape(qc61);
        g2d.setColor(new Color(0, 3, 32));
        BasicStroke bs61 = new BasicStroke(
                3.24f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs61);
        g2d.draw(rotated61);

        // Square
        Rectangle2D.Double square62 = new Rectangle2D.Double(
                783.55, 389.11,
                29.1, 29.1
        );
        g2d.setColor(new Color(0, 0, 23));
        g2d.fill(square62);

        // Area / transformation
        Ellipse2D.Double outer63 = new Ellipse2D.Double(
                495.49, 187.97,
                214.56, 87.68
        );
        Ellipse2D.Double cutout63 = new Ellipse2D.Double(
                495.49 + 214.56 * 0.28,
                187.97 - 87.68 * 0.12,
                214.56, 87.68
        );
        Area area63 = new Area(outer63);
        area63.subtract(new Area(cutout63));
        Rectangle2D bounds63 = area63.getBounds2D();
        AffineTransform rotation63 = AffineTransform.getRotateInstance(
                Math.toRadians(277),
                bounds63.getCenterX(), bounds63.getCenterY()
        );
        Shape rotated63 = rotation63.createTransformedShape(area63);
        g2d.setColor(new Color(95, 133, 198));
        g2d.fill(rotated63);

        // Ellipse
        Ellipse2D.Double ellipse64 = new Ellipse2D.Double(
                166.12, 254.53,
                27.43, 70.39
        );
        Rectangle2D bounds64 = ellipse64.getBounds2D();
        AffineTransform rotation64 = AffineTransform.getRotateInstance(
                Math.toRadians(144.5),
                bounds64.getCenterX(), bounds64.getCenterY()
        );
        Shape rotated64 = rotation64.createTransformedShape(ellipse64);
        g2d.setColor(new Color(100, 104, 177));
        g2d.fill(rotated64);

        // Quadratic curve
        QuadCurve2D.Double qc65 = new QuadCurve2D.Double(
                332.81, 347.83,
                456.52, 266.03,
                580.24, 347.83
        );
        Rectangle2D bounds65 = qc65.getBounds2D();
        AffineTransform rotation65 = AffineTransform.getRotateInstance(
                Math.toRadians(266),
                bounds65.getCenterX(), bounds65.getCenterY()
        );
        Shape rotated65 = rotation65.createTransformedShape(qc65);
        g2d.setColor(new Color(36, 39, 84));
        BasicStroke bs65 = new BasicStroke(
                17.02f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs65);
        g2d.draw(rotated65);

        // Area / transformation
        Ellipse2D.Double outer66 = new Ellipse2D.Double(
                240.81, 158.07,
                187.95, 136.04
        );
        Ellipse2D.Double cutout66 = new Ellipse2D.Double(
                240.81 + 187.95 * 0.28,
                158.07 - 136.04 * 0.12,
                187.95, 136.04
        );
        Area area66 = new Area(outer66);
        area66.subtract(new Area(cutout66));
        Rectangle2D bounds66 = area66.getBounds2D();
        AffineTransform rotation66 = AffineTransform.getRotateInstance(
                Math.toRadians(20),
                bounds66.getCenterX(), bounds66.getCenterY()
        );
        Shape rotated66 = rotation66.createTransformedShape(area66);
        g2d.setColor(new Color(35, 59, 109));
        g2d.fill(rotated66);

        // Ellipse
        Ellipse2D.Double ellipse67 = new Ellipse2D.Double(
                220.22, 279.84,
                31.1, 57.1
        );
        Rectangle2D bounds67 = ellipse67.getBounds2D();
        AffineTransform rotation67 = AffineTransform.getRotateInstance(
                Math.toRadians(102.07),
                bounds67.getCenterX(), bounds67.getCenterY()
        );
        Shape rotated67 = rotation67.createTransformedShape(ellipse67);
        g2d.setColor(new Color(4, 19, 53));
        g2d.fill(rotated67);

    }

    public static void drawDetails5(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse68 = new Ellipse2D.Double(
                510.22, 355.59,
                56.44, 101.36
        );
        g2d.setColor(new Color(16, 61, 155));
        g2d.fill(ellipse68);

        // Ellipse
        Ellipse2D.Double ellipse69 = new Ellipse2D.Double(
                72.48, 372.6,
                110.45, 95.58
        );
        Rectangle2D bounds69 = ellipse69.getBounds2D();
        AffineTransform rotation69 = AffineTransform.getRotateInstance(
                Math.toRadians(44),
                bounds69.getCenterX(), bounds69.getCenterY()
        );
        Shape rotated69 = rotation69.createTransformedShape(ellipse69);
        g2d.setColor(new Color(9, 15, 55));
        g2d.fill(rotated69);

        // Area / transformation
        Ellipse2D.Double outer70 = new Ellipse2D.Double(
                375.28, 171.22,
                66.78, 57.39
        );
        Ellipse2D.Double cutout70 = new Ellipse2D.Double(
                375.28 + 66.78 * 0.28,
                171.22 - 57.39 * 0.12,
                66.78, 57.39
        );
        Area area70 = new Area(outer70);
        area70.subtract(new Area(cutout70));
        Rectangle2D bounds70 = area70.getBounds2D();
        AffineTransform rotation70 = AffineTransform.getRotateInstance(
                Math.toRadians(288),
                bounds70.getCenterX(), bounds70.getCenterY()
        );
        Shape rotated70 = rotation70.createTransformedShape(area70);
        g2d.setColor(new Color(127, 145, 215));
        g2d.fill(rotated70);

        // Rectangle
        Rectangle2D.Double rectangle71 = new Rectangle2D.Double(
                335.39, 216.03,
                20.35, 36.56
        );
        Rectangle2D bounds71 = rectangle71.getBounds2D();
        AffineTransform rotation71 = AffineTransform.getRotateInstance(
                Math.toRadians(-47.6),
                bounds71.getCenterX(), bounds71.getCenterY()
        );
        Shape rotated71 = rotation71.createTransformedShape(rectangle71);
        g2d.setColor(new Color(42, 68, 185));
        g2d.fill(rotated71);

        // Rectangle
        Rectangle2D.Double rectangle72 = new Rectangle2D.Double(
                662.66, 254.23,
                92.06, 91.53
        );
        g2d.setColor(new Color(13, 14, 44));
        g2d.fill(rectangle72);

        // Arc
        Arc2D.Double arc73 = new Arc2D.Double(
                46.38, 19.87,
                104.27, 69.39,
                0, 236, Arc2D.PIE
        );
        Rectangle2D bounds73 = arc73.getBounds2D();
        AffineTransform rotation73 = AffineTransform.getRotateInstance(
                Math.toRadians(147),
                bounds73.getCenterX(), bounds73.getCenterY()
        );
        Shape rotated73 = rotation73.createTransformedShape(arc73);
        g2d.setColor(new Color(30, 31, 27));
        g2d.fill(rotated73);

        // Ellipse
        Ellipse2D.Double ellipse74 = new Ellipse2D.Double(
                346.48, 258.03,
                13.04, 16.48
        );
        Rectangle2D bounds74 = ellipse74.getBounds2D();
        AffineTransform rotation74 = AffineTransform.getRotateInstance(
                Math.toRadians(165.2),
                bounds74.getCenterX(), bounds74.getCenterY()
        );
        Shape rotated74 = rotation74.createTransformedShape(ellipse74);
        g2d.setColor(new Color(145, 163, 253));
        g2d.fill(rotated74);

        // Rectangle
        Rectangle2D.Double rectangle75 = new Rectangle2D.Double(
                202.1, -22.2,
                95.26, 119.49
        );
        g2d.setColor(new Color(7, 12, 23));
        g2d.fill(rectangle75);

        // Rectangle
        Rectangle2D.Double rectangle76 = new Rectangle2D.Double(
                335.89, 92.99,
                82.19, 52.75
        );
        g2d.setColor(new Color(17, 29, 64));
        g2d.fill(rectangle76);

        // General path
        GeneralPath gp77 = new GeneralPath();
        gp77.moveTo(361.46, 312.11);
        gp77.lineTo(366.46, 317.11);
        gp77.lineTo(370.46, 323.11);
        gp77.lineTo(376.46, 329.11);
        gp77.lineTo(386.46, 328.11);
        gp77.lineTo(396.46, 331.11);
        gp77.lineTo(400.46, 336.11);
        gp77.lineTo(402.46, 334.11);
        gp77.lineTo(404.46, 332.11);
        gp77.lineTo(408.46, 334.11);
        gp77.lineTo(412.46, 333.11);
        gp77.lineTo(401.46, 330.11);
        gp77.lineTo(401.46, 327.11);
        gp77.lineTo(397.46, 323.11);
        gp77.lineTo(403.46, 319.11);
        gp77.lineTo(407.46, 317.11);
        gp77.lineTo(383.46, 310.11);
        gp77.lineTo(373.46, 309.11);
        gp77.closePath();
        g2d.setColor(new Color(244, 233, 255));
        g2d.fill(gp77);

        // Ellipse
        Ellipse2D.Double ellipse78 = new Ellipse2D.Double(
                398.46, 287.4,
                12.06, 17.46
        );
        Rectangle2D bounds78 = ellipse78.getBounds2D();
        AffineTransform rotation78 = AffineTransform.getRotateInstance(
                Math.toRadians(64.1),
                bounds78.getCenterX(), bounds78.getCenterY()
        );
        Shape rotated78 = rotation78.createTransformedShape(ellipse78);
        g2d.setColor(new Color(127, 151, 239));
        g2d.fill(rotated78);

        // Rectangle
        Rectangle2D.Double rectangle79 = new Rectangle2D.Double(
                428.61, 4.41,
                17.1, 7.23
        );
        Rectangle2D bounds79 = rectangle79.getBounds2D();
        AffineTransform rotation79 = AffineTransform.getRotateInstance(
                Math.toRadians(-80.54),
                bounds79.getCenterX(), bounds79.getCenterY()
        );
        Shape rotated79 = rotation79.createTransformedShape(rectangle79);
        g2d.setColor(new Color(18, 35, 188));
        g2d.fill(rotated79);

        // Rectangle
        Rectangle2D.Double rectangle80 = new Rectangle2D.Double(
                430.96, 102.04,
                56.56, 26.35
        );
        g2d.setColor(new Color(18, 56, 166));
        g2d.fill(rectangle80);

    }

    public static void drawDetails6(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse81 = new Ellipse2D.Double(
                180.82, 324.75,
                29.67, 20.06
        );
        Rectangle2D bounds81 = ellipse81.getBounds2D();
        AffineTransform rotation81 = AffineTransform.getRotateInstance(
                Math.toRadians(193),
                bounds81.getCenterX(), bounds81.getCenterY()
        );
        Shape rotated81 = rotation81.createTransformedShape(ellipse81);
        g2d.setColor(new Color(7, 19, 67));
        g2d.fill(rotated81);

        // Rectangle
        Rectangle2D.Double rectangle82 = new Rectangle2D.Double(
                494.04, 437.88,
                14.99, 12.23
        );
        g2d.setColor(new Color(37, 33, 20));
        g2d.fill(rectangle82);

        // Square
        Rectangle2D.Double square83 = new Rectangle2D.Double(
                377.81, 38.48,
                46.7, 46.7
        );
        g2d.setColor(new Color(2, 5, 22));
        g2d.fill(square83);

        // Rectangle
        Rectangle2D.Double rectangle84 = new Rectangle2D.Double(
                314.12, 40.92,
                39.15, 40.41
        );
        g2d.setColor(new Color(15, 40, 71));
        g2d.fill(rectangle84);

        // Ellipse
        Ellipse2D.Double ellipse85 = new Ellipse2D.Double(
                140.43, 353.22,
                23.85, 8.59
        );
        Rectangle2D bounds85 = ellipse85.getBounds2D();
        AffineTransform rotation85 = AffineTransform.getRotateInstance(
                Math.toRadians(114),
                bounds85.getCenterX(), bounds85.getCenterY()
        );
        Shape rotated85 = rotation85.createTransformedShape(ellipse85);
        g2d.setColor(new Color(83, 94, 142));
        g2d.fill(rotated85);

        // Ellipse
        Ellipse2D.Double ellipse86 = new Ellipse2D.Double(
                498.99, 136.92,
                10.31, 20.2
        );
        Rectangle2D bounds86 = ellipse86.getBounds2D();
        AffineTransform rotation86 = AffineTransform.getRotateInstance(
                Math.toRadians(74.75),
                bounds86.getCenterX(), bounds86.getCenterY()
        );
        Shape rotated86 = rotation86.createTransformedShape(ellipse86);
        g2d.setColor(new Color(103, 137, 236));
        g2d.fill(rotated86);

        // Rectangle
        Rectangle2D.Double rectangle87 = new Rectangle2D.Double(
                557.26, 13.53,
                7.19, 22.2
        );
        Rectangle2D bounds87 = rectangle87.getBounds2D();
        AffineTransform rotation87 = AffineTransform.getRotateInstance(
                Math.toRadians(-60.26),
                bounds87.getCenterX(), bounds87.getCenterY()
        );
        Shape rotated87 = rotation87.createTransformedShape(rectangle87);
        g2d.setColor(new Color(85, 91, 109));
        g2d.fill(rotated87);

        // Rectangle
        Rectangle2D.Double rectangle88 = new Rectangle2D.Double(
                460.51, 31.96,
                33.81, 16.34
        );
        g2d.setColor(new Color(6, 13, 32));
        g2d.fill(rectangle88);

        // Circle
        Ellipse2D.Double circle89 = new Ellipse2D.Double(
                141.52, -8.14,
                21.29, 21.29
        );
        Rectangle2D bounds89 = circle89.getBounds2D();
        AffineTransform rotation89 = AffineTransform.getRotateInstance(
                Math.toRadians(192),
                bounds89.getCenterX(), bounds89.getCenterY()
        );
        Shape rotated89 = rotation89.createTransformedShape(circle89);
        g2d.setColor(new Color(45, 45, 34));
        g2d.fill(rotated89);

        // Rectangle
        Rectangle2D.Double rectangle90 = new Rectangle2D.Double(
                688.44, 382.58,
                69.98, 14.41
        );
        Rectangle2D bounds90 = rectangle90.getBounds2D();
        AffineTransform rotation90 = AffineTransform.getRotateInstance(
                Math.toRadians(-65.9),
                bounds90.getCenterX(), bounds90.getCenterY()
        );
        Shape rotated90 = rotation90.createTransformedShape(rectangle90);
        g2d.setColor(new Color(46, 54, 88));
        g2d.fill(rotated90);

        // Circle
        Ellipse2D.Double circle91 = new Ellipse2D.Double(
                382.84, 16.64,
                13, 13
        );
        g2d.setColor(new Color(34, 50, 118));
        g2d.fill(circle91);

        // Ellipse
        Ellipse2D.Double ellipse92 = new Ellipse2D.Double(
                517.09, 14.46,
                5.2, 28.68
        );
        Rectangle2D bounds92 = ellipse92.getBounds2D();
        AffineTransform rotation92 = AffineTransform.getRotateInstance(
                Math.toRadians(67.11),
                bounds92.getCenterX(), bounds92.getCenterY()
        );
        Shape rotated92 = rotation92.createTransformedShape(ellipse92);
        g2d.setColor(new Color(11, 9, 0));
        g2d.fill(rotated92);

        // Square
        Rectangle2D.Double square93 = new Rectangle2D.Double(
                454.68, -0.73,
                22.81, 22.81
        );
        g2d.setColor(new Color(19, 34, 88));
        g2d.fill(square93);

        // Rectangle
        Rectangle2D.Double rectangle94 = new Rectangle2D.Double(
                503.37, 130.69,
                2.69, 51.91
        );
        Rectangle2D bounds94 = rectangle94.getBounds2D();
        AffineTransform rotation94 = AffineTransform.getRotateInstance(
                Math.toRadians(-88.64),
                bounds94.getCenterX(), bounds94.getCenterY()
        );
        Shape rotated94 = rotation94.createTransformedShape(rectangle94);
        g2d.setColor(new Color(0, 0, 0));
        g2d.fill(rotated94);

        // Ellipse
        Ellipse2D.Double ellipse95 = new Ellipse2D.Double(
                412.76, -30.18,
                18.28, 58.58
        );
        Rectangle2D bounds95 = ellipse95.getBounds2D();
        AffineTransform rotation95 = AffineTransform.getRotateInstance(
                Math.toRadians(18.9),
                bounds95.getCenterX(), bounds95.getCenterY()
        );
        Shape rotated95 = rotation95.createTransformedShape(ellipse95);
        g2d.setColor(new Color(15, 19, 97));
        g2d.fill(rotated95);

    }

    public static void drawDetails7(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse96 = new Ellipse2D.Double(
                167.72, -9.66,
                7.21, 60.95
        );
        Rectangle2D bounds96 = ellipse96.getBounds2D();
        AffineTransform rotation96 = AffineTransform.getRotateInstance(
                Math.toRadians(20.19),
                bounds96.getCenterX(), bounds96.getCenterY()
        );
        Shape rotated96 = rotation96.createTransformedShape(ellipse96);
        g2d.setColor(new Color(45, 43, 29));
        g2d.fill(rotated96);

        // Rectangle
        Rectangle2D.Double rectangle97 = new Rectangle2D.Double(
                439.48, 50.99,
                2.4, 21.04
        );
        Rectangle2D bounds97 = rectangle97.getBounds2D();
        AffineTransform rotation97 = AffineTransform.getRotateInstance(
                Math.toRadians(-11.31),
                bounds97.getCenterX(), bounds97.getCenterY()
        );
        Shape rotated97 = rotation97.createTransformedShape(rectangle97);
        g2d.setColor(new Color(230, 255, 255));
        g2d.fill(rotated97);

        // Rectangle
        Rectangle2D.Double rectangle98 = new Rectangle2D.Double(
                432.69, 147.53,
                17.89, 18.05
        );
        g2d.setColor(new Color(10, 22, 65));
        g2d.fill(rectangle98);

        // General path
        GeneralPath gp99 = new GeneralPath();
        gp99.moveTo(453.31, 77.39);
        gp99.lineTo(461.46, 62.64);
        gp99.lineTo(469.61, 75.55);
        gp99.lineTo(461.46, 81.08);
        gp99.closePath();
        Rectangle2D bounds99 = gp99.getBounds2D();
        AffineTransform rotation99 = AffineTransform.getRotateInstance(
                Math.toRadians(234),
                bounds99.getCenterX(), bounds99.getCenterY()
        );
        Shape rotated99 = rotation99.createTransformedShape(gp99);
        g2d.setColor(new Color(155, 150, 150));
        g2d.fill(rotated99);

        // Square
        Rectangle2D.Double square100 = new Rectangle2D.Double(
                453.04, 142.49,
                9.82, 9.82
        );
        g2d.setColor(new Color(74, 127, 214));
        g2d.fill(square100);

        // Circle
        Ellipse2D.Double circle101 = new Ellipse2D.Double(
                670.84, 376.52,
                22.32, 22.32
        );
        g2d.setColor(new Color(21, 28, 80));
        g2d.fill(circle101);

        // Square
        Rectangle2D.Double square102 = new Rectangle2D.Double(
                629.19, 355.38,
                16, 16
        );
        g2d.setColor(new Color(11, 37, 107));
        g2d.fill(square102);

        // Ellipse
        Ellipse2D.Double ellipse103 = new Ellipse2D.Double(
                511.28, 1.78,
                14.77, 28.65
        );
        Rectangle2D bounds103 = ellipse103.getBounds2D();
        AffineTransform rotation103 = AffineTransform.getRotateInstance(
                Math.toRadians(57.65),
                bounds103.getCenterX(), bounds103.getCenterY()
        );
        Shape rotated103 = rotation103.createTransformedShape(ellipse103);
        g2d.setColor(new Color(65, 70, 57));
        g2d.fill(rotated103);

        // Line
        Line2D.Double line104 = new Line2D.Double(
                681.06, 413.49,
                708.57, 413.49
        );
        Rectangle2D bounds104 = line104.getBounds2D();
        AffineTransform rotation104 = AffineTransform.getRotateInstance(
                Math.toRadians(280),
                bounds104.getCenterX(), bounds104.getCenterY()
        );
        Shape rotated104 = rotation104.createTransformedShape(line104);
        g2d.setColor(new Color(108, 127, 157));
        BasicStroke bs104 = new BasicStroke(
                3.23f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs104);
        g2d.draw(rotated104);

        // Arc
        Arc2D.Double arc105 = new Arc2D.Double(
                614.18, 298.84,
                18.98, 22.52,
                0, 102, Arc2D.OPEN
        );
        Rectangle2D bounds105 = arc105.getBounds2D();
        AffineTransform rotation105 = AffineTransform.getRotateInstance(
                Math.toRadians(44),
                bounds105.getCenterX(), bounds105.getCenterY()
        );
        Shape rotated105 = rotation105.createTransformedShape(arc105);
        g2d.setColor(new Color(115, 131, 183));
        BasicStroke bs105 = new BasicStroke(
                4.29f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs105);
        g2d.draw(rotated105);

        // Ellipse
        Ellipse2D.Double ellipse106 = new Ellipse2D.Double(
                508.56, -2.37,
                12.2, 9.34
        );
        Rectangle2D bounds106 = ellipse106.getBounds2D();
        AffineTransform rotation106 = AffineTransform.getRotateInstance(
                Math.toRadians(208),
                bounds106.getCenterX(), bounds106.getCenterY()
        );
        Shape rotated106 = rotation106.createTransformedShape(ellipse106);
        g2d.setColor(new Color(0, 4, 27));
        g2d.fill(rotated106);

        // Circle
        Ellipse2D.Double circle107 = new Ellipse2D.Double(
                490.53, 1.7,
                8.39, 8.39
        );
        g2d.setColor(new Color(9, 36, 119));
        g2d.fill(circle107);

        // Rectangle
        Rectangle2D.Double rectangle108 = new Rectangle2D.Double(
                365.5, -6.5,
                10, 23
        );
        Rectangle2D bounds108 = rectangle108.getBounds2D();
        AffineTransform rotation108 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds108.getCenterX(), bounds108.getCenterY()
        );
        Shape rotated108 = rotation108.createTransformedShape(rectangle108);
        g2d.setColor(new Color(8, 14, 35));
        g2d.fill(rotated108);

        // Square
        Rectangle2D.Double square109 = new Rectangle2D.Double(
                68.13, 291.35,
                25.03, 25.03
        );
        g2d.setColor(new Color(6, 10, 30));
        g2d.fill(square109);

    }

    public static void drawDetails8(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle110 = new Rectangle2D.Double(
                633.71, -3.17,
                2.36, 38.78
        );
        Rectangle2D bounds110 = rectangle110.getBounds2D();
        AffineTransform rotation110 = AffineTransform.getRotateInstance(
                Math.toRadians(-10.78),
                bounds110.getCenterX(), bounds110.getCenterY()
        );
        Shape rotated110 = rotation110.createTransformedShape(rectangle110);
        g2d.setColor(new Color(48, 47, 51));
        g2d.fill(rotated110);

        // Quadratic curve
        QuadCurve2D.Double qc111 = new QuadCurve2D.Double(
                605.08, 34.78,
                617.39, 27.23,
                629.71, 34.78
        );
        Rectangle2D bounds111 = qc111.getBounds2D();
        AffineTransform rotation111 = AffineTransform.getRotateInstance(
                Math.toRadians(258),
                bounds111.getCenterX(), bounds111.getCenterY()
        );
        Shape rotated111 = rotation111.createTransformedShape(qc111);
        g2d.setColor(new Color(59, 58, 62));
        BasicStroke bs111 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs111);
        g2d.draw(rotated111);

        // Cubic curve
        CubicCurve2D.Double cc112 = new CubicCurve2D.Double(
                511.74, 311.7,
                531.32, 275.21,
                557.43, 348.18,
                577.02, 311.7
        );
        Rectangle2D bounds112 = cc112.getBounds2D();
        AffineTransform rotation112 = AffineTransform.getRotateInstance(
                Math.toRadians(218),
                bounds112.getCenterX(), bounds112.getCenterY()
        );
        Shape rotated112 = rotation112.createTransformedShape(cc112);
        g2d.setColor(new Color(1, 23, 68));
        BasicStroke bs112 = new BasicStroke(
                17.98f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs112);
        g2d.draw(rotated112);

        // Ellipse
        Ellipse2D.Double ellipse113 = new Ellipse2D.Double(
                547.73, 138.18,
                79.66, 106.53
        );
        Rectangle2D bounds113 = ellipse113.getBounds2D();
        AffineTransform rotation113 = AffineTransform.getRotateInstance(
                Math.toRadians(31),
                bounds113.getCenterX(), bounds113.getCenterY()
        );
        Shape rotated113 = rotation113.createTransformedShape(ellipse113);
        g2d.setColor(new Color(19, 50, 109));
        g2d.fill(rotated113);

        // Arc
        Arc2D.Double arc114 = new Arc2D.Double(
                330.51, 340.21,
                165.16, 85.51,
                0, 214, Arc2D.OPEN
        );
        Rectangle2D bounds114 = arc114.getBounds2D();
        AffineTransform rotation114 = AffineTransform.getRotateInstance(
                Math.toRadians(150),
                bounds114.getCenterX(), bounds114.getCenterY()
        );
        Shape rotated114 = rotation114.createTransformedShape(arc114);
        g2d.setColor(new Color(26, 35, 80));
        BasicStroke bs114 = new BasicStroke(
                33.59f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs114);
        g2d.draw(rotated114);

        // Area / transformation
        Ellipse2D.Double outer115 = new Ellipse2D.Double(
                442.04, 190.49,
                121.83, 84.53
        );
        Ellipse2D.Double cutout115 = new Ellipse2D.Double(
                442.04 + 121.83 * 0.28,
                190.49 - 84.53 * 0.12,
                121.83, 84.53
        );
        Area area115 = new Area(outer115);
        area115.subtract(new Area(cutout115));
        Rectangle2D bounds115 = area115.getBounds2D();
        AffineTransform rotation115 = AffineTransform.getRotateInstance(
                Math.toRadians(199),
                bounds115.getCenterX(), bounds115.getCenterY()
        );
        Shape rotated115 = rotation115.createTransformedShape(area115);
        g2d.setColor(new Color(64, 123, 208));
        g2d.fill(rotated115);

        // Circle
        Ellipse2D.Double circle116 = new Ellipse2D.Double(
                485.11, 431.99,
                8.44, 8.44
        );
        g2d.setColor(new Color(255, 255, 255));
        g2d.fill(circle116);

        // Rectangle
        Rectangle2D.Double rectangle117 = new Rectangle2D.Double(
                313.63, 155.97,
                33.23, 15.56
        );
        Rectangle2D bounds117 = rectangle117.getBounds2D();
        AffineTransform rotation117 = AffineTransform.getRotateInstance(
                Math.toRadians(-45),
                bounds117.getCenterX(), bounds117.getCenterY()
        );
        Shape rotated117 = rotation117.createTransformedShape(rectangle117);
        g2d.setColor(new Color(60, 111, 166));
        g2d.fill(rotated117);

        // Square
        Rectangle2D.Double square118 = new Rectangle2D.Double(
                114.08, 241.66,
                44.86, 44.86
        );
        g2d.setColor(new Color(49, 53, 95));
        g2d.fill(square118);

        // Quadratic curve
        QuadCurve2D.Double qc119 = new QuadCurve2D.Double(
                212.2, 340.14,
                266.24, 278.87,
                320.29, 340.14
        );
        Rectangle2D bounds119 = qc119.getBounds2D();
        AffineTransform rotation119 = AffineTransform.getRotateInstance(
                Math.toRadians(134),
                bounds119.getCenterX(), bounds119.getCenterY()
        );
        Shape rotated119 = rotation119.createTransformedShape(qc119);
        g2d.setColor(new Color(43, 87, 173));
        BasicStroke bs119 = new BasicStroke(
                10.65f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs119);
        g2d.draw(rotated119);

        // Square
        Rectangle2D.Double square120 = new Rectangle2D.Double(
                133.57, 298.69,
                38.22, 38.22
        );
        g2d.setColor(new Color(60, 69, 123));
        g2d.fill(square120);

        // Ellipse
        Ellipse2D.Double ellipse121 = new Ellipse2D.Double(
                283.3, 231.5,
                28.12, 31.02
        );
        Rectangle2D bounds121 = ellipse121.getBounds2D();
        AffineTransform rotation121 = AffineTransform.getRotateInstance(
                Math.toRadians(22.76),
                bounds121.getCenterX(), bounds121.getCenterY()
        );
        Shape rotated121 = rotation121.createTransformedShape(ellipse121);
        g2d.setColor(new Color(2, 12, 47));
        g2d.fill(rotated121);

    }

    public static void drawDetails9(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse122 = new Ellipse2D.Double(
                201.91, 105.21,
                44.11, 183.5
        );
        Rectangle2D bounds122 = ellipse122.getBounds2D();
        AffineTransform rotation122 = AffineTransform.getRotateInstance(
                Math.toRadians(22.06),
                bounds122.getCenterX(), bounds122.getCenterY()
        );
        Shape rotated122 = rotation122.createTransformedShape(ellipse122);
        g2d.setColor(new Color(15, 29, 54));
        g2d.fill(rotated122);

        // Rectangle
        Rectangle2D.Double rectangle123 = new Rectangle2D.Double(
                553.36, 367.25,
                82.16, 11.3
        );
        Rectangle2D bounds123 = rectangle123.getBounds2D();
        AffineTransform rotation123 = AffineTransform.getRotateInstance(
                Math.toRadians(-52.6),
                bounds123.getCenterX(), bounds123.getCenterY()
        );
        Shape rotated123 = rotation123.createTransformedShape(rectangle123);
        g2d.setColor(new Color(118, 144, 196));
        g2d.fill(rotated123);

        // Area / transformation
        Ellipse2D.Double outer124 = new Ellipse2D.Double(
                343.87, 152.82,
                60.09, 33.5
        );
        Ellipse2D.Double cutout124 = new Ellipse2D.Double(
                343.87 + 60.09 * 0.28,
                152.82 - 33.5 * 0.12,
                60.09, 33.5
        );
        Area area124 = new Area(outer124);
        area124.subtract(new Area(cutout124));
        Rectangle2D bounds124 = area124.getBounds2D();
        AffineTransform rotation124 = AffineTransform.getRotateInstance(
                Math.toRadians(279),
                bounds124.getCenterX(), bounds124.getCenterY()
        );
        Shape rotated124 = rotation124.createTransformedShape(area124);
        g2d.setColor(new Color(47, 59, 102));
        g2d.fill(rotated124);

        // Rectangle
        Rectangle2D.Double rectangle125 = new Rectangle2D.Double(
                563.35, 409.1,
                61.97, 24.04
        );
        g2d.setColor(new Color(18, 42, 121));
        g2d.fill(rectangle125);

        // Rectangle
        Rectangle2D.Double rectangle126 = new Rectangle2D.Double(
                -17.75, 390.56,
                106.15, 104.88
        );
        g2d.setColor(new Color(5, 6, 24));
        g2d.fill(rectangle126);

        // Circle
        Ellipse2D.Double circle127 = new Ellipse2D.Double(
                410.86, 221.92,
                19.25, 19.25
        );
        g2d.setColor(new Color(86, 113, 227));
        g2d.fill(circle127);

        // Circle
        Ellipse2D.Double circle128 = new Ellipse2D.Double(
                399.92, 297.35,
                16.43, 16.43
        );
        g2d.setColor(new Color(85, 104, 188));
        g2d.fill(circle128);

        // Rectangle
        Rectangle2D.Double rectangle129 = new Rectangle2D.Double(
                45.54, 36.43,
                50.09, 61.25
        );
        g2d.setColor(new Color(5, 6, 9));
        g2d.fill(rectangle129);

        // Area / transformation
        GeneralPath boundary130_1 = new GeneralPath();
        boundary130_1.moveTo(377, 224);
        boundary130_1.lineTo(374, 237);
        boundary130_1.lineTo(385, 241);
        boundary130_1.lineTo(385, 261);
        boundary130_1.lineTo(375, 255);
        boundary130_1.lineTo(359, 268);
        boundary130_1.lineTo(369, 269);
        boundary130_1.lineTo(386, 288);
        boundary130_1.lineTo(402, 283);
        boundary130_1.lineTo(411, 244);
        boundary130_1.lineTo(410, 270);
        boundary130_1.lineTo(392, 274);
        boundary130_1.lineTo(386, 260);
        boundary130_1.lineTo(387, 244);
        boundary130_1.lineTo(403, 237);
        boundary130_1.lineTo(409, 232);
        boundary130_1.lineTo(398, 227);
        boundary130_1.lineTo(386, 225);
        boundary130_1.closePath();
        Area area130 = new Area(boundary130_1);
        GeneralPath boundary130_2 = new GeneralPath();
        boundary130_2.moveTo(381, 270);
        boundary130_2.lineTo(382, 271);
        boundary130_2.lineTo(382, 275);
        boundary130_2.lineTo(384, 278);
        boundary130_2.lineTo(382, 280);
        boundary130_2.lineTo(378, 281);
        boundary130_2.lineTo(376, 279);
        boundary130_2.lineTo(376, 276);
        boundary130_2.closePath();
        area130.subtract(new Area(boundary130_2));
        GeneralPath boundary130_3 = new GeneralPath();
        boundary130_3.moveTo(384, 255);
        boundary130_3.lineTo(386, 254);
        boundary130_3.lineTo(387, 257);
        boundary130_3.lineTo(385, 258);
        boundary130_3.closePath();
        area130.subtract(new Area(boundary130_3));
        g2d.setColor(new Color(225, 248, 253));
        g2d.fill(area130);

        // Square
        Rectangle2D.Double square131 = new Rectangle2D.Double(
                309.09, 200.02,
                26.87, 26.87
        );
        g2d.setColor(new Color(22, 45, 118));
        g2d.fill(square131);

        // Ellipse
        Ellipse2D.Double ellipse132 = new Ellipse2D.Double(
                105.96, 49.33,
                18.95, 29.52
        );
        g2d.setColor(new Color(66, 69, 62));
        g2d.fill(ellipse132);

        // Rectangle
        Rectangle2D.Double rectangle133 = new Rectangle2D.Double(
                407.33, 195.14,
                11.34, 18.89
        );
        Rectangle2D bounds133 = rectangle133.getBounds2D();
        AffineTransform rotation133 = AffineTransform.getRotateInstance(
                Math.toRadians(-45),
                bounds133.getCenterX(), bounds133.getCenterY()
        );
        Shape rotated133 = rotation133.createTransformedShape(rectangle133);
        g2d.setColor(new Color(238, 231, 254));
        g2d.fill(rotated133);

        // Ellipse
        Ellipse2D.Double ellipse134 = new Ellipse2D.Double(
                283.24, 201.46,
                19.47, 30.05
        );
        Rectangle2D bounds134 = ellipse134.getBounds2D();
        AffineTransform rotation134 = AffineTransform.getRotateInstance(
                Math.toRadians(55.84),
                bounds134.getCenterX(), bounds134.getCenterY()
        );
        Shape rotated134 = rotation134.createTransformedShape(ellipse134);
        g2d.setColor(new Color(50, 77, 146));
        g2d.fill(rotated134);

    }

}

class witchPart2 {

    public static void drawPart(Graphics2D g2d) {
        drawDetails10(g2d);
        drawDetails11(g2d);
        drawDetails12(g2d);
        drawDetails13(g2d);
        drawDetails14(g2d);
        drawDetails15(g2d);
        drawDetails16(g2d);
        drawDetails17(g2d);
        drawDetails18(g2d);
        drawDetails19(g2d);
    }

    public static void drawDetails10(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse135 = new Ellipse2D.Double(
                324.33, 83.49,
                27.64, 27.93
        );
        Rectangle2D bounds135 = ellipse135.getBounds2D();
        AffineTransform rotation135 = AffineTransform.getRotateInstance(
                Math.toRadians(108),
                bounds135.getCenterX(), bounds135.getCenterY()
        );
        Shape rotated135 = rotation135.createTransformedShape(ellipse135);
        g2d.setColor(new Color(25, 64, 103));
        g2d.fill(rotated135);

        // Square
        Rectangle2D.Double square136 = new Rectangle2D.Double(
                328.06, 250.32,
                18.27, 18.27
        );
        g2d.setColor(new Color(35, 41, 143));
        g2d.fill(square136);

        // Circle
        Ellipse2D.Double circle137 = new Ellipse2D.Double(
                504.25, 402.05,
                18.38, 18.38
        );
        g2d.setColor(new Color(42, 92, 191));
        g2d.fill(circle137);

        // Ellipse
        Ellipse2D.Double ellipse138 = new Ellipse2D.Double(
                302.7, 169.23,
                8.11, 53.81
        );
        Rectangle2D bounds138 = ellipse138.getBounds2D();
        AffineTransform rotation138 = AffineTransform.getRotateInstance(
                Math.toRadians(71.08),
                bounds138.getCenterX(), bounds138.getCenterY()
        );
        Shape rotated138 = rotation138.createTransformedShape(ellipse138);
        g2d.setColor(new Color(1, 9, 39));
        g2d.fill(rotated138);

        // Ellipse
        Ellipse2D.Double ellipse139 = new Ellipse2D.Double(
                684.33, 332.43,
                26.41, 40.88
        );
        Rectangle2D bounds139 = ellipse139.getBounds2D();
        AffineTransform rotation139 = AffineTransform.getRotateInstance(
                Math.toRadians(67.37),
                bounds139.getCenterX(), bounds139.getCenterY()
        );
        Shape rotated139 = rotation139.createTransformedShape(ellipse139);
        g2d.setColor(new Color(0, 8, 51));
        g2d.fill(rotated139);

        // Square
        Rectangle2D.Double square140 = new Rectangle2D.Double(
                513.85, 437.94,
                19, 19
        );
        g2d.setColor(new Color(54, 74, 144));
        g2d.fill(square140);

        // Rectangle
        Rectangle2D.Double rectangle141 = new Rectangle2D.Double(
                106.09, 21.97,
                17.67, 2.69
        );
        Rectangle2D bounds141 = rectangle141.getBounds2D();
        AffineTransform rotation141 = AffineTransform.getRotateInstance(
                Math.toRadians(-39.81),
                bounds141.getCenterX(), bounds141.getCenterY()
        );
        Shape rotated141 = rotation141.createTransformedShape(rectangle141);
        g2d.setColor(new Color(193, 217, 171));
        g2d.fill(rotated141);

        // Square
        Rectangle2D.Double square142 = new Rectangle2D.Double(
                497.37, 428.3,
                10.23, 10.23
        );
        g2d.setColor(new Color(36, 32, 20));
        g2d.fill(square142);

        // General path
        GeneralPath gp143 = new GeneralPath();
        gp143.moveTo(390.86, 311.15);
        gp143.lineTo(395.65, 304.6);
        gp143.lineTo(400.44, 310.33);
        gp143.lineTo(395.65, 312.79);
        gp143.closePath();
        Rectangle2D bounds143 = gp143.getBounds2D();
        AffineTransform rotation143 = AffineTransform.getRotateInstance(
                Math.toRadians(279),
                bounds143.getCenterX(), bounds143.getCenterY()
        );
        Shape rotated143 = rotation143.createTransformedShape(gp143);
        g2d.setColor(new Color(53, 86, 189));
        g2d.fill(rotated143);

        // Rectangle
        Rectangle2D.Double rectangle144 = new Rectangle2D.Double(
                650.15, 288.51,
                22.86, 10.18
        );
        g2d.setColor(new Color(58, 52, 73));
        g2d.fill(rectangle144);

        // Ellipse
        Ellipse2D.Double ellipse145 = new Ellipse2D.Double(
                445.94, 43.52,
                21.16, 8.6
        );
        Rectangle2D bounds145 = ellipse145.getBounds2D();
        AffineTransform rotation145 = AffineTransform.getRotateInstance(
                Math.toRadians(299),
                bounds145.getCenterX(), bounds145.getCenterY()
        );
        Shape rotated145 = rotation145.createTransformedShape(ellipse145);
        g2d.setColor(new Color(143, 158, 141));
        g2d.fill(rotated145);

        // Square
        Rectangle2D.Double square146 = new Rectangle2D.Double(
                729.44, 388.5,
                26.45, 26.45
        );
        g2d.setColor(new Color(17, 19, 52));
        g2d.fill(square146);

        // Ellipse
        Ellipse2D.Double ellipse147 = new Ellipse2D.Double(
                419.64, 119.87,
                21.6, 21.13
        );
        Rectangle2D bounds147 = ellipse147.getBounds2D();
        AffineTransform rotation147 = AffineTransform.getRotateInstance(
                Math.toRadians(343),
                bounds147.getCenterX(), bounds147.getCenterY()
        );
        Shape rotated147 = rotation147.createTransformedShape(ellipse147);
        g2d.setColor(new Color(31, 83, 172));
        g2d.fill(rotated147);

        // Square
        Rectangle2D.Double square148 = new Rectangle2D.Double(
                435.21, 18.74,
                20.27, 20.27
        );
        g2d.setColor(new Color(3, 10, 29));
        g2d.fill(square148);

        // Ellipse
        Ellipse2D.Double ellipse149 = new Ellipse2D.Double(
                116.42, 449.44,
                20.78, 9.78
        );
        Rectangle2D bounds149 = ellipse149.getBounds2D();
        AffineTransform rotation149 = AffineTransform.getRotateInstance(
                Math.toRadians(190),
                bounds149.getCenterX(), bounds149.getCenterY()
        );
        Shape rotated149 = rotation149.createTransformedShape(ellipse149);
        g2d.setColor(new Color(127, 144, 158));
        g2d.fill(rotated149);

    }

    public static void drawDetails11(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse150 = new Ellipse2D.Double(
                752.56, 319.25,
                41.76, 64.25
        );
        Rectangle2D bounds150 = ellipse150.getBounds2D();
        AffineTransform rotation150 = AffineTransform.getRotateInstance(
                Math.toRadians(31.69),
                bounds150.getCenterX(), bounds150.getCenterY()
        );
        Shape rotated150 = rotation150.createTransformedShape(ellipse150);
        g2d.setColor(new Color(22, 25, 51));
        g2d.fill(rotated150);

        // Line
        Line2D.Double line151 = new Line2D.Double(
                681.92, 269.57,
                700.69, 269.57
        );
        Rectangle2D bounds151 = line151.getBounds2D();
        AffineTransform rotation151 = AffineTransform.getRotateInstance(
                Math.toRadians(336),
                bounds151.getCenterX(), bounds151.getCenterY()
        );
        Shape rotated151 = rotation151.createTransformedShape(line151);
        g2d.setColor(new Color(47, 104, 173));
        BasicStroke bs151 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs151);
        g2d.draw(rotated151);

        // Rectangle
        Rectangle2D.Double rectangle152 = new Rectangle2D.Double(
                470.5, -0.5,
                5, 6
        );
        Rectangle2D bounds152 = rectangle152.getBounds2D();
        AffineTransform rotation152 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds152.getCenterX(), bounds152.getCenterY()
        );
        Shape rotated152 = rotation152.createTransformedShape(rectangle152);
        g2d.setColor(new Color(109, 111, 94));
        g2d.fill(rotated152);

        // Rectangle
        Rectangle2D.Double rectangle153 = new Rectangle2D.Double(
                728.31, 252.08,
                8.85, 8.95
        );
        g2d.setColor(new Color(8, 51, 104));
        g2d.fill(rectangle153);

        // General path
        GeneralPath gp154 = new GeneralPath();
        gp154.moveTo(539, 15);
        gp154.lineTo(541, 21);
        gp154.lineTo(551, 23);
        gp154.lineTo(549, 18);
        gp154.lineTo(543, 17);
        gp154.closePath();
        g2d.setColor(new Color(94, 103, 130));
        g2d.fill(gp154);

        // Rectangle
        Rectangle2D.Double rectangle155 = new Rectangle2D.Double(
                737.16, 265.68,
                30.37, 36.99
        );
        g2d.setColor(new Color(0, 0, 29));
        g2d.fill(rectangle155);

        // Rectangle
        Rectangle2D.Double rectangle156 = new Rectangle2D.Double(
                384.88, 0.5,
                2.73, 20.48
        );
        Rectangle2D bounds156 = rectangle156.getBounds2D();
        AffineTransform rotation156 = AffineTransform.getRotateInstance(
                Math.toRadians(-6.01),
                bounds156.getCenterX(), bounds156.getCenterY()
        );
        Shape rotated156 = rotation156.createTransformedShape(rectangle156);
        g2d.setColor(new Color(6, 13, 178));
        g2d.fill(rotated156);

        // Circle
        Ellipse2D.Double circle157 = new Ellipse2D.Double(
                721.4, 336.34,
                17.54, 17.54
        );
        Rectangle2D bounds157 = circle157.getBounds2D();
        AffineTransform rotation157 = AffineTransform.getRotateInstance(
                Math.toRadians(325),
                bounds157.getCenterX(), bounds157.getCenterY()
        );
        Shape rotated157 = rotation157.createTransformedShape(circle157);
        g2d.setColor(new Color(0, 2, 38));
        g2d.fill(rotated157);

        // Circle
        Ellipse2D.Double circle158 = new Ellipse2D.Double(
                102.03, 1.25,
                13.32, 13.32
        );
        Rectangle2D bounds158 = circle158.getBounds2D();
        AffineTransform rotation158 = AffineTransform.getRotateInstance(
                Math.toRadians(165),
                bounds158.getCenterX(), bounds158.getCenterY()
        );
        Shape rotated158 = rotation158.createTransformedShape(circle158);
        g2d.setColor(new Color(48, 47, 41));
        g2d.fill(rotated158);

        // Square
        Rectangle2D.Double square159 = new Rectangle2D.Double(
                465.76, 55.97,
                16.31, 16.31
        );
        g2d.setColor(new Color(95, 80, 102));
        g2d.fill(square159);

        // Ellipse
        Ellipse2D.Double ellipse160 = new Ellipse2D.Double(
                524.04, 12.89,
                6.87, 11.18
        );
        Rectangle2D bounds160 = ellipse160.getBounds2D();
        AffineTransform rotation160 = AffineTransform.getRotateInstance(
                Math.toRadians(99.22),
                bounds160.getCenterX(), bounds160.getCenterY()
        );
        Shape rotated160 = rotation160.createTransformedShape(ellipse160);
        g2d.setColor(new Color(95, 104, 118));
        g2d.fill(rotated160);

        // Square
        Rectangle2D.Double square161 = new Rectangle2D.Double(
                416.23, -10.53,
                13.56, 13.56
        );
        g2d.setColor(new Color(51, 69, 138));
        g2d.fill(square161);

        // Rectangle
        Rectangle2D.Double rectangle162 = new Rectangle2D.Double(
                479.92, 24.66,
                23.21, 17.35
        );
        g2d.setColor(new Color(4, 12, 26));
        g2d.fill(rectangle162);

        // Arc
        Arc2D.Double arc163 = new Arc2D.Double(
                117.54, 38.69,
                37.62, 13.23,
                0, 229, Arc2D.PIE
        );
        Rectangle2D bounds163 = arc163.getBounds2D();
        AffineTransform rotation163 = AffineTransform.getRotateInstance(
                Math.toRadians(93),
                bounds163.getCenterX(), bounds163.getCenterY()
        );
        Shape rotated163 = rotation163.createTransformedShape(arc163);
        g2d.setColor(new Color(1, 1, 6));
        g2d.fill(rotated163);

        // Square
        Rectangle2D.Double square164 = new Rectangle2D.Double(
                531.6, 383.7,
                24.5, 24.5
        );
        g2d.setColor(new Color(9, 65, 173));
        g2d.fill(square164);

    }

    public static void drawDetails12(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse165 = new Ellipse2D.Double(
                269.47, 24.68,
                8.56, 5.76
        );
        Rectangle2D bounds165 = ellipse165.getBounds2D();
        AffineTransform rotation165 = AffineTransform.getRotateInstance(
                Math.toRadians(29),
                bounds165.getCenterX(), bounds165.getCenterY()
        );
        Shape rotated165 = rotation165.createTransformedShape(ellipse165);
        g2d.setColor(new Color(62, 82, 119));
        g2d.fill(rotated165);

        // Rectangle
        Rectangle2D.Double rectangle166 = new Rectangle2D.Double(
                144.17, 42.49,
                39.21, 2.22
        );
        Rectangle2D bounds166 = rectangle166.getBounds2D();
        AffineTransform rotation166 = AffineTransform.getRotateInstance(
                Math.toRadians(-69.68),
                bounds166.getCenterX(), bounds166.getCenterY()
        );
        Shape rotated166 = rotation166.createTransformedShape(rectangle166);
        g2d.setColor(new Color(63, 66, 50));
        g2d.fill(rotated166);

        // Square
        Rectangle2D.Double square167 = new Rectangle2D.Double(
                362.08, 225.14,
                10.8, 10.8
        );
        g2d.setColor(new Color(144, 178, 255));
        g2d.fill(square167);

        // General path
        GeneralPath gp168 = new GeneralPath();
        gp168.moveTo(630.13, 298.89);
        gp168.lineTo(634.78, 290.26);
        gp168.lineTo(639.43, 297.81);
        gp168.lineTo(634.78, 301.04);
        gp168.closePath();
        Rectangle2D bounds168 = gp168.getBounds2D();
        AffineTransform rotation168 = AffineTransform.getRotateInstance(
                Math.toRadians(273),
                bounds168.getCenterX(), bounds168.getCenterY()
        );
        Shape rotated168 = rotation168.createTransformedShape(gp168);
        g2d.setColor(new Color(124, 137, 186));
        g2d.fill(rotated168);

        // Cubic curve
        CubicCurve2D.Double cc169 = new CubicCurve2D.Double(
                212.86, 300,
                215.58, 295.05,
                219.21, 304.95,
                221.93, 300
        );
        Rectangle2D bounds169 = cc169.getBounds2D();
        AffineTransform rotation169 = AffineTransform.getRotateInstance(
                Math.toRadians(16),
                bounds169.getCenterX(), bounds169.getCenterY()
        );
        Shape rotated169 = rotation169.createTransformedShape(cc169);
        g2d.setColor(new Color(60, 69, 97));
        BasicStroke bs169 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs169);
        g2d.draw(rotated169);

        // Square
        Rectangle2D.Double square170 = new Rectangle2D.Double(
                190.6, 1.94,
                28.39, 28.39
        );
        g2d.setColor(new Color(4, 5, 9));
        g2d.fill(square170);

        // Rectangle
        Rectangle2D.Double rectangle171 = new Rectangle2D.Double(
                247.55, 292.91,
                11.96, 6.68
        );
        g2d.setColor(new Color(20, 54, 129));
        g2d.fill(rectangle171);

        // Ellipse
        Ellipse2D.Double ellipse172 = new Ellipse2D.Double(
                123.04, -4.78,
                4.8, 17.72
        );
        Rectangle2D bounds172 = ellipse172.getBounds2D();
        AffineTransform rotation172 = AffineTransform.getRotateInstance(
                Math.toRadians(28.34),
                bounds172.getCenterX(), bounds172.getCenterY()
        );
        Shape rotated172 = rotation172.createTransformedShape(ellipse172);
        g2d.setColor(new Color(52, 46, 22));
        g2d.fill(rotated172);

        // General path
        GeneralPath gp173 = new GeneralPath();
        gp173.moveTo(483.71, 151.27);
        gp173.lineTo(493.94, 140.69);
        gp173.lineTo(504.18, 149.95);
        gp173.lineTo(493.94, 153.92);
        gp173.closePath();
        Rectangle2D bounds173 = gp173.getBounds2D();
        AffineTransform rotation173 = AffineTransform.getRotateInstance(
                Math.toRadians(162),
                bounds173.getCenterX(), bounds173.getCenterY()
        );
        Shape rotated173 = rotation173.createTransformedShape(gp173);
        g2d.setColor(new Color(70, 114, 223));
        g2d.fill(rotated173);

        // Square
        Rectangle2D.Double square174 = new Rectangle2D.Double(
                501.94, -0.89,
                13.51, 13.51
        );
        g2d.setColor(new Color(3, 16, 51));
        g2d.fill(square174);

        // General path
        GeneralPath gp175 = new GeneralPath();
        gp175.moveTo(140.9, 11.91);
        gp175.lineTo(147.83, 3.34);
        gp175.lineTo(154.75, 10.84);
        gp175.lineTo(147.83, 14.06);
        gp175.closePath();
        Rectangle2D bounds175 = gp175.getBounds2D();
        AffineTransform rotation175 = AffineTransform.getRotateInstance(
                Math.toRadians(137),
                bounds175.getCenterX(), bounds175.getCenterY()
        );
        Shape rotated175 = rotation175.createTransformedShape(gp175);
        g2d.setColor(new Color(54, 56, 44));
        g2d.fill(rotated175);

        // Ellipse
        Ellipse2D.Double ellipse176 = new Ellipse2D.Double(
                692.35, 415.31,
                18.39, 12.88
        );
        Rectangle2D bounds176 = ellipse176.getBounds2D();
        AffineTransform rotation176 = AffineTransform.getRotateInstance(
                Math.toRadians(101),
                bounds176.getCenterX(), bounds176.getCenterY()
        );
        Shape rotated176 = rotation176.createTransformedShape(ellipse176);
        g2d.setColor(new Color(69, 80, 112));
        g2d.fill(rotated176);

        // Line
        Line2D.Double line177 = new Line2D.Double(
                266.36, 381.18,
                503.26, 381.18
        );
        Rectangle2D bounds177 = line177.getBounds2D();
        AffineTransform rotation177 = AffineTransform.getRotateInstance(
                Math.toRadians(6),
                bounds177.getCenterX(), bounds177.getCenterY()
        );
        Shape rotated177 = rotation177.createTransformedShape(line177);
        g2d.setColor(new Color(52, 56, 181));
        BasicStroke bs177 = new BasicStroke(
                14.86f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs177);
        g2d.draw(rotated177);

    }

    public static void drawDetails13(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle178 = new Rectangle2D.Double(
                483.97, 353.3,
                12.96, 29.09
        );
        Rectangle2D bounds178 = rectangle178.getBounds2D();
        AffineTransform rotation178 = AffineTransform.getRotateInstance(
                Math.toRadians(-18.43),
                bounds178.getCenterX(), bounds178.getCenterY()
        );
        Shape rotated178 = rotation178.createTransformedShape(rectangle178);
        g2d.setColor(new Color(68, 142, 227));
        g2d.fill(rotated178);

        // Square
        Rectangle2D.Double square179 = new Rectangle2D.Double(
                293.14, 408.02,
                187.63, 187.63
        );
        g2d.setColor(new Color(23, 31, 47));
        g2d.fill(square179);

        // Rectangle
        Rectangle2D.Double rectangle180 = new Rectangle2D.Double(
                539.92, 253.54,
                109.26, 8.51
        );
        Rectangle2D bounds180 = rectangle180.getBounds2D();
        AffineTransform rotation180 = AffineTransform.getRotateInstance(
                Math.toRadians(-59.26),
                bounds180.getCenterX(), bounds180.getCenterY()
        );
        Shape rotated180 = rotation180.createTransformedShape(rectangle180);
        g2d.setColor(new Color(163, 189, 247));
        g2d.fill(rotated180);

        // Rectangle
        Rectangle2D.Double rectangle181 = new Rectangle2D.Double(
                533.01, 86.81,
                58.51, 66.9
        );
        g2d.setColor(new Color(9, 29, 97));
        g2d.fill(rectangle181);

        // Area / transformation
        Ellipse2D.Double outer182 = new Ellipse2D.Double(
                491.39, 267.94,
                78.73, 87.65
        );
        Ellipse2D.Double cutout182 = new Ellipse2D.Double(
                491.39 + 78.73 * 0.28,
                267.94 - 87.65 * 0.12,
                78.73, 87.65
        );
        Area area182 = new Area(outer182);
        area182.subtract(new Area(cutout182));
        Rectangle2D bounds182 = area182.getBounds2D();
        AffineTransform rotation182 = AffineTransform.getRotateInstance(
                Math.toRadians(325),
                bounds182.getCenterX(), bounds182.getCenterY()
        );
        Shape rotated182 = rotation182.createTransformedShape(area182);
        g2d.setColor(new Color(50, 101, 176));
        g2d.fill(rotated182);

        // Rectangle
        Rectangle2D.Double rectangle183 = new Rectangle2D.Double(
                405.61, 351.91,
                49.35, 22.82
        );
        g2d.setColor(new Color(30, 28, 68));
        g2d.fill(rectangle183);

        // Arc
        Arc2D.Double arc184 = new Arc2D.Double(
                500.99, 166.4,
                76.28, 58.51,
                0, 257, Arc2D.PIE
        );
        Rectangle2D bounds184 = arc184.getBounds2D();
        AffineTransform rotation184 = AffineTransform.getRotateInstance(
                Math.toRadians(348),
                bounds184.getCenterX(), bounds184.getCenterY()
        );
        Shape rotated184 = rotation184.createTransformedShape(arc184);
        g2d.setColor(new Color(31, 78, 175));
        g2d.fill(rotated184);

        // Ellipse
        Ellipse2D.Double ellipse185 = new Ellipse2D.Double(
                444.78, 275.83,
                18.74, 36.79
        );
        Rectangle2D bounds185 = ellipse185.getBounds2D();
        AffineTransform rotation185 = AffineTransform.getRotateInstance(
                Math.toRadians(170.79),
                bounds185.getCenterX(), bounds185.getCenterY()
        );
        Shape rotated185 = rotation185.createTransformedShape(ellipse185);
        g2d.setColor(new Color(0, 15, 60));
        g2d.fill(rotated185);

        // Square
        Rectangle2D.Double square186 = new Rectangle2D.Double(
                535.93, 244.86,
                36.59, 36.59
        );
        g2d.setColor(new Color(49, 99, 175));
        g2d.fill(square186);

        // Rectangle
        Rectangle2D.Double rectangle187 = new Rectangle2D.Double(
                132.5, 275.5,
                41, 18
        );
        Rectangle2D bounds187 = rectangle187.getBounds2D();
        AffineTransform rotation187 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds187.getCenterX(), bounds187.getCenterY()
        );
        Shape rotated187 = rotation187.createTransformedShape(rectangle187);
        g2d.setColor(new Color(20, 26, 64));
        g2d.fill(rotated187);

        // Square
        Rectangle2D.Double square188 = new Rectangle2D.Double(
                299.46, 137.02,
                30.71, 30.71
        );
        g2d.setColor(new Color(45, 80, 127));
        g2d.fill(square188);

        // Square
        Rectangle2D.Double square189 = new Rectangle2D.Double(
                82.83, 227.13,
                39.61, 39.61
        );
        g2d.setColor(new Color(32, 31, 57));
        g2d.fill(square189);

        // Circle
        Ellipse2D.Double circle190 = new Ellipse2D.Double(
                614.92, 376.63,
                55.98, 55.98
        );
        g2d.setColor(new Color(33, 45, 116));
        g2d.fill(circle190);

        // Ellipse
        Ellipse2D.Double ellipse191 = new Ellipse2D.Double(
                379.29, 163.43,
                6.72, 14.98
        );
        Rectangle2D bounds191 = ellipse191.getBounds2D();
        AffineTransform rotation191 = AffineTransform.getRotateInstance(
                Math.toRadians(111.28),
                bounds191.getCenterX(), bounds191.getCenterY()
        );
        Shape rotated191 = rotation191.createTransformedShape(ellipse191);
        g2d.setColor(new Color(200, 199, 255));
        g2d.fill(rotated191);

        // Rectangle
        Rectangle2D.Double rectangle192 = new Rectangle2D.Double(
                461.61, 171.17,
                11.42, 56.23
        );
        Rectangle2D bounds192 = rectangle192.getBounds2D();
        AffineTransform rotation192 = AffineTransform.getRotateInstance(
                Math.toRadians(-56.72),
                bounds192.getCenterX(), bounds192.getCenterY()
        );
        Shape rotated192 = rotation192.createTransformedShape(rectangle192);
        g2d.setColor(new Color(13, 31, 80));
        g2d.fill(rotated192);

    }

    public static void drawDetails14(Graphics2D g2d) {

        // Area / transformation
        Ellipse2D.Double outer193 = new Ellipse2D.Double(
                352.3, 183.34,
                69.11, 25.64
        );
        Ellipse2D.Double cutout193 = new Ellipse2D.Double(
                352.3 + 69.11 * 0.28,
                183.34 - 25.64 * 0.12,
                69.11, 25.64
        );
        Area area193 = new Area(outer193);
        area193.subtract(new Area(cutout193));
        Rectangle2D bounds193 = area193.getBounds2D();
        AffineTransform rotation193 = AffineTransform.getRotateInstance(
                Math.toRadians(307),
                bounds193.getCenterX(), bounds193.getCenterY()
        );
        Shape rotated193 = rotation193.createTransformedShape(area193);
        g2d.setColor(new Color(98, 109, 180));
        g2d.fill(rotated193);

        // Rectangle
        Rectangle2D.Double rectangle194 = new Rectangle2D.Double(
                176.34, 346.85,
                42.74, 25.05
        );
        Rectangle2D bounds194 = rectangle194.getBounds2D();
        AffineTransform rotation194 = AffineTransform.getRotateInstance(
                Math.toRadians(-7.12),
                bounds194.getCenterX(), bounds194.getCenterY()
        );
        Shape rotated194 = rotation194.createTransformedShape(rectangle194);
        g2d.setColor(new Color(65, 79, 136));
        g2d.fill(rotated194);

        // Rectangle
        Rectangle2D.Double rectangle195 = new Rectangle2D.Double(
                329.02, 178.4,
                35.46, 12.96
        );
        Rectangle2D bounds195 = rectangle195.getBounds2D();
        AffineTransform rotation195 = AffineTransform.getRotateInstance(
                Math.toRadians(-50.53),
                bounds195.getCenterX(), bounds195.getCenterY()
        );
        Shape rotated195 = rotation195.createTransformedShape(rectangle195);
        g2d.setColor(new Color(84, 132, 193));
        g2d.fill(rotated195);

        // General path
        GeneralPath gp196 = new GeneralPath();
        gp196.moveTo(260.46, 290.96);
        gp196.lineTo(276.64, 258.56);
        gp196.lineTo(292.83, 286.91);
        gp196.lineTo(276.64, 299.06);
        gp196.closePath();
        Rectangle2D bounds196 = gp196.getBounds2D();
        AffineTransform rotation196 = AffineTransform.getRotateInstance(
                Math.toRadians(288),
                bounds196.getCenterX(), bounds196.getCenterY()
        );
        Shape rotated196 = rotation196.createTransformedShape(gp196);
        g2d.setColor(new Color(64, 98, 161));
        g2d.fill(rotated196);

        // Square
        Rectangle2D.Double square197 = new Rectangle2D.Double(
                197.24, 246.51,
                45.75, 45.75
        );
        g2d.setColor(new Color(21, 39, 79));
        g2d.fill(square197);

        // Rectangle
        Rectangle2D.Double rectangle198 = new Rectangle2D.Double(
                172.76, 310.85,
                14.31, 24.01
        );
        Rectangle2D bounds198 = rectangle198.getBounds2D();
        AffineTransform rotation198 = AffineTransform.getRotateInstance(
                Math.toRadians(-75.96),
                bounds198.getCenterX(), bounds198.getCenterY()
        );
        Shape rotated198 = rotation198.createTransformedShape(rectangle198);
        g2d.setColor(new Color(79, 85, 155));
        g2d.fill(rotated198);

        // General path
        GeneralPath gp199 = new GeneralPath();
        gp199.moveTo(410.84, 274.45);
        gp199.lineTo(420.58, 257.07);
        gp199.lineTo(430.31, 272.28);
        gp199.lineTo(420.58, 278.8);
        gp199.closePath();
        Rectangle2D bounds199 = gp199.getBounds2D();
        AffineTransform rotation199 = AffineTransform.getRotateInstance(
                Math.toRadians(272),
                bounds199.getCenterX(), bounds199.getCenterY()
        );
        Shape rotated199 = rotation199.createTransformedShape(gp199);
        g2d.setColor(new Color(115, 132, 223));
        g2d.fill(rotated199);

        // Circle
        Ellipse2D.Double circle200 = new Ellipse2D.Double(
                484.86, 429.06,
                7.75, 7.75
        );
        g2d.setColor(new Color(255, 255, 246));
        g2d.fill(circle200);

        // Rectangle
        Rectangle2D.Double rectangle201 = new Rectangle2D.Double(
                102.93, 130.09,
                211.08, 47.03
        );
        Rectangle2D bounds201 = rectangle201.getBounds2D();
        AffineTransform rotation201 = AffineTransform.getRotateInstance(
                Math.toRadians(-58.09),
                bounds201.getCenterX(), bounds201.getCenterY()
        );
        Shape rotated201 = rotation201.createTransformedShape(rectangle201);
        g2d.setColor(new Color(9, 17, 34));
        g2d.fill(rotated201);

        // Rectangle
        Rectangle2D.Double rectangle202 = new Rectangle2D.Double(
                409.11, 233.65,
                29.02, 12.78
        );
        Rectangle2D bounds202 = rectangle202.getBounds2D();
        AffineTransform rotation202 = AffineTransform.getRotateInstance(
                Math.toRadians(-62.35),
                bounds202.getCenterX(), bounds202.getCenterY()
        );
        Shape rotated202 = rotation202.createTransformedShape(rectangle202);
        g2d.setColor(new Color(72, 101, 218));
        g2d.fill(rotated202);

        // Circle
        Ellipse2D.Double circle203 = new Ellipse2D.Double(
                356.5, 240,
                23.77, 23.77
        );
        g2d.setColor(new Color(149, 182, 252));
        g2d.fill(circle203);

        // Rectangle
        Rectangle2D.Double rectangle204 = new Rectangle2D.Double(
                299.37, 53.32,
                65.76, 26.87
        );
        Rectangle2D bounds204 = rectangle204.getBounds2D();
        AffineTransform rotation204 = AffineTransform.getRotateInstance(
                Math.toRadians(-45),
                bounds204.getCenterX(), bounds204.getCenterY()
        );
        Shape rotated204 = rotation204.createTransformedShape(rectangle204);
        g2d.setColor(new Color(17, 42, 74));
        g2d.fill(rotated204);

        // Ellipse
        Ellipse2D.Double ellipse205 = new Ellipse2D.Double(
                338.15, 265.62,
                33.23, 13.82
        );
        Rectangle2D bounds205 = ellipse205.getBounds2D();
        AffineTransform rotation205 = AffineTransform.getRotateInstance(
                Math.toRadians(239),
                bounds205.getCenterX(), bounds205.getCenterY()
        );
        Shape rotated205 = rotation205.createTransformedShape(ellipse205);
        g2d.setColor(new Color(121, 141, 230));
        g2d.fill(rotated205);

    }

    public static void drawDetails15(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle206 = new Rectangle2D.Double(
                351.24, 72.24,
                45.69, 25.61
        );
        Rectangle2D bounds206 = rectangle206.getBounds2D();
        AffineTransform rotation206 = AffineTransform.getRotateInstance(
                Math.toRadians(-53.75),
                bounds206.getCenterX(), bounds206.getCenterY()
        );
        Shape rotated206 = rotation206.createTransformedShape(rectangle206);
        g2d.setColor(new Color(3, 11, 30));
        g2d.fill(rotated206);

        // Circle
        Ellipse2D.Double circle207 = new Ellipse2D.Double(
                381.09, 218.1,
                11.74, 11.74
        );
        Rectangle2D bounds207 = circle207.getBounds2D();
        AffineTransform rotation207 = AffineTransform.getRotateInstance(
                Math.toRadians(305),
                bounds207.getCenterX(), bounds207.getCenterY()
        );
        Shape rotated207 = rotation207.createTransformedShape(circle207);
        g2d.setColor(new Color(206, 196, 253));
        g2d.fill(rotated207);

        // Rectangle
        Rectangle2D.Double rectangle208 = new Rectangle2D.Double(
                305.83, 200.51,
                13.98, 9.46
        );
        Rectangle2D bounds208 = rectangle208.getBounds2D();
        AffineTransform rotation208 = AffineTransform.getRotateInstance(
                Math.toRadians(-15.26),
                bounds208.getCenterX(), bounds208.getCenterY()
        );
        Shape rotated208 = rotation208.createTransformedShape(rectangle208);
        g2d.setColor(new Color(71, 98, 177));
        g2d.fill(rotated208);

        // Rectangle
        Rectangle2D.Double rectangle209 = new Rectangle2D.Double(
                558.36, 427.47,
                32.05, 22.9
        );
        g2d.setColor(new Color(16, 40, 111));
        g2d.fill(rectangle209);

        // Rectangle
        Rectangle2D.Double rectangle210 = new Rectangle2D.Double(
                297.46, 244.96,
                34.46, 19.64
        );
        g2d.setColor(new Color(8, 21, 62));
        g2d.fill(rectangle210);

        // General path
        GeneralPath gp211 = new GeneralPath();
        gp211.moveTo(618.69, 326.44);
        gp211.lineTo(616.69, 327.44);
        gp211.lineTo(612.69, 332.44);
        gp211.lineTo(597.69, 345.44);
        gp211.lineTo(589.69, 353.44);
        gp211.lineTo(583.69, 361.44);
        gp211.lineTo(574.69, 376.44);
        gp211.lineTo(572.69, 381.44);
        gp211.lineTo(569.69, 390.44);
        gp211.lineTo(571.69, 395.44);
        gp211.lineTo(576.69, 386.44);
        gp211.lineTo(579.69, 385.44);
        gp211.lineTo(584.69, 375.44);
        gp211.lineTo(596.69, 363.44);
        gp211.lineTo(603.69, 356.44);
        gp211.lineTo(610.69, 348.44);
        gp211.lineTo(615.69, 339.44);
        gp211.lineTo(616.69, 333.44);
        gp211.closePath();
        g2d.setColor(new Color(156, 173, 214));
        g2d.fill(gp211);

        // Rectangle
        Rectangle2D.Double rectangle212 = new Rectangle2D.Double(
                91.69, 83.04,
                25.35, 2.44
        );
        Rectangle2D bounds212 = rectangle212.getBounds2D();
        AffineTransform rotation212 = AffineTransform.getRotateInstance(
                Math.toRadians(-62.24),
                bounds212.getCenterX(), bounds212.getCenterY()
        );
        Shape rotated212 = rotation212.createTransformedShape(rectangle212);
        g2d.setColor(new Color(118, 115, 83));
        g2d.fill(rotated212);

        // Circle
        Ellipse2D.Double circle213 = new Ellipse2D.Double(
                662.04, 287.89,
                54.07, 54.07
        );
        g2d.setColor(new Color(22, 23, 48));
        g2d.fill(circle213);

        // Ellipse
        Ellipse2D.Double ellipse214 = new Ellipse2D.Double(
                550.15, 282.73,
                12.74, 17.15
        );
        Rectangle2D bounds214 = ellipse214.getBounds2D();
        AffineTransform rotation214 = AffineTransform.getRotateInstance(
                Math.toRadians(212),
                bounds214.getCenterX(), bounds214.getCenterY()
        );
        Shape rotated214 = rotation214.createTransformedShape(ellipse214);
        g2d.setColor(new Color(40, 89, 169));
        g2d.fill(rotated214);

        // General path
        GeneralPath gp215 = new GeneralPath();
        gp215.moveTo(292.64, 194.5);
        gp215.lineTo(304.35, 174.38);
        gp215.lineTo(316.05, 191.99);
        gp215.lineTo(304.35, 199.54);
        gp215.closePath();
        Rectangle2D bounds215 = gp215.getBounds2D();
        AffineTransform rotation215 = AffineTransform.getRotateInstance(
                Math.toRadians(229),
                bounds215.getCenterX(), bounds215.getCenterY()
        );
        Shape rotated215 = rotation215.createTransformedShape(gp215);
        g2d.setColor(new Color(40, 69, 126));
        g2d.fill(rotated215);

        // Circle
        Ellipse2D.Double circle216 = new Ellipse2D.Double(
                130.79, 247.07,
                11.6, 11.6
        );
        Rectangle2D bounds216 = circle216.getBounds2D();
        AffineTransform rotation216 = AffineTransform.getRotateInstance(
                Math.toRadians(232),
                bounds216.getCenterX(), bounds216.getCenterY()
        );
        Shape rotated216 = rotation216.createTransformedShape(circle216);
        g2d.setColor(new Color(79, 91, 152));
        g2d.fill(rotated216);

        // Rectangle
        Rectangle2D.Double rectangle217 = new Rectangle2D.Double(
                328.69, 206.07,
                19.78, 10.55
        );
        g2d.setColor(new Color(31, 54, 145));
        g2d.fill(rectangle217);

        // Rectangle
        Rectangle2D.Double rectangle218 = new Rectangle2D.Double(
                394.92, 395.02,
                9.91, 12.01
        );
        g2d.setColor(new Color(59, 47, 153));
        g2d.fill(rectangle218);

    }

    public static void drawDetails16(Graphics2D g2d) {

        // General path
        GeneralPath gp219 = new GeneralPath();
        gp219.moveTo(617.93, 343.14);
        gp219.lineTo(615.93, 342.14);
        gp219.lineTo(613.93, 353.14);
        gp219.lineTo(610.93, 358.14);
        gp219.lineTo(608.93, 364.14);
        gp219.lineTo(592.93, 380.14);
        gp219.lineTo(579.93, 395.14);
        gp219.lineTo(578.93, 396.14);
        gp219.lineTo(563.93, 410.14);
        gp219.lineTo(564.93, 412.14);
        gp219.lineTo(565.93, 410.14);
        gp219.lineTo(576.93, 405.14);
        gp219.lineTo(578.93, 403.14);
        gp219.lineTo(605.93, 376.14);
        gp219.lineTo(612.93, 368.14);
        gp219.lineTo(615.93, 362.14);
        gp219.lineTo(616.93, 357.14);
        gp219.lineTo(617.93, 351.14);
        gp219.closePath();
        g2d.setColor(new Color(84, 112, 183));
        g2d.fill(gp219);

        // General path
        GeneralPath gp220 = new GeneralPath();
        gp220.moveTo(441.95, 47.17);
        gp220.lineTo(452.17, 37.33);
        gp220.lineTo(462.39, 45.94);
        gp220.lineTo(452.17, 49.63);
        gp220.closePath();
        Rectangle2D bounds220 = gp220.getBounds2D();
        AffineTransform rotation220 = AffineTransform.getRotateInstance(
                Math.toRadians(2),
                bounds220.getCenterX(), bounds220.getCenterY()
        );
        Shape rotated220 = rotation220.createTransformedShape(gp220);
        g2d.setColor(new Color(122, 136, 135));
        g2d.fill(rotated220);

        // Rectangle
        Rectangle2D.Double rectangle221 = new Rectangle2D.Double(
                379.3, 283.91,
                13.08, 6.75
        );
        g2d.setColor(new Color(255, 255, 255));
        g2d.fill(rectangle221);

        // Circle
        Ellipse2D.Double circle222 = new Ellipse2D.Double(
                415.53, 24.53,
                24.74, 24.74
        );
        Rectangle2D bounds222 = circle222.getBounds2D();
        AffineTransform rotation222 = AffineTransform.getRotateInstance(
                Math.toRadians(72),
                bounds222.getCenterX(), bounds222.getCenterY()
        );
        Shape rotated222 = rotation222.createTransformedShape(circle222);
        g2d.setColor(new Color(0, 6, 33));
        g2d.fill(rotated222);

        // Rectangle
        Rectangle2D.Double rectangle223 = new Rectangle2D.Double(
                638.81, 283.43,
                11.94, 5.74
        );
        g2d.setColor(new Color(0, 4, 57));
        g2d.fill(rectangle223);

        // Rectangle
        Rectangle2D.Double rectangle224 = new Rectangle2D.Double(
                712, 358.55,
                19.47, 22.03
        );
        g2d.setColor(new Color(64, 73, 104));
        g2d.fill(rectangle224);

        // Ellipse
        Ellipse2D.Double ellipse225 = new Ellipse2D.Double(
                82.55, 44.73,
                4.07, 43.53
        );
        Rectangle2D bounds225 = ellipse225.getBounds2D();
        AffineTransform rotation225 = AffineTransform.getRotateInstance(
                Math.toRadians(33.52),
                bounds225.getCenterX(), bounds225.getCenterY()
        );
        Shape rotated225 = rotation225.createTransformedShape(ellipse225);
        g2d.setColor(new Color(43, 43, 36));
        g2d.fill(rotated225);

        // Rectangle
        Rectangle2D.Double rectangle226 = new Rectangle2D.Double(
                99.47, 49.33,
                9.76, 5.68
        );
        g2d.setColor(new Color(77, 81, 72));
        g2d.fill(rectangle226);

        // Area / transformation
        GeneralPath boundary227_1 = new GeneralPath();
        boundary227_1.moveTo(272.11, 4.74);
        boundary227_1.lineTo(147.11, 72.74);
        boundary227_1.lineTo(125.11, 137.74);
        boundary227_1.lineTo(49.11, 177.74);
        boundary227_1.lineTo(-5.89, 4.74);
        boundary227_1.lineTo(23.11, 438.74);
        boundary227_1.lineTo(4.11, 349.74);
        boundary227_1.lineTo(20.11, 306.74);
        boundary227_1.lineTo(44.11, 283.74);
        boundary227_1.lineTo(64.11, 256.74);
        boundary227_1.lineTo(66.11, 214.74);
        boundary227_1.lineTo(92.11, 192.74);
        boundary227_1.lineTo(105.11, 173.74);
        boundary227_1.lineTo(145.11, 167.74);
        boundary227_1.lineTo(157.11, 131.74);
        boundary227_1.lineTo(181.11, 93.74);
        boundary227_1.lineTo(216.11, 65.74);
        boundary227_1.lineTo(242.11, 38.74);
        boundary227_1.closePath();
        Area area227 = new Area(boundary227_1);
        GeneralPath boundary227_2 = new GeneralPath();
        boundary227_2.moveTo(-2.89, 305.74);
        boundary227_2.lineTo(-1.89, 304.74);
        boundary227_2.lineTo(0.11, 306.74);
        boundary227_2.lineTo(-1.89, 307.74);
        boundary227_2.closePath();
        area227.subtract(new Area(boundary227_2));
        GeneralPath boundary227_3 = new GeneralPath();
        boundary227_3.moveTo(48.11, 239.74);
        boundary227_3.lineTo(49.11, 238.74);
        boundary227_3.lineTo(52.11, 238.74);
        boundary227_3.lineTo(53.11, 241.74);
        boundary227_3.lineTo(51.11, 242.74);
        boundary227_3.lineTo(50.11, 240.74);
        boundary227_3.closePath();
        area227.subtract(new Area(boundary227_3));
        g2d.setColor(new Color(3, 5, 11));
        g2d.fill(area227);

        // Circle
        Ellipse2D.Double circle228 = new Ellipse2D.Double(
                504.76, 410.43,
                18.7, 18.7
        );
        g2d.setColor(new Color(31, 79, 175));
        g2d.fill(circle228);

        // Square
        Rectangle2D.Double square229 = new Rectangle2D.Double(
                414.25, 135.73,
                13.5, 13.5
        );
        g2d.setColor(new Color(17, 26, 65));
        g2d.fill(square229);

        // Rectangle
        Rectangle2D.Double rectangle230 = new Rectangle2D.Double(
                737.07, 253.61,
                12.82, 14.52
        );
        g2d.setColor(new Color(0, 0, 23));
        g2d.fill(rectangle230);

        // Rectangle
        Rectangle2D.Double rectangle231 = new Rectangle2D.Double(
                733.87, 293.43,
                34.49, 27.55
        );
        g2d.setColor(new Color(3, 1, 29));
        g2d.fill(rectangle231);

    }

    public static void drawDetails17(Graphics2D g2d) {

        // General path
        GeneralPath gp232 = new GeneralPath();
        gp232.moveTo(338.77, 255.97);
        gp232.lineTo(347.83, 245.84);
        gp232.lineTo(356.88, 254.71);
        gp232.lineTo(347.83, 258.51);
        gp232.closePath();
        Rectangle2D bounds232 = gp232.getBounds2D();
        AffineTransform rotation232 = AffineTransform.getRotateInstance(
                Math.toRadians(246),
                bounds232.getCenterX(), bounds232.getCenterY()
        );
        Shape rotated232 = rotation232.createTransformedShape(gp232);
        g2d.setColor(new Color(13, 27, 167));
        g2d.fill(rotated232);

        // Circle
        Ellipse2D.Double circle233 = new Ellipse2D.Double(
                536.04, 21.55,
                9.66, 9.66
        );
        Rectangle2D bounds233 = circle233.getBounds2D();
        AffineTransform rotation233 = AffineTransform.getRotateInstance(
                Math.toRadians(116),
                bounds233.getCenterX(), bounds233.getCenterY()
        );
        Shape rotated233 = rotation233.createTransformedShape(circle233);
        g2d.setColor(new Color(27, 21, 8));
        g2d.fill(rotated233);

        // Square
        Rectangle2D.Double square234 = new Rectangle2D.Double(
                120.59, 61.32,
                7.82, 7.82
        );
        g2d.setColor(new Color(84, 87, 73));
        g2d.fill(square234);

        // Rectangle
        Rectangle2D.Double rectangle235 = new Rectangle2D.Double(
                674.32, 360.44,
                12.15, 25.24
        );
        Rectangle2D bounds235 = rectangle235.getBounds2D();
        AffineTransform rotation235 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds235.getCenterX(), bounds235.getCenterY()
        );
        Shape rotated235 = rotation235.createTransformedShape(rectangle235);
        g2d.setColor(new Color(0, 12, 61));
        g2d.fill(rotated235);

        // Ellipse
        Ellipse2D.Double ellipse236 = new Ellipse2D.Double(
                279.54, 252.48,
                12.93, 6.11
        );
        Rectangle2D bounds236 = ellipse236.getBounds2D();
        AffineTransform rotation236 = AffineTransform.getRotateInstance(
                Math.toRadians(235),
                bounds236.getCenterX(), bounds236.getCenterY()
        );
        Shape rotated236 = rotation236.createTransformedShape(ellipse236);
        g2d.setColor(new Color(0, 0, 23));
        g2d.fill(rotated236);

        // Rectangle
        Rectangle2D.Double rectangle237 = new Rectangle2D.Double(
                109.35, 28.17,
                11.15, 13.24
        );
        g2d.setColor(new Color(11, 10, 8));
        g2d.fill(rectangle237);

        // Ellipse
        Ellipse2D.Double ellipse238 = new Ellipse2D.Double(
                463.74, 4.11,
                13.03, 30.5
        );
        Rectangle2D bounds238 = ellipse238.getBounds2D();
        AffineTransform rotation238 = AffineTransform.getRotateInstance(
                Math.toRadians(146.21),
                bounds238.getCenterX(), bounds238.getCenterY()
        );
        Shape rotated238 = rotation238.createTransformedShape(ellipse238);
        g2d.setColor(new Color(1, 17, 83));
        g2d.fill(rotated238);

        // Rectangle
        Rectangle2D.Double rectangle239 = new Rectangle2D.Double(
                746.21, 341.65,
                19.66, 25.18
        );
        g2d.setColor(new Color(32, 36, 65));
        g2d.fill(rectangle239);

        // General path
        GeneralPath gp240 = new GeneralPath();
        gp240.moveTo(259.25, 31.97);
        gp240.lineTo(270, 24.07);
        gp240.lineTo(280.74, 30.98);
        gp240.lineTo(270, 33.94);
        gp240.closePath();
        Rectangle2D bounds240 = gp240.getBounds2D();
        AffineTransform rotation240 = AffineTransform.getRotateInstance(
                Math.toRadians(123),
                bounds240.getCenterX(), bounds240.getCenterY()
        );
        Shape rotated240 = rotation240.createTransformedShape(gp240);
        g2d.setColor(new Color(7, 10, 22));
        g2d.fill(rotated240);

        // Rectangle
        Rectangle2D.Double rectangle241 = new Rectangle2D.Double(
                453.15, 23.97,
                11.77, 17.04
        );
        Rectangle2D bounds241 = rectangle241.getBounds2D();
        AffineTransform rotation241 = AffineTransform.getRotateInstance(
                Math.toRadians(-71.56),
                bounds241.getCenterX(), bounds241.getCenterY()
        );
        Shape rotated241 = rotation241.createTransformedShape(rectangle241);
        g2d.setColor(new Color(2, 8, 18));
        g2d.fill(rotated241);

        // Rectangle
        Rectangle2D.Double rectangle242 = new Rectangle2D.Double(
                521.67, -5.4,
                33.18, 21.38
        );
        g2d.setColor(new Color(58, 60, 46));
        g2d.fill(rectangle242);

        // General path
        GeneralPath gp243 = new GeneralPath();
        gp243.moveTo(624.05, 297.87);
        gp243.lineTo(630.43, 291.95);
        gp243.lineTo(636.82, 297.13);
        gp243.lineTo(630.43, 299.36);
        gp243.closePath();
        Rectangle2D bounds243 = gp243.getBounds2D();
        AffineTransform rotation243 = AffineTransform.getRotateInstance(
                Math.toRadians(37),
                bounds243.getCenterX(), bounds243.getCenterY()
        );
        Shape rotated243 = rotation243.createTransformedShape(gp243);
        g2d.setColor(new Color(48, 74, 162));
        g2d.fill(rotated243);

        // Arc
        Arc2D.Double arc244 = new Arc2D.Double(
                453.37, 65.68,
                15, 16.47,
                0, 151, Arc2D.OPEN
        );
        Rectangle2D bounds244 = arc244.getBounds2D();
        AffineTransform rotation244 = AffineTransform.getRotateInstance(
                Math.toRadians(81),
                bounds244.getCenterX(), bounds244.getCenterY()
        );
        Shape rotated244 = rotation244.createTransformedShape(arc244);
        g2d.setColor(new Color(153, 147, 149));
        BasicStroke bs244 = new BasicStroke(
                3.3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs244);
        g2d.draw(rotated244);

    }

    public static void drawDetails18(Graphics2D g2d) {

        // Arc
        Arc2D.Double arc245 = new Arc2D.Double(
                611.59, 344.39,
                28.42, 17.99,
                0, 188, Arc2D.PIE
        );
        Rectangle2D bounds245 = arc245.getBounds2D();
        AffineTransform rotation245 = AffineTransform.getRotateInstance(
                Math.toRadians(256),
                bounds245.getCenterX(), bounds245.getCenterY()
        );
        Shape rotated245 = rotation245.createTransformedShape(arc245);
        g2d.setColor(new Color(21, 48, 118));
        g2d.fill(rotated245);

        // General path
        GeneralPath gp246 = new GeneralPath();
        gp246.moveTo(420, 0);
        gp246.lineTo(416, 0);
        gp246.lineTo(415, 24);
        gp246.lineTo(417, 24);
        gp246.lineTo(421, 21);
        gp246.lineTo(422, 23);
        gp246.lineTo(423, 19);
        gp246.lineTo(422, 20);
        gp246.lineTo(421, 19);
        gp246.lineTo(422, 4);
        gp246.lineTo(419, 4);
        gp246.lineTo(418, 3);
        gp246.lineTo(420, 2);
        gp246.closePath();
        g2d.setColor(new Color(6, 9, 76));
        g2d.fill(gp246);

        // Circle
        Ellipse2D.Double circle247 = new Ellipse2D.Double(
                471.83, 48.62,
                11.29, 11.29
        );
        Rectangle2D bounds247 = circle247.getBounds2D();
        AffineTransform rotation247 = AffineTransform.getRotateInstance(
                Math.toRadians(242),
                bounds247.getCenterX(), bounds247.getCenterY()
        );
        Shape rotated247 = rotation247.createTransformedShape(circle247);
        g2d.setColor(new Color(114, 111, 127));
        g2d.fill(rotated247);

        // Rectangle
        Rectangle2D.Double rectangle248 = new Rectangle2D.Double(
                705.15, 261.6,
                30.74, 16.01
        );
        g2d.setColor(new Color(1, 8, 43));
        g2d.fill(rectangle248);

        // Ellipse
        Ellipse2D.Double ellipse249 = new Ellipse2D.Double(
                384.06, 18.13,
                4.74, 18.34
        );
        Rectangle2D bounds249 = ellipse249.getBounds2D();
        AffineTransform rotation249 = AffineTransform.getRotateInstance(
                Math.toRadians(175.51),
                bounds249.getCenterX(), bounds249.getCenterY()
        );
        Shape rotated249 = rotation249.createTransformedShape(ellipse249);
        g2d.setColor(new Color(0, 9, 96));
        g2d.fill(rotated249);

        // General path
        GeneralPath gp250 = new GeneralPath();
        gp250.moveTo(214.95, 8.77);
        gp250.lineTo(221.68, 2.14);
        gp250.lineTo(228.41, 7.94);
        gp250.lineTo(221.68, 10.43);
        gp250.closePath();
        Rectangle2D bounds250 = gp250.getBounds2D();
        AffineTransform rotation250 = AffineTransform.getRotateInstance(
                Math.toRadians(300),
                bounds250.getCenterX(), bounds250.getCenterY()
        );
        Shape rotated250 = rotation250.createTransformedShape(gp250);
        g2d.setColor(new Color(48, 52, 65));
        g2d.fill(rotated250);

        // Rectangle
        Rectangle2D.Double rectangle251 = new Rectangle2D.Double(
                714.36, 393.83,
                33.8, 9.97
        );
        Rectangle2D bounds251 = rectangle251.getBounds2D();
        AffineTransform rotation251 = AffineTransform.getRotateInstance(
                Math.toRadians(-49.4),
                bounds251.getCenterX(), bounds251.getCenterY()
        );
        Shape rotated251 = rotation251.createTransformedShape(rectangle251);
        g2d.setColor(new Color(29, 34, 68));
        g2d.fill(rotated251);

        // Rectangle
        Rectangle2D.Double rectangle252 = new Rectangle2D.Double(
                94.66, 15.42,
                13.17, 14.33
        );
        g2d.setColor(new Color(7, 7, 8));
        g2d.fill(rectangle252);

        // Circle
        Ellipse2D.Double circle253 = new Ellipse2D.Double(
                574.91, 219.43,
                9.23, 9.23
        );
        Rectangle2D bounds253 = circle253.getBounds2D();
        AffineTransform rotation253 = AffineTransform.getRotateInstance(
                Math.toRadians(291),
                bounds253.getCenterX(), bounds253.getCenterY()
        );
        Shape rotated253 = rotation253.createTransformedShape(circle253);
        g2d.setColor(new Color(61, 93, 131));
        g2d.fill(rotated253);

        // Rectangle
        Rectangle2D.Double rectangle254 = new Rectangle2D.Double(
                780.33, 362.79,
                28.11, 31.91
        );
        g2d.setColor(new Color(4, 4, 32));
        g2d.fill(rectangle254);

        // General path
        GeneralPath gp255 = new GeneralPath();
        gp255.moveTo(134.52, 29.64);
        gp255.lineTo(139.13, 20.16);
        gp255.lineTo(143.74, 28.46);
        gp255.lineTo(139.13, 32.01);
        gp255.closePath();
        Rectangle2D bounds255 = gp255.getBounds2D();
        AffineTransform rotation255 = AffineTransform.getRotateInstance(
                Math.toRadians(254),
                bounds255.getCenterX(), bounds255.getCenterY()
        );
        Shape rotated255 = rotation255.createTransformedShape(gp255);
        g2d.setColor(new Color(0, 0, 3));
        g2d.fill(rotated255);

        // Rectangle
        Rectangle2D.Double rectangle256 = new Rectangle2D.Double(
                630.87, 32.75,
                40.7, 143.85
        );
        Rectangle2D bounds256 = rectangle256.getBounds2D();
        AffineTransform rotation256 = AffineTransform.getRotateInstance(
                Math.toRadians(-63.15),
                bounds256.getCenterX(), bounds256.getCenterY()
        );
        Shape rotated256 = rotation256.createTransformedShape(rectangle256);
        g2d.setColor(new Color(20, 24, 67));
        g2d.fill(rotated256);

        // Circle
        Ellipse2D.Double circle257 = new Ellipse2D.Double(
                384.74, 432.09,
                17.68, 17.68
        );
        g2d.setColor(new Color(15, 80, 176));
        g2d.fill(circle257);

    }

    public static void drawDetails19(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle258 = new Rectangle2D.Double(
                311.86, 354.94,
                56.97, 13.54
        );
        Rectangle2D bounds258 = rectangle258.getBounds2D();
        AffineTransform rotation258 = AffineTransform.getRotateInstance(
                Math.toRadians(-3.18),
                bounds258.getCenterX(), bounds258.getCenterY()
        );
        Shape rotated258 = rotation258.createTransformedShape(rectangle258);
        g2d.setColor(new Color(22, 21, 53));
        g2d.fill(rotated258);

        // Circle
        Ellipse2D.Double circle259 = new Ellipse2D.Double(
                167.25, 389.08,
                135.07, 135.07
        );
        Rectangle2D bounds259 = circle259.getBounds2D();
        AffineTransform rotation259 = AffineTransform.getRotateInstance(
                Math.toRadians(211),
                bounds259.getCenterX(), bounds259.getCenterY()
        );
        Shape rotated259 = rotation259.createTransformedShape(circle259);
        g2d.setColor(new Color(4, 23, 71));
        g2d.fill(rotated259);

        // Circle
        Ellipse2D.Double circle260 = new Ellipse2D.Double(
                370.92, 333.2,
                34.26, 34.26
        );
        g2d.setColor(new Color(102, 96, 175));
        g2d.fill(circle260);

        // Rectangle
        Rectangle2D.Double rectangle261 = new Rectangle2D.Double(
                550.4, 272.87,
                105.73, 23.9
        );
        Rectangle2D bounds261 = rectangle261.getBounds2D();
        AffineTransform rotation261 = AffineTransform.getRotateInstance(
                Math.toRadians(-58.84),
                bounds261.getCenterX(), bounds261.getCenterY()
        );
        Shape rotated261 = rotation261.createTransformedShape(rectangle261);
        g2d.setColor(new Color(91, 134, 205));
        g2d.fill(rotated261);

        // Rectangle
        Rectangle2D.Double rectangle262 = new Rectangle2D.Double(
                378.84, 362.66,
                11.5, 47.03
        );
        Rectangle2D bounds262 = rectangle262.getBounds2D();
        AffineTransform rotation262 = AffineTransform.getRotateInstance(
                Math.toRadians(-85.6),
                bounds262.getCenterX(), bounds262.getCenterY()
        );
        Shape rotated262 = rotation262.createTransformedShape(rectangle262);
        g2d.setColor(new Color(109, 109, 244));
        g2d.fill(rotated262);

        // Square
        Rectangle2D.Double square263 = new Rectangle2D.Double(
                429.01, 294.18,
                41.84, 41.84
        );
        g2d.setColor(new Color(11, 23, 56));
        g2d.fill(square263);

        // General path
        GeneralPath gp264 = new GeneralPath();
        gp264.moveTo(519.87, 198.24);
        gp264.lineTo(563.32, 116.88);
        gp264.lineTo(606.77, 188.07);
        gp264.lineTo(563.32, 218.58);
        gp264.closePath();
        Rectangle2D bounds264 = gp264.getBounds2D();
        AffineTransform rotation264 = AffineTransform.getRotateInstance(
                Math.toRadians(317),
                bounds264.getCenterX(), bounds264.getCenterY()
        );
        Shape rotated264 = rotation264.createTransformedShape(gp264);
        g2d.setColor(new Color(13, 48, 122));
        g2d.fill(rotated264);

        // Arc
        Arc2D.Double arc265 = new Arc2D.Double(
                485.91, 245.38,
                72.47, 42.8,
                0, 219, Arc2D.PIE
        );
        Rectangle2D bounds265 = arc265.getBounds2D();
        AffineTransform rotation265 = AffineTransform.getRotateInstance(
                Math.toRadians(143),
                bounds265.getCenterX(), bounds265.getCenterY()
        );
        Shape rotated265 = rotation265.createTransformedShape(arc265);
        g2d.setColor(new Color(73, 127, 204));
        g2d.fill(rotated265);

        // Ellipse
        Ellipse2D.Double ellipse266 = new Ellipse2D.Double(
                432.08, 438.15,
                39.2, 26.09
        );
        Rectangle2D bounds266 = ellipse266.getBounds2D();
        AffineTransform rotation266 = AffineTransform.getRotateInstance(
                Math.toRadians(285),
                bounds266.getCenterX(), bounds266.getCenterY()
        );
        Shape rotated266 = rotation266.createTransformedShape(ellipse266);
        g2d.setColor(new Color(24, 65, 138));
        g2d.fill(rotated266);

        // Ellipse
        Ellipse2D.Double ellipse267 = new Ellipse2D.Double(
                380.66, 167.94,
                10.13, 15.7
        );
        Rectangle2D bounds267 = ellipse267.getBounds2D();
        AffineTransform rotation267 = AffineTransform.getRotateInstance(
                Math.toRadians(104.47),
                bounds267.getCenterX(), bounds267.getCenterY()
        );
        Shape rotated267 = rotation267.createTransformedShape(ellipse267);
        g2d.setColor(new Color(205, 208, 255));
        g2d.fill(rotated267);

        // Ellipse
        Ellipse2D.Double ellipse268 = new Ellipse2D.Double(
                424.12, 174.55,
                17.86, 35.25
        );
        Rectangle2D bounds268 = ellipse268.getBounds2D();
        AffineTransform rotation268 = AffineTransform.getRotateInstance(
                Math.toRadians(115.68),
                bounds268.getCenterX(), bounds268.getCenterY()
        );
        Shape rotated268 = rotation268.createTransformedShape(ellipse268);
        g2d.setColor(new Color(99, 151, 213));
        g2d.fill(rotated268);

        // General path
        GeneralPath gp269 = new GeneralPath();
        gp269.moveTo(494.69, 293.39);
        gp269.lineTo(497.69, 294.39);
        gp269.lineTo(503.69, 296.39);
        gp269.lineTo(514.69, 302.39);
        gp269.lineTo(522.69, 309.39);
        gp269.lineTo(529.69, 311.39);
        gp269.lineTo(534.69, 315.39);
        gp269.lineTo(540.69, 314.39);
        gp269.lineTo(550.69, 322.39);
        gp269.lineTo(545.69, 320.39);
        gp269.lineTo(542.69, 311.39);
        gp269.lineTo(547.69, 303.39);
        gp269.lineTo(544.69, 295.39);
        gp269.lineTo(541.69, 284.39);
        gp269.lineTo(534.69, 277.39);
        gp269.lineTo(525.69, 283.39);
        gp269.lineTo(511.69, 288.39);
        gp269.lineTo(499.69, 289.39);
        gp269.closePath();
        g2d.setColor(new Color(0, 16, 53));
        g2d.fill(gp269);

    }

}

class witchPart3 {

    public static void drawPart(Graphics2D g2d) {
        drawDetails20(g2d);
        drawDetails21(g2d);
        drawDetails22(g2d);
        drawDetails23(g2d);
        drawDetails24(g2d);
        drawDetails25(g2d);
        drawDetails26(g2d);
        drawDetails27(g2d);
        drawDetails28(g2d);
        drawDetails29(g2d);
    }

    public static void drawDetails20(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse270 = new Ellipse2D.Double(
                152.61, 244.07,
                13.66, 36.98
        );
        Rectangle2D bounds270 = ellipse270.getBounds2D();
        AffineTransform rotation270 = AffineTransform.getRotateInstance(
                Math.toRadians(155.03),
                bounds270.getCenterX(), bounds270.getCenterY()
        );
        Shape rotated270 = rotation270.createTransformedShape(ellipse270);
        g2d.setColor(new Color(95, 94, 174));
        g2d.fill(rotated270);

        // Ellipse
        Ellipse2D.Double ellipse271 = new Ellipse2D.Double(
                609.67, 179.84,
                11.22, 53.23
        );
        Rectangle2D bounds271 = ellipse271.getBounds2D();
        AffineTransform rotation271 = AffineTransform.getRotateInstance(
                Math.toRadians(71.4),
                bounds271.getCenterX(), bounds271.getCenterY()
        );
        Shape rotated271 = rotation271.createTransformedShape(ellipse271);
        g2d.setColor(new Color(58, 74, 102));
        g2d.fill(rotated271);

        // Arc
        Arc2D.Double arc272 = new Arc2D.Double(
                477.92, 213.2,
                35.46, 25.77,
                0, 219, Arc2D.PIE
        );
        Rectangle2D bounds272 = arc272.getBounds2D();
        AffineTransform rotation272 = AffineTransform.getRotateInstance(
                Math.toRadians(131),
                bounds272.getCenterX(), bounds272.getCenterY()
        );
        Shape rotated272 = rotation272.createTransformedShape(arc272);
        g2d.setColor(new Color(63, 123, 207));
        g2d.fill(rotated272);

        // Circle
        Ellipse2D.Double circle273 = new Ellipse2D.Double(
                388.24, 419.37,
                9.24, 9.24
        );
        g2d.setColor(new Color(82, 147, 232));
        g2d.fill(circle273);

        // Ellipse
        Ellipse2D.Double ellipse274 = new Ellipse2D.Double(
                334.95, 130.72,
                71.43, 29.62
        );
        Rectangle2D bounds274 = ellipse274.getBounds2D();
        AffineTransform rotation274 = AffineTransform.getRotateInstance(
                Math.toRadians(105),
                bounds274.getCenterX(), bounds274.getCenterY()
        );
        Shape rotated274 = rotation274.createTransformedShape(ellipse274);
        g2d.setColor(new Color(25, 39, 93));
        g2d.fill(rotated274);

        // Rectangle
        Rectangle2D.Double rectangle275 = new Rectangle2D.Double(
                180.38, 170.67,
                163.56, 38.98
        );
        Rectangle2D bounds275 = rectangle275.getBounds2D();
        AffineTransform rotation275 = AffineTransform.getRotateInstance(
                Math.toRadians(-66.6),
                bounds275.getCenterX(), bounds275.getCenterY()
        );
        Shape rotated275 = rotation275.createTransformedShape(rectangle275);
        g2d.setColor(new Color(27, 48, 85));
        g2d.fill(rotated275);

        // Square
        Rectangle2D.Double square276 = new Rectangle2D.Double(
                405.76, 424.88,
                31.73, 31.73
        );
        g2d.setColor(new Color(7, 8, 19));
        g2d.fill(square276);

        // Cubic curve
        CubicCurve2D.Double cc277 = new CubicCurve2D.Double(
                469.38, 186.95,
                484.59, 164.22,
                504.89, 209.69,
                520.1, 186.95
        );
        Rectangle2D bounds277 = cc277.getBounds2D();
        AffineTransform rotation277 = AffineTransform.getRotateInstance(
                Math.toRadians(164),
                bounds277.getCenterX(), bounds277.getCenterY()
        );
        Shape rotated277 = rotation277.createTransformedShape(cc277);
        g2d.setColor(new Color(84, 141, 234));
        BasicStroke bs277 = new BasicStroke(
                3.74f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs277);
        g2d.draw(rotated277);

        // Rectangle
        Rectangle2D.Double rectangle278 = new Rectangle2D.Double(
                463.82, 407.47,
                36.41, 20.26
        );
        g2d.setColor(new Color(43, 44, 44));
        g2d.fill(rectangle278);

        // Ellipse
        Ellipse2D.Double ellipse279 = new Ellipse2D.Double(
                486.54, 377.09,
                10.19, 19.18
        );
        Rectangle2D bounds279 = ellipse279.getBounds2D();
        AffineTransform rotation279 = AffineTransform.getRotateInstance(
                Math.toRadians(146.07),
                bounds279.getCenterX(), bounds279.getCenterY()
        );
        Shape rotated279 = rotation279.createTransformedShape(ellipse279);
        g2d.setColor(new Color(97, 162, 240));
        g2d.fill(rotated279);

        // Ellipse
        Ellipse2D.Double ellipse280 = new Ellipse2D.Double(
                355.27, 196.33,
                10.26, 16.28
        );
        Rectangle2D bounds280 = ellipse280.getBounds2D();
        AffineTransform rotation280 = AffineTransform.getRotateInstance(
                Math.toRadians(37.51),
                bounds280.getCenterX(), bounds280.getCenterY()
        );
        Shape rotated280 = rotation280.createTransformedShape(ellipse280);
        g2d.setColor(new Color(246, 237, 255));
        g2d.fill(rotated280);

        // Rectangle
        Rectangle2D.Double rectangle281 = new Rectangle2D.Double(
                122.81, 268.15,
                23.51, 67.07
        );
        Rectangle2D bounds281 = rectangle281.getBounds2D();
        AffineTransform rotation281 = AffineTransform.getRotateInstance(
                Math.toRadians(-13.17),
                bounds281.getCenterX(), bounds281.getCenterY()
        );
        Shape rotated281 = rotation281.createTransformedShape(rectangle281);
        g2d.setColor(new Color(57, 63, 111));
        g2d.fill(rotated281);

        // Ellipse
        Ellipse2D.Double ellipse282 = new Ellipse2D.Double(
                387.6, 246.82,
                30.21, 30.12
        );
        Rectangle2D bounds282 = ellipse282.getBounds2D();
        AffineTransform rotation282 = AffineTransform.getRotateInstance(
                Math.toRadians(338),
                bounds282.getCenterX(), bounds282.getCenterY()
        );
        Shape rotated282 = rotation282.createTransformedShape(ellipse282);
        g2d.setColor(new Color(176, 235, 253));
        g2d.fill(rotated282);

    }

    public static void drawDetails21(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse283 = new Ellipse2D.Double(
                326.44, 184.9,
                6.79, 21.9
        );
        Rectangle2D bounds283 = ellipse283.getBounds2D();
        AffineTransform rotation283 = AffineTransform.getRotateInstance(
                Math.toRadians(53.28),
                bounds283.getCenterX(), bounds283.getCenterY()
        );
        Shape rotated283 = rotation283.createTransformedShape(ellipse283);
        g2d.setColor(new Color(80, 123, 193));
        g2d.fill(rotated283);

        // Square
        Rectangle2D.Double square284 = new Rectangle2D.Double(
                376.43, 188.2,
                15.77, 15.77
        );
        g2d.setColor(new Color(135, 147, 195));
        g2d.fill(square284);

        // Circle
        Ellipse2D.Double circle285 = new Ellipse2D.Double(
                477, 214.88,
                11.9, 11.9
        );
        Rectangle2D bounds285 = circle285.getBounds2D();
        AffineTransform rotation285 = AffineTransform.getRotateInstance(
                Math.toRadians(2),
                bounds285.getCenterX(), bounds285.getCenterY()
        );
        Shape rotated285 = rotation285.createTransformedShape(circle285);
        g2d.setColor(new Color(82, 152, 232));
        g2d.fill(rotated285);

        // Rectangle
        Rectangle2D.Double rectangle286 = new Rectangle2D.Double(
                411.3, 382.55,
                12.42, 11.6
        );
        g2d.setColor(new Color(81, 75, 225));
        g2d.fill(rectangle286);

        // Rectangle
        Rectangle2D.Double rectangle287 = new Rectangle2D.Double(
                420.12, 246.11,
                29.33, 12.13
        );
        g2d.setColor(new Color(31, 45, 153));
        g2d.fill(rectangle287);

        // Square
        Rectangle2D.Double square288 = new Rectangle2D.Double(
                162.09, 330.43,
                18.61, 18.61
        );
        g2d.setColor(new Color(18, 30, 69));
        g2d.fill(square288);

        // Square
        Rectangle2D.Double square289 = new Rectangle2D.Double(
                69.42, 226.71,
                27.53, 27.53
        );
        g2d.setColor(new Color(25, 23, 44));
        g2d.fill(square289);

        // Circle
        Ellipse2D.Double circle290 = new Ellipse2D.Double(
                166.43, 235.75,
                28.12, 28.12
        );
        Rectangle2D bounds290 = circle290.getBounds2D();
        AffineTransform rotation290 = AffineTransform.getRotateInstance(
                Math.toRadians(299),
                bounds290.getCenterX(), bounds290.getCenterY()
        );
        Shape rotated290 = rotation290.createTransformedShape(circle290);
        g2d.setColor(new Color(13, 21, 54));
        g2d.fill(rotated290);

        // Circle
        Ellipse2D.Double circle291 = new Ellipse2D.Double(
                314.63, 226.62,
                23.36, 23.36
        );
        g2d.setColor(new Color(14, 31, 110));
        g2d.fill(circle291);

        // Ellipse
        Ellipse2D.Double ellipse292 = new Ellipse2D.Double(
                417.72, 348.02,
                7.74, 51.9
        );
        Rectangle2D bounds292 = ellipse292.getBounds2D();
        AffineTransform rotation292 = AffineTransform.getRotateInstance(
                Math.toRadians(102.28),
                bounds292.getCenterX(), bounds292.getCenterY()
        );
        Shape rotated292 = rotation292.createTransformedShape(ellipse292);
        g2d.setColor(new Color(32, 24, 126));
        g2d.fill(rotated292);

        // General path
        GeneralPath gp293 = new GeneralPath();
        gp293.moveTo(355.22, 283.82);
        gp293.lineTo(361.22, 281.82);
        gp293.lineTo(359.22, 289.82);
        gp293.lineTo(361.22, 298.82);
        gp293.lineTo(380.22, 305.82);
        gp293.lineTo(387.22, 307.82);
        gp293.lineTo(389.22, 308.82);
        gp293.lineTo(392.22, 307.82);
        gp293.lineTo(403.22, 296.82);
        gp293.lineTo(398.22, 291.82);
        gp293.lineTo(393.22, 293.82);
        gp293.lineTo(393.22, 296.82);
        gp293.lineTo(393.22, 298.82);
        gp293.lineTo(392.22, 303.82);
        gp293.lineTo(376.22, 300.82);
        gp293.lineTo(366.22, 297.82);
        gp293.lineTo(363.22, 285.82);
        gp293.lineTo(361.22, 279.82);
        gp293.closePath();
        g2d.setColor(new Color(109, 132, 233));
        g2d.fill(gp293);

        // Ellipse
        Ellipse2D.Double ellipse294 = new Ellipse2D.Double(
                83.77, 62.86,
                6.83, 113.18
        );
        Rectangle2D bounds294 = ellipse294.getBounds2D();
        AffineTransform rotation294 = AffineTransform.getRotateInstance(
                Math.toRadians(30.91),
                bounds294.getCenterX(), bounds294.getCenterY()
        );
        Shape rotated294 = rotation294.createTransformedShape(ellipse294);
        g2d.setColor(new Color(32, 31, 25));
        g2d.fill(rotated294);

        // Ellipse
        Ellipse2D.Double ellipse295 = new Ellipse2D.Double(
                329.34, 168.59,
                9.68, 25.58
        );
        Rectangle2D bounds295 = ellipse295.getBounds2D();
        AffineTransform rotation295 = AffineTransform.getRotateInstance(
                Math.toRadians(44.55),
                bounds295.getCenterX(), bounds295.getCenterY()
        );
        Shape rotated295 = rotation295.createTransformedShape(ellipse295);
        g2d.setColor(new Color(0, 12, 46));
        g2d.fill(rotated295);

        // Square
        Rectangle2D.Double square296 = new Rectangle2D.Double(
                185.4, 339.18,
                14.65, 14.65
        );
        g2d.setColor(new Color(15, 31, 74));
        g2d.fill(square296);

        // Ellipse
        Ellipse2D.Double ellipse297 = new Ellipse2D.Double(
                338.69, 214.39,
                26.98, 14.69
        );
        Rectangle2D bounds297 = ellipse297.getBounds2D();
        AffineTransform rotation297 = AffineTransform.getRotateInstance(
                Math.toRadians(325),
                bounds297.getCenterX(), bounds297.getCenterY()
        );
        Shape rotated297 = rotation297.createTransformedShape(ellipse297);
        g2d.setColor(new Color(56, 84, 189));
        g2d.fill(rotated297);

    }

    public static void drawDetails22(Graphics2D g2d) {

        // Line
        Line2D.Double line298 = new Line2D.Double(
                523.09, 321.54,
                541.87, 321.54
        );
        Rectangle2D bounds298 = line298.getBounds2D();
        AffineTransform rotation298 = AffineTransform.getRotateInstance(
                Math.toRadians(237),
                bounds298.getCenterX(), bounds298.getCenterY()
        );
        Shape rotated298 = rotation298.createTransformedShape(line298);
        g2d.setColor(new Color(0, 0, 28));
        BasicStroke bs298 = new BasicStroke(
                3.23f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs298);
        g2d.draw(rotated298);

        // Rectangle
        Rectangle2D.Double rectangle299 = new Rectangle2D.Double(
                471.83, 446.54,
                22.64, 11.39
        );
        g2d.setColor(new Color(16, 17, 13));
        g2d.fill(rectangle299);

        // Circle
        Ellipse2D.Double circle300 = new Ellipse2D.Double(
                342.74, 181.17,
                13.21, 13.21
        );
        Rectangle2D bounds300 = circle300.getBounds2D();
        AffineTransform rotation300 = AffineTransform.getRotateInstance(
                Math.toRadians(172),
                bounds300.getCenterX(), bounds300.getCenterY()
        );
        Shape rotated300 = rotation300.createTransformedShape(circle300);
        g2d.setColor(new Color(98, 148, 207));
        g2d.fill(rotated300);

        // Rectangle
        Rectangle2D.Double rectangle301 = new Rectangle2D.Double(
                358.29, 45.03,
                8.53, 9.22
        );
        g2d.setColor(new Color(42, 74, 133));
        g2d.fill(rectangle301);

        // Ellipse
        Ellipse2D.Double ellipse302 = new Ellipse2D.Double(
                304.68, 4.61,
                31.67, 83.14
        );
        Rectangle2D bounds302 = ellipse302.getBounds2D();
        AffineTransform rotation302 = AffineTransform.getRotateInstance(
                Math.toRadians(50.49),
                bounds302.getCenterX(), bounds302.getCenterY()
        );
        Shape rotated302 = rotation302.createTransformedShape(ellipse302);
        g2d.setColor(new Color(12, 28, 53));
        g2d.fill(rotated302);

        // Square
        Rectangle2D.Double square303 = new Rectangle2D.Double(
                598.03, 389.25,
                30.36, 30.36
        );
        g2d.setColor(new Color(42, 60, 144));
        g2d.fill(square303);

        // Ellipse
        Ellipse2D.Double ellipse304 = new Ellipse2D.Double(
                122.84, 202.52,
                8.6, 33.33
        );
        Rectangle2D bounds304 = ellipse304.getBounds2D();
        AffineTransform rotation304 = AffineTransform.getRotateInstance(
                Math.toRadians(140.65),
                bounds304.getCenterX(), bounds304.getCenterY()
        );
        Shape rotated304 = rotation304.createTransformedShape(ellipse304);
        g2d.setColor(new Color(11, 8, 61));
        g2d.fill(rotated304);

        // Ellipse
        Ellipse2D.Double ellipse305 = new Ellipse2D.Double(
                185.24, 261.47,
                5.9, 29.23
        );
        Rectangle2D bounds305 = ellipse305.getBounds2D();
        AffineTransform rotation305 = AffineTransform.getRotateInstance(
                Math.toRadians(135.84),
                bounds305.getCenterX(), bounds305.getCenterY()
        );
        Shape rotated305 = rotation305.createTransformedShape(ellipse305);
        g2d.setColor(new Color(15, 26, 65));
        g2d.fill(rotated305);

        // Square
        Rectangle2D.Double square306 = new Rectangle2D.Double(
                391.7, 224.36,
                13.89, 13.89
        );
        g2d.setColor(new Color(240, 250, 255));
        g2d.fill(square306);

        // Ellipse
        Ellipse2D.Double ellipse307 = new Ellipse2D.Double(
                353.52, 261.4,
                10.17, 5.75
        );
        Rectangle2D bounds307 = ellipse307.getBounds2D();
        AffineTransform rotation307 = AffineTransform.getRotateInstance(
                Math.toRadians(108),
                bounds307.getCenterX(), bounds307.getCenterY()
        );
        Shape rotated307 = rotation307.createTransformedShape(ellipse307);
        g2d.setColor(new Color(200, 255, 255));
        g2d.fill(rotated307);

        // Ellipse
        Ellipse2D.Double ellipse308 = new Ellipse2D.Double(
                451.07, 357.74,
                3.51, 49.75
        );
        Rectangle2D bounds308 = ellipse308.getBounds2D();
        AffineTransform rotation308 = AffineTransform.getRotateInstance(
                Math.toRadians(88.95),
                bounds308.getCenterX(), bounds308.getCenterY()
        );
        Shape rotated308 = rotation308.createTransformedShape(ellipse308);
        g2d.setColor(new Color(58, 37, 226));
        g2d.fill(rotated308);

        // Rectangle
        Rectangle2D.Double rectangle309 = new Rectangle2D.Double(
                614.48, 326.84,
                13.69, 4.77
        );
        Rectangle2D bounds309 = rectangle309.getBounds2D();
        AffineTransform rotation309 = AffineTransform.getRotateInstance(
                Math.toRadians(-71.56),
                bounds309.getCenterX(), bounds309.getCenterY()
        );
        Shape rotated309 = rotation309.createTransformedShape(rectangle309);
        g2d.setColor(new Color(0, 44, 133));
        g2d.fill(rotated309);

        // Rectangle
        Rectangle2D.Double rectangle310 = new Rectangle2D.Double(
                601.5, 427.68,
                26.46, 30.04
        );
        g2d.setColor(new Color(12, 25, 77));
        g2d.fill(rectangle310);

        // Rectangle
        Rectangle2D.Double rectangle311 = new Rectangle2D.Double(
                153.48, 100.54,
                13.82, 6.49
        );
        g2d.setColor(new Color(31, 39, 50));
        g2d.fill(rectangle311);

        // Arc
        Arc2D.Double arc312 = new Arc2D.Double(
                354.4, 271.72,
                12.93, 13.08,
                0, 90, Arc2D.PIE
        );
        Rectangle2D bounds312 = arc312.getBounds2D();
        AffineTransform rotation312 = AffineTransform.getRotateInstance(
                Math.toRadians(358),
                bounds312.getCenterX(), bounds312.getCenterY()
        );
        Shape rotated312 = rotation312.createTransformedShape(arc312);
        g2d.setColor(new Color(167, 252, 255));
        g2d.fill(rotated312);

    }

    public static void drawDetails23(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse313 = new Ellipse2D.Double(
                698.88, 278.94,
                23.3, 41.94
        );
        Rectangle2D bounds313 = ellipse313.getBounds2D();
        AffineTransform rotation313 = AffineTransform.getRotateInstance(
                Math.toRadians(128.54),
                bounds313.getCenterX(), bounds313.getCenterY()
        );
        Shape rotated313 = rotation313.createTransformedShape(ellipse313);
        g2d.setColor(new Color(37, 23, 38));
        g2d.fill(rotated313);

        // Square
        Rectangle2D.Double square314 = new Rectangle2D.Double(
                11.83, 15.97,
                42.77, 42.77
        );
        g2d.setColor(new Color(1, 1, 4));
        g2d.fill(square314);

        // Rectangle
        Rectangle2D.Double rectangle315 = new Rectangle2D.Double(
                132.38, 238.95,
                4.35, 8.71
        );
        Rectangle2D bounds315 = rectangle315.getBounds2D();
        AffineTransform rotation315 = AffineTransform.getRotateInstance(
                Math.toRadians(-45),
                bounds315.getCenterX(), bounds315.getCenterY()
        );
        Shape rotated315 = rotation315.createTransformedShape(rectangle315);
        g2d.setColor(new Color(69, 79, 146));
        g2d.fill(rotated315);

        // Ellipse
        Ellipse2D.Double ellipse316 = new Ellipse2D.Double(
                370.51, 281.99,
                11.59, 8.5
        );
        Rectangle2D bounds316 = ellipse316.getBounds2D();
        AffineTransform rotation316 = AffineTransform.getRotateInstance(
                Math.toRadians(12),
                bounds316.getCenterX(), bounds316.getCenterY()
        );
        Shape rotated316 = rotation316.createTransformedShape(ellipse316);
        g2d.setColor(new Color(217, 255, 255));
        g2d.fill(rotated316);

        // Rectangle
        Rectangle2D.Double rectangle317 = new Rectangle2D.Double(
                371.2, 255.4,
                14.11, 10.94
        );
        g2d.setColor(new Color(215, 239, 252));
        g2d.fill(rectangle317);

        // Square
        Rectangle2D.Double square318 = new Rectangle2D.Double(
                486.75, 431.22,
                9.11, 9.11
        );
        g2d.setColor(new Color(217, 219, 215));
        g2d.fill(square318);

        // Square
        Rectangle2D.Double square319 = new Rectangle2D.Double(
                763.7, 263.62,
                31.26, 31.26
        );
        g2d.setColor(new Color(0, 0, 24));
        g2d.fill(square319);

        // Line
        Line2D.Double line320 = new Line2D.Double(
                566.09, 436.72,
                580.64, 436.72
        );
        Rectangle2D bounds320 = line320.getBounds2D();
        AffineTransform rotation320 = AffineTransform.getRotateInstance(
                Math.toRadians(16),
                bounds320.getCenterX(), bounds320.getCenterY()
        );
        Shape rotated320 = rotation320.createTransformedShape(line320);
        g2d.setColor(new Color(88, 108, 165));
        BasicStroke bs320 = new BasicStroke(
                3.1f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs320);
        g2d.draw(rotated320);

        // Ellipse
        Ellipse2D.Double ellipse321 = new Ellipse2D.Double(
                657.46, 405.64,
                25.01, 24.69
        );
        Rectangle2D bounds321 = ellipse321.getBounds2D();
        AffineTransform rotation321 = AffineTransform.getRotateInstance(
                Math.toRadians(199),
                bounds321.getCenterX(), bounds321.getCenterY()
        );
        Shape rotated321 = rotation321.createTransformedShape(ellipse321);
        g2d.setColor(new Color(24, 31, 95));
        g2d.fill(rotated321);

        // Square
        Rectangle2D.Double square322 = new Rectangle2D.Double(
                201.65, 287.65,
                10.08, 10.08
        );
        g2d.setColor(new Color(11, 26, 75));
        g2d.fill(square322);

        // Area / transformation
        GeneralPath boundary323_1 = new GeneralPath();
        boundary323_1.moveTo(408, 10);
        boundary323_1.lineTo(393, 29);
        boundary323_1.lineTo(387, 49);
        boundary323_1.lineTo(377, 48);
        boundary323_1.lineTo(370, 74);
        boundary323_1.lineTo(370, 71);
        boundary323_1.lineTo(376, 77);
        boundary323_1.lineTo(388, 65);
        boundary323_1.lineTo(386, 88);
        boundary323_1.lineTo(389, 82);
        boundary323_1.lineTo(395, 48);
        boundary323_1.lineTo(400, 36);
        boundary323_1.lineTo(405, 41);
        boundary323_1.lineTo(405, 55);
        boundary323_1.lineTo(397, 77);
        boundary323_1.lineTo(411, 79);
        boundary323_1.lineTo(419, 45);
        boundary323_1.lineTo(404, 37);
        boundary323_1.closePath();
        Area area323 = new Area(boundary323_1);
        GeneralPath boundary323_2 = new GeneralPath();
        boundary323_2.moveTo(389, 59);
        boundary323_2.lineTo(390, 60);
        boundary323_2.lineTo(390, 63);
        boundary323_2.lineTo(388, 65);
        boundary323_2.lineTo(387, 62);
        boundary323_2.closePath();
        area323.subtract(new Area(boundary323_2));
        GeneralPath boundary323_3 = new GeneralPath();
        boundary323_3.moveTo(380, 43);
        boundary323_3.lineTo(383, 45);
        boundary323_3.lineTo(383, 48);
        boundary323_3.lineTo(384, 49);
        boundary323_3.lineTo(384, 52);
        boundary323_3.lineTo(382, 56);
        boundary323_3.lineTo(379, 54);
        boundary323_3.lineTo(378, 51);
        boundary323_3.closePath();
        area323.subtract(new Area(boundary323_3));
        g2d.setColor(new Color(1, 4, 22));
        g2d.fill(area323);

    }

    public static void drawDetails24(Graphics2D g2d) {

        // General path
        GeneralPath gp324 = new GeneralPath();
        gp324.moveTo(616.67, 328.95);
        gp324.lineTo(613.67, 337.95);
        gp324.lineTo(608.67, 346.95);
        gp324.lineTo(599.67, 358.95);
        gp324.lineTo(582.67, 373.95);
        gp324.lineTo(577.67, 381.95);
        gp324.lineTo(580.67, 379.95);
        gp324.lineTo(581.67, 384.95);
        gp324.lineTo(578.67, 384.95);
        gp324.lineTo(565.67, 397.95);
        gp324.lineTo(564.67, 400.95);
        gp324.lineTo(567.67, 399.95);
        gp324.lineTo(578.67, 385.95);
        gp324.lineTo(582.67, 382.95);
        gp324.lineTo(583.67, 379.95);
        gp324.lineTo(596.67, 365.95);
        gp324.lineTo(604.67, 357.95);
        gp324.lineTo(614.67, 338.95);
        gp324.closePath();
        g2d.setColor(new Color(145, 165, 206));
        g2d.fill(gp324);

        // Rectangle
        Rectangle2D.Double rectangle325 = new Rectangle2D.Double(
                119.54, 31.63,
                13.09, 6.3
        );
        g2d.setColor(new Color(64, 64, 42));
        g2d.fill(rectangle325);

        // Square
        Rectangle2D.Double square326 = new Rectangle2D.Double(
                233.18, 35.57,
                11.9, 11.9
        );
        g2d.setColor(new Color(16, 27, 47));
        g2d.fill(square326);

        // Rectangle
        Rectangle2D.Double rectangle327 = new Rectangle2D.Double(
                535.43, 417.99,
                24.26, 32.17
        );
        g2d.setColor(new Color(19, 52, 140));
        g2d.fill(rectangle327);

        // Arc
        Arc2D.Double arc328 = new Arc2D.Double(
                107.54, 38.4,
                8.78, 11.84,
                0, 294, Arc2D.OPEN
        );
        Rectangle2D bounds328 = arc328.getBounds2D();
        AffineTransform rotation328 = AffineTransform.getRotateInstance(
                Math.toRadians(285),
                bounds328.getCenterX(), bounds328.getCenterY()
        );
        Shape rotated328 = rotation328.createTransformedShape(arc328);
        g2d.setColor(new Color(6, 0, 2));
        BasicStroke bs328 = new BasicStroke(
                2.83f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs328);
        g2d.draw(rotated328);

        // Circle
        Ellipse2D.Double circle329 = new Ellipse2D.Double(
                12.2, 61.04,
                37.87, 37.87
        );
        Rectangle2D bounds329 = circle329.getBounds2D();
        AffineTransform rotation329 = AffineTransform.getRotateInstance(
                Math.toRadians(127),
                bounds329.getCenterX(), bounds329.getCenterY()
        );
        Shape rotated329 = rotation329.createTransformedShape(circle329);
        g2d.setColor(new Color(1, 2, 5));
        g2d.fill(rotated329);

        // Arc
        Arc2D.Double arc330 = new Arc2D.Double(
                307.9, 194.16,
                13.06, 11.62,
                0, 175, Arc2D.PIE
        );
        Rectangle2D bounds330 = arc330.getBounds2D();
        AffineTransform rotation330 = AffineTransform.getRotateInstance(
                Math.toRadians(193),
                bounds330.getCenterX(), bounds330.getCenterY()
        );
        Shape rotated330 = rotation330.createTransformedShape(arc330);
        g2d.setColor(new Color(0, 2, 29));
        g2d.fill(rotated330);

        // General path
        GeneralPath gp331 = new GeneralPath();
        gp331.moveTo(127, 0);
        gp331.lineTo(118, 18);
        gp331.lineTo(111, 7);
        gp331.lineTo(106, 8);
        gp331.lineTo(109, 18);
        gp331.lineTo(109, 27);
        gp331.lineTo(109, 29);
        gp331.lineTo(106, 33);
        gp331.lineTo(106, 34);
        gp331.lineTo(108, 30);
        gp331.lineTo(112, 28);
        gp331.lineTo(128, 16);
        gp331.lineTo(127, 17);
        gp331.lineTo(127, 17);
        gp331.lineTo(121, 21);
        gp331.lineTo(111, 29);
        gp331.lineTo(112, 24);
        gp331.lineTo(120, 13);
        gp331.closePath();
        g2d.setColor(new Color(64, 67, 59));
        g2d.fill(gp331);

        // Square
        Rectangle2D.Double square332 = new Rectangle2D.Double(
                -0.6, 428.69,
                22.94, 22.94
        );
        g2d.setColor(new Color(3, 3, 11));
        g2d.fill(square332);

        // Arc
        Arc2D.Double arc333 = new Arc2D.Double(
                339.48, 197.45,
                9.1, 8.63,
                0, 269, Arc2D.PIE
        );
        Rectangle2D bounds333 = arc333.getBounds2D();
        AffineTransform rotation333 = AffineTransform.getRotateInstance(
                Math.toRadians(124),
                bounds333.getCenterX(), bounds333.getCenterY()
        );
        Shape rotated333 = rotation333.createTransformedShape(arc333);
        g2d.setColor(new Color(9, 25, 88));
        g2d.fill(rotated333);

        // Square
        Rectangle2D.Double square334 = new Rectangle2D.Double(
                692.24, 360.81,
                13.19, 13.19
        );
        g2d.setColor(new Color(4, 14, 63));
        g2d.fill(square334);

        // Rectangle
        Rectangle2D.Double rectangle335 = new Rectangle2D.Double(
                192.85, 91.15,
                23, 26.39
        );
        g2d.setColor(new Color(8, 15, 28));
        g2d.fill(rectangle335);

        // Rectangle
        Rectangle2D.Double rectangle336 = new Rectangle2D.Double(
                202.5, 135.5,
                6, 11
        );
        Rectangle2D bounds336 = rectangle336.getBounds2D();
        AffineTransform rotation336 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds336.getCenterX(), bounds336.getCenterY()
        );
        Shape rotated336 = rotation336.createTransformedShape(rectangle336);
        g2d.setColor(new Color(24, 41, 66));
        g2d.fill(rotated336);

    }

    public static void drawDetails25(Graphics2D g2d) {

        // Line
        Line2D.Double line337 = new Line2D.Double(
                213.73, 17.54,
                233.94, 17.54
        );
        Rectangle2D bounds337 = line337.getBounds2D();
        AffineTransform rotation337 = AffineTransform.getRotateInstance(
                Math.toRadians(256),
                bounds337.getCenterX(), bounds337.getCenterY()
        );
        Shape rotated337 = rotation337.createTransformedShape(line337);
        g2d.setColor(new Color(0, 0, 0));
        BasicStroke bs337 = new BasicStroke(
                3.36f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs337);
        g2d.draw(rotated337);

        // Quadratic curve
        QuadCurve2D.Double qc338 = new QuadCurve2D.Double(
                450.42, 17.15,
                457.78, 12.27,
                465.13, 17.15
        );
        Rectangle2D bounds338 = qc338.getBounds2D();
        AffineTransform rotation338 = AffineTransform.getRotateInstance(
                Math.toRadians(18),
                bounds338.getCenterX(), bounds338.getCenterY()
        );
        Shape rotated338 = rotation338.createTransformedShape(qc338);
        g2d.setColor(new Color(54, 63, 99));
        BasicStroke bs338 = new BasicStroke(
                2.88f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs338);
        g2d.draw(rotated338);

        // Rectangle
        Rectangle2D.Double rectangle339 = new Rectangle2D.Double(
                432.67, 39.77,
                10.52, 5.26
        );
        Rectangle2D bounds339 = rectangle339.getBounds2D();
        AffineTransform rotation339 = AffineTransform.getRotateInstance(
                Math.toRadians(-45),
                bounds339.getCenterX(), bounds339.getCenterY()
        );
        Shape rotated339 = rotation339.createTransformedShape(rectangle339);
        g2d.setColor(new Color(5, 16, 36));
        g2d.fill(rotated339);

        // Line
        Line2D.Double line340 = new Line2D.Double(
                503.82, 435.11,
                519.7, 435.11
        );
        Rectangle2D bounds340 = line340.getBounds2D();
        AffineTransform rotation340 = AffineTransform.getRotateInstance(
                Math.toRadians(96),
                bounds340.getCenterX(), bounds340.getCenterY()
        );
        Shape rotated340 = rotation340.createTransformedShape(line340);
        g2d.setColor(new Color(34, 74, 173));
        BasicStroke bs340 = new BasicStroke(
                3.01f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs340);
        g2d.draw(rotated340);

        // Arc
        Arc2D.Double arc341 = new Arc2D.Double(
                719.23, 246.88,
                21.2, 15.71,
                0, 80, Arc2D.PIE
        );
        Rectangle2D bounds341 = arc341.getBounds2D();
        AffineTransform rotation341 = AffineTransform.getRotateInstance(
                Math.toRadians(302),
                bounds341.getCenterX(), bounds341.getCenterY()
        );
        Shape rotated341 = rotation341.createTransformedShape(arc341);
        g2d.setColor(new Color(0, 0, 23));
        g2d.fill(rotated341);

        // Circle
        Ellipse2D.Double circle342 = new Ellipse2D.Double(
                341.01, 70.64,
                13.36, 13.36
        );
        Rectangle2D bounds342 = circle342.getBounds2D();
        AffineTransform rotation342 = AffineTransform.getRotateInstance(
                Math.toRadians(107),
                bounds342.getCenterX(), bounds342.getCenterY()
        );
        Shape rotated342 = rotation342.createTransformedShape(circle342);
        g2d.setColor(new Color(20, 60, 101));
        g2d.fill(rotated342);

        // Rectangle
        Rectangle2D.Double rectangle343 = new Rectangle2D.Double(
                405.53, 33.76,
                42.58, 4.84
        );
        Rectangle2D bounds343 = rectangle343.getBounds2D();
        AffineTransform rotation343 = AffineTransform.getRotateInstance(
                Math.toRadians(-80.79),
                bounds343.getCenterX(), bounds343.getCenterY()
        );
        Shape rotated343 = rotation343.createTransformedShape(rectangle343);
        g2d.setColor(new Color(0, 3, 24));
        g2d.fill(rotated343);

        // Arc
        Arc2D.Double arc344 = new Arc2D.Double(
                460.7, 72.28,
                9.04, 3.26,
                0, 285, Arc2D.OPEN
        );
        Rectangle2D bounds344 = arc344.getBounds2D();
        AffineTransform rotation344 = AffineTransform.getRotateInstance(
                Math.toRadians(123),
                bounds344.getCenterX(), bounds344.getCenterY()
        );
        Shape rotated344 = rotation344.createTransformedShape(arc344);
        g2d.setColor(new Color(166, 158, 161));
        BasicStroke bs344 = new BasicStroke(
                2.83f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs344);
        g2d.draw(rotated344);

        // Rectangle
        Rectangle2D.Double rectangle345 = new Rectangle2D.Double(
                754.21, 377.34,
                29.84, 24.47
        );
        g2d.setColor(new Color(10, 12, 47));
        g2d.fill(rectangle345);

        // Circle
        Ellipse2D.Double circle346 = new Ellipse2D.Double(
                645.36, 110.4,
                49.9, 49.9
        );
        Rectangle2D bounds346 = circle346.getBounds2D();
        AffineTransform rotation346 = AffineTransform.getRotateInstance(
                Math.toRadians(304),
                bounds346.getCenterX(), bounds346.getCenterY()
        );
        Shape rotated346 = rotation346.createTransformedShape(circle346);
        g2d.setColor(new Color(50, 59, 116));
        g2d.fill(rotated346);

        // Ellipse
        Ellipse2D.Double ellipse347 = new Ellipse2D.Double(
                234.02, 350.17,
                50.96, 80.73
        );
        Rectangle2D bounds347 = ellipse347.getBounds2D();
        AffineTransform rotation347 = AffineTransform.getRotateInstance(
                Math.toRadians(116.88),
                bounds347.getCenterX(), bounds347.getCenterY()
        );
        Shape rotated347 = rotation347.createTransformedShape(ellipse347);
        g2d.setColor(new Color(4, 35, 104));
        g2d.fill(rotated347);

    }

    public static void drawDetails26(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse348 = new Ellipse2D.Double(
                310.61, 308.06,
                48.22, 67.82
        );
        Rectangle2D bounds348 = ellipse348.getBounds2D();
        AffineTransform rotation348 = AffineTransform.getRotateInstance(
                Math.toRadians(163.44),
                bounds348.getCenterX(), bounds348.getCenterY()
        );
        Shape rotated348 = rotation348.createTransformedShape(ellipse348);
        g2d.setColor(new Color(27, 28, 54));
        g2d.fill(rotated348);

        // Rectangle
        Rectangle2D.Double rectangle349 = new Rectangle2D.Double(
                461.18, 267.14,
                8.7, 28.11
        );
        Rectangle2D bounds349 = rectangle349.getBounds2D();
        AffineTransform rotation349 = AffineTransform.getRotateInstance(
                Math.toRadians(-40.6),
                bounds349.getCenterX(), bounds349.getCenterY()
        );
        Shape rotated349 = rotation349.createTransformedShape(rectangle349);
        g2d.setColor(new Color(101, 164, 231));
        g2d.fill(rotated349);

        // Ellipse
        Ellipse2D.Double ellipse350 = new Ellipse2D.Double(
                478.96, 326.45,
                5.9, 50.39
        );
        Rectangle2D bounds350 = ellipse350.getBounds2D();
        AffineTransform rotation350 = AffineTransform.getRotateInstance(
                Math.toRadians(151.89),
                bounds350.getCenterX(), bounds350.getCenterY()
        );
        Shape rotated350 = rotation350.createTransformedShape(ellipse350);
        g2d.setColor(new Color(74, 142, 228));
        g2d.fill(rotated350);

        // Ellipse
        Ellipse2D.Double ellipse351 = new Ellipse2D.Double(
                553.76, 325.37,
                33.38, 36.98
        );
        Rectangle2D bounds351 = ellipse351.getBounds2D();
        AffineTransform rotation351 = AffineTransform.getRotateInstance(
                Math.toRadians(228),
                bounds351.getCenterX(), bounds351.getCenterY()
        );
        Shape rotated351 = rotation351.createTransformedShape(ellipse351);
        g2d.setColor(new Color(0, 41, 118));
        g2d.fill(rotated351);

        // General path
        GeneralPath gp352 = new GeneralPath();
        gp352.moveTo(610.38, 233.48);
        gp352.lineTo(635.56, 204.88);
        gp352.lineTo(660.74, 229.9);
        gp352.lineTo(635.56, 240.63);
        gp352.closePath();
        Rectangle2D bounds352 = gp352.getBounds2D();
        AffineTransform rotation352 = AffineTransform.getRotateInstance(
                Math.toRadians(277),
                bounds352.getCenterX(), bounds352.getCenterY()
        );
        Shape rotated352 = rotation352.createTransformedShape(gp352);
        g2d.setColor(new Color(24, 42, 92));
        g2d.fill(rotated352);

        // Quadratic curve
        QuadCurve2D.Double qc353 = new QuadCurve2D.Double(
                413.06, 345.73,
                441.8, 332.31,
                470.54, 345.73
        );
        Rectangle2D bounds353 = qc353.getBounds2D();
        AffineTransform rotation353 = AffineTransform.getRotateInstance(
                Math.toRadians(199),
                bounds353.getCenterX(), bounds353.getCenterY()
        );
        Shape rotated353 = rotation353.createTransformedShape(qc353);
        g2d.setColor(new Color(118, 101, 102));
        BasicStroke bs353 = new BasicStroke(
                5.13f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs353);
        g2d.draw(rotated353);

        // Circle
        Ellipse2D.Double circle354 = new Ellipse2D.Double(
                585.51, 150.41,
                48.9, 48.9
        );
        Rectangle2D bounds354 = circle354.getBounds2D();
        AffineTransform rotation354 = AffineTransform.getRotateInstance(
                Math.toRadians(137),
                bounds354.getCenterX(), bounds354.getCenterY()
        );
        Shape rotated354 = rotation354.createTransformedShape(circle354);
        g2d.setColor(new Color(12, 32, 78));
        g2d.fill(rotated354);

        // Circle
        Ellipse2D.Double circle355 = new Ellipse2D.Double(
                395.91, 167.28,
                25.62, 25.62
        );
        Rectangle2D bounds355 = circle355.getBounds2D();
        AffineTransform rotation355 = AffineTransform.getRotateInstance(
                Math.toRadians(262),
                bounds355.getCenterX(), bounds355.getCenterY()
        );
        Shape rotated355 = rotation355.createTransformedShape(circle355);
        g2d.setColor(new Color(35, 49, 99));
        g2d.fill(rotated355);

        // Ellipse
        Ellipse2D.Double ellipse356 = new Ellipse2D.Double(
                306.22, 73.64,
                18.69, 89.79
        );
        Rectangle2D bounds356 = ellipse356.getBounds2D();
        AffineTransform rotation356 = AffineTransform.getRotateInstance(
                Math.toRadians(135.91),
                bounds356.getCenterX(), bounds356.getCenterY()
        );
        Shape rotated356 = rotation356.createTransformedShape(ellipse356);
        g2d.setColor(new Color(16, 20, 16));
        g2d.fill(rotated356);

        // Rectangle
        Rectangle2D.Double rectangle357 = new Rectangle2D.Double(
                532.98, 205.74,
                33.49, 22.75
        );
        g2d.setColor(new Color(34, 85, 165));
        g2d.fill(rectangle357);

        // Rectangle
        Rectangle2D.Double rectangle358 = new Rectangle2D.Double(
                436.22, 411.23,
                39.19, 15.02
        );
        g2d.setColor(new Color(57, 54, 47));
        g2d.fill(rectangle358);

        // Ellipse
        Ellipse2D.Double ellipse359 = new Ellipse2D.Double(
                480.78, 257.06,
                24.66, 29.89
        );
        Rectangle2D bounds359 = ellipse359.getBounds2D();
        AffineTransform rotation359 = AffineTransform.getRotateInstance(
                Math.toRadians(273),
                bounds359.getCenterX(), bounds359.getCenterY()
        );
        Shape rotated359 = rotation359.createTransformedShape(ellipse359);
        g2d.setColor(new Color(86, 145, 211));
        g2d.fill(rotated359);

        // Ellipse
        Ellipse2D.Double ellipse360 = new Ellipse2D.Double(
                422.76, 197.08,
                31.84, 34.31
        );
        Rectangle2D bounds360 = ellipse360.getBounds2D();
        AffineTransform rotation360 = AffineTransform.getRotateInstance(
                Math.toRadians(317),
                bounds360.getCenterX(), bounds360.getCenterY()
        );
        Shape rotated360 = rotation360.createTransformedShape(ellipse360);
        g2d.setColor(new Color(38, 64, 150));
        g2d.fill(rotated360);

    }

    public static void drawDetails27(Graphics2D g2d) {

        // Arc
        Arc2D.Double arc361 = new Arc2D.Double(
                450.26, 170.53,
                40.87, 26.88,
                0, 135, Arc2D.PIE
        );
        Rectangle2D bounds361 = arc361.getBounds2D();
        AffineTransform rotation361 = AffineTransform.getRotateInstance(
                Math.toRadians(347),
                bounds361.getCenterX(), bounds361.getCenterY()
        );
        Shape rotated361 = rotation361.createTransformedShape(arc361);
        g2d.setColor(new Color(11, 23, 74));
        g2d.fill(rotated361);

        // Ellipse
        Ellipse2D.Double ellipse362 = new Ellipse2D.Double(
                362.86, 337.37,
                10.56, 16.8
        );
        Rectangle2D bounds362 = ellipse362.getBounds2D();
        AffineTransform rotation362 = AffineTransform.getRotateInstance(
                Math.toRadians(13.72),
                bounds362.getCenterX(), bounds362.getCenterY()
        );
        Shape rotated362 = rotation362.createTransformedShape(ellipse362);
        g2d.setColor(new Color(20, 19, 50));
        g2d.fill(rotated362);

        // Square
        Rectangle2D.Double square363 = new Rectangle2D.Double(
                500.26, 195.11,
                23.61, 23.61
        );
        g2d.setColor(new Color(48, 104, 200));
        g2d.fill(square363);

        // Square
        Rectangle2D.Double square364 = new Rectangle2D.Double(
                363.38, 398.59,
                25.61, 25.61
        );
        g2d.setColor(new Color(26, 27, 83));
        g2d.fill(square364);

        // Rectangle
        Rectangle2D.Double rectangle365 = new Rectangle2D.Double(
                349.16, 169.97,
                33.39, 8.76
        );
        Rectangle2D bounds365 = rectangle365.getBounds2D();
        AffineTransform rotation365 = AffineTransform.getRotateInstance(
                Math.toRadians(-84.56),
                bounds365.getCenterX(), bounds365.getCenterY()
        );
        Shape rotated365 = rotation365.createTransformedShape(rectangle365);
        g2d.setColor(new Color(2, 11, 35));
        g2d.fill(rotated365);

        // Ellipse
        Ellipse2D.Double ellipse366 = new Ellipse2D.Double(
                157.26, 278.51,
                15.92, 16.9
        );
        Rectangle2D bounds366 = ellipse366.getBounds2D();
        AffineTransform rotation366 = AffineTransform.getRotateInstance(
                Math.toRadians(266),
                bounds366.getCenterX(), bounds366.getCenterY()
        );
        Shape rotated366 = rotation366.createTransformedShape(ellipse366);
        g2d.setColor(new Color(36, 42, 89));
        g2d.fill(rotated366);

        // General path
        GeneralPath gp367 = new GeneralPath();
        gp367.moveTo(436.24, 187.47);
        gp367.lineTo(442.36, 180.42);
        gp367.lineTo(448.49, 186.59);
        gp367.lineTo(442.36, 189.23);
        gp367.closePath();
        Rectangle2D bounds367 = gp367.getBounds2D();
        AffineTransform rotation367 = AffineTransform.getRotateInstance(
                Math.toRadians(28),
                bounds367.getCenterX(), bounds367.getCenterY()
        );
        Shape rotated367 = rotation367.createTransformedShape(gp367);
        g2d.setColor(new Color(0, 0, 15));
        g2d.fill(rotated367);

        // Ellipse
        Ellipse2D.Double ellipse368 = new Ellipse2D.Double(
                118.66, 217.97,
                3.67, 54.44
        );
        Rectangle2D bounds368 = ellipse368.getBounds2D();
        AffineTransform rotation368 = AffineTransform.getRotateInstance(
                Math.toRadians(168.58),
                bounds368.getCenterX(), bounds368.getCenterY()
        );
        Shape rotated368 = rotation368.createTransformedShape(ellipse368);
        g2d.setColor(new Color(0, 0, 0));
        g2d.fill(rotated368);

        // Square
        Rectangle2D.Double square369 = new Rectangle2D.Double(
                533.38, 134.1,
                37.77, 37.77
        );
        g2d.setColor(new Color(18, 52, 143));
        g2d.fill(square369);

        // Rectangle
        Rectangle2D.Double rectangle370 = new Rectangle2D.Double(
                390.5, 434.5,
                6, 23
        );
        Rectangle2D bounds370 = rectangle370.getBounds2D();
        AffineTransform rotation370 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds370.getCenterX(), bounds370.getCenterY()
        );
        Shape rotated370 = rotation370.createTransformedShape(rectangle370);
        g2d.setColor(new Color(15, 73, 165));
        g2d.fill(rotated370);

        // Ellipse
        Ellipse2D.Double ellipse371 = new Ellipse2D.Double(
                410.95, 271.96,
                12.88, 12.61
        );
        Rectangle2D bounds371 = ellipse371.getBounds2D();
        AffineTransform rotation371 = AffineTransform.getRotateInstance(
                Math.toRadians(237),
                bounds371.getCenterX(), bounds371.getCenterY()
        );
        Shape rotated371 = rotation371.createTransformedShape(ellipse371);
        g2d.setColor(new Color(98, 110, 212));
        g2d.fill(rotated371);

        // Ellipse
        Ellipse2D.Double ellipse372 = new Ellipse2D.Double(
                240.35, 97.18,
                32.33, 165.49
        );
        Rectangle2D bounds372 = ellipse372.getBounds2D();
        AffineTransform rotation372 = AffineTransform.getRotateInstance(
                Math.toRadians(19.72),
                bounds372.getCenterX(), bounds372.getCenterY()
        );
        Shape rotated372 = rotation372.createTransformedShape(ellipse372);
        g2d.setColor(new Color(22, 42, 76));
        g2d.fill(rotated372);

        // Rectangle
        Rectangle2D.Double rectangle373 = new Rectangle2D.Double(
                238.99, 261.67,
                29.34, 11.53
        );
        g2d.setColor(new Color(61, 81, 123));
        g2d.fill(rectangle373);

        // Rectangle
        Rectangle2D.Double rectangle374 = new Rectangle2D.Double(
                353, 201,
                14, 8
        );
        Rectangle2D bounds374 = rectangle374.getBounds2D();
        AffineTransform rotation374 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds374.getCenterX(), bounds374.getCenterY()
        );
        Shape rotated374 = rotation374.createTransformedShape(rectangle374);
        g2d.setColor(new Color(241, 234, 255));
        g2d.fill(rotated374);

    }

    public static void drawDetails28(Graphics2D g2d) {

        // Square
        Rectangle2D.Double square375 = new Rectangle2D.Double(
                490.39, 219.83,
                23.52, 23.52
        );
        g2d.setColor(new Color(64, 128, 209));
        g2d.fill(square375);

        // Square
        Rectangle2D.Double square376 = new Rectangle2D.Double(
                128.13, 261.26,
                15.01, 15.01
        );
        g2d.setColor(new Color(74, 83, 140));
        g2d.fill(square376);

        // General path
        GeneralPath gp377 = new GeneralPath();
        gp377.moveTo(364.7, 132.22);
        gp377.lineTo(376.91, 114.81);
        gp377.lineTo(389.12, 130.05);
        gp377.lineTo(376.91, 136.58);
        gp377.closePath();
        Rectangle2D bounds377 = gp377.getBounds2D();
        AffineTransform rotation377 = AffineTransform.getRotateInstance(
                Math.toRadians(133),
                bounds377.getCenterX(), bounds377.getCenterY()
        );
        Shape rotated377 = rotation377.createTransformedShape(gp377);
        g2d.setColor(new Color(37, 54, 135));
        g2d.fill(rotated377);

        // Square
        Rectangle2D.Double square378 = new Rectangle2D.Double(
                95.59, 245.52,
                22.25, 22.25
        );
        g2d.setColor(new Color(48, 45, 78));
        g2d.fill(square378);

        // Rectangle
        Rectangle2D.Double rectangle379 = new Rectangle2D.Double(
                299.81, 218,
                21.24, 16.96
        );
        g2d.setColor(new Color(4, 19, 72));
        g2d.fill(rectangle379);

        // Rectangle
        Rectangle2D.Double rectangle380 = new Rectangle2D.Double(
                382.98, 201.86,
                22.33, 13.38
        );
        g2d.setColor(new Color(107, 119, 189));
        g2d.fill(rectangle380);

        // Ellipse
        Ellipse2D.Double ellipse381 = new Ellipse2D.Double(
                493.41, 379.71,
                5.85, 19.65
        );
        Rectangle2D bounds381 = ellipse381.getBounds2D();
        AffineTransform rotation381 = AffineTransform.getRotateInstance(
                Math.toRadians(10.87),
                bounds381.getCenterX(), bounds381.getCenterY()
        );
        Shape rotated381 = rotation381.createTransformedShape(ellipse381);
        g2d.setColor(new Color(71, 144, 230));
        g2d.fill(rotated381);

        // Area / transformation
        GeneralPath boundary382_1 = new GeneralPath();
        boundary382_1.moveTo(121.78, 307.75);
        boundary382_1.lineTo(125.78, 331.75);
        boundary382_1.lineTo(133.78, 354.75);
        boundary382_1.lineTo(138.78, 362.75);
        boundary382_1.lineTo(141.78, 364.75);
        boundary382_1.lineTo(148.78, 378.75);
        boundary382_1.lineTo(153.78, 382.75);
        boundary382_1.lineTo(159.78, 388.75);
        boundary382_1.lineTo(201.78, 398.75);
        boundary382_1.lineTo(198.78, 390.75);
        boundary382_1.lineTo(180.78, 375.75);
        boundary382_1.lineTo(169.78, 363.75);
        boundary382_1.lineTo(166.78, 373.75);
        boundary382_1.lineTo(150.78, 368.75);
        boundary382_1.lineTo(139.78, 357.75);
        boundary382_1.lineTo(144.78, 355.75);
        boundary382_1.lineTo(146.78, 339.75);
        boundary382_1.lineTo(137.78, 317.75);
        boundary382_1.closePath();
        Area area382 = new Area(boundary382_1);
        GeneralPath boundary382_2 = new GeneralPath();
        boundary382_2.moveTo(153.78, 369.75);
        boundary382_2.lineTo(154.78, 369.75);
        boundary382_2.lineTo(156.78, 372.75);
        boundary382_2.lineTo(155.78, 375.75);
        boundary382_2.lineTo(152.78, 375.75);
        boundary382_2.lineTo(151.78, 374.75);
        boundary382_2.lineTo(151.78, 371.75);
        boundary382_2.closePath();
        area382.subtract(new Area(boundary382_2));
        GeneralPath boundary382_3 = new GeneralPath();
        boundary382_3.moveTo(144.78, 367.75);
        boundary382_3.lineTo(146.78, 366.75);
        boundary382_3.lineTo(147.78, 368.75);
        boundary382_3.lineTo(146.78, 369.75);
        boundary382_3.closePath();
        area382.subtract(new Area(boundary382_3));
        g2d.setColor(new Color(36, 43, 96));
        g2d.fill(area382);

        // Area / transformation
        GeneralPath boundary383_1 = new GeneralPath();
        boundary383_1.moveTo(72.17, 376.83);
        boundary383_1.lineTo(85.17, 393.83);
        boundary383_1.lineTo(91.17, 420.83);
        boundary383_1.lineTo(100.17, 447.83);
        boundary383_1.lineTo(119.17, 448.83);
        boundary383_1.lineTo(156.17, 447.83);
        boundary383_1.lineTo(175.17, 449.83);
        boundary383_1.lineTo(190.17, 451.83);
        boundary383_1.lineTo(230.17, 451.83);
        boundary383_1.lineTo(244.17, 442.83);
        boundary383_1.lineTo(217.17, 428.83);
        boundary383_1.lineTo(197.17, 421.83);
        boundary383_1.lineTo(158.17, 427.83);
        boundary383_1.lineTo(133.17, 407.83);
        boundary383_1.lineTo(130.17, 392.83);
        boundary383_1.lineTo(126.17, 363.83);
        boundary383_1.lineTo(103.17, 353.83);
        boundary383_1.lineTo(91.17, 364.83);
        boundary383_1.closePath();
        Area area383 = new Area(boundary383_1);
        GeneralPath boundary383_2 = new GeneralPath();
        boundary383_2.moveTo(205.17, 448.83);
        boundary383_2.lineTo(206.17, 446.83);
        boundary383_2.lineTo(208.17, 445.83);
        boundary383_2.lineTo(209.17, 447.83);
        boundary383_2.lineTo(212.17, 449.83);
        boundary383_2.lineTo(211.17, 450.83);
        boundary383_2.lineTo(207.17, 450.83);
        boundary383_2.closePath();
        area383.subtract(new Area(boundary383_2));
        GeneralPath boundary383_3 = new GeneralPath();
        boundary383_3.moveTo(208.17, 442.83);
        boundary383_3.lineTo(209.17, 440.83);
        boundary383_3.lineTo(211.17, 441.83);
        boundary383_3.lineTo(209.17, 443.83);
        boundary383_3.closePath();
        area383.subtract(new Area(boundary383_3));
        g2d.setColor(new Color(7, 14, 52));
        g2d.fill(area383);

        // Rectangle
        Rectangle2D.Double rectangle384 = new Rectangle2D.Double(
                193.81, 351.17,
                20.12, 14.8
        );
        g2d.setColor(new Color(83, 98, 157));
        g2d.fill(rectangle384);

        // Rectangle
        Rectangle2D.Double rectangle385 = new Rectangle2D.Double(
                361.46, 364.38,
                8.89, 9.84
        );
        g2d.setColor(new Color(29, 23, 87));
        g2d.fill(rectangle385);

        // Rectangle
        Rectangle2D.Double rectangle386 = new Rectangle2D.Double(
                384.86, 357.49,
                16.46, 12.36
        );
        g2d.setColor(new Color(61, 62, 163));
        g2d.fill(rectangle386);

    }

    public static void drawDetails29(Graphics2D g2d) {

        // Circle
        Ellipse2D.Double circle387 = new Ellipse2D.Double(
                534.33, 279.82,
                10.55, 10.55
        );
        Rectangle2D bounds387 = circle387.getBounds2D();
        AffineTransform rotation387 = AffineTransform.getRotateInstance(
                Math.toRadians(170),
                bounds387.getCenterX(), bounds387.getCenterY()
        );
        Shape rotated387 = rotation387.createTransformedShape(circle387);
        g2d.setColor(new Color(0, 8, 40));
        g2d.fill(rotated387);

        // Rectangle
        Rectangle2D.Double rectangle388 = new Rectangle2D.Double(
                162.87, 331.88,
                31.76, 11.61
        );
        g2d.setColor(new Color(7, 21, 60));
        g2d.fill(rectangle388);

        // Quadratic curve
        QuadCurve2D.Double qc389 = new QuadCurve2D.Double(
                331.26, 166.36,
                344.23, 159.55,
                357.2, 166.36
        );
        Rectangle2D bounds389 = qc389.getBounds2D();
        AffineTransform rotation389 = AffineTransform.getRotateInstance(
                Math.toRadians(126),
                bounds389.getCenterX(), bounds389.getCenterY()
        );
        Shape rotated389 = rotation389.createTransformedShape(qc389);
        g2d.setColor(new Color(0, 8, 41));
        BasicStroke bs389 = new BasicStroke(
                3.1f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs389);
        g2d.draw(rotated389);

        // Square
        Rectangle2D.Double square390 = new Rectangle2D.Double(
                624.68, 369.53,
                20.21, 20.21
        );
        g2d.setColor(new Color(38, 56, 134));
        g2d.fill(square390);

        // Area / transformation
        Ellipse2D.Double outer391 = new Ellipse2D.Double(
                180.68, 240.88,
                12.54, 13.89
        );
        Ellipse2D.Double cutout391 = new Ellipse2D.Double(
                180.68 + 12.54 * 0.28,
                240.88 - 13.89 * 0.12,
                12.54, 13.89
        );
        Area area391 = new Area(outer391);
        area391.subtract(new Area(cutout391));
        Rectangle2D bounds391 = area391.getBounds2D();
        AffineTransform rotation391 = AffineTransform.getRotateInstance(
                Math.toRadians(273),
                bounds391.getCenterX(), bounds391.getCenterY()
        );
        Shape rotated391 = rotation391.createTransformedShape(area391);
        g2d.setColor(new Color(60, 71, 114));
        g2d.fill(rotated391);

        // Rectangle
        Rectangle2D.Double rectangle392 = new Rectangle2D.Double(
                398.5, 245.5,
                7, 12
        );
        Rectangle2D bounds392 = rectangle392.getBounds2D();
        AffineTransform rotation392 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds392.getCenterX(), bounds392.getCenterY()
        );
        Shape rotated392 = rotation392.createTransformedShape(rectangle392);
        g2d.setColor(new Color(229, 253, 252));
        g2d.fill(rotated392);

        // Rectangle
        Rectangle2D.Double rectangle393 = new Rectangle2D.Double(
                342.96, 223.31,
                18.42, 14.24
        );
        g2d.setColor(new Color(60, 88, 201));
        g2d.fill(rectangle393);

        // Square
        Rectangle2D.Double square394 = new Rectangle2D.Double(
                138.01, 234.98,
                10.94, 10.94
        );
        g2d.setColor(new Color(8, 8, 50));
        g2d.fill(square394);

        // Ellipse
        Ellipse2D.Double ellipse395 = new Ellipse2D.Double(
                427.88, 374.23,
                2.99, 42.44
        );
        Rectangle2D bounds395 = ellipse395.getBounds2D();
        AffineTransform rotation395 = AffineTransform.getRotateInstance(
                Math.toRadians(88.95),
                bounds395.getCenterX(), bounds395.getCenterY()
        );
        Shape rotated395 = rotation395.createTransformedShape(ellipse395);
        g2d.setColor(new Color(56, 17, 201));
        g2d.fill(rotated395);

        // Rectangle
        Rectangle2D.Double rectangle396 = new Rectangle2D.Double(
                391.6, 440.83,
                5.83, 22.34
        );
        Rectangle2D bounds396 = rectangle396.getBounds2D();
        AffineTransform rotation396 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds396.getCenterX(), bounds396.getCenterY()
        );
        Shape rotated396 = rotation396.createTransformedShape(rectangle396);
        g2d.setColor(new Color(0, 55, 152));
        g2d.fill(rotated396);

        // Quadratic curve
        QuadCurve2D.Double qc397 = new QuadCurve2D.Double(
                383.79, 244.43,
                397.72, 226.49,
                411.64, 244.43
        );
        Rectangle2D bounds397 = qc397.getBounds2D();
        AffineTransform rotation397 = AffineTransform.getRotateInstance(
                Math.toRadians(172),
                bounds397.getCenterX(), bounds397.getCenterY()
        );
        Shape rotated397 = rotation397.createTransformedShape(qc397);
        g2d.setColor(new Color(149, 225, 249));
        BasicStroke bs397 = new BasicStroke(
                3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs397);
        g2d.draw(rotated397);

        // Square
        Rectangle2D.Double square398 = new Rectangle2D.Double(
                114.65, 71.07,
                8.51, 8.51
        );
        g2d.setColor(new Color(27, 26, 20));
        g2d.fill(square398);

        // Circle
        Ellipse2D.Double circle399 = new Ellipse2D.Double(
                399.74, 220.79,
                9.21, 9.21
        );
        Rectangle2D bounds399 = circle399.getBounds2D();
        AffineTransform rotation399 = AffineTransform.getRotateInstance(
                Math.toRadians(305),
                bounds399.getCenterX(), bounds399.getCenterY()
        );
        Shape rotated399 = rotation399.createTransformedShape(circle399);
        g2d.setColor(new Color(161, 208, 254));
        g2d.fill(rotated399);

        // Rectangle
        Rectangle2D.Double rectangle400 = new Rectangle2D.Double(
                561.91, 422.5,
                15.3, 15.87
        );
        g2d.setColor(new Color(11, 41, 121));
        g2d.fill(rectangle400);

    }

}

class witchPart4 {

    public static void drawPart(Graphics2D g2d) {
        drawDetails30(g2d);
        drawDetails31(g2d);
        drawDetails32(g2d);
        drawDetails33(g2d);
        drawDetails34(g2d);
        drawDetails35(g2d);
        drawDetails36(g2d);
        drawDetails37(g2d);
        drawDetails38(g2d);
        drawDetails39(g2d);
    }

    public static void drawDetails30(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle401 = new Rectangle2D.Double(
                425.31, 376.37,
                25.68, 3.49
        );
        Rectangle2D bounds401 = rectangle401.getBounds2D();
        AffineTransform rotation401 = AffineTransform.getRotateInstance(
                Math.toRadians(-5.71),
                bounds401.getCenterX(), bounds401.getCenterY()
        );
        Shape rotated401 = rotation401.createTransformedShape(rectangle401);
        g2d.setColor(new Color(41, 31, 151));
        g2d.fill(rotated401);

        // Rectangle
        Rectangle2D.Double rectangle402 = new Rectangle2D.Double(
                45.3, 0.3,
                29.76, 30.76
        );
        g2d.setColor(new Color(1, 2, 4));
        g2d.fill(rectangle402);

        // Rectangle
        Rectangle2D.Double rectangle403 = new Rectangle2D.Double(
                85.58, 227.65,
                11.58, 5.53
        );
        g2d.setColor(new Color(0, 0, 5));
        g2d.fill(rectangle403);

        // Arc
        Arc2D.Double arc404 = new Arc2D.Double(
                382.23, 186.17,
                14.21, 7.03,
                0, 198, Arc2D.PIE
        );
        Rectangle2D bounds404 = arc404.getBounds2D();
        AffineTransform rotation404 = AffineTransform.getRotateInstance(
                Math.toRadians(130),
                bounds404.getCenterX(), bounds404.getCenterY()
        );
        Shape rotated404 = rotation404.createTransformedShape(arc404);
        g2d.setColor(new Color(179, 186, 218));
        g2d.fill(rotated404);

        // Rectangle
        Rectangle2D.Double rectangle405 = new Rectangle2D.Double(
                360.92, 257.6,
                10.97, 4.89
        );
        g2d.setColor(new Color(114, 144, 251));
        g2d.fill(rectangle405);

        // Rectangle
        Rectangle2D.Double rectangle406 = new Rectangle2D.Double(
                593.84, 434.79,
                12.32, 8.67
        );
        g2d.setColor(new Color(33, 44, 97));
        g2d.fill(rectangle406);

        // Ellipse
        Ellipse2D.Double ellipse407 = new Ellipse2D.Double(
                645.95, 405.56,
                20.99, 56.23
        );
        Rectangle2D bounds407 = ellipse407.getBounds2D();
        AffineTransform rotation407 = AffineTransform.getRotateInstance(
                Math.toRadians(86.9),
                bounds407.getCenterX(), bounds407.getCenterY()
        );
        Shape rotated407 = rotation407.createTransformedShape(ellipse407);
        g2d.setColor(new Color(31, 34, 88));
        g2d.fill(rotated407);

        // Ellipse
        Ellipse2D.Double ellipse408 = new Ellipse2D.Double(
                495.56, 429.82,
                7.23, 15.12
        );
        Rectangle2D bounds408 = ellipse408.getBounds2D();
        AffineTransform rotation408 = AffineTransform.getRotateInstance(
                Math.toRadians(152.87),
                bounds408.getCenterX(), bounds408.getCenterY()
        );
        Shape rotated408 = rotation408.createTransformedShape(ellipse408);
        g2d.setColor(new Color(48, 54, 51));
        g2d.fill(rotated408);

        // Ellipse
        Ellipse2D.Double ellipse409 = new Ellipse2D.Double(
                418.79, 247.59,
                4.33, 22.85
        );
        g2d.setColor(new Color(98, 122, 246));
        g2d.fill(ellipse409);

        // Square
        Rectangle2D.Double square410 = new Rectangle2D.Double(
                1.84, -1.42,
                34.63, 34.63
        );
        g2d.setColor(new Color(1, 1, 3));
        g2d.fill(square410);

        // Rectangle
        Rectangle2D.Double rectangle411 = new Rectangle2D.Double(
                334.46, 242.75,
                9.34, 10.16
        );
        g2d.setColor(new Color(16, 28, 120));
        g2d.fill(rectangle411);

        // General path
        GeneralPath gp412 = new GeneralPath();
        gp412.moveTo(364.23, 279.88);
        gp412.lineTo(368.23, 283.88);
        gp412.lineTo(367.23, 286.88);
        gp412.lineTo(367.23, 295.88);
        gp412.lineTo(369.23, 297.88);
        gp412.lineTo(376.23, 301.88);
        gp412.lineTo(379.23, 300.88);
        gp412.lineTo(387.23, 303.88);
        gp412.lineTo(395.23, 303.88);
        gp412.lineTo(396.23, 300.88);
        gp412.lineTo(394.23, 300.88);
        gp412.lineTo(391.23, 297.88);
        gp412.lineTo(391.23, 295.88);
        gp412.lineTo(389.23, 293.88);
        gp412.lineTo(385.23, 294.88);
        gp412.lineTo(377.23, 293.88);
        gp412.lineTo(376.23, 296.88);
        gp412.lineTo(375.23, 295.88);
        gp412.closePath();
        g2d.setColor(new Color(144, 167, 255));
        g2d.fill(gp412);

        // Rectangle
        Rectangle2D.Double rectangle413 = new Rectangle2D.Double(
                724.34, 314.78,
                25.94, 28.1
        );
        g2d.setColor(new Color(1, 4, 39));
        g2d.fill(rectangle413);

        // General path
        GeneralPath gp414 = new GeneralPath();
        gp414.moveTo(604.51, 340.28);
        gp414.lineTo(609.74, 332.3);
        gp414.lineTo(614.96, 339.28);
        gp414.lineTo(609.74, 342.27);
        gp414.closePath();
        Rectangle2D bounds414 = gp414.getBounds2D();
        AffineTransform rotation414 = AffineTransform.getRotateInstance(
                Math.toRadians(268),
                bounds414.getCenterX(), bounds414.getCenterY()
        );
        Shape rotated414 = rotation414.createTransformedShape(gp414);
        g2d.setColor(new Color(154, 165, 195));
        g2d.fill(rotated414);

        // Ellipse
        Ellipse2D.Double ellipse415 = new Ellipse2D.Double(
                463.9, 444.92,
                7.4, 16.35
        );
        Rectangle2D bounds415 = ellipse415.getBounds2D();
        AffineTransform rotation415 = AffineTransform.getRotateInstance(
                Math.toRadians(146.11),
                bounds415.getCenterX(), bounds415.getCenterY()
        );
        Shape rotated415 = rotation415.createTransformedShape(ellipse415);
        g2d.setColor(new Color(8, 55, 142));
        g2d.fill(rotated415);

    }

    public static void drawDetails31(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle416 = new Rectangle2D.Double(
                430.34, 443.38,
                14.4, 3.6
        );
        Rectangle2D bounds416 = rectangle416.getBounds2D();
        AffineTransform rotation416 = AffineTransform.getRotateInstance(
                Math.toRadians(-63.44),
                bounds416.getCenterX(), bounds416.getCenterY()
        );
        Shape rotated416 = rotation416.createTransformedShape(rectangle416);
        g2d.setColor(new Color(0, 0, 0));
        g2d.fill(rotated416);

        // Ellipse
        Ellipse2D.Double ellipse417 = new Ellipse2D.Double(
                440.87, 365.13,
                3.2, 45.4
        );
        Rectangle2D bounds417 = ellipse417.getBounds2D();
        AffineTransform rotation417 = AffineTransform.getRotateInstance(
                Math.toRadians(88.95),
                bounds417.getCenterX(), bounds417.getCenterY()
        );
        Shape rotated417 = rotation417.createTransformedShape(ellipse417);
        g2d.setColor(new Color(83, 78, 228));
        g2d.fill(rotated417);

        // Square
        Rectangle2D.Double square418 = new Rectangle2D.Double(
                660.43, 392.3,
                30.18, 30.18
        );
        g2d.setColor(new Color(24, 31, 90));
        g2d.fill(square418);

        // Line
        Line2D.Double line419 = new Line2D.Double(
                476.87, 378.26,
                497.04, 378.26
        );
        Rectangle2D bounds419 = line419.getBounds2D();
        AffineTransform rotation419 = AffineTransform.getRotateInstance(
                Math.toRadians(245),
                bounds419.getCenterX(), bounds419.getCenterY()
        );
        Shape rotated419 = rotation419.createTransformedShape(line419);
        g2d.setColor(new Color(91, 154, 240));
        BasicStroke bs419 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs419);
        g2d.draw(rotated419);

        // Ellipse
        Ellipse2D.Double ellipse420 = new Ellipse2D.Double(
                196.92, 259.45,
                20.17, 36.27
        );
        Rectangle2D bounds420 = ellipse420.getBounds2D();
        AffineTransform rotation420 = AffineTransform.getRotateInstance(
                Math.toRadians(111.81),
                bounds420.getCenterX(), bounds420.getCenterY()
        );
        Shape rotated420 = rotation420.createTransformedShape(ellipse420);
        g2d.setColor(new Color(15, 30, 70));
        g2d.fill(rotated420);

        // Rectangle
        Rectangle2D.Double rectangle421 = new Rectangle2D.Double(
                590.46, 390.18,
                20.71, 7.69
        );
        g2d.setColor(new Color(51, 79, 170));
        g2d.fill(rectangle421);

        // Rectangle
        Rectangle2D.Double rectangle422 = new Rectangle2D.Double(
                81.55, 235.42,
                8.03, 8
        );
        g2d.setColor(new Color(50, 49, 69));
        g2d.fill(rectangle422);

        // Square
        Rectangle2D.Double square423 = new Rectangle2D.Double(
                618.89, 326.79,
                10.51, 10.51
        );
        g2d.setColor(new Color(8, 49, 119));
        g2d.fill(square423);

        // Rectangle
        Rectangle2D.Double rectangle424 = new Rectangle2D.Double(
                521.59, 443.51,
                16.92, 7.87
        );
        g2d.setColor(new Color(65, 80, 143));
        g2d.fill(rectangle424);

        // Ellipse
        Ellipse2D.Double ellipse425 = new Ellipse2D.Double(
                355.4, 22.46,
                7.33, 26.64
        );
        Rectangle2D bounds425 = ellipse425.getBounds2D();
        AffineTransform rotation425 = AffineTransform.getRotateInstance(
                Math.toRadians(169.6),
                bounds425.getCenterX(), bounds425.getCenterY()
        );
        Shape rotated425 = rotation425.createTransformedShape(ellipse425);
        g2d.setColor(new Color(11, 31, 85));
        g2d.fill(rotated425);

        // Ellipse
        Ellipse2D.Double ellipse426 = new Ellipse2D.Double(
                283.36, -4.24,
                27.36, 72.5
        );
        Rectangle2D bounds426 = ellipse426.getBounds2D();
        AffineTransform rotation426 = AffineTransform.getRotateInstance(
                Math.toRadians(39.27),
                bounds426.getCenterX(), bounds426.getCenterY()
        );
        Shape rotated426 = rotation426.createTransformedShape(ellipse426);
        g2d.setColor(new Color(8, 17, 34));
        g2d.fill(rotated426);

        // General path
        GeneralPath gp427 = new GeneralPath();
        gp427.moveTo(126.75, 21.53);
        gp427.lineTo(124.75, 23.53);
        gp427.lineTo(119.75, 35.53);
        gp427.lineTo(121.75, 39.53);
        gp427.lineTo(126.75, 27.53);
        gp427.closePath();
        g2d.setColor(new Color(0, 0, 1));
        g2d.fill(gp427);

        // Ellipse
        Ellipse2D.Double ellipse428 = new Ellipse2D.Double(
                619.62, 439.21,
                19.74, 35.03
        );
        Rectangle2D bounds428 = ellipse428.getBounds2D();
        AffineTransform rotation428 = AffineTransform.getRotateInstance(
                Math.toRadians(84.87),
                bounds428.getCenterX(), bounds428.getCenterY()
        );
        Shape rotated428 = rotation428.createTransformedShape(ellipse428);
        g2d.setColor(new Color(2, 15, 58));
        g2d.fill(rotated428);

    }

    public static void drawDetails32(Graphics2D g2d) {

        // Area / transformation
        GeneralPath boundary429_1 = new GeneralPath();
        boundary429_1.moveTo(65.98, 270.22);
        boundary429_1.lineTo(64.98, 284.22);
        boundary429_1.lineTo(48.98, 297.22);
        boundary429_1.lineTo(42.98, 302.22);
        boundary429_1.lineTo(26.98, 314.22);
        boundary429_1.lineTo(7.98, 331.22);
        boundary429_1.lineTo(-2.02, 353.22);
        boundary429_1.lineTo(-5.02, 407.22);
        boundary429_1.lineTo(26.98, 459.22);
        boundary429_1.lineTo(62.98, 465.22);
        boundary429_1.lineTo(47.98, 443.22);
        boundary429_1.lineTo(28.98, 427.22);
        boundary429_1.lineTo(23.98, 387.22);
        boundary429_1.lineTo(43.98, 354.22);
        boundary429_1.lineTo(32.98, 341.22);
        boundary429_1.lineTo(47.98, 326.22);
        boundary429_1.lineTo(46.98, 320.22);
        boundary429_1.lineTo(67.98, 308.22);
        boundary429_1.closePath();
        Area area429 = new Area(boundary429_1);
        GeneralPath boundary429_2 = new GeneralPath();
        boundary429_2.moveTo(35.98, 465.22);
        boundary429_2.lineTo(36.98, 463.22);
        boundary429_2.lineTo(38.98, 464.22);
        boundary429_2.lineTo(36.98, 466.22);
        boundary429_2.closePath();
        area429.subtract(new Area(boundary429_2));
        GeneralPath boundary429_3 = new GeneralPath();
        boundary429_3.moveTo(26.98, 357.22);
        boundary429_3.lineTo(27.98, 354.22);
        boundary429_3.lineTo(30.98, 356.22);
        boundary429_3.lineTo(28.98, 358.22);
        boundary429_3.closePath();
        area429.subtract(new Area(boundary429_3));
        g2d.setColor(new Color(4, 5, 19));
        g2d.fill(area429);

        // General path
        GeneralPath gp430 = new GeneralPath();
        gp430.moveTo(412.66, 0.3);
        gp430.lineTo(411.66, 0.3);
        gp430.lineTo(411.66, 3.3);
        gp430.lineTo(409.66, 7.3);
        gp430.lineTo(408.66, 22.3);
        gp430.lineTo(405.66, 26.3);
        gp430.lineTo(405.66, 29.3);
        gp430.lineTo(402.66, 33.3);
        gp430.lineTo(402.66, 35.3);
        gp430.lineTo(404.66, 35.3);
        gp430.lineTo(413.66, 28.3);
        gp430.lineTo(412.66, 29.3);
        gp430.lineTo(410.66, 28.3);
        gp430.lineTo(410.66, 18.3);
        gp430.lineTo(411.66, 17.3);
        gp430.lineTo(411.66, 11.3);
        gp430.lineTo(410.66, 9.3);
        gp430.lineTo(412.66, 4.3);
        gp430.closePath();
        g2d.setColor(new Color(9, 16, 75));
        g2d.fill(gp430);

        // Rectangle
        Rectangle2D.Double rectangle431 = new Rectangle2D.Double(
                649.67, 116.14,
                11.73, 53.78
        );
        Rectangle2D bounds431 = rectangle431.getBounds2D();
        AffineTransform rotation431 = AffineTransform.getRotateInstance(
                Math.toRadians(-38.5),
                bounds431.getCenterX(), bounds431.getCenterY()
        );
        Shape rotated431 = rotation431.createTransformedShape(rectangle431);
        g2d.setColor(new Color(81, 101, 168));
        g2d.fill(rotated431);

        // Rectangle
        Rectangle2D.Double rectangle432 = new Rectangle2D.Double(
                296.69, 398.2,
                53.1, 63.85
        );
        g2d.setColor(new Color(18, 23, 25));
        g2d.fill(rectangle432);

        // Quadratic curve
        QuadCurve2D.Double qc433 = new QuadCurve2D.Double(
                337.54, 306.49,
                351.37, 292.97,
                365.2, 306.49
        );
        Rectangle2D bounds433 = qc433.getBounds2D();
        AffineTransform rotation433 = AffineTransform.getRotateInstance(
                Math.toRadians(84),
                bounds433.getCenterX(), bounds433.getCenterY()
        );
        Shape rotated433 = rotation433.createTransformedShape(qc433);
        g2d.setColor(new Color(47, 50, 126));
        BasicStroke bs433 = new BasicStroke(
                6.12f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs433);
        g2d.draw(rotated433);

        // General path
        GeneralPath gp434 = new GeneralPath();
        gp434.moveTo(473.07, 291.81);
        gp434.lineTo(473.07, 293.81);
        gp434.lineTo(482.07, 304.81);
        gp434.lineTo(514.07, 339.81);
        gp434.lineTo(513.07, 333.81);
        gp434.lineTo(514.07, 327.81);
        gp434.lineTo(515.07, 320.81);
        gp434.lineTo(512.07, 310.81);
        gp434.lineTo(508.07, 305.81);
        gp434.lineTo(498.07, 302.81);
        gp434.lineTo(492.07, 298.81);
        gp434.lineTo(485.07, 293.81);
        gp434.lineTo(490.07, 299.81);
        gp434.lineTo(486.07, 299.81);
        gp434.lineTo(481.07, 299.81);
        gp434.lineTo(478.07, 292.81);
        gp434.lineTo(480.07, 288.81);
        gp434.lineTo(476.07, 291.81);
        gp434.closePath();
        g2d.setColor(new Color(82, 144, 221));
        g2d.fill(gp434);

        // Rectangle
        Rectangle2D.Double rectangle435 = new Rectangle2D.Double(
                619.3, 14.11,
                42.94, 151.76
        );
        Rectangle2D bounds435 = rectangle435.getBounds2D();
        AffineTransform rotation435 = AffineTransform.getRotateInstance(
                Math.toRadians(-63.15),
                bounds435.getCenterX(), bounds435.getCenterY()
        );
        Shape rotated435 = rotation435.createTransformedShape(rectangle435);
        g2d.setColor(new Color(15, 18, 55));
        g2d.fill(rotated435);

        // Rectangle
        Rectangle2D.Double rectangle436 = new Rectangle2D.Double(
                223.63, 331.61,
                48.81, 30.29
        );
        g2d.setColor(new Color(29, 66, 170));
        g2d.fill(rectangle436);

        // Ellipse
        Ellipse2D.Double ellipse437 = new Ellipse2D.Double(
                312.61, 272.85,
                21.86, 48.4
        );
        Rectangle2D bounds437 = ellipse437.getBounds2D();
        AffineTransform rotation437 = AffineTransform.getRotateInstance(
                Math.toRadians(24.05),
                bounds437.getCenterX(), bounds437.getCenterY()
        );
        Shape rotated437 = rotation437.createTransformedShape(ellipse437);
        g2d.setColor(new Color(6, 20, 62));
        g2d.fill(rotated437);

    }

    public static void drawDetails33(Graphics2D g2d) {

        // General path
        GeneralPath gp438 = new GeneralPath();
        gp438.moveTo(458.17, 315.91);
        gp438.lineTo(462.17, 337.91);
        gp438.lineTo(471.17, 349.91);
        gp438.lineTo(471.17, 348.91);
        gp438.lineTo(469.17, 341.91);
        gp438.lineTo(468.17, 329.91);
        gp438.lineTo(482.17, 340.91);
        gp438.lineTo(502.17, 357.91);
        gp438.lineTo(508.17, 357.91);
        gp438.lineTo(521.17, 364.91);
        gp438.lineTo(526.17, 369.91);
        gp438.lineTo(530.17, 364.91);
        gp438.lineTo(502.17, 330.91);
        gp438.lineTo(481.17, 306.91);
        gp438.lineTo(486.17, 314.91);
        gp438.lineTo(480.17, 312.91);
        gp438.lineTo(480.17, 323.91);
        gp438.lineTo(467.17, 322.91);
        gp438.closePath();
        g2d.setColor(new Color(0, 18, 73));
        g2d.fill(gp438);

        // General path
        GeneralPath gp439 = new GeneralPath();
        gp439.moveTo(597.95, 121.13);
        gp439.lineTo(596.95, 126.13);
        gp439.lineTo(595.95, 132.13);
        gp439.lineTo(591.95, 141.13);
        gp439.lineTo(607.95, 145.13);
        gp439.lineTo(614.95, 145.13);
        gp439.lineTo(624.95, 154.13);
        gp439.lineTo(630.95, 158.13);
        gp439.lineTo(640.95, 162.13);
        gp439.lineTo(652.95, 179.13);
        gp439.lineTo(659.95, 178.13);
        gp439.lineTo(654.95, 169.13);
        gp439.lineTo(640.95, 154.13);
        gp439.lineTo(629.95, 158.13);
        gp439.lineTo(638.95, 151.13);
        gp439.lineTo(626.95, 138.13);
        gp439.lineTo(616.95, 131.13);
        gp439.lineTo(606.95, 124.13);
        gp439.closePath();
        g2d.setColor(new Color(129, 152, 208));
        g2d.fill(gp439);

        // General path
        GeneralPath gp440 = new GeneralPath();
        gp440.moveTo(261.26, 376.74);
        gp440.lineTo(289.24, 354.6);
        gp440.lineTo(317.22, 373.97);
        gp440.lineTo(289.24, 382.28);
        gp440.closePath();
        Rectangle2D bounds440 = gp440.getBounds2D();
        AffineTransform rotation440 = AffineTransform.getRotateInstance(
                Math.toRadians(156),
                bounds440.getCenterX(), bounds440.getCenterY()
        );
        Shape rotated440 = rotation440.createTransformedShape(gp440);
        g2d.setColor(new Color(11, 39, 152));
        g2d.fill(rotated440);

        // Rectangle
        Rectangle2D.Double rectangle441 = new Rectangle2D.Double(
                548.97, 262.77,
                105.3, 23.8
        );
        Rectangle2D bounds441 = rectangle441.getBounds2D();
        AffineTransform rotation441 = AffineTransform.getRotateInstance(
                Math.toRadians(-58.84),
                bounds441.getCenterX(), bounds441.getCenterY()
        );
        Shape rotated441 = rotation441.createTransformedShape(rectangle441);
        g2d.setColor(new Color(101, 144, 214));
        g2d.fill(rotated441);

        // Square
        Rectangle2D.Double square442 = new Rectangle2D.Double(
                635.19, 248.98,
                29.24, 29.24
        );
        g2d.setColor(new Color(11, 25, 69));
        g2d.fill(square442);

        // Rectangle
        Rectangle2D.Double rectangle443 = new Rectangle2D.Double(
                563.26, 329.74,
                33.56, 16.21
        );
        g2d.setColor(new Color(2, 32, 94));
        g2d.fill(rectangle443);

        // Area / transformation
        Ellipse2D.Double outer444 = new Ellipse2D.Double(
                413.71, 328.5,
                16.06, 12.57
        );
        Ellipse2D.Double cutout444 = new Ellipse2D.Double(
                413.71 + 16.06 * 0.28,
                328.5 - 12.57 * 0.12,
                16.06, 12.57
        );
        Area area444 = new Area(outer444);
        area444.subtract(new Area(cutout444));
        Rectangle2D bounds444 = area444.getBounds2D();
        AffineTransform rotation444 = AffineTransform.getRotateInstance(
                Math.toRadians(338),
                bounds444.getCenterX(), bounds444.getCenterY()
        );
        Shape rotated444 = rotation444.createTransformedShape(area444);
        g2d.setColor(new Color(255, 255, 233));
        g2d.fill(rotated444);

        // Rectangle
        Rectangle2D.Double rectangle445 = new Rectangle2D.Double(
                548.88, 208.74,
                21.89, 65.88
        );
        Rectangle2D bounds445 = rectangle445.getBounds2D();
        AffineTransform rotation445 = AffineTransform.getRotateInstance(
                Math.toRadians(-28.22),
                bounds445.getCenterX(), bounds445.getCenterY()
        );
        Shape rotated445 = rotation445.createTransformedShape(rectangle445);
        g2d.setColor(new Color(37, 86, 162));
        g2d.fill(rotated445);

        // Rectangle
        Rectangle2D.Double rectangle446 = new Rectangle2D.Double(
                650, 206,
                3.14, 28.64
        );
        Rectangle2D bounds446 = rectangle446.getBounds2D();
        AffineTransform rotation446 = AffineTransform.getRotateInstance(
                Math.toRadians(-12.53),
                bounds446.getCenterX(), bounds446.getCenterY()
        );
        Shape rotated446 = rotation446.createTransformedShape(rectangle446);
        g2d.setColor(new Color(121, 148, 139));
        g2d.fill(rotated446);

        // Rectangle
        Rectangle2D.Double rectangle447 = new Rectangle2D.Double(
                350.85, 394.78,
                19.57, 8.9
        );
        g2d.setColor(new Color(28, 25, 76));
        g2d.fill(rectangle447);

        // Rectangle
        Rectangle2D.Double rectangle448 = new Rectangle2D.Double(
                478.5, 253.43,
                16.92, 6.18
        );
        g2d.setColor(new Color(0, 8, 39));
        g2d.fill(rectangle448);

        // Ellipse
        Ellipse2D.Double ellipse449 = new Ellipse2D.Double(
                160, 291.52,
                14.63, 26.38
        );
        Rectangle2D bounds449 = ellipse449.getBounds2D();
        AffineTransform rotation449 = AffineTransform.getRotateInstance(
                Math.toRadians(28.47),
                bounds449.getCenterX(), bounds449.getCenterY()
        );
        Shape rotated449 = rotation449.createTransformedShape(ellipse449);
        g2d.setColor(new Color(80, 98, 168));
        g2d.fill(rotated449);

    }

    public static void drawDetails34(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse450 = new Ellipse2D.Double(
                432.26, 336.22,
                6.66, 11.64
        );
        Rectangle2D bounds450 = ellipse450.getBounds2D();
        AffineTransform rotation450 = AffineTransform.getRotateInstance(
                Math.toRadians(113.91),
                bounds450.getCenterX(), bounds450.getCenterY()
        );
        Shape rotated450 = rotation450.createTransformedShape(ellipse450);
        g2d.setColor(new Color(237, 210, 198));
        g2d.fill(rotated450);

        // Rectangle
        Rectangle2D.Double rectangle451 = new Rectangle2D.Double(
                455.84, 422.02,
                9.16, 22.54
        );
        Rectangle2D bounds451 = rectangle451.getBounds2D();
        AffineTransform rotation451 = AffineTransform.getRotateInstance(
                Math.toRadians(-45),
                bounds451.getCenterX(), bounds451.getCenterY()
        );
        Shape rotated451 = rotation451.createTransformedShape(rectangle451);
        g2d.setColor(new Color(27, 20, 20));
        g2d.fill(rotated451);

        // General path
        GeneralPath gp452 = new GeneralPath();
        gp452.moveTo(419, 177);
        gp452.lineTo(419, 183);
        gp452.lineTo(419, 187);
        gp452.lineTo(418, 194);
        gp452.lineTo(420, 196);
        gp452.lineTo(421, 194);
        gp452.lineTo(431, 196);
        gp452.lineTo(434, 198);
        gp452.lineTo(438, 198);
        gp452.lineTo(443, 200);
        gp452.lineTo(446, 199);
        gp452.lineTo(448, 196);
        gp452.lineTo(434, 185);
        gp452.lineTo(433, 186);
        gp452.lineTo(431, 180);
        gp452.lineTo(427, 181);
        gp452.lineTo(427, 178);
        gp452.lineTo(423, 177);
        gp452.closePath();
        g2d.setColor(new Color(105, 160, 225));
        g2d.fill(gp452);

        // Ellipse
        Ellipse2D.Double ellipse453 = new Ellipse2D.Double(
                467.66, 391.02,
                21.2, 26.66
        );
        Rectangle2D bounds453 = ellipse453.getBounds2D();
        AffineTransform rotation453 = AffineTransform.getRotateInstance(
                Math.toRadians(114),
                bounds453.getCenterX(), bounds453.getCenterY()
        );
        Shape rotated453 = rotation453.createTransformedShape(ellipse453);
        g2d.setColor(new Color(30, 32, 68));
        g2d.fill(rotated453);

        // Rectangle
        Rectangle2D.Double rectangle454 = new Rectangle2D.Double(
                281.8, 398.49,
                12.68, 3.99
        );
        Rectangle2D bounds454 = rectangle454.getBounds2D();
        AffineTransform rotation454 = AffineTransform.getRotateInstance(
                Math.toRadians(-80.54),
                bounds454.getCenterX(), bounds454.getCenterY()
        );
        Shape rotated454 = rotation454.createTransformedShape(rectangle454);
        g2d.setColor(new Color(34, 134, 236));
        g2d.fill(rotated454);

        // Rectangle
        Rectangle2D.Double rectangle455 = new Rectangle2D.Double(
                435.25, 260.34,
                21.87, 16.9
        );
        g2d.setColor(new Color(24, 35, 103));
        g2d.fill(rectangle455);

        // Rectangle
        Rectangle2D.Double rectangle456 = new Rectangle2D.Double(
                583.44, 204.03,
                52.93, 4.59
        );
        Rectangle2D bounds456 = rectangle456.getBounds2D();
        AffineTransform rotation456 = AffineTransform.getRotateInstance(
                Math.toRadians(-34.38),
                bounds456.getCenterX(), bounds456.getCenterY()
        );
        Shape rotated456 = rotation456.createTransformedShape(rectangle456);
        g2d.setColor(new Color(98, 125, 149));
        g2d.fill(rotated456);

        // Ellipse
        Ellipse2D.Double ellipse457 = new Ellipse2D.Double(
                445.63, 208.77,
                23.84, 24.05
        );
        Rectangle2D bounds457 = ellipse457.getBounds2D();
        AffineTransform rotation457 = AffineTransform.getRotateInstance(
                Math.toRadians(295),
                bounds457.getCenterX(), bounds457.getCenterY()
        );
        Shape rotated457 = rotation457.createTransformedShape(ellipse457);
        g2d.setColor(new Color(12, 31, 96));
        g2d.fill(rotated457);

        // Circle
        Ellipse2D.Double circle458 = new Ellipse2D.Double(
                352.24, 166.16,
                9.59, 9.59
        );
        Rectangle2D bounds458 = circle458.getBounds2D();
        AffineTransform rotation458 = AffineTransform.getRotateInstance(
                Math.toRadians(342),
                bounds458.getCenterX(), bounds458.getCenterY()
        );
        Shape rotated458 = rotation458.createTransformedShape(circle458);
        g2d.setColor(new Color(76, 135, 188));
        g2d.fill(rotated458);

        // Square
        Rectangle2D.Double square459 = new Rectangle2D.Double(
                412.42, 198.93,
                11.03, 11.03
        );
        g2d.setColor(new Color(226, 222, 255));
        g2d.fill(square459);

        // Rectangle
        Rectangle2D.Double rectangle460 = new Rectangle2D.Double(
                542, 137,
                4, 8
        );
        Rectangle2D bounds460 = rectangle460.getBounds2D();
        AffineTransform rotation460 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds460.getCenterX(), bounds460.getCenterY()
        );
        Shape rotated460 = rotation460.createTransformedShape(rectangle460);
        g2d.setColor(new Color(101, 148, 224));
        g2d.fill(rotated460);

        // Ellipse
        Ellipse2D.Double ellipse461 = new Ellipse2D.Double(
                351.7, 192.9,
                10.83, 17.19
        );
        Rectangle2D bounds461 = ellipse461.getBounds2D();
        AffineTransform rotation461 = AffineTransform.getRotateInstance(
                Math.toRadians(37.51),
                bounds461.getCenterX(), bounds461.getCenterY()
        );
        Shape rotated461 = rotation461.createTransformedShape(ellipse461);
        g2d.setColor(new Color(208, 204, 253));
        g2d.fill(rotated461);

        // Square
        Rectangle2D.Double square462 = new Rectangle2D.Double(
                334.5, 120.78,
                15.05, 15.05
        );
        g2d.setColor(new Color(29, 33, 24));
        g2d.fill(square462);

    }

    public static void drawDetails35(Graphics2D g2d) {

        // Square
        Rectangle2D.Double square463 = new Rectangle2D.Double(
                506.79, 254.8,
                21.14, 21.14
        );
        g2d.setColor(new Color(96, 145, 214));
        g2d.fill(square463);

        // Rectangle
        Rectangle2D.Double rectangle464 = new Rectangle2D.Double(
                229.44, 166.24,
                106.12, 25.12
        );
        Rectangle2D bounds464 = rectangle464.getBounds2D();
        AffineTransform rotation464 = AffineTransform.getRotateInstance(
                Math.toRadians(-67.5),
                bounds464.getCenterX(), bounds464.getCenterY()
        );
        Shape rotated464 = rotation464.createTransformedShape(rectangle464);
        g2d.setColor(new Color(35, 59, 103));
        g2d.fill(rotated464);

        // Circle
        Ellipse2D.Double circle465 = new Ellipse2D.Double(
                384.98, 429.19,
                17.65, 17.65
        );
        g2d.setColor(new Color(15, 74, 158));
        g2d.fill(circle465);

        // Ellipse
        Ellipse2D.Double ellipse466 = new Ellipse2D.Double(
                369.4, 175.35,
                7.02, 15.72
        );
        Rectangle2D bounds466 = ellipse466.getBounds2D();
        AffineTransform rotation466 = AffineTransform.getRotateInstance(
                Math.toRadians(161.99),
                bounds466.getCenterX(), bounds466.getCenterY()
        );
        Shape rotated466 = rotation466.createTransformedShape(ellipse466);
        g2d.setColor(new Color(6, 15, 58));
        g2d.fill(rotated466);

        // Area / transformation
        Ellipse2D.Double outer467 = new Ellipse2D.Double(
                404.77, 205.18,
                16.62, 17.29
        );
        Ellipse2D.Double cutout467 = new Ellipse2D.Double(
                404.77 + 16.62 * 0.28,
                205.18 - 17.29 * 0.12,
                16.62, 17.29
        );
        Area area467 = new Area(outer467);
        area467.subtract(new Area(cutout467));
        Rectangle2D bounds467 = area467.getBounds2D();
        AffineTransform rotation467 = AffineTransform.getRotateInstance(
                Math.toRadians(305),
                bounds467.getCenterX(), bounds467.getCenterY()
        );
        Shape rotated467 = rotation467.createTransformedShape(area467);
        g2d.setColor(new Color(49, 78, 188));
        g2d.fill(rotated467);

        // Rectangle
        Rectangle2D.Double rectangle468 = new Rectangle2D.Double(
                110.23, 434.55,
                15.84, 21.06
        );
        g2d.setColor(new Color(8, 11, 50));
        g2d.fill(rectangle468);

        // Area / transformation
        GeneralPath boundary469_1 = new GeneralPath();
        boundary469_1.moveTo(449.29, 154.18);
        boundary469_1.lineTo(450.29, 156.18);
        boundary469_1.lineTo(458.29, 163.18);
        boundary469_1.lineTo(468.29, 164.18);
        boundary469_1.lineTo(476.29, 167.18);
        boundary469_1.lineTo(492.29, 173.18);
        boundary469_1.lineTo(495.29, 175.18);
        boundary469_1.lineTo(505.29, 176.18);
        boundary469_1.lineTo(514.29, 175.18);
        boundary469_1.lineTo(524.29, 171.18);
        boundary469_1.lineTo(534.29, 163.18);
        boundary469_1.lineTo(534.29, 158.18);
        boundary469_1.lineTo(515.29, 157.18);
        boundary469_1.lineTo(514.29, 158.18);
        boundary469_1.lineTo(502.29, 159.18);
        boundary469_1.lineTo(495.29, 159.18);
        boundary469_1.lineTo(494.29, 158.18);
        boundary469_1.lineTo(468.29, 157.18);
        boundary469_1.closePath();
        Area area469 = new Area(boundary469_1);
        GeneralPath boundary469_2 = new GeneralPath();
        boundary469_2.moveTo(485.29, 168.18);
        boundary469_2.lineTo(487.29, 167.18);
        boundary469_2.lineTo(488.29, 169.18);
        boundary469_2.lineTo(486.29, 170.18);
        boundary469_2.closePath();
        area469.subtract(new Area(boundary469_2));
        g2d.setColor(new Color(0, 9, 36));
        g2d.fill(area469);

        // Ellipse
        Ellipse2D.Double ellipse470 = new Ellipse2D.Double(
                292.8, 69.3,
                12.31, 78.17
        );
        Rectangle2D bounds470 = ellipse470.getBounds2D();
        AffineTransform rotation470 = AffineTransform.getRotateInstance(
                Math.toRadians(138.62),
                bounds470.getCenterX(), bounds470.getCenterY()
        );
        Shape rotated470 = rotation470.createTransformedShape(ellipse470);
        g2d.setColor(new Color(7, 10, 15));
        g2d.fill(rotated470);

        // Circle
        Ellipse2D.Double circle471 = new Ellipse2D.Double(
                162.75, 392.78,
                37.71, 37.71
        );
        Rectangle2D bounds471 = circle471.getBounds2D();
        AffineTransform rotation471 = AffineTransform.getRotateInstance(
                Math.toRadians(23),
                bounds471.getCenterX(), bounds471.getCenterY()
        );
        Shape rotated471 = rotation471.createTransformedShape(circle471);
        g2d.setColor(new Color(14, 28, 86));
        g2d.fill(rotated471);

        // Circle
        Ellipse2D.Double circle472 = new Ellipse2D.Double(
                357.1, 182.13,
                8.75, 8.75
        );
        g2d.setColor(new Color(2, 8, 41));
        g2d.fill(circle472);

        // General path
        GeneralPath gp473 = new GeneralPath();
        gp473.moveTo(440.99, 184.47);
        gp473.lineTo(443.99, 184.47);
        gp473.lineTo(447.99, 186.47);
        gp473.lineTo(455.99, 192.47);
        gp473.lineTo(460.99, 202.47);
        gp473.lineTo(460.99, 204.47);
        gp473.lineTo(465.99, 204.47);
        gp473.lineTo(472.99, 206.47);
        gp473.lineTo(477.99, 209.47);
        gp473.lineTo(480.99, 213.47);
        gp473.lineTo(483.99, 211.47);
        gp473.lineTo(487.99, 213.47);
        gp473.lineTo(484.99, 206.47);
        gp473.lineTo(479.99, 203.47);
        gp473.lineTo(477.99, 203.47);
        gp473.lineTo(466.99, 196.47);
        gp473.lineTo(460.99, 193.47);
        gp473.lineTo(452.99, 188.47);
        gp473.closePath();
        g2d.setColor(new Color(0, 3, 35));
        g2d.fill(gp473);

        // Rectangle
        Rectangle2D.Double rectangle474 = new Rectangle2D.Double(
                120.23, 347.69,
                15.96, 21.21
        );
        g2d.setColor(new Color(10, 18, 57));
        g2d.fill(rectangle474);

    }

    public static void drawDetails36(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle475 = new Rectangle2D.Double(
                202.13, 233.41,
                30.52, 20.13
        );
        g2d.setColor(new Color(13, 27, 58));
        g2d.fill(rectangle475);

        // Square
        Rectangle2D.Double square476 = new Rectangle2D.Double(
                118.82, 239.58,
                9.93, 9.93
        );
        g2d.setColor(new Color(6, 8, 18));
        g2d.fill(square476);

        // Ellipse
        Ellipse2D.Double ellipse477 = new Ellipse2D.Double(
                143.68, 265.75,
                16.43, 39.32
        );
        Rectangle2D bounds477 = ellipse477.getBounds2D();
        AffineTransform rotation477 = AffineTransform.getRotateInstance(
                Math.toRadians(172.13),
                bounds477.getCenterX(), bounds477.getCenterY()
        );
        Shape rotated477 = rotation477.createTransformedShape(ellipse477);
        g2d.setColor(new Color(9, 17, 50));
        g2d.fill(rotated477);

        // General path
        GeneralPath gp478 = new GeneralPath();
        gp478.moveTo(150.1, 329.47);
        gp478.lineTo(148.1, 342.47);
        gp478.lineTo(152.1, 353.47);
        gp478.lineTo(154.1, 355.47);
        gp478.lineTo(155.1, 360.47);
        gp478.lineTo(158.1, 366.47);
        gp478.lineTo(164.1, 366.47);
        gp478.lineTo(167.1, 368.47);
        gp478.lineTo(166.1, 361.47);
        gp478.lineTo(166.1, 358.47);
        gp478.lineTo(168.1, 358.47);
        gp478.lineTo(173.1, 358.47);
        gp478.lineTo(179.1, 364.47);
        gp478.lineTo(167.1, 344.47);
        gp478.lineTo(154.1, 343.47);
        gp478.lineTo(153.1, 338.47);
        gp478.lineTo(166.1, 332.47);
        gp478.lineTo(162.1, 329.47);
        gp478.closePath();
        g2d.setColor(new Color(48, 59, 115));
        g2d.fill(gp478);

        // Rectangle
        Rectangle2D.Double rectangle479 = new Rectangle2D.Double(
                368.72, 105.96,
                15.56, 7.07
        );
        Rectangle2D bounds479 = rectangle479.getBounds2D();
        AffineTransform rotation479 = AffineTransform.getRotateInstance(
                Math.toRadians(-45),
                bounds479.getCenterX(), bounds479.getCenterY()
        );
        Shape rotated479 = rotation479.createTransformedShape(rectangle479);
        g2d.setColor(new Color(27, 42, 115));
        g2d.fill(rotated479);

        // Square
        Rectangle2D.Double square480 = new Rectangle2D.Double(
                425.53, 406.52,
                21.59, 21.59
        );
        g2d.setColor(new Color(47, 47, 42));
        g2d.fill(square480);

        // Rectangle
        Rectangle2D.Double rectangle481 = new Rectangle2D.Double(
                307.89, 207,
                24.89, 11.51
        );
        Rectangle2D bounds481 = rectangle481.getBounds2D();
        AffineTransform rotation481 = AffineTransform.getRotateInstance(
                Math.toRadians(-18.43),
                bounds481.getCenterX(), bounds481.getCenterY()
        );
        Shape rotated481 = rotation481.createTransformedShape(rectangle481);
        g2d.setColor(new Color(10, 31, 97));
        g2d.fill(rotated481);

        // Area / transformation
        GeneralPath boundary482_1 = new GeneralPath();
        boundary482_1.moveTo(99, 221);
        boundary482_1.lineTo(99, 237);
        boundary482_1.lineTo(98, 245);
        boundary482_1.lineTo(94, 249);
        boundary482_1.lineTo(96, 252);
        boundary482_1.lineTo(98, 271);
        boundary482_1.lineTo(98, 283);
        boundary482_1.lineTo(102, 295);
        boundary482_1.lineTo(106, 301);
        boundary482_1.lineTo(112, 311);
        boundary482_1.lineTo(121, 325);
        boundary482_1.lineTo(124, 325);
        boundary482_1.lineTo(121, 311);
        boundary482_1.lineTo(121, 292);
        boundary482_1.lineTo(120, 291);
        boundary482_1.lineTo(113, 260);
        boundary482_1.lineTo(111, 249);
        boundary482_1.lineTo(109, 237);
        boundary482_1.closePath();
        Area area482 = new Area(boundary482_1);
        GeneralPath boundary482_2 = new GeneralPath();
        boundary482_2.moveTo(113, 311);
        boundary482_2.lineTo(115, 310);
        boundary482_2.lineTo(116, 312);
        boundary482_2.lineTo(114, 313);
        boundary482_2.closePath();
        area482.subtract(new Area(boundary482_2));
        GeneralPath boundary482_3 = new GeneralPath();
        boundary482_3.moveTo(108, 266);
        boundary482_3.lineTo(110, 265);
        boundary482_3.lineTo(111, 267);
        boundary482_3.lineTo(109, 268);
        boundary482_3.closePath();
        area482.subtract(new Area(boundary482_3));
        g2d.setColor(new Color(39, 37, 73));
        g2d.fill(area482);

        // Rectangle
        Rectangle2D.Double rectangle483 = new Rectangle2D.Double(
                239.11, 403.31,
                26.13, 10.78
        );
        g2d.setColor(new Color(2, 26, 81));
        g2d.fill(rectangle483);

        // Rectangle
        Rectangle2D.Double rectangle484 = new Rectangle2D.Double(
                400.19, 256.24,
                14.53, 7.45
        );
        Rectangle2D bounds484 = rectangle484.getBounds2D();
        AffineTransform rotation484 = AffineTransform.getRotateInstance(
                Math.toRadians(-59.04),
                bounds484.getCenterX(), bounds484.getCenterY()
        );
        Shape rotated484 = rotation484.createTransformedShape(rectangle484);
        g2d.setColor(new Color(130, 212, 253));
        g2d.fill(rotated484);

        // Ellipse
        Ellipse2D.Double ellipse485 = new Ellipse2D.Double(
                318.42, 328.36,
                8.83, 11.34
        );
        Rectangle2D bounds485 = ellipse485.getBounds2D();
        AffineTransform rotation485 = AffineTransform.getRotateInstance(
                Math.toRadians(128),
                bounds485.getCenterX(), bounds485.getCenterY()
        );
        Shape rotated485 = rotation485.createTransformedShape(ellipse485);
        g2d.setColor(new Color(74, 66, 67));
        g2d.fill(rotated485);

        // Rectangle
        Rectangle2D.Double rectangle486 = new Rectangle2D.Double(
                68.22, 394.34,
                29.2, 36.64
        );
        g2d.setColor(new Color(7, 10, 39));
        g2d.fill(rectangle486);

    }

    public static void drawDetails37(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle487 = new Rectangle2D.Double(
                181.05, 343.9,
                9.7, 4.34
        );
        g2d.setColor(new Color(84, 94, 156));
        g2d.fill(rectangle487);

        // Circle
        Ellipse2D.Double circle488 = new Ellipse2D.Double(
                536.64, 284.46,
                13.68, 13.68
        );
        Rectangle2D bounds488 = circle488.getBounds2D();
        AffineTransform rotation488 = AffineTransform.getRotateInstance(
                Math.toRadians(139),
                bounds488.getCenterX(), bounds488.getCenterY()
        );
        Shape rotated488 = rotation488.createTransformedShape(circle488);
        g2d.setColor(new Color(0, 21, 62));
        g2d.fill(rotated488);

        // Quadratic curve
        QuadCurve2D.Double qc489 = new QuadCurve2D.Double(
                476.67, 234.89,
                483.8, 230.05,
                490.92, 234.89
        );
        Rectangle2D bounds489 = qc489.getBounds2D();
        AffineTransform rotation489 = AffineTransform.getRotateInstance(
                Math.toRadians(242),
                bounds489.getCenterX(), bounds489.getCenterY()
        );
        Shape rotated489 = rotation489.createTransformedShape(qc489);
        g2d.setColor(new Color(0, 8, 63));
        BasicStroke bs489 = new BasicStroke(
                3.17f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs489);
        g2d.draw(rotated489);

        // Rectangle
        Rectangle2D.Double rectangle490 = new Rectangle2D.Double(
                358.81, 135.85,
                18.78, 8.5
        );
        Rectangle2D bounds490 = rectangle490.getBounds2D();
        AffineTransform rotation490 = AffineTransform.getRotateInstance(
                Math.toRadians(-63.44),
                bounds490.getCenterX(), bounds490.getCenterY()
        );
        Shape rotated490 = rotation490.createTransformedShape(rectangle490);
        g2d.setColor(new Color(33, 51, 128));
        g2d.fill(rotated490);

        // General path
        GeneralPath gp491 = new GeneralPath();
        gp491.moveTo(115.81, 206.55);
        gp491.lineTo(120.81, 214.55);
        gp491.lineTo(122.81, 215.55);
        gp491.lineTo(128.81, 222.55);
        gp491.lineTo(130.81, 228.55);
        gp491.lineTo(132.81, 232.55);
        gp491.lineTo(142.81, 242.55);
        gp491.lineTo(144.81, 257.55);
        gp491.lineTo(144.81, 263.55);
        gp491.lineTo(143.81, 264.55);
        gp491.lineTo(148.81, 263.55);
        gp491.lineTo(147.81, 259.55);
        gp491.lineTo(148.81, 253.55);
        gp491.lineTo(146.81, 248.55);
        gp491.lineTo(139.81, 239.55);
        gp491.lineTo(133.81, 227.55);
        gp491.lineTo(131.81, 224.55);
        gp491.lineTo(125.81, 216.55);
        gp491.closePath();
        g2d.setColor(new Color(4, 6, 47));
        g2d.fill(gp491);

        // Square
        Rectangle2D.Double square492 = new Rectangle2D.Double(
                232.28, 433.03,
                22.36, 22.36
        );
        g2d.setColor(new Color(0, 18, 52));
        g2d.fill(square492);

        // Rectangle
        Rectangle2D.Double rectangle493 = new Rectangle2D.Double(
                386.42, 199.96,
                6.73, 11.69
        );
        Rectangle2D bounds493 = rectangle493.getBounds2D();
        AffineTransform rotation493 = AffineTransform.getRotateInstance(
                Math.toRadians(-80.54),
                bounds493.getCenterX(), bounds493.getCenterY()
        );
        Shape rotated493 = rotation493.createTransformedShape(rectangle493);
        g2d.setColor(new Color(167, 160, 202));
        g2d.fill(rotated493);

        // Area / transformation
        Ellipse2D.Double outer494 = new Ellipse2D.Double(
                350.24, 213.24,
                29.96, 25.7
        );
        Ellipse2D.Double cutout494 = new Ellipse2D.Double(
                350.24 + 29.96 * 0.28,
                213.24 - 25.7 * 0.12,
                29.96, 25.7
        );
        Area area494 = new Area(outer494);
        area494.subtract(new Area(cutout494));
        Rectangle2D bounds494 = area494.getBounds2D();
        AffineTransform rotation494 = AffineTransform.getRotateInstance(
                Math.toRadians(65),
                bounds494.getCenterX(), bounds494.getCenterY()
        );
        Shape rotated494 = rotation494.createTransformedShape(area494);
        g2d.setColor(new Color(62, 92, 198));
        g2d.fill(rotated494);

        // Ellipse
        Ellipse2D.Double ellipse495 = new Ellipse2D.Double(
                295.86, 224.07,
                19.24, 38.36
        );
        Rectangle2D bounds495 = ellipse495.getBounds2D();
        AffineTransform rotation495 = AffineTransform.getRotateInstance(
                Math.toRadians(170.2),
                bounds495.getCenterX(), bounds495.getCenterY()
        );
        Shape rotated495 = rotation495.createTransformedShape(ellipse495);
        g2d.setColor(new Color(4, 15, 53));
        g2d.fill(rotated495);

        // Ellipse
        Ellipse2D.Double ellipse496 = new Ellipse2D.Double(
                378.4, 206.79,
                5.16, 13.06
        );
        Rectangle2D bounds496 = ellipse496.getBounds2D();
        AffineTransform rotation496 = AffineTransform.getRotateInstance(
                Math.toRadians(100.92),
                bounds496.getCenterX(), bounds496.getCenterY()
        );
        Shape rotated496 = rotation496.createTransformedShape(ellipse496);
        g2d.setColor(new Color(53, 81, 189));
        g2d.fill(rotated496);

        // Square
        Rectangle2D.Double square497 = new Rectangle2D.Double(
                215.04, 384.49,
                9.64, 9.64
        );
        g2d.setColor(new Color(14, 48, 97));
        g2d.fill(square497);

        // Quadratic curve
        QuadCurve2D.Double qc498 = new QuadCurve2D.Double(
                364.24, 372.43,
                378.15, 356.58,
                392.05, 372.43
        );
        Rectangle2D bounds498 = qc498.getBounds2D();
        AffineTransform rotation498 = AffineTransform.getRotateInstance(
                Math.toRadians(230),
                bounds498.getCenterX(), bounds498.getCenterY()
        );
        Shape rotated498 = rotation498.createTransformedShape(qc498);
        g2d.setColor(new Color(98, 84, 181));
        BasicStroke bs498 = new BasicStroke(
                2.85f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs498);
        g2d.draw(rotated498);

    }

    public static void drawDetails38(Graphics2D g2d) {

        // Arc
        Arc2D.Double arc499 = new Arc2D.Double(
                407.41, 387.16,
                19.96, 8.29,
                0, 224, Arc2D.PIE
        );
        Rectangle2D bounds499 = arc499.getBounds2D();
        AffineTransform rotation499 = AffineTransform.getRotateInstance(
                Math.toRadians(352),
                bounds499.getCenterX(), bounds499.getCenterY()
        );
        Shape rotated499 = rotation499.createTransformedShape(arc499);
        g2d.setColor(new Color(97, 91, 211));
        g2d.fill(rotated499);

        // Quadratic curve
        QuadCurve2D.Double qc500 = new QuadCurve2D.Double(
                220.43, 266.24,
                232.49, 256.75,
                244.54, 266.24
        );
        Rectangle2D bounds500 = qc500.getBounds2D();
        AffineTransform rotation500 = AffineTransform.getRotateInstance(
                Math.toRadians(197),
                bounds500.getCenterX(), bounds500.getCenterY()
        );
        Shape rotated500 = rotation500.createTransformedShape(qc500);
        g2d.setColor(new Color(99, 108, 119));
        BasicStroke bs500 = new BasicStroke(
                3.14f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs500);
        g2d.draw(rotated500);

        // Rectangle
        Rectangle2D.Double rectangle501 = new Rectangle2D.Double(
                75.42, 440.53,
                27.3, 25.13
        );
        g2d.setColor(new Color(7, 8, 42));
        g2d.fill(rectangle501);

        // Rectangle
        Rectangle2D.Double rectangle502 = new Rectangle2D.Double(
                581.86, 441.57,
                15.81, 10.73
        );
        g2d.setColor(new Color(1, 24, 85));
        g2d.fill(rectangle502);

        // Rectangle
        Rectangle2D.Double rectangle503 = new Rectangle2D.Double(
                445.03, 140.85,
                5.08, 53.71
        );
        Rectangle2D bounds503 = rectangle503.getBounds2D();
        AffineTransform rotation503 = AffineTransform.getRotateInstance(
                Math.toRadians(-61.29),
                bounds503.getCenterX(), bounds503.getCenterY()
        );
        Shape rotated503 = rotation503.createTransformedShape(rectangle503);
        g2d.setColor(new Color(19, 31, 93));
        g2d.fill(rotated503);

        // Area / transformation
        Ellipse2D.Double outer504 = new Ellipse2D.Double(
                238.22, 267.03,
                24.25, 23.48
        );
        Ellipse2D.Double cutout504 = new Ellipse2D.Double(
                238.22 + 24.25 * 0.28,
                267.03 - 23.48 * 0.12,
                24.25, 23.48
        );
        Area area504 = new Area(outer504);
        area504.subtract(new Area(cutout504));
        Rectangle2D bounds504 = area504.getBounds2D();
        AffineTransform rotation504 = AffineTransform.getRotateInstance(
                Math.toRadians(24),
                bounds504.getCenterX(), bounds504.getCenterY()
        );
        Shape rotated504 = rotation504.createTransformedShape(area504);
        g2d.setColor(new Color(20, 46, 99));
        g2d.fill(rotated504);

        // Ellipse
        Ellipse2D.Double ellipse505 = new Ellipse2D.Double(
                411.99, 364.53,
                6.25, 23.39
        );
        Rectangle2D bounds505 = ellipse505.getBounds2D();
        AffineTransform rotation505 = AffineTransform.getRotateInstance(
                Math.toRadians(110.34),
                bounds505.getCenterX(), bounds505.getCenterY()
        );
        Shape rotated505 = rotation505.createTransformedShape(ellipse505);
        g2d.setColor(new Color(29, 23, 117));
        g2d.fill(rotated505);

        // Ellipse
        Ellipse2D.Double ellipse506 = new Ellipse2D.Double(
                390.02, 241.18,
                7.58, 16.1
        );
        Rectangle2D bounds506 = ellipse506.getBounds2D();
        AffineTransform rotation506 = AffineTransform.getRotateInstance(
                Math.toRadians(30.49),
                bounds506.getCenterX(), bounds506.getCenterY()
        );
        Shape rotated506 = rotation506.createTransformedShape(ellipse506);
        g2d.setColor(new Color(152, 199, 251));
        g2d.fill(rotated506);

        // Rectangle
        Rectangle2D.Double rectangle507 = new Rectangle2D.Double(
                84.07, 369.64,
                9.4, 10.85
        );
        g2d.setColor(new Color(23, 39, 80));
        g2d.fill(rectangle507);

        // Square
        Rectangle2D.Double square508 = new Rectangle2D.Double(
                490.34, 442.56,
                10.63, 10.63
        );
        g2d.setColor(new Color(29, 31, 30));
        g2d.fill(square508);

        // Ellipse
        Ellipse2D.Double ellipse509 = new Ellipse2D.Double(
                361.08, 249.49,
                4.14, 12.87
        );
        Rectangle2D bounds509 = ellipse509.getBounds2D();
        AffineTransform rotation509 = AffineTransform.getRotateInstance(
                Math.toRadians(4.39),
                bounds509.getCenterX(), bounds509.getCenterY()
        );
        Shape rotated509 = rotation509.createTransformedShape(ellipse509);
        g2d.setColor(new Color(106, 133, 251));
        g2d.fill(rotated509);

        // Square
        Rectangle2D.Double square510 = new Rectangle2D.Double(
                564.78, 409.3,
                15.71, 15.71
        );
        g2d.setColor(new Color(8, 44, 135));
        g2d.fill(square510);

        // Rectangle
        Rectangle2D.Double rectangle511 = new Rectangle2D.Double(
                651.7, 433.92,
                18.34, 10.42
        );
        g2d.setColor(new Color(44, 42, 88));
        g2d.fill(rectangle511);

        // Ellipse
        Ellipse2D.Double ellipse512 = new Ellipse2D.Double(
                662.4, 153.46,
                53.4, 95.77
        );
        Rectangle2D bounds512 = ellipse512.getBounds2D();
        AffineTransform rotation512 = AffineTransform.getRotateInstance(
                Math.toRadians(2.58),
                bounds512.getCenterX(), bounds512.getCenterY()
        );
        Shape rotated512 = rotation512.createTransformedShape(ellipse512);
        g2d.setColor(new Color(1, 5, 42));
        g2d.fill(rotated512);

    }

    public static void drawDetails39(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle513 = new Rectangle2D.Double(
                551.14, 64.66,
                45.54, 53.29
        );
        g2d.setColor(new Color(6, 17, 63));
        g2d.fill(rectangle513);

        // Square
        Rectangle2D.Double square514 = new Rectangle2D.Double(
                283.02, 268.86,
                30.71, 30.71
        );
        g2d.setColor(new Color(59, 91, 157));
        g2d.fill(square514);

        // Ellipse
        Ellipse2D.Double ellipse515 = new Ellipse2D.Double(
                430.86, 284.34,
                27.93, 79.52
        );
        Rectangle2D bounds515 = ellipse515.getBounds2D();
        AffineTransform rotation515 = AffineTransform.getRotateInstance(
                Math.toRadians(142.12),
                bounds515.getCenterX(), bounds515.getCenterY()
        );
        Shape rotated515 = rotation515.createTransformedShape(ellipse515);
        g2d.setColor(new Color(22, 29, 60));
        g2d.fill(rotated515);

        // Ellipse
        Ellipse2D.Double ellipse516 = new Ellipse2D.Double(
                504.52, 302.17,
                21.32, 41.91
        );
        Rectangle2D bounds516 = ellipse516.getBounds2D();
        AffineTransform rotation516 = AffineTransform.getRotateInstance(
                Math.toRadians(168.51),
                bounds516.getCenterX(), bounds516.getCenterY()
        );
        Shape rotated516 = rotation516.createTransformedShape(ellipse516);
        g2d.setColor(new Color(65, 126, 208));
        g2d.fill(rotated516);

        // Rectangle
        Rectangle2D.Double rectangle517 = new Rectangle2D.Double(
                260.36, 320.74,
                24.17, 15.93
        );
        g2d.setColor(new Color(59, 104, 181));
        g2d.fill(rectangle517);

        // Square
        Rectangle2D.Double square518 = new Rectangle2D.Double(
                546.8, 338.85,
                29.05, 29.05
        );
        g2d.setColor(new Color(1, 55, 147));
        g2d.fill(square518);

        // Rectangle
        Rectangle2D.Double rectangle519 = new Rectangle2D.Double(
                633.6, 100.2,
                3.6, 19.2
        );
        Rectangle2D bounds519 = rectangle519.getBounds2D();
        AffineTransform rotation519 = AffineTransform.getRotateInstance(
                Math.toRadians(-53.13),
                bounds519.getCenterX(), bounds519.getCenterY()
        );
        Shape rotated519 = rotation519.createTransformedShape(rectangle519);
        g2d.setColor(new Color(84, 100, 182));
        g2d.fill(rotated519);

        // General path
        GeneralPath gp520 = new GeneralPath();
        gp520.moveTo(476, 335);
        gp520.lineTo(485, 347);
        gp520.lineTo(486, 351);
        gp520.lineTo(499, 364);
        gp520.lineTo(507, 384);
        gp520.lineTo(513, 364);
        gp520.lineTo(523, 381);
        gp520.lineTo(524, 385);
        gp520.lineTo(530, 392);
        gp520.lineTo(530, 378);
        gp520.lineTo(528, 366);
        gp520.lineTo(535, 372);
        gp520.lineTo(529, 358);
        gp520.lineTo(527, 364);
        gp520.lineTo(522, 364);
        gp520.lineTo(514, 361);
        gp520.lineTo(504, 355);
        gp520.lineTo(492, 350);
        gp520.closePath();
        g2d.setColor(new Color(0, 22, 92));
        g2d.fill(gp520);

        // Rectangle
        Rectangle2D.Double rectangle521 = new Rectangle2D.Double(
                322.11, 440.63,
                28.82, 19.01
        );
        g2d.setColor(new Color(3, 28, 78));
        g2d.fill(rectangle521);

        // Circle
        Ellipse2D.Double circle522 = new Ellipse2D.Double(
                283.62, 366.95,
                18.86, 18.86
        );
        Rectangle2D bounds522 = circle522.getBounds2D();
        AffineTransform rotation522 = AffineTransform.getRotateInstance(
                Math.toRadians(70),
                bounds522.getCenterX(), bounds522.getCenterY()
        );
        Shape rotated522 = rotation522.createTransformedShape(circle522);
        g2d.setColor(new Color(28, 80, 195));
        g2d.fill(rotated522);

        // Rectangle
        Rectangle2D.Double rectangle523 = new Rectangle2D.Double(
                683.37, -26.73,
                100.69, 132.22
        );
        Rectangle2D bounds523 = rectangle523.getBounds2D();
        AffineTransform rotation523 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds523.getCenterX(), bounds523.getCenterY()
        );
        Shape rotated523 = rotation523.createTransformedShape(rectangle523);
        g2d.setColor(new Color(3, 2, 18));
        g2d.fill(rotated523);

        // Ellipse
        Ellipse2D.Double ellipse524 = new Ellipse2D.Double(
                618.33, 92.37,
                22.16, 86.96
        );
        Rectangle2D bounds524 = ellipse524.getBounds2D();
        AffineTransform rotation524 = AffineTransform.getRotateInstance(
                Math.toRadians(134.2),
                bounds524.getCenterX(), bounds524.getCenterY()
        );
        Shape rotated524 = rotation524.createTransformedShape(ellipse524);
        g2d.setColor(new Color(106, 132, 192));
        g2d.fill(rotated524);

        // Square
        Rectangle2D.Double square525 = new Rectangle2D.Double(
                228.34, 348.71,
                12.89, 12.89
        );
        g2d.setColor(new Color(0, 33, 111));
        g2d.fill(square525);

        // Rectangle
        Rectangle2D.Double rectangle526 = new Rectangle2D.Double(
                575.53, 242.69,
                27.16, 6.19
        );
        Rectangle2D bounds526 = rectangle526.getBounds2D();
        AffineTransform rotation526 = AffineTransform.getRotateInstance(
                Math.toRadians(-57.26),
                bounds526.getCenterX(), bounds526.getCenterY()
        );
        Shape rotated526 = rotation526.createTransformedShape(rectangle526);
        g2d.setColor(new Color(10, 43, 112));
        g2d.fill(rotated526);

        // Rectangle
        Rectangle2D.Double rectangle527 = new Rectangle2D.Double(
                542.71, 319.53,
                21.13, 12.55
        );
        g2d.setColor(new Color(0, 19, 61));
        g2d.fill(rectangle527);

    }

}

class witchPart5 {

    public static void drawPart(Graphics2D g2d) {
        drawDetails40(g2d);
        drawDetails41(g2d);
        drawDetails42(g2d);
        drawDetails43(g2d);
        drawDetails44(g2d);
        drawDetails45(g2d);
        drawDetails46(g2d);
        drawDetails47(g2d);
        drawDetails48(g2d);
        drawDetails49(g2d);
    }

    public static void drawDetails40(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle528 = new Rectangle2D.Double(
                592.82, 271.04,
                54.97, 12.07
        );
        Rectangle2D bounds528 = rectangle528.getBounds2D();
        AffineTransform rotation528 = AffineTransform.getRotateInstance(
                Math.toRadians(-64),
                bounds528.getCenterX(), bounds528.getCenterY()
        );
        Shape rotated528 = rotation528.createTransformedShape(rectangle528);
        g2d.setColor(new Color(83, 123, 193));
        g2d.fill(rotated528);

        // Ellipse
        Ellipse2D.Double ellipse529 = new Ellipse2D.Double(
                206.47, 305.6,
                11.87, 38.53
        );
        Rectangle2D bounds529 = ellipse529.getBounds2D();
        AffineTransform rotation529 = AffineTransform.getRotateInstance(
                Math.toRadians(118.85),
                bounds529.getCenterX(), bounds529.getCenterY()
        );
        Shape rotated529 = rotation529.createTransformedShape(ellipse529);
        g2d.setColor(new Color(7, 4, 135));
        g2d.fill(rotated529);

        // Rectangle
        Rectangle2D.Double rectangle530 = new Rectangle2D.Double(
                411.44, 183.62,
                5.07, 11.56
        );
        Rectangle2D bounds530 = rectangle530.getBounds2D();
        AffineTransform rotation530 = AffineTransform.getRotateInstance(
                Math.toRadians(-66.04),
                bounds530.getCenterX(), bounds530.getCenterY()
        );
        Shape rotated530 = rotation530.createTransformedShape(rectangle530);
        g2d.setColor(new Color(0, 0, 38));
        g2d.fill(rotated530);

        // General path
        GeneralPath gp531 = new GeneralPath();
        gp531.moveTo(624, 210);
        gp531.lineTo(619, 212);
        gp531.lineTo(613, 220);
        gp531.lineTo(608, 225);
        gp531.lineTo(606, 228);
        gp531.lineTo(604, 235);
        gp531.lineTo(583, 270);
        gp531.lineTo(578, 278);
        gp531.lineTo(567, 296);
        gp531.lineTo(559, 306);
        gp531.lineTo(565, 314);
        gp531.lineTo(567, 307);
        gp531.lineTo(581, 286);
        gp531.lineTo(590, 272);
        gp531.lineTo(600, 253);
        gp531.lineTo(612, 234);
        gp531.lineTo(615, 225);
        gp531.lineTo(621, 216);
        gp531.closePath();
        g2d.setColor(new Color(165, 191, 250));
        g2d.fill(gp531);

        // Area / transformation
        GeneralPath boundary532_1 = new GeneralPath();
        boundary532_1.moveTo(429, 97);
        boundary532_1.lineTo(432, 115);
        boundary532_1.lineTo(439, 122);
        boundary532_1.lineTo(478, 131);
        boundary532_1.lineTo(505, 127);
        boundary532_1.lineTo(526, 138);
        boundary532_1.lineTo(538, 157);
        boundary532_1.lineTo(530, 183);
        boundary532_1.lineTo(544, 205);
        boundary532_1.lineTo(562, 212);
        boundary532_1.lineTo(556, 192);
        boundary532_1.lineTo(541, 161);
        boundary532_1.lineTo(537, 138);
        boundary532_1.lineTo(524, 122);
        boundary532_1.lineTo(502, 108);
        boundary532_1.lineTo(484, 109);
        boundary532_1.lineTo(470, 100);
        boundary532_1.lineTo(464, 85);
        boundary532_1.closePath();
        Area area532 = new Area(boundary532_1);
        GeneralPath boundary532_2 = new GeneralPath();
        boundary532_2.moveTo(551, 203);
        boundary532_2.lineTo(553, 202);
        boundary532_2.lineTo(554, 204);
        boundary532_2.lineTo(553, 205);
        boundary532_2.closePath();
        area532.subtract(new Area(boundary532_2));
        GeneralPath boundary532_3 = new GeneralPath();
        boundary532_3.moveTo(480, 123);
        boundary532_3.lineTo(482, 122);
        boundary532_3.lineTo(483, 124);
        boundary532_3.lineTo(481, 125);
        boundary532_3.closePath();
        area532.subtract(new Area(boundary532_3));
        g2d.setColor(new Color(20, 53, 166));
        g2d.fill(area532);

        // Ellipse
        Ellipse2D.Double ellipse533 = new Ellipse2D.Double(
                277.5, 329.83,
                39.12, 25.47
        );
        Rectangle2D bounds533 = ellipse533.getBounds2D();
        AffineTransform rotation533 = AffineTransform.getRotateInstance(
                Math.toRadians(314),
                bounds533.getCenterX(), bounds533.getCenterY()
        );
        Shape rotated533 = rotation533.createTransformedShape(ellipse533);
        g2d.setColor(new Color(7, 27, 86));
        g2d.fill(rotated533);

        // Rectangle
        Rectangle2D.Double rectangle534 = new Rectangle2D.Double(
                427.78, 141.84,
                7.26, 67.22
        );
        Rectangle2D bounds534 = rectangle534.getBounds2D();
        AffineTransform rotation534 = AffineTransform.getRotateInstance(
                Math.toRadians(-72.72),
                bounds534.getCenterX(), bounds534.getCenterY()
        );
        Shape rotated534 = rotation534.createTransformedShape(rectangle534);
        g2d.setColor(new Color(52, 71, 160));
        g2d.fill(rotated534);

        // Square
        Rectangle2D.Double square535 = new Rectangle2D.Double(
                523.5, 227.11,
                23.28, 23.28
        );
        g2d.setColor(new Color(47, 102, 194));
        g2d.fill(square535);

        // Circle
        Ellipse2D.Double circle536 = new Ellipse2D.Double(
                474.08, 290.16,
                11.19, 11.19
        );
        g2d.setColor(new Color(107, 168, 239));
        g2d.fill(circle536);

        // Square
        Rectangle2D.Double square537 = new Rectangle2D.Double(
                349.77, 313.39,
                11.22, 11.22
        );
        g2d.setColor(new Color(133, 128, 172));
        g2d.fill(square537);

        // Rectangle
        Rectangle2D.Double rectangle538 = new Rectangle2D.Double(
                291.2, 425.44,
                5.49, 23.61
        );
        Rectangle2D bounds538 = rectangle538.getBounds2D();
        AffineTransform rotation538 = AffineTransform.getRotateInstance(
                Math.toRadians(-8.13),
                bounds538.getCenterX(), bounds538.getCenterY()
        );
        Shape rotated538 = rotation538.createTransformedShape(rectangle538);
        g2d.setColor(new Color(3, 0, 8));
        g2d.fill(rotated538);

        // Rectangle
        Rectangle2D.Double rectangle539 = new Rectangle2D.Double(
                247.82, 344.41,
                18.87, 13.61
        );
        g2d.setColor(new Color(59, 98, 203));
        g2d.fill(rectangle539);

    }

    public static void drawDetails41(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle540 = new Rectangle2D.Double(
                460.96, 422.95,
                13.36, 5.46
        );
        g2d.setColor(new Color(131, 120, 96));
        g2d.fill(rectangle540);

        // General path
        GeneralPath gp541 = new GeneralPath();
        gp541.moveTo(634.46, 251.11);
        gp541.lineTo(640.5, 242.26);
        gp541.lineTo(646.55, 250.01);
        gp541.lineTo(640.5, 253.32);
        gp541.closePath();
        Rectangle2D bounds541 = gp541.getBounds2D();
        AffineTransform rotation541 = AffineTransform.getRotateInstance(
                Math.toRadians(187),
                bounds541.getCenterX(), bounds541.getCenterY()
        );
        Shape rotated541 = rotation541.createTransformedShape(gp541);
        g2d.setColor(new Color(59, 74, 96));
        g2d.fill(rotated541);

        // Square
        Rectangle2D.Double square542 = new Rectangle2D.Double(
                355.59, 297.35,
                10.56, 10.56
        );
        g2d.setColor(new Color(77, 90, 178));
        g2d.fill(square542);

        // Square
        Rectangle2D.Double square543 = new Rectangle2D.Double(
                630, 209.79,
                18.26, 18.26
        );
        g2d.setColor(new Color(4, 20, 70));
        g2d.fill(square543);

        // Cubic curve
        CubicCurve2D.Double cc544 = new CubicCurve2D.Double(
                461.47, 212.9,
                466.14, 204.55,
                472.37, 221.25,
                477.04, 212.9
        );
        Rectangle2D bounds544 = cc544.getBounds2D();
        AffineTransform rotation544 = AffineTransform.getRotateInstance(
                Math.toRadians(32),
                bounds544.getCenterX(), bounds544.getCenterY()
        );
        Shape rotated544 = rotation544.createTransformedShape(cc544);
        g2d.setColor(new Color(77, 156, 240));
        BasicStroke bs544 = new BasicStroke(
                2.97f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs544);
        g2d.draw(rotated544);

        // Ellipse
        Ellipse2D.Double ellipse545 = new Ellipse2D.Double(
                410.58, 344.58,
                24.55, 9.47
        );
        Rectangle2D bounds545 = ellipse545.getBounds2D();
        AffineTransform rotation545 = AffineTransform.getRotateInstance(
                Math.toRadians(228),
                bounds545.getCenterX(), bounds545.getCenterY()
        );
        Shape rotated545 = rotation545.createTransformedShape(ellipse545);
        g2d.setColor(new Color(34, 30, 49));
        g2d.fill(rotated545);

        // General path
        GeneralPath gp546 = new GeneralPath();
        gp546.moveTo(364.16, 394.61);
        gp546.lineTo(378.22, 385.23);
        gp546.lineTo(392.28, 393.44);
        gp546.lineTo(378.22, 396.96);
        gp546.closePath();
        Rectangle2D bounds546 = gp546.getBounds2D();
        AffineTransform rotation546 = AffineTransform.getRotateInstance(
                Math.toRadians(10),
                bounds546.getCenterX(), bounds546.getCenterY()
        );
        Shape rotated546 = rotation546.createTransformedShape(gp546);
        g2d.setColor(new Color(93, 88, 216));
        g2d.fill(rotated546);

        // Circle
        Ellipse2D.Double circle547 = new Ellipse2D.Double(
                440.52, 225.67,
                18.16, 18.16
        );
        g2d.setColor(new Color(24, 41, 131));
        g2d.fill(circle547);

        // Rectangle
        Rectangle2D.Double rectangle548 = new Rectangle2D.Double(
                273.01, 221.91,
                17.84, 14.64
        );
        g2d.setColor(new Color(59, 83, 136));
        g2d.fill(rectangle548);

        // Line
        Line2D.Double line549 = new Line2D.Double(
                258.23, 220.02,
                271.99, 220.02
        );
        g2d.setColor(new Color(153, 147, 162));
        BasicStroke bs549 = new BasicStroke(
                2.78f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs549);
        g2d.draw(line549);

        // General path
        GeneralPath gp550 = new GeneralPath();
        gp550.moveTo(582.68, 339.87);
        gp550.lineTo(595.65, 326.3);
        gp550.lineTo(608.63, 338.18);
        gp550.lineTo(595.65, 343.27);
        gp550.closePath();
        Rectangle2D bounds550 = gp550.getBounds2D();
        AffineTransform rotation550 = AffineTransform.getRotateInstance(
                Math.toRadians(159),
                bounds550.getCenterX(), bounds550.getCenterY()
        );
        Shape rotated550 = rotation550.createTransformedShape(gp550);
        g2d.setColor(new Color(1, 36, 107));
        g2d.fill(rotated550);

        // Cubic curve
        CubicCurve2D.Double cc551 = new CubicCurve2D.Double(
                489.25, 251.9,
                493.49, 243.83,
                499.13, 259.96,
                503.37, 251.9
        );
        Rectangle2D bounds551 = cc551.getBounds2D();
        AffineTransform rotation551 = AffineTransform.getRotateInstance(
                Math.toRadians(159),
                bounds551.getCenterX(), bounds551.getCenterY()
        );
        Shape rotated551 = rotation551.createTransformedShape(cc551);
        g2d.setColor(new Color(0, 0, 0));
        BasicStroke bs551 = new BasicStroke(
                3.22f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs551);
        g2d.draw(rotated551);

        // Ellipse
        Ellipse2D.Double ellipse552 = new Ellipse2D.Double(
                628.39, 73.65,
                7.18, 12.94
        );
        Rectangle2D bounds552 = ellipse552.getBounds2D();
        AffineTransform rotation552 = AffineTransform.getRotateInstance(
                Math.toRadians(125.47),
                bounds552.getCenterX(), bounds552.getCenterY()
        );
        Shape rotated552 = rotation552.createTransformedShape(ellipse552);
        g2d.setColor(new Color(45, 73, 119));
        g2d.fill(rotated552);

    }

    public static void drawDetails42(Graphics2D g2d) {

        // General path
        GeneralPath gp553 = new GeneralPath();
        gp553.moveTo(285.05, 173.1);
        gp553.lineTo(289.05, 176.1);
        gp553.lineTo(299.05, 178.1);
        gp553.lineTo(303.05, 180.1);
        gp553.lineTo(321.05, 180.1);
        gp553.lineTo(324.05, 183.1);
        gp553.lineTo(326.05, 182.1);
        gp553.lineTo(327.05, 180.1);
        gp553.lineTo(326.05, 178.1);
        gp553.lineTo(324.05, 178.1);
        gp553.lineTo(321.05, 179.1);
        gp553.lineTo(320.05, 177.1);
        gp553.lineTo(314.05, 177.1);
        gp553.lineTo(313.05, 178.1);
        gp553.lineTo(312.05, 177.1);
        gp553.lineTo(301.05, 177.1);
        gp553.lineTo(300.05, 176.1);
        gp553.lineTo(296.05, 176.1);
        gp553.closePath();
        g2d.setColor(new Color(0, 0, 20));
        g2d.fill(gp553);

        // Ellipse
        Ellipse2D.Double ellipse554 = new Ellipse2D.Double(
                307.19, 66.72,
                18.84, 90.54
        );
        Rectangle2D bounds554 = ellipse554.getBounds2D();
        AffineTransform rotation554 = AffineTransform.getRotateInstance(
                Math.toRadians(135.91),
                bounds554.getCenterX(), bounds554.getCenterY()
        );
        Shape rotated554 = rotation554.createTransformedShape(ellipse554);
        g2d.setColor(new Color(23, 27, 18));
        g2d.fill(rotated554);

        // Ellipse
        Ellipse2D.Double ellipse555 = new Ellipse2D.Double(
                357.58, 173.35,
                22.39, 18.43
        );
        Rectangle2D bounds555 = ellipse555.getBounds2D();
        AffineTransform rotation555 = AffineTransform.getRotateInstance(
                Math.toRadians(133),
                bounds555.getCenterX(), bounds555.getCenterY()
        );
        Shape rotated555 = rotation555.createTransformedShape(ellipse555);
        g2d.setColor(new Color(11, 20, 57));
        g2d.fill(rotated555);

        // General path
        GeneralPath gp556 = new GeneralPath();
        gp556.moveTo(469, 329);
        gp556.lineTo(468, 331);
        gp556.lineTo(472, 336);
        gp556.lineTo(475, 343);
        gp556.lineTo(477, 345);
        gp556.lineTo(477, 347);
        gp556.lineTo(480, 352);
        gp556.lineTo(483, 361);
        gp556.lineTo(484, 358);
        gp556.lineTo(484, 349);
        gp556.lineTo(482, 345);
        gp556.lineTo(472, 334);
        gp556.lineTo(473, 333);
        gp556.closePath();
        g2d.setColor(new Color(86, 148, 231));
        g2d.fill(gp556);

        // Rectangle
        Rectangle2D.Double rectangle557 = new Rectangle2D.Double(
                485.24, 167.94,
                11.26, 12.42
        );
        g2d.setColor(new Color(0, 9, 45));
        g2d.fill(rectangle557);

        // Line
        Line2D.Double line558 = new Line2D.Double(
                445.45, 269.32,
                466.17, 269.32
        );
        Rectangle2D bounds558 = line558.getBounds2D();
        AffineTransform rotation558 = AffineTransform.getRotateInstance(
                Math.toRadians(149),
                bounds558.getCenterX(), bounds558.getCenterY()
        );
        Shape rotated558 = rotation558.createTransformedShape(line558);
        g2d.setColor(new Color(41, 75, 130));
        BasicStroke bs558 = new BasicStroke(
                2.92f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs558);
        g2d.draw(rotated558);

        // General path
        GeneralPath gp559 = new GeneralPath();
        gp559.moveTo(301.61, 133);
        gp559.lineTo(307.13, 124.44);
        gp559.lineTo(312.64, 131.93);
        gp559.lineTo(307.13, 135.14);
        gp559.closePath();
        Rectangle2D bounds559 = gp559.getBounds2D();
        AffineTransform rotation559 = AffineTransform.getRotateInstance(
                Math.toRadians(27),
                bounds559.getCenterX(), bounds559.getCenterY()
        );
        Shape rotated559 = rotation559.createTransformedShape(gp559);
        g2d.setColor(new Color(56, 89, 154));
        g2d.fill(rotated559);

        // Rectangle
        Rectangle2D.Double rectangle560 = new Rectangle2D.Double(
                515.02, 262.89,
                22.13, 13.35
        );
        g2d.setColor(new Color(97, 143, 217));
        g2d.fill(rectangle560);

        // Rectangle
        Rectangle2D.Double rectangle561 = new Rectangle2D.Double(
                342.34, 262.93,
                7.41, 32.5
        );
        Rectangle2D bounds561 = rectangle561.getBounds2D();
        AffineTransform rotation561 = AffineTransform.getRotateInstance(
                Math.toRadians(-29.74),
                bounds561.getCenterX(), bounds561.getCenterY()
        );
        Shape rotated561 = rotation561.createTransformedShape(rectangle561);
        g2d.setColor(new Color(37, 44, 156));
        g2d.fill(rotated561);

        // Rectangle
        Rectangle2D.Double rectangle562 = new Rectangle2D.Double(
                178.42, 364.85,
                27.05, 10.92
        );
        g2d.setColor(new Color(48, 60, 121));
        g2d.fill(rectangle562);

        // Rectangle
        Rectangle2D.Double rectangle563 = new Rectangle2D.Double(
                152.24, 317.92,
                25.22, 15.36
        );
        g2d.setColor(new Color(64, 76, 143));
        g2d.fill(rectangle563);

        // Square
        Rectangle2D.Double square564 = new Rectangle2D.Double(
                141.58, 390.78,
                29.91, 29.91
        );
        g2d.setColor(new Color(10, 18, 73));
        g2d.fill(square564);

        // Rectangle
        Rectangle2D.Double rectangle565 = new Rectangle2D.Double(
                253.25, 94.49,
                29.62, 18.56
        );
        g2d.setColor(new Color(15, 31, 56));
        g2d.fill(rectangle565);

        // Circle
        Ellipse2D.Double circle566 = new Ellipse2D.Double(
                474.14, 383.64,
                13.53, 13.53
        );
        g2d.setColor(new Color(34, 31, 152));
        g2d.fill(circle566);

    }

    public static void drawDetails43(Graphics2D g2d) {

        // Square
        Rectangle2D.Double square567 = new Rectangle2D.Double(
                343.14, 110.23,
                18.07, 18.07
        );
        g2d.setColor(new Color(7, 18, 39));
        g2d.fill(square567);

        // Rectangle
        Rectangle2D.Double rectangle568 = new Rectangle2D.Double(
                138.36, 298.96,
                11.54, 14.52
        );
        Rectangle2D bounds568 = rectangle568.getBounds2D();
        AffineTransform rotation568 = AffineTransform.getRotateInstance(
                Math.toRadians(-61.39),
                bounds568.getCenterX(), bounds568.getCenterY()
        );
        Shape rotated568 = rotation568.createTransformedShape(rectangle568);
        g2d.setColor(new Color(87, 90, 134));
        g2d.fill(rotated568);

        // Square
        Rectangle2D.Double square569 = new Rectangle2D.Double(
                329, 303.87,
                17.13, 17.13
        );
        g2d.setColor(new Color(20, 24, 48));
        g2d.fill(square569);

        // Rectangle
        Rectangle2D.Double rectangle570 = new Rectangle2D.Double(
                446.37, 434.9,
                10.72, 6.19
        );
        g2d.setColor(new Color(69, 119, 204));
        g2d.fill(rectangle570);

        // Ellipse
        Ellipse2D.Double ellipse571 = new Ellipse2D.Double(
                185.31, 223.32,
                22.28, 28.37
        );
        Rectangle2D bounds571 = ellipse571.getBounds2D();
        AffineTransform rotation571 = AffineTransform.getRotateInstance(
                Math.toRadians(168.78),
                bounds571.getCenterX(), bounds571.getCenterY()
        );
        Shape rotated571 = rotation571.createTransformedShape(ellipse571);
        g2d.setColor(new Color(9, 19, 43));
        g2d.fill(rotated571);

        // Ellipse
        Ellipse2D.Double ellipse572 = new Ellipse2D.Double(
                112.24, 225.24,
                4.16, 61.65
        );
        Rectangle2D bounds572 = ellipse572.getBounds2D();
        AffineTransform rotation572 = AffineTransform.getRotateInstance(
                Math.toRadians(168.58),
                bounds572.getCenterX(), bounds572.getCenterY()
        );
        Shape rotated572 = rotation572.createTransformedShape(ellipse572);
        g2d.setColor(new Color(75, 73, 102));
        g2d.fill(rotated572);

        // Ellipse
        Ellipse2D.Double ellipse573 = new Ellipse2D.Double(
                405.09, 410.82,
                21.83, 10.54
        );
        Rectangle2D bounds573 = ellipse573.getBounds2D();
        AffineTransform rotation573 = AffineTransform.getRotateInstance(
                Math.toRadians(16),
                bounds573.getCenterX(), bounds573.getCenterY()
        );
        Shape rotated573 = rotation573.createTransformedShape(ellipse573);
        g2d.setColor(new Color(56, 53, 62));
        g2d.fill(rotated573);

        // Area / transformation
        Ellipse2D.Double outer574 = new Ellipse2D.Double(
                132.88, 350.2,
                21.2, 12.65
        );
        Ellipse2D.Double cutout574 = new Ellipse2D.Double(
                132.88 + 21.2 * 0.28,
                350.2 - 12.65 * 0.12,
                21.2, 12.65
        );
        Area area574 = new Area(outer574);
        area574.subtract(new Area(cutout574));
        Rectangle2D bounds574 = area574.getBounds2D();
        AffineTransform rotation574 = AffineTransform.getRotateInstance(
                Math.toRadians(140),
                bounds574.getCenterX(), bounds574.getCenterY()
        );
        Shape rotated574 = rotation574.createTransformedShape(area574);
        g2d.setColor(new Color(75, 72, 110));
        g2d.fill(rotated574);

        // Square
        Rectangle2D.Double square575 = new Rectangle2D.Double(
                147.13, 362.81,
                10.09, 10.09
        );
        g2d.setColor(new Color(32, 40, 87));
        g2d.fill(square575);

        // Ellipse
        Ellipse2D.Double ellipse576 = new Ellipse2D.Double(
                398.88, 412.23,
                9.92, 32.61
        );
        Rectangle2D bounds576 = ellipse576.getBounds2D();
        AffineTransform rotation576 = AffineTransform.getRotateInstance(
                Math.toRadians(159.48),
                bounds576.getCenterX(), bounds576.getCenterY()
        );
        Shape rotated576 = rotation576.createTransformedShape(ellipse576);
        g2d.setColor(new Color(9, 12, 41));
        g2d.fill(rotated576);

        // Square
        Rectangle2D.Double square577 = new Rectangle2D.Double(
                471.17, 225.8,
                10.22, 10.22
        );
        g2d.setColor(new Color(5, 19, 63));
        g2d.fill(square577);

        // Area / transformation
        Ellipse2D.Double outer578 = new Ellipse2D.Double(
                258.27, 405.42,
                16.4, 14.66
        );
        Ellipse2D.Double cutout578 = new Ellipse2D.Double(
                258.27 + 16.4 * 0.28,
                405.42 - 14.66 * 0.12,
                16.4, 14.66
        );
        Area area578 = new Area(outer578);
        area578.subtract(new Area(cutout578));
        Rectangle2D bounds578 = area578.getBounds2D();
        AffineTransform rotation578 = AffineTransform.getRotateInstance(
                Math.toRadians(227),
                bounds578.getCenterX(), bounds578.getCenterY()
        );
        Shape rotated578 = rotation578.createTransformedShape(area578);
        g2d.setColor(new Color(43, 89, 165));
        g2d.fill(rotated578);

        // Line
        Line2D.Double line579 = new Line2D.Double(
                432.64, 409.66,
                442.58, 409.66
        );
        Rectangle2D bounds579 = line579.getBounds2D();
        AffineTransform rotation579 = AffineTransform.getRotateInstance(
                Math.toRadians(28),
                bounds579.getCenterX(), bounds579.getCenterY()
        );
        Shape rotated579 = rotation579.createTransformedShape(line579);
        g2d.setColor(new Color(118, 95, 91));
        BasicStroke bs579 = new BasicStroke(
                3.19f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs579);
        g2d.draw(rotated579);

    }

    public static void drawDetails44(Graphics2D g2d) {

        // Area / transformation
        GeneralPath boundary580_1 = new GeneralPath();
        boundary580_1.moveTo(356.35, 134.09);
        boundary580_1.lineTo(351.35, 137.09);
        boundary580_1.lineTo(356.35, 140.09);
        boundary580_1.lineTo(349.35, 148.09);
        boundary580_1.lineTo(348.35, 150.09);
        boundary580_1.lineTo(350.35, 154.09);
        boundary580_1.lineTo(348.35, 160.09);
        boundary580_1.lineTo(343.35, 170.09);
        boundary580_1.lineTo(350.35, 170.09);
        boundary580_1.lineTo(345.35, 177.09);
        boundary580_1.lineTo(351.35, 170.09);
        boundary580_1.lineTo(357.35, 166.09);
        boundary580_1.lineTo(367.35, 155.09);
        boundary580_1.lineTo(353.35, 164.09);
        boundary580_1.lineTo(355.35, 157.09);
        boundary580_1.lineTo(361.35, 150.09);
        boundary580_1.lineTo(355.35, 145.09);
        boundary580_1.lineTo(361.35, 138.09);
        boundary580_1.closePath();
        Area area580 = new Area(boundary580_1);
        GeneralPath boundary580_2 = new GeneralPath();
        boundary580_2.moveTo(349.35, 156.09);
        boundary580_2.lineTo(352.35, 155.09);
        boundary580_2.lineTo(353.35, 158.09);
        boundary580_2.lineTo(351.35, 160.09);
        boundary580_2.lineTo(349.35, 158.09);
        boundary580_2.closePath();
        area580.subtract(new Area(boundary580_2));
        g2d.setColor(new Color(11, 27, 72));
        g2d.fill(area580);

        // Rectangle
        Rectangle2D.Double rectangle581 = new Rectangle2D.Double(
                98.22, 336.01,
                28.48, 20.23
        );
        g2d.setColor(new Color(9, 15, 46));
        g2d.fill(rectangle581);

        // Ellipse
        Ellipse2D.Double ellipse582 = new Ellipse2D.Double(
                148.16, 243.77,
                7.19, 15.09
        );
        Rectangle2D bounds582 = ellipse582.getBounds2D();
        AffineTransform rotation582 = AffineTransform.getRotateInstance(
                Math.toRadians(162.47),
                bounds582.getCenterX(), bounds582.getCenterY()
        );
        Shape rotated582 = rotation582.createTransformedShape(ellipse582);
        g2d.setColor(new Color(79, 71, 152));
        g2d.fill(rotated582);

        // Circle
        Ellipse2D.Double circle583 = new Ellipse2D.Double(
                390.06, 264.61,
                20.98, 20.98
        );
        Rectangle2D bounds583 = circle583.getBounds2D();
        AffineTransform rotation583 = AffineTransform.getRotateInstance(
                Math.toRadians(23),
                bounds583.getCenterX(), bounds583.getCenterY()
        );
        Shape rotated583 = rotation583.createTransformedShape(circle583);
        g2d.setColor(new Color(185, 247, 254));
        g2d.fill(rotated583);

        // Rectangle
        Rectangle2D.Double rectangle584 = new Rectangle2D.Double(
                448.31, 202.09,
                6.21, 15.52
        );
        Rectangle2D bounds584 = rectangle584.getBounds2D();
        AffineTransform rotation584 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds584.getCenterX(), bounds584.getCenterY()
        );
        Shape rotated584 = rotation584.createTransformedShape(rectangle584);
        g2d.setColor(new Color(14, 36, 100));
        g2d.fill(rotated584);

        // Square
        Rectangle2D.Double square585 = new Rectangle2D.Double(
                331.67, 215.08,
                12.22, 12.22
        );
        g2d.setColor(new Color(31, 55, 153));
        g2d.fill(square585);

        // Ellipse
        Ellipse2D.Double ellipse586 = new Ellipse2D.Double(
                192.89, 418.61,
                22.92, 14.95
        );
        Rectangle2D bounds586 = ellipse586.getBounds2D();
        AffineTransform rotation586 = AffineTransform.getRotateInstance(
                Math.toRadians(153),
                bounds586.getCenterX(), bounds586.getCenterY()
        );
        Shape rotated586 = rotation586.createTransformedShape(ellipse586);
        g2d.setColor(new Color(7, 23, 77));
        g2d.fill(rotated586);

        // Ellipse
        Ellipse2D.Double ellipse587 = new Ellipse2D.Double(
                415.91, 314.56,
                4.24, 16.34
        );
        Rectangle2D bounds587 = ellipse587.getBounds2D();
        AffineTransform rotation587 = AffineTransform.getRotateInstance(
                Math.toRadians(23.73),
                bounds587.getCenterX(), bounds587.getCenterY()
        );
        Shape rotated587 = rotation587.createTransformedShape(ellipse587);
        g2d.setColor(new Color(93, 92, 140));
        g2d.fill(rotated587);

        // Area / transformation
        Ellipse2D.Double outer588 = new Ellipse2D.Double(
                442.58, 194.13,
                10.5, 11.73
        );
        Ellipse2D.Double cutout588 = new Ellipse2D.Double(
                442.58 + 10.5 * 0.28,
                194.13 - 11.73 * 0.12,
                10.5, 11.73
        );
        Area area588 = new Area(outer588);
        area588.subtract(new Area(cutout588));
        Rectangle2D bounds588 = area588.getBounds2D();
        AffineTransform rotation588 = AffineTransform.getRotateInstance(
                Math.toRadians(101),
                bounds588.getCenterX(), bounds588.getCenterY()
        );
        Shape rotated588 = rotation588.createTransformedShape(area588);
        g2d.setColor(new Color(155, 214, 255));
        g2d.fill(rotated588);

        // Circle
        Ellipse2D.Double circle589 = new Ellipse2D.Double(
                151.11, 336.13,
                10.58, 10.58
        );
        Rectangle2D bounds589 = circle589.getBounds2D();
        AffineTransform rotation589 = AffineTransform.getRotateInstance(
                Math.toRadians(220),
                bounds589.getCenterX(), bounds589.getCenterY()
        );
        Shape rotated589 = rotation589.createTransformedShape(circle589);
        g2d.setColor(new Color(16, 30, 68));
        g2d.fill(rotated589);

        // Area / transformation
        Ellipse2D.Double outer590 = new Ellipse2D.Double(
                376.24, 192.48,
                12.73, 15.04
        );
        Ellipse2D.Double cutout590 = new Ellipse2D.Double(
                376.24 + 12.73 * 0.28,
                192.48 - 15.04 * 0.12,
                12.73, 15.04
        );
        Area area590 = new Area(outer590);
        area590.subtract(new Area(cutout590));
        Rectangle2D bounds590 = area590.getBounds2D();
        AffineTransform rotation590 = AffineTransform.getRotateInstance(
                Math.toRadians(181),
                bounds590.getCenterX(), bounds590.getCenterY()
        );
        Shape rotated590 = rotation590.createTransformedShape(area590);
        g2d.setColor(new Color(95, 112, 171));
        g2d.fill(rotated590);

    }

    public static void drawDetails45(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle591 = new Rectangle2D.Double(
                323.08, 330.6,
                21.55, 16.58
        );
        g2d.setColor(new Color(28, 28, 41));
        g2d.fill(rectangle591);

        // Rectangle
        Rectangle2D.Double rectangle592 = new Rectangle2D.Double(
                111.37, 190.52,
                7.94, 28.15
        );
        Rectangle2D bounds592 = rectangle592.getBounds2D();
        AffineTransform rotation592 = AffineTransform.getRotateInstance(
                Math.toRadians(-45),
                bounds592.getCenterX(), bounds592.getCenterY()
        );
        Shape rotated592 = rotation592.createTransformedShape(rectangle592);
        g2d.setColor(new Color(11, 7, 57));
        g2d.fill(rotated592);

        // General path
        GeneralPath gp593 = new GeneralPath();
        gp593.moveTo(302.79, 234.96);
        gp593.lineTo(296.79, 237.96);
        gp593.lineTo(290.79, 239.96);
        gp593.lineTo(284.79, 240.96);
        gp593.lineTo(282.79, 246.96);
        gp593.lineTo(279.79, 249.96);
        gp593.lineTo(279.79, 251.96);
        gp593.lineTo(283.79, 253.96);
        gp593.lineTo(283.79, 256.96);
        gp593.lineTo(288.79, 258.96);
        gp593.lineTo(298.79, 258.96);
        gp593.lineTo(296.79, 263.96);
        gp593.lineTo(300.79, 263.96);
        gp593.lineTo(303.79, 260.96);
        gp593.lineTo(307.79, 252.96);
        gp593.lineTo(302.79, 250.96);
        gp593.lineTo(301.79, 243.96);
        gp593.lineTo(297.79, 240.96);
        gp593.closePath();
        g2d.setColor(new Color(1, 11, 42));
        g2d.fill(gp593);

        // Rectangle
        Rectangle2D.Double rectangle594 = new Rectangle2D.Double(
                364.85, 219.97,
                16.4, 5.93
        );
        Rectangle2D bounds594 = rectangle594.getBounds2D();
        AffineTransform rotation594 = AffineTransform.getRotateInstance(
                Math.toRadians(-51.34),
                bounds594.getCenterX(), bounds594.getCenterY()
        );
        Shape rotated594 = rotation594.createTransformedShape(rectangle594);
        g2d.setColor(new Color(142, 174, 249));
        g2d.fill(rotated594);

        // Square
        Rectangle2D.Double square595 = new Rectangle2D.Double(
                395.35, 205.94,
                9.29, 9.29
        );
        g2d.setColor(new Color(79, 103, 193));
        g2d.fill(square595);

        // Ellipse
        Ellipse2D.Double ellipse596 = new Ellipse2D.Double(
                330.67, 194.83,
                3.53, 13.96
        );
        Rectangle2D bounds596 = ellipse596.getBounds2D();
        AffineTransform rotation596 = AffineTransform.getRotateInstance(
                Math.toRadians(98.7),
                bounds596.getCenterX(), bounds596.getCenterY()
        );
        Shape rotated596 = rotation596.createTransformedShape(ellipse596);
        g2d.setColor(new Color(0, 15, 63));
        g2d.fill(rotated596);

        // Arc
        Arc2D.Double arc597 = new Arc2D.Double(
                233.18, 389.64,
                29.42, 34.18,
                0, 137, Arc2D.OPEN
        );
        Rectangle2D bounds597 = arc597.getBounds2D();
        AffineTransform rotation597 = AffineTransform.getRotateInstance(
                Math.toRadians(134),
                bounds597.getCenterX(), bounds597.getCenterY()
        );
        Shape rotated597 = rotation597.createTransformedShape(arc597);
        g2d.setColor(new Color(2, 27, 84));
        BasicStroke bs597 = new BasicStroke(
                6.69f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs597);
        g2d.draw(rotated597);

        // General path
        GeneralPath gp598 = new GeneralPath();
        gp598.moveTo(363, 198);
        gp598.lineTo(359, 199);
        gp598.lineTo(356, 203);
        gp598.lineTo(356, 209);
        gp598.lineTo(357, 211);
        gp598.lineTo(360, 212);
        gp598.lineTo(364, 208);
        gp598.lineTo(363, 206);
        gp598.closePath();
        g2d.setColor(new Color(239, 235, 255));
        g2d.fill(gp598);

        // Circle
        Ellipse2D.Double circle599 = new Ellipse2D.Double(
                204.19, 261.71,
                31.91, 31.91
        );
        g2d.setColor(new Color(15, 33, 79));
        g2d.fill(circle599);

        // Square
        Rectangle2D.Double square600 = new Rectangle2D.Double(
                548.68, 281.97,
                13.2, 13.2
        );
        g2d.setColor(new Color(51, 98, 175));
        g2d.fill(square600);

        // Circle
        Ellipse2D.Double circle601 = new Ellipse2D.Double(
                392.67, 197.27,
                7.6, 7.6
        );
        g2d.setColor(new Color(100, 130, 192));
        g2d.fill(circle601);

        // Quadratic curve
        QuadCurve2D.Double qc602 = new QuadCurve2D.Double(
                127.9, 282.61,
                139.13, 272.05,
                150.36, 282.61
        );
        Rectangle2D bounds602 = qc602.getBounds2D();
        AffineTransform rotation602 = AffineTransform.getRotateInstance(
                Math.toRadians(58),
                bounds602.getCenterX(), bounds602.getCenterY()
        );
        Shape rotated602 = rotation602.createTransformedShape(qc602);
        g2d.setColor(new Color(92, 99, 146));
        BasicStroke bs602 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs602);
        g2d.draw(rotated602);

        // Arc
        Arc2D.Double arc603 = new Arc2D.Double(
                250.55, 254.42,
                12.81, 16.83,
                0, 258, Arc2D.PIE
        );
        Rectangle2D bounds603 = arc603.getBounds2D();
        AffineTransform rotation603 = AffineTransform.getRotateInstance(
                Math.toRadians(10),
                bounds603.getCenterX(), bounds603.getCenterY()
        );
        Shape rotated603 = rotation603.createTransformedShape(arc603);
        g2d.setColor(new Color(20, 49, 101));
        g2d.fill(rotated603);

    }

    public static void drawDetails46(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle604 = new Rectangle2D.Double(
                189.49, 388.61,
                20.57, 13.15
        );
        g2d.setColor(new Color(18, 41, 103));
        g2d.fill(rectangle604);

        // Rectangle
        Rectangle2D.Double rectangle605 = new Rectangle2D.Double(
                420.01, 394.47,
                47.04, 5.32
        );
        Rectangle2D bounds605 = rectangle605.getBounds2D();
        AffineTransform rotation605 = AffineTransform.getRotateInstance(
                Math.toRadians(-1.55),
                bounds605.getCenterX(), bounds605.getCenterY()
        );
        Shape rotated605 = rotation605.createTransformedShape(rectangle605);
        g2d.setColor(new Color(34, 30, 108));
        g2d.fill(rotated605);

        // Square
        Rectangle2D.Double square606 = new Rectangle2D.Double(
                74.4, 353.85,
                18.28, 18.28
        );
        g2d.setColor(new Color(7, 10, 41));
        g2d.fill(square606);

        // Arc
        Arc2D.Double arc607 = new Arc2D.Double(
                474.42, 255.43,
                10.31, 6.72,
                0, 152, Arc2D.OPEN
        );
        Rectangle2D bounds607 = arc607.getBounds2D();
        AffineTransform rotation607 = AffineTransform.getRotateInstance(
                Math.toRadians(251),
                bounds607.getCenterX(), bounds607.getCenterY()
        );
        Shape rotated607 = rotation607.createTransformedShape(arc607);
        g2d.setColor(new Color(0, 6, 35));
        BasicStroke bs607 = new BasicStroke(
                2.83f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs607);
        g2d.draw(rotated607);

        // Rectangle
        Rectangle2D.Double rectangle608 = new Rectangle2D.Double(
                186.81, 347.89,
                8.99, 8.57
        );
        g2d.setColor(new Color(9, 28, 71));
        g2d.fill(rectangle608);

        // General path
        GeneralPath gp609 = new GeneralPath();
        gp609.moveTo(65.05, 226.44);
        gp609.lineTo(64.05, 231.44);
        gp609.lineTo(66.05, 236.44);
        gp609.lineTo(69.05, 241.44);
        gp609.lineTo(72.05, 245.44);
        gp609.lineTo(74.05, 245.44);
        gp609.lineTo(77.05, 250.44);
        gp609.lineTo(81.05, 256.44);
        gp609.lineTo(85.05, 262.44);
        gp609.lineTo(98.05, 274.44);
        gp609.lineTo(97.05, 265.44);
        gp609.lineTo(96.05, 255.44);
        gp609.lineTo(94.05, 258.44);
        gp609.lineTo(83.05, 238.44);
        gp609.lineTo(82.05, 234.44);
        gp609.lineTo(78.05, 233.44);
        gp609.lineTo(77.05, 230.44);
        gp609.lineTo(75.05, 230.44);
        gp609.closePath();
        g2d.setColor(new Color(30, 26, 50));
        g2d.fill(gp609);

        // Rectangle
        Rectangle2D.Double rectangle610 = new Rectangle2D.Double(
                504.82, 38.7,
                74.87, 38.9
        );
        g2d.setColor(new Color(7, 19, 64));
        g2d.fill(rectangle610);

        // Rectangle
        Rectangle2D.Double rectangle611 = new Rectangle2D.Double(
                682.57, 242.23,
                4.85, 17.72
        );
        Rectangle2D bounds611 = rectangle611.getBounds2D();
        AffineTransform rotation611 = AffineTransform.getRotateInstance(
                Math.toRadians(-75.96),
                bounds611.getCenterX(), bounds611.getCenterY()
        );
        Shape rotated611 = rotation611.createTransformedShape(rectangle611);
        g2d.setColor(new Color(87, 98, 122));
        g2d.fill(rotated611);

        // Area / transformation
        GeneralPath boundary612_1 = new GeneralPath();
        boundary612_1.moveTo(464.04, 271.8);
        boundary612_1.lineTo(474.04, 281.8);
        boundary612_1.lineTo(476.04, 282.8);
        boundary612_1.lineTo(482.04, 287.8);
        boundary612_1.lineTo(490.04, 292.8);
        boundary612_1.lineTo(496.04, 296.8);
        boundary612_1.lineTo(503.04, 298.8);
        boundary612_1.lineTo(505.04, 301.8);
        boundary612_1.lineTo(509.04, 305.8);
        boundary612_1.lineTo(511.04, 300.8);
        boundary612_1.lineTo(519.04, 304.8);
        boundary612_1.lineTo(513.04, 300.8);
        boundary612_1.lineTo(505.04, 297.8);
        boundary612_1.lineTo(503.04, 297.8);
        boundary612_1.lineTo(497.04, 291.8);
        boundary612_1.lineTo(507.04, 288.8);
        boundary612_1.lineTo(496.04, 287.8);
        boundary612_1.lineTo(473.04, 277.8);
        boundary612_1.closePath();
        Area area612 = new Area(boundary612_1);
        GeneralPath boundary612_2 = new GeneralPath();
        boundary612_2.moveTo(495.04, 293.8);
        boundary612_2.lineTo(498.04, 292.8);
        boundary612_2.lineTo(500.04, 295.8);
        boundary612_2.lineTo(499.04, 296.8);
        boundary612_2.lineTo(496.04, 295.8);
        boundary612_2.closePath();
        area612.subtract(new Area(boundary612_2));
        GeneralPath boundary612_3 = new GeneralPath();
        boundary612_3.moveTo(491.04, 291.8);
        boundary612_3.lineTo(493.04, 287.8);
        boundary612_3.lineTo(494.04, 289.8);
        boundary612_3.lineTo(496.04, 290.8);
        boundary612_3.lineTo(493.04, 292.8);
        boundary612_3.closePath();
        area612.subtract(new Area(boundary612_3));
        g2d.setColor(new Color(0, 1, 40));
        g2d.fill(area612);

        // Square
        Rectangle2D.Double square613 = new Rectangle2D.Double(
                546.04, 335.7,
                12.26, 12.26
        );
        g2d.setColor(new Color(0, 24, 89));
        g2d.fill(square613);

        // Ellipse
        Ellipse2D.Double ellipse614 = new Ellipse2D.Double(
                291.09, 294.05,
                12.66, 25.88
        );
        Rectangle2D bounds614 = ellipse614.getBounds2D();
        AffineTransform rotation614 = AffineTransform.getRotateInstance(
                Math.toRadians(27),
                bounds614.getCenterX(), bounds614.getCenterY()
        );
        Shape rotated614 = rotation614.createTransformedShape(ellipse614);
        g2d.setColor(new Color(58, 111, 189));
        g2d.fill(rotated614);

        // Rectangle
        Rectangle2D.Double rectangle615 = new Rectangle2D.Double(
                263.9, 294.85,
                24.21, 19.65
        );
        g2d.setColor(new Color(11, 40, 91));
        g2d.fill(rectangle615);

    }

    public static void drawDetails47(Graphics2D g2d) {

        // Circle
        Ellipse2D.Double circle616 = new Ellipse2D.Double(
                702.71, 35.84,
                8.98, 8.98
        );
        g2d.setColor(new Color(41, 96, 138));
        g2d.fill(circle616);

        // Ellipse
        Ellipse2D.Double ellipse617 = new Ellipse2D.Double(
                690.7, 93.31,
                34.61, 72.41
        );
        Rectangle2D bounds617 = ellipse617.getBounds2D();
        AffineTransform rotation617 = AffineTransform.getRotateInstance(
                Math.toRadians(166.21),
                bounds617.getCenterX(), bounds617.getCenterY()
        );
        Shape rotated617 = rotation617.createTransformedShape(ellipse617);
        g2d.setColor(new Color(32, 31, 72));
        g2d.fill(rotated617);

        // Square
        Rectangle2D.Double square618 = new Rectangle2D.Double(
                348.51, 437.08,
                22.36, 22.36
        );
        g2d.setColor(new Color(5, 6, 18));
        g2d.fill(square618);

        // Cubic curve
        CubicCurve2D.Double cc619 = new CubicCurve2D.Double(
                454.41, 360.87,
                460.89, 349.4,
                469.54, 372.33,
                476.03, 360.87
        );
        Rectangle2D bounds619 = cc619.getBounds2D();
        AffineTransform rotation619 = AffineTransform.getRotateInstance(
                Math.toRadians(24),
                bounds619.getCenterX(), bounds619.getCenterY()
        );
        Shape rotated619 = rotation619.createTransformedShape(cc619);
        g2d.setColor(new Color(140, 115, 96));
        BasicStroke bs619 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs619);
        g2d.draw(rotated619);

        // Rectangle
        Rectangle2D.Double rectangle620 = new Rectangle2D.Double(
                594.7, 103.48,
                5.63, 16.19
        );
        Rectangle2D bounds620 = rectangle620.getBounds2D();
        AffineTransform rotation620 = AffineTransform.getRotateInstance(
                Math.toRadians(-45),
                bounds620.getCenterX(), bounds620.getCenterY()
        );
        Shape rotated620 = rotation620.createTransformedShape(rectangle620);
        g2d.setColor(new Color(25, 37, 88));
        g2d.fill(rotated620);

        // Circle
        Ellipse2D.Double circle621 = new Ellipse2D.Double(
                300.73, 265.33,
                11.01, 11.01
        );
        g2d.setColor(new Color(86, 122, 206));
        g2d.fill(circle621);

        // Area / transformation
        GeneralPath boundary622_1 = new GeneralPath();
        boundary622_1.moveTo(295, 381);
        boundary622_1.lineTo(302, 379);
        boundary622_1.lineTo(311, 378);
        boundary622_1.lineTo(321, 381);
        boundary622_1.lineTo(342, 387);
        boundary622_1.lineTo(357, 391);
        boundary622_1.lineTo(355, 390);
        boundary622_1.lineTo(345, 385);
        boundary622_1.lineTo(334, 383);
        boundary622_1.lineTo(317, 377);
        boundary622_1.lineTo(319, 375);
        boundary622_1.lineTo(330, 373);
        boundary622_1.lineTo(330, 372);
        boundary622_1.lineTo(320, 368);
        boundary622_1.lineTo(312, 370);
        boundary622_1.lineTo(305, 366);
        boundary622_1.lineTo(305, 362);
        boundary622_1.lineTo(302, 375);
        boundary622_1.closePath();
        Area area622 = new Area(boundary622_1);
        GeneralPath boundary622_2 = new GeneralPath();
        boundary622_2.moveTo(308, 373);
        boundary622_2.lineTo(309, 372);
        boundary622_2.lineTo(312, 373);
        boundary622_2.lineTo(311, 374);
        boundary622_2.closePath();
        area622.subtract(new Area(boundary622_2));
        GeneralPath boundary622_3 = new GeneralPath();
        boundary622_3.moveTo(312, 373);
        boundary622_3.lineTo(314, 371);
        boundary622_3.lineTo(316, 372);
        boundary622_3.lineTo(315, 374);
        boundary622_3.closePath();
        area622.subtract(new Area(boundary622_3));
        g2d.setColor(new Color(27, 14, 155));
        g2d.fill(area622);

        // General path
        GeneralPath gp623 = new GeneralPath();
        gp623.moveTo(638, 109);
        gp623.lineTo(640, 112);
        gp623.lineTo(639, 113);
        gp623.lineTo(645, 118);
        gp623.lineTo(650, 124);
        gp623.lineTo(652, 124);
        gp623.lineTo(658, 125);
        gp623.lineTo(655, 127);
        gp623.lineTo(655, 130);
        gp623.lineTo(670, 148);
        gp623.lineTo(677, 155);
        gp623.lineTo(678, 156);
        gp623.lineTo(681, 150);
        gp623.lineTo(682, 149);
        gp623.lineTo(677, 145);
        gp623.lineTo(672, 138);
        gp623.lineTo(658, 122);
        gp623.lineTo(648, 115);
        gp623.closePath();
        g2d.setColor(new Color(66, 77, 148));
        g2d.fill(gp623);

        // Square
        Rectangle2D.Double square624 = new Rectangle2D.Double(
                409.74, 293.33,
                14.89, 14.89
        );
        g2d.setColor(new Color(62, 78, 170));
        g2d.fill(square624);

        // Ellipse
        Ellipse2D.Double ellipse625 = new Ellipse2D.Double(
                601.7, 294.91,
                9.57, 32.57
        );
        Rectangle2D bounds625 = ellipse625.getBounds2D();
        AffineTransform rotation625 = AffineTransform.getRotateInstance(
                Math.toRadians(31.61),
                bounds625.getCenterX(), bounds625.getCenterY()
        );
        Shape rotated625 = rotation625.createTransformedShape(ellipse625);
        g2d.setColor(new Color(83, 117, 197));
        g2d.fill(rotated625);

        // Square
        Rectangle2D.Double square626 = new Rectangle2D.Double(
                481.22, 84.41,
                27.63, 27.63
        );
        g2d.setColor(new Color(20, 33, 137));
        g2d.fill(square626);

        // Rectangle
        Rectangle2D.Double rectangle627 = new Rectangle2D.Double(
                252.76, 321.16,
                15.58, 11.56
        );
        g2d.setColor(new Color(34, 80, 162));
        g2d.fill(rectangle627);

    }

    public static void drawDetails48(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle628 = new Rectangle2D.Double(
                421.14, 88.27,
                34.53, 3.68
        );
        Rectangle2D bounds628 = rectangle628.getBounds2D();
        AffineTransform rotation628 = AffineTransform.getRotateInstance(
                Math.toRadians(-23.2),
                bounds628.getCenterX(), bounds628.getCenterY()
        );
        Shape rotated628 = rotation628.createTransformedShape(rectangle628);
        g2d.setColor(new Color(6, 10, 24));
        g2d.fill(rotated628);

        // General path
        GeneralPath gp629 = new GeneralPath();
        gp629.moveTo(544, 333);
        gp629.lineTo(541, 330);
        gp629.lineTo(535, 339);
        gp629.lineTo(530, 344);
        gp629.lineTo(535, 340);
        gp629.lineTo(539, 339);
        gp629.closePath();
        g2d.setColor(new Color(166, 183, 246));
        g2d.fill(gp629);

        // Area / transformation
        GeneralPath boundary630_1 = new GeneralPath();
        boundary630_1.moveTo(503.01, 180.6);
        boundary630_1.lineTo(501.01, 180.6);
        boundary630_1.lineTo(498.01, 185.6);
        boundary630_1.lineTo(491.01, 185.6);
        boundary630_1.lineTo(484.01, 186.6);
        boundary630_1.lineTo(479.01, 184.6);
        boundary630_1.lineTo(464.01, 185.6);
        boundary630_1.lineTo(459.01, 186.6);
        boundary630_1.lineTo(469.01, 195.6);
        boundary630_1.lineTo(476.01, 199.6);
        boundary630_1.lineTo(486.01, 201.6);
        boundary630_1.lineTo(487.01, 205.6);
        boundary630_1.lineTo(492.01, 205.6);
        boundary630_1.lineTo(494.01, 204.6);
        boundary630_1.lineTo(490.01, 200.6);
        boundary630_1.lineTo(486.01, 195.6);
        boundary630_1.lineTo(490.01, 192.6);
        boundary630_1.lineTo(499.01, 186.6);
        boundary630_1.closePath();
        Area area630 = new Area(boundary630_1);
        GeneralPath boundary630_2 = new GeneralPath();
        boundary630_2.moveTo(473.01, 191.6);
        boundary630_2.lineTo(475.01, 189.6);
        boundary630_2.lineTo(477.01, 190.6);
        boundary630_2.lineTo(476.01, 192.6);
        boundary630_2.closePath();
        area630.subtract(new Area(boundary630_2));
        g2d.setColor(new Color(77, 142, 225));
        g2d.fill(area630);

        // General path
        GeneralPath gp631 = new GeneralPath();
        gp631.moveTo(357, 323);
        gp631.lineTo(360, 327);
        gp631.lineTo(356, 328);
        gp631.lineTo(364, 334);
        gp631.lineTo(377, 348);
        gp631.lineTo(371, 353);
        gp631.lineTo(373, 354);
        gp631.lineTo(378, 349);
        gp631.lineTo(391, 349);
        gp631.lineTo(400, 341);
        gp631.lineTo(404, 340);
        gp631.lineTo(400, 334);
        gp631.lineTo(396, 335);
        gp631.lineTo(390, 337);
        gp631.lineTo(384, 335);
        gp631.lineTo(372, 335);
        gp631.lineTo(365, 330);
        gp631.lineTo(362, 328);
        gp631.closePath();
        g2d.setColor(new Color(139, 129, 191));
        g2d.fill(gp631);

        // Area / transformation
        GeneralPath boundary632_1 = new GeneralPath();
        boundary632_1.moveTo(514, 368);
        boundary632_1.lineTo(514, 383);
        boundary632_1.lineTo(514, 388);
        boundary632_1.lineTo(512, 388);
        boundary632_1.lineTo(516, 393);
        boundary632_1.lineTo(514, 395);
        boundary632_1.lineTo(510, 393);
        boundary632_1.lineTo(509, 396);
        boundary632_1.lineTo(508, 401);
        boundary632_1.lineTo(506, 403);
        boundary632_1.lineTo(508, 404);
        boundary632_1.lineTo(512, 406);
        boundary632_1.lineTo(518, 398);
        boundary632_1.lineTo(519, 395);
        boundary632_1.lineTo(519, 392);
        boundary632_1.lineTo(520, 382);
        boundary632_1.lineTo(520, 377);
        boundary632_1.lineTo(519, 374);
        boundary632_1.closePath();
        Area area632 = new Area(boundary632_1);
        GeneralPath boundary632_2 = new GeneralPath();
        boundary632_2.moveTo(511, 396);
        boundary632_2.lineTo(513, 395);
        boundary632_2.lineTo(514, 397);
        boundary632_2.lineTo(512, 398);
        boundary632_2.closePath();
        area632.subtract(new Area(boundary632_2));
        GeneralPath boundary632_3 = new GeneralPath();
        boundary632_3.moveTo(519, 376);
        boundary632_3.lineTo(520, 377);
        boundary632_3.lineTo(519, 380);
        boundary632_3.lineTo(518, 379);
        boundary632_3.closePath();
        area632.subtract(new Area(boundary632_3));
        g2d.setColor(new Color(32, 105, 212));
        g2d.fill(area632);

        // Rectangle
        Rectangle2D.Double rectangle633 = new Rectangle2D.Double(
                303.48, 288.31,
                10.44, 5.98
        );
        g2d.setColor(new Color(131, 160, 202));
        g2d.fill(rectangle633);

        // Square
        Rectangle2D.Double square634 = new Rectangle2D.Double(
                287.03, 381.81,
                5.71, 5.71
        );
        Rectangle2D bounds634 = square634.getBounds2D();
        AffineTransform rotation634 = AffineTransform.getRotateInstance(
                Math.toRadians(-63.44),
                bounds634.getCenterX(), bounds634.getCenterY()
        );
        Shape rotated634 = rotation634.createTransformedShape(square634);
        g2d.setColor(new Color(61, 157, 242));
        g2d.fill(rotated634);

        // Circle
        Ellipse2D.Double circle635 = new Ellipse2D.Double(
                655.35, 207.79,
                27.21, 27.21
        );
        g2d.setColor(new Color(3, 12, 51));
        g2d.fill(circle635);

        // Square
        Rectangle2D.Double square636 = new Rectangle2D.Double(
                535.96, 350.5,
                25.62, 25.62
        );
        g2d.setColor(new Color(11, 72, 171));
        g2d.fill(square636);

        // Arc
        Arc2D.Double arc637 = new Arc2D.Double(
                610.31, 200.58,
                27.87, 25.3,
                0, 137, Arc2D.OPEN
        );
        Rectangle2D bounds637 = arc637.getBounds2D();
        AffineTransform rotation637 = AffineTransform.getRotateInstance(
                Math.toRadians(309),
                bounds637.getCenterX(), bounds637.getCenterY()
        );
        Shape rotated637 = rotation637.createTransformedShape(arc637);
        g2d.setColor(new Color(42, 52, 84));
        BasicStroke bs637 = new BasicStroke(
                6.48f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs637);
        g2d.draw(rotated637);

    }

    public static void drawDetails49(Graphics2D g2d) {

        // Area / transformation
        GeneralPath boundary638_1 = new GeneralPath();
        boundary638_1.moveTo(160.63, 260.29);
        boundary638_1.lineTo(162.63, 269.29);
        boundary638_1.lineTo(166.63, 282.29);
        boundary638_1.lineTo(176.63, 276.29);
        boundary638_1.lineTo(176.63, 288.29);
        boundary638_1.lineTo(176.63, 302.29);
        boundary638_1.lineTo(177.63, 295.29);
        boundary638_1.lineTo(179.63, 296.29);
        boundary638_1.lineTo(181.63, 307.29);
        boundary638_1.lineTo(185.63, 316.29);
        boundary638_1.lineTo(192.63, 320.29);
        boundary638_1.lineTo(181.63, 321.29);
        boundary638_1.lineTo(192.63, 322.29);
        boundary638_1.lineTo(197.63, 318.29);
        boundary638_1.lineTo(207.63, 308.29);
        boundary638_1.lineTo(207.63, 308.29);
        boundary638_1.lineTo(183.63, 281.29);
        boundary638_1.lineTo(173.63, 266.29);
        boundary638_1.closePath();
        Area area638 = new Area(boundary638_1);
        GeneralPath boundary638_2 = new GeneralPath();
        boundary638_2.moveTo(190.63, 309.29);
        boundary638_2.lineTo(191.63, 310.29);
        boundary638_2.lineTo(190.63, 313.29);
        boundary638_2.lineTo(188.63, 311.29);
        boundary638_2.closePath();
        area638.subtract(new Area(boundary638_2));
        GeneralPath boundary638_3 = new GeneralPath();
        boundary638_3.moveTo(175.63, 291.29);
        boundary638_3.lineTo(177.63, 290.29);
        boundary638_3.lineTo(178.63, 292.29);
        boundary638_3.lineTo(177.63, 293.29);
        boundary638_3.closePath();
        area638.subtract(new Area(boundary638_3));
        g2d.setColor(new Color(108, 112, 193));
        g2d.fill(area638);

        // Ellipse
        Ellipse2D.Double ellipse639 = new Ellipse2D.Double(
                300.1, 350.54,
                3.78, 16.79
        );
        Rectangle2D bounds639 = ellipse639.getBounds2D();
        AffineTransform rotation639 = AffineTransform.getRotateInstance(
                Math.toRadians(25.4),
                bounds639.getCenterX(), bounds639.getCenterY()
        );
        Shape rotated639 = rotation639.createTransformedShape(ellipse639);
        g2d.setColor(new Color(63, 145, 214));
        g2d.fill(rotated639);

        // General path
        GeneralPath gp640 = new GeneralPath();
        gp640.moveTo(254.12, 358.04);
        gp640.lineTo(267.33, 344.96);
        gp640.lineTo(280.55, 356.4);
        gp640.lineTo(267.33, 361.31);
        gp640.closePath();
        Rectangle2D bounds640 = gp640.getBounds2D();
        AffineTransform rotation640 = AffineTransform.getRotateInstance(
                Math.toRadians(167),
                bounds640.getCenterX(), bounds640.getCenterY()
        );
        Shape rotated640 = rotation640.createTransformedShape(gp640);
        g2d.setColor(new Color(45, 89, 199));
        g2d.fill(rotated640);

        // Arc
        Arc2D.Double arc641 = new Arc2D.Double(
                415.45, 217.67,
                29.97, 16.84,
                0, 245, Arc2D.PIE
        );
        Rectangle2D bounds641 = arc641.getBounds2D();
        AffineTransform rotation641 = AffineTransform.getRotateInstance(
                Math.toRadians(225),
                bounds641.getCenterX(), bounds641.getCenterY()
        );
        Shape rotated641 = rotation641.createTransformedShape(arc641);
        g2d.setColor(new Color(65, 93, 200));
        g2d.fill(rotated641);

        // Rectangle
        Rectangle2D.Double rectangle642 = new Rectangle2D.Double(
                458.98, 300.54,
                18.78, 17.39
        );
        g2d.setColor(new Color(0, 16, 60));
        g2d.fill(rectangle642);

        // Rectangle
        Rectangle2D.Double rectangle643 = new Rectangle2D.Double(
                308.66, 169.69,
                8.77, 8.45
        );
        g2d.setColor(new Color(54, 86, 139));
        g2d.fill(rectangle643);

        // Arc
        Arc2D.Double arc644 = new Arc2D.Double(
                636.48, 244,
                14, 7.65,
                0, 214, Arc2D.PIE
        );
        Rectangle2D bounds644 = arc644.getBounds2D();
        AffineTransform rotation644 = AffineTransform.getRotateInstance(
                Math.toRadians(134),
                bounds644.getCenterX(), bounds644.getCenterY()
        );
        Shape rotated644 = rotation644.createTransformedShape(arc644);
        g2d.setColor(new Color(125, 143, 153));
        g2d.fill(rotated644);

        // Square
        Rectangle2D.Double square645 = new Rectangle2D.Double(
                223.96, 318.79,
                11.84, 11.84
        );
        g2d.setColor(new Color(0, 11, 66));
        g2d.fill(square645);

        // Ellipse
        Ellipse2D.Double ellipse646 = new Ellipse2D.Double(
                377.48, 164.99,
                10.88, 16.86
        );
        Rectangle2D bounds646 = ellipse646.getBounds2D();
        AffineTransform rotation646 = AffineTransform.getRotateInstance(
                Math.toRadians(104.47),
                bounds646.getCenterX(), bounds646.getCenterY()
        );
        Shape rotated646 = rotation646.createTransformedShape(ellipse646);
        g2d.setColor(new Color(178, 182, 238));
        g2d.fill(rotated646);

        // Line
        Line2D.Double line647 = new Line2D.Double(
                306.81, 183.58,
                325.83, 183.58
        );
        Rectangle2D bounds647 = line647.getBounds2D();
        AffineTransform rotation647 = AffineTransform.getRotateInstance(
                Math.toRadians(355),
                bounds647.getCenterX(), bounds647.getCenterY()
        );
        Shape rotated647 = rotation647.createTransformedShape(line647);
        g2d.setColor(new Color(69, 108, 188));
        BasicStroke bs647 = new BasicStroke(
                3.19f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs647);
        g2d.draw(rotated647);

        // General path
        GeneralPath gp648 = new GeneralPath();
        gp648.moveTo(269.59, 377.38);
        gp648.lineTo(280.62, 358.82);
        gp648.lineTo(291.65, 375.06);
        gp648.lineTo(280.62, 382.02);
        gp648.closePath();
        Rectangle2D bounds648 = gp648.getBounds2D();
        AffineTransform rotation648 = AffineTransform.getRotateInstance(
                Math.toRadians(190),
                bounds648.getCenterX(), bounds648.getCenterY()
        );
        Shape rotated648 = rotation648.createTransformedShape(gp648);
        g2d.setColor(new Color(0, 8, 137));
        g2d.fill(rotated648);

    }

}

class witchPart6 {

    public static void drawPart(Graphics2D g2d) {
        drawDetails50(g2d);
        drawDetails51(g2d);
        drawDetails52(g2d);
        drawDetails53(g2d);
        drawDetails54(g2d);
        drawDetails55(g2d);
        drawDetails56(g2d);
        drawDetails57(g2d);
        drawDetails58(g2d);
        drawDetails59(g2d);
    }

    public static void drawDetails50(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle649 = new Rectangle2D.Double(
                305.57, 319.98,
                4.66, 9.44
        );
        Rectangle2D bounds649 = rectangle649.getBounds2D();
        AffineTransform rotation649 = AffineTransform.getRotateInstance(
                Math.toRadians(-77.47),
                bounds649.getCenterX(), bounds649.getCenterY()
        );
        Shape rotated649 = rotation649.createTransformedShape(rectangle649);
        g2d.setColor(new Color(96, 96, 122));
        g2d.fill(rotated649);

        // Rectangle
        Rectangle2D.Double rectangle650 = new Rectangle2D.Double(
                667.14, 5.92,
                26.43, 30.51
        );
        g2d.setColor(new Color(17, 13, 20));
        g2d.fill(rectangle650);

        // Arc
        Arc2D.Double arc651 = new Arc2D.Double(
                464.22, 421.02,
                19.11, 21.37,
                0, 291, Arc2D.PIE
        );
        Rectangle2D bounds651 = arc651.getBounds2D();
        AffineTransform rotation651 = AffineTransform.getRotateInstance(
                Math.toRadians(321),
                bounds651.getCenterX(), bounds651.getCenterY()
        );
        Shape rotated651 = rotation651.createTransformedShape(arc651);
        g2d.setColor(new Color(54, 53, 42));
        g2d.fill(rotated651);

        // Ellipse
        Ellipse2D.Double ellipse652 = new Ellipse2D.Double(
                660.88, 174.74,
                11.47, 15.25
        );
        Rectangle2D bounds652 = ellipse652.getBounds2D();
        AffineTransform rotation652 = AffineTransform.getRotateInstance(
                Math.toRadians(62),
                bounds652.getCenterX(), bounds652.getCenterY()
        );
        Shape rotated652 = rotation652.createTransformedShape(ellipse652);
        g2d.setColor(new Color(28, 42, 77));
        g2d.fill(rotated652);

        // Ellipse
        Ellipse2D.Double ellipse653 = new Ellipse2D.Double(
                411.93, 170.49,
                13.18, 9.71
        );
        Rectangle2D bounds653 = ellipse653.getBounds2D();
        AffineTransform rotation653 = AffineTransform.getRotateInstance(
                Math.toRadians(38),
                bounds653.getCenterX(), bounds653.getCenterY()
        );
        Shape rotated653 = rotation653.createTransformedShape(ellipse653);
        g2d.setColor(new Color(82, 104, 186));
        g2d.fill(rotated653);

        // Rectangle
        Rectangle2D.Double rectangle654 = new Rectangle2D.Double(
                486.93, 249.11,
                17.43, 6.13
        );
        g2d.setColor(new Color(0, 13, 56));
        g2d.fill(rectangle654);

        // General path
        GeneralPath gp655 = new GeneralPath();
        gp655.moveTo(618, 223);
        gp655.lineTo(609, 239);
        gp655.lineTo(597, 262);
        gp655.lineTo(591, 272);
        gp655.lineTo(572, 301);
        gp655.lineTo(565, 310);
        gp655.lineTo(566, 314);
        gp655.lineTo(563, 319);
        gp655.lineTo(565, 321);
        gp655.lineTo(577, 315);
        gp655.lineTo(585, 312);
        gp655.lineTo(595, 309);
        gp655.lineTo(583, 305);
        gp655.lineTo(588, 298);
        gp655.lineTo(601, 278);
        gp655.lineTo(606, 266);
        gp655.lineTo(611, 253);
        gp655.lineTo(617, 242);
        gp655.closePath();
        g2d.setColor(new Color(113, 154, 224));
        g2d.fill(gp655);

        // Square
        Rectangle2D.Double square656 = new Rectangle2D.Double(
                526.28, 148.52,
                8.31, 8.31
        );
        g2d.setColor(new Color(54, 89, 191));
        g2d.fill(square656);

        // Square
        Rectangle2D.Double square657 = new Rectangle2D.Double(
                568.81, 240.58,
                17.75, 17.75
        );
        g2d.setColor(new Color(24, 65, 135));
        g2d.fill(square657);

        // Rectangle
        Rectangle2D.Double rectangle658 = new Rectangle2D.Double(
                508.49, 133.64,
                15.98, 17.99
        );
        g2d.setColor(new Color(61, 94, 220));
        g2d.fill(rectangle658);

        // Rectangle
        Rectangle2D.Double rectangle659 = new Rectangle2D.Double(
                442.05, 182.35,
                11.56, 9.22
        );
        g2d.setColor(new Color(7, 15, 59));
        g2d.fill(rectangle659);

        // Square
        Rectangle2D.Double square660 = new Rectangle2D.Double(
                521.67, 322.74,
                8.83, 8.83
        );
        g2d.setColor(new Color(54, 118, 208));
        g2d.fill(square660);

        // Circle
        Ellipse2D.Double circle661 = new Ellipse2D.Double(
                210.82, 340.2,
                20.02, 20.02
        );
        g2d.setColor(new Color(32, 51, 131));
        g2d.fill(circle661);

        // Rectangle
        Rectangle2D.Double rectangle662 = new Rectangle2D.Double(
                520.48, 393.95,
                13.5, 4.8
        );
        Rectangle2D bounds662 = rectangle662.getBounds2D();
        AffineTransform rotation662 = AffineTransform.getRotateInstance(
                Math.toRadians(-80.54),
                bounds662.getCenterX(), bounds662.getCenterY()
        );
        Shape rotated662 = rotation662.createTransformedShape(rectangle662);
        g2d.setColor(new Color(0, 2, 108));
        g2d.fill(rotated662);

        // Square
        Rectangle2D.Double square663 = new Rectangle2D.Double(
                455.19, 124.2,
                22.53, 22.53
        );
        g2d.setColor(new Color(27, 79, 180));
        g2d.fill(square663);

    }

    public static void drawDetails51(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse664 = new Ellipse2D.Double(
                559.96, 327.63,
                16.11, 12.65
        );
        Rectangle2D bounds664 = ellipse664.getBounds2D();
        AffineTransform rotation664 = AffineTransform.getRotateInstance(
                Math.toRadians(203),
                bounds664.getCenterX(), bounds664.getCenterY()
        );
        Shape rotated664 = rotation664.createTransformedShape(ellipse664);
        g2d.setColor(new Color(0, 18, 60));
        g2d.fill(rotated664);

        // General path
        GeneralPath gp665 = new GeneralPath();
        gp665.moveTo(220.84, 339.16);
        gp665.lineTo(230.61, 333.51);
        gp665.lineTo(240.38, 338.45);
        gp665.lineTo(230.61, 340.57);
        gp665.closePath();
        Rectangle2D bounds665 = gp665.getBounds2D();
        AffineTransform rotation665 = AffineTransform.getRotateInstance(
                Math.toRadians(14),
                bounds665.getCenterX(), bounds665.getCenterY()
        );
        Shape rotated665 = rotation665.createTransformedShape(gp665);
        g2d.setColor(new Color(84, 90, 201));
        g2d.fill(rotated665);

        // Circle
        Ellipse2D.Double circle666 = new Ellipse2D.Double(
                347.53, 103.66,
                7.75, 7.75
        );
        Rectangle2D bounds666 = circle666.getBounds2D();
        AffineTransform rotation666 = AffineTransform.getRotateInstance(
                Math.toRadians(274),
                bounds666.getCenterX(), bounds666.getCenterY()
        );
        Shape rotated666 = rotation666.createTransformedShape(circle666);
        g2d.setColor(new Color(36, 93, 144));
        g2d.fill(rotated666);

        // Area / transformation
        Ellipse2D.Double outer667 = new Ellipse2D.Double(
                196.18, 250.99,
                11.25, 11.34
        );
        Ellipse2D.Double cutout667 = new Ellipse2D.Double(
                196.18 + 11.25 * 0.28,
                250.99 - 11.34 * 0.12,
                11.25, 11.34
        );
        Area area667 = new Area(outer667);
        area667.subtract(new Area(cutout667));
        Rectangle2D bounds667 = area667.getBounds2D();
        AffineTransform rotation667 = AffineTransform.getRotateInstance(
                Math.toRadians(138),
                bounds667.getCenterX(), bounds667.getCenterY()
        );
        Shape rotated667 = rotation667.createTransformedShape(area667);
        g2d.setColor(new Color(91, 94, 146));
        g2d.fill(rotated667);

        // Rectangle
        Rectangle2D.Double rectangle668 = new Rectangle2D.Double(
                586.1, 59.1,
                36.3, 39.83
        );
        g2d.setColor(new Color(4, 11, 47));
        g2d.fill(rectangle668);

        // Circle
        Ellipse2D.Double circle669 = new Ellipse2D.Double(
                548.09, 308.78,
                13.9, 13.9
        );
        Rectangle2D bounds669 = circle669.getBounds2D();
        AffineTransform rotation669 = AffineTransform.getRotateInstance(
                Math.toRadians(222),
                bounds669.getCenterX(), bounds669.getCenterY()
        );
        Shape rotated669 = rotation669.createTransformedShape(circle669);
        g2d.setColor(new Color(0, 20, 64));
        g2d.fill(rotated669);

        // Ellipse
        Ellipse2D.Double ellipse670 = new Ellipse2D.Double(
                268.38, 117.28,
                21.55, 104.3
        );
        Rectangle2D bounds670 = ellipse670.getBounds2D();
        AffineTransform rotation670 = AffineTransform.getRotateInstance(
                Math.toRadians(23.62),
                bounds670.getCenterX(), bounds670.getCenterY()
        );
        Shape rotated670 = rotation670.createTransformedShape(ellipse670);
        g2d.setColor(new Color(29, 53, 93));
        g2d.fill(rotated670);

        // Line
        Line2D.Double line671 = new Line2D.Double(
                610.65, 304.35,
                632.83, 304.35
        );
        Rectangle2D bounds671 = line671.getBounds2D();
        AffineTransform rotation671 = AffineTransform.getRotateInstance(
                Math.toRadians(89),
                bounds671.getCenterX(), bounds671.getCenterY()
        );
        Shape rotated671 = rotation671.createTransformedShape(line671);
        g2d.setColor(new Color(70, 98, 173));
        BasicStroke bs671 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs671);
        g2d.draw(rotated671);

        // Cubic curve
        CubicCurve2D.Double cc672 = new CubicCurve2D.Double(
                359.63, 196.78,
                363.53, 190.84,
                368.73, 202.71,
                372.62, 196.78
        );
        Rectangle2D bounds672 = cc672.getBounds2D();
        AffineTransform rotation672 = AffineTransform.getRotateInstance(
                Math.toRadians(270),
                bounds672.getCenterX(), bounds672.getCenterY()
        );
        Shape rotated672 = rotation672.createTransformedShape(cc672);
        g2d.setColor(new Color(15, 30, 100));
        BasicStroke bs672 = new BasicStroke(
                3.03f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs672);
        g2d.draw(rotated672);

        // Square
        Rectangle2D.Double square673 = new Rectangle2D.Double(
                488.64, 120.02,
                14.57, 14.57
        );
        g2d.setColor(new Color(35, 65, 204));
        g2d.fill(square673);

        // General path
        GeneralPath gp674 = new GeneralPath();
        gp674.moveTo(294.79, 365.81);
        gp674.lineTo(292.79, 370.81);
        gp674.lineTo(289.79, 372.81);
        gp674.lineTo(292.79, 373.81);
        gp674.lineTo(291.79, 375.81);
        gp674.lineTo(289.79, 375.81);
        gp674.lineTo(289.79, 377.81);
        gp674.lineTo(292.79, 379.81);
        gp674.lineTo(293.79, 381.81);
        gp674.lineTo(293.79, 378.81);
        gp674.lineTo(295.79, 377.81);
        gp674.lineTo(294.79, 374.81);
        gp674.lineTo(294.79, 367.81);
        gp674.lineTo(293.79, 366.81);
        gp674.closePath();
        g2d.setColor(new Color(75, 160, 230));
        g2d.fill(gp674);

        // Square
        Rectangle2D.Double square675 = new Rectangle2D.Double(
                574.48, 346.85,
                12, 12
        );
        g2d.setColor(new Color(3, 54, 144));
        g2d.fill(square675);

    }

    public static void drawDetails52(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle676 = new Rectangle2D.Double(
                379.03, 395.18,
                20.96, 5.92
        );
        Rectangle2D bounds676 = rectangle676.getBounds2D();
        AffineTransform rotation676 = AffineTransform.getRotateInstance(
                Math.toRadians(-8.53),
                bounds676.getCenterX(), bounds676.getCenterY()
        );
        Shape rotated676 = rotation676.createTransformedShape(rectangle676);
        g2d.setColor(new Color(51, 40, 173));
        g2d.fill(rotated676);

        // Rectangle
        Rectangle2D.Double rectangle677 = new Rectangle2D.Double(
                417.71, 188.25,
                4.94, 11.25
        );
        Rectangle2D bounds677 = rectangle677.getBounds2D();
        AffineTransform rotation677 = AffineTransform.getRotateInstance(
                Math.toRadians(-66.04),
                bounds677.getCenterX(), bounds677.getCenterY()
        );
        Shape rotated677 = rotation677.createTransformedShape(rectangle677);
        g2d.setColor(new Color(57, 89, 151));
        g2d.fill(rotated677);

        // Rectangle
        Rectangle2D.Double rectangle678 = new Rectangle2D.Double(
                333.53, 296.63,
                13.78, 10.42
        );
        g2d.setColor(new Color(38, 38, 76));
        g2d.fill(rectangle678);

        // Quadratic curve
        QuadCurve2D.Double qc679 = new QuadCurve2D.Double(
                467.49, 219.08,
                481, 211.31,
                494.51, 219.08
        );
        Rectangle2D bounds679 = qc679.getBounds2D();
        AffineTransform rotation679 = AffineTransform.getRotateInstance(
                Math.toRadians(36),
                bounds679.getCenterX(), bounds679.getCenterY()
        );
        Shape rotated679 = rotation679.createTransformedShape(qc679);
        g2d.setColor(new Color(71, 134, 215));
        BasicStroke bs679 = new BasicStroke(
                3.32f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs679);
        g2d.draw(rotated679);

        // Square
        Rectangle2D.Double square680 = new Rectangle2D.Double(
                515.91, 208.33,
                20.35, 20.35
        );
        g2d.setColor(new Color(42, 97, 193));
        g2d.fill(square680);

        // Rectangle
        Rectangle2D.Double rectangle681 = new Rectangle2D.Double(
                376.41, 380.01,
                6.64, 7.59
        );
        Rectangle2D bounds681 = rectangle681.getBounds2D();
        AffineTransform rotation681 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds681.getCenterX(), bounds681.getCenterY()
        );
        Shape rotated681 = rotation681.createTransformedShape(rectangle681);
        g2d.setColor(new Color(144, 145, 255));
        g2d.fill(rotated681);

        // Ellipse
        Ellipse2D.Double ellipse682 = new Ellipse2D.Double(
                501.85, 319.91,
                13.68, 12.35
        );
        Rectangle2D bounds682 = ellipse682.getBounds2D();
        AffineTransform rotation682 = AffineTransform.getRotateInstance(
                Math.toRadians(282),
                bounds682.getCenterX(), bounds682.getCenterY()
        );
        Shape rotated682 = rotation682.createTransformedShape(ellipse682);
        g2d.setColor(new Color(98, 140, 216));
        g2d.fill(rotated682);

        // Circle
        Ellipse2D.Double circle683 = new Ellipse2D.Double(
                499.97, 237.18,
                11.81, 11.81
        );
        Rectangle2D bounds683 = circle683.getBounds2D();
        AffineTransform rotation683 = AffineTransform.getRotateInstance(
                Math.toRadians(12),
                bounds683.getCenterX(), bounds683.getCenterY()
        );
        Shape rotated683 = rotation683.createTransformedShape(circle683);
        g2d.setColor(new Color(73, 139, 212));
        g2d.fill(rotated683);

        // Cubic curve
        CubicCurve2D.Double cc684 = new CubicCurve2D.Double(
                280.54, 282.61,
                284.39, 278.02,
                289.52, 287.2,
                293.38, 282.61
        );
        Rectangle2D bounds684 = cc684.getBounds2D();
        AffineTransform rotation684 = AffineTransform.getRotateInstance(
                Math.toRadians(307),
                bounds684.getCenterX(), bounds684.getCenterY()
        );
        Shape rotated684 = rotation684.createTransformedShape(cc684);
        g2d.setColor(new Color(103, 135, 193));
        BasicStroke bs684 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs684);
        g2d.draw(rotated684);

        // Rectangle
        Rectangle2D.Double rectangle685 = new Rectangle2D.Double(
                356.61, 105.41,
                10.87, 14.66
        );
        g2d.setColor(new Color(2, 12, 32));
        g2d.fill(rectangle685);

        // Rectangle
        Rectangle2D.Double rectangle686 = new Rectangle2D.Double(
                111.96, 240.41,
                9.05, 5.83
        );
        g2d.setColor(new Color(0, 3, 18));
        g2d.fill(rectangle686);

        // Ellipse
        Ellipse2D.Double ellipse687 = new Ellipse2D.Double(
                698.96, 7.78,
                8.88, 13.41
        );
        Rectangle2D bounds687 = ellipse687.getBounds2D();
        AffineTransform rotation687 = AffineTransform.getRotateInstance(
                Math.toRadians(96.4),
                bounds687.getCenterX(), bounds687.getCenterY()
        );
        Shape rotated687 = rotation687.createTransformedShape(ellipse687);
        g2d.setColor(new Color(11, 25, 52));
        g2d.fill(rotated687);

        // Rectangle
        Rectangle2D.Double rectangle688 = new Rectangle2D.Double(
                328.21, 270.45,
                13.64, 13.88
        );
        g2d.setColor(new Color(12, 21, 91));
        g2d.fill(rectangle688);

        // Rectangle
        Rectangle2D.Double rectangle689 = new Rectangle2D.Double(
                344.33, 264.15,
                3.46, 16.38
        );
        Rectangle2D bounds689 = rectangle689.getBounds2D();
        AffineTransform rotation689 = AffineTransform.getRotateInstance(
                Math.toRadians(-32.47),
                bounds689.getCenterX(), bounds689.getCenterY()
        );
        Shape rotated689 = rotation689.createTransformedShape(rectangle689);
        g2d.setColor(new Color(95, 103, 202));
        g2d.fill(rotated689);

    }

    public static void drawDetails53(Graphics2D g2d) {

        // Line
        Line2D.Double line690 = new Line2D.Double(
                336.13, 190.52,
                361.38, 190.52
        );
        Rectangle2D bounds690 = line690.getBounds2D();
        AffineTransform rotation690 = AffineTransform.getRotateInstance(
                Math.toRadians(6),
                bounds690.getCenterX(), bounds690.getCenterY()
        );
        Shape rotated690 = rotation690.createTransformedShape(line690);
        g2d.setColor(new Color(112, 143, 201));
        BasicStroke bs690 = new BasicStroke(
                3.36f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs690);
        g2d.draw(rotated690);

        // Square
        Rectangle2D.Double square691 = new Rectangle2D.Double(
                117.16, 258.43,
                9.16, 9.16
        );
        g2d.setColor(new Color(3, 7, 23));
        g2d.fill(square691);

        // Quadratic curve
        QuadCurve2D.Double qc692 = new QuadCurve2D.Double(
                383.55, 288.76,
                395.06, 282.08,
                406.56, 288.76
        );
        Rectangle2D bounds692 = qc692.getBounds2D();
        AffineTransform rotation692 = AffineTransform.getRotateInstance(
                Math.toRadians(225),
                bounds692.getCenterX(), bounds692.getCenterY()
        );
        Shape rotated692 = rotation692.createTransformedShape(qc692);
        g2d.setColor(new Color(229, 235, 255));
        BasicStroke bs692 = new BasicStroke(
                3.01f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs692);
        g2d.draw(rotated692);

        // Area / transformation
        GeneralPath boundary693_1 = new GeneralPath();
        boundary693_1.moveTo(263.95, 53.29);
        boundary693_1.lineTo(265.95, 65.29);
        boundary693_1.lineTo(268.95, 74.29);
        boundary693_1.lineTo(280.95, 96.29);
        boundary693_1.lineTo(291.95, 109.29);
        boundary693_1.lineTo(299.95, 114.29);
        boundary693_1.lineTo(307.95, 117.29);
        boundary693_1.lineTo(293.95, 109.29);
        boundary693_1.lineTo(293.95, 100.29);
        boundary693_1.lineTo(310.95, 110.29);
        boundary693_1.lineTo(318.95, 118.29);
        boundary693_1.lineTo(330.95, 127.29);
        boundary693_1.lineTo(321.95, 118.29);
        boundary693_1.lineTo(301.95, 103.29);
        boundary693_1.lineTo(296.95, 94.29);
        boundary693_1.lineTo(281.95, 77.29);
        boundary693_1.lineTo(277.95, 68.29);
        boundary693_1.lineTo(271.95, 62.29);
        boundary693_1.closePath();
        Area area693 = new Area(boundary693_1);
        GeneralPath boundary693_2 = new GeneralPath();
        boundary693_2.moveTo(318.95, 119.29);
        boundary693_2.lineTo(319.95, 118.29);
        boundary693_2.lineTo(323.95, 118.29);
        boundary693_2.lineTo(325.95, 121.29);
        boundary693_2.lineTo(329.95, 123.29);
        boundary693_2.lineTo(329.95, 125.29);
        boundary693_2.lineTo(328.95, 126.29);
        boundary693_2.lineTo(320.95, 122.29);
        boundary693_2.closePath();
        area693.subtract(new Area(boundary693_2));
        GeneralPath boundary693_3 = new GeneralPath();
        boundary693_3.moveTo(287.95, 97.29);
        boundary693_3.lineTo(289.95, 96.29);
        boundary693_3.lineTo(291.95, 98.29);
        boundary693_3.lineTo(289.95, 100.29);
        boundary693_3.closePath();
        area693.subtract(new Area(boundary693_3));
        g2d.setColor(new Color(1, 2, 16));
        g2d.fill(area693);

        // Line
        Line2D.Double line694 = new Line2D.Double(
                599.53, 324.08,
                629.12, 324.08
        );
        Rectangle2D bounds694 = line694.getBounds2D();
        AffineTransform rotation694 = AffineTransform.getRotateInstance(
                Math.toRadians(328),
                bounds694.getCenterX(), bounds694.getCenterY()
        );
        Shape rotated694 = rotation694.createTransformedShape(line694);
        g2d.setColor(new Color(0, 21, 92));
        BasicStroke bs694 = new BasicStroke(
                2.87f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs694);
        g2d.draw(rotated694);

        // Circle
        Ellipse2D.Double circle695 = new Ellipse2D.Double(
                251.2, 408.57,
                14.91, 14.91
        );
        Rectangle2D bounds695 = circle695.getBounds2D();
        AffineTransform rotation695 = AffineTransform.getRotateInstance(
                Math.toRadians(341),
                bounds695.getCenterX(), bounds695.getCenterY()
        );
        Shape rotated695 = rotation695.createTransformedShape(circle695);
        g2d.setColor(new Color(1, 21, 76));
        g2d.fill(rotated695);

        // Rectangle
        Rectangle2D.Double rectangle696 = new Rectangle2D.Double(
                428.37, 423.29,
                24.09, 12.05
        );
        g2d.setColor(new Color(28, 30, 22));
        g2d.fill(rectangle696);

        // Square
        Rectangle2D.Double square697 = new Rectangle2D.Double(
                766.89, 76.54,
                31.07, 31.07
        );
        g2d.setColor(new Color(1, 0, 16));
        g2d.fill(square697);

        // Quadratic curve
        QuadCurve2D.Double qc698 = new QuadCurve2D.Double(
                331.42, 110.3,
                337.5, 103.53,
                343.59, 110.3
        );
        Rectangle2D bounds698 = qc698.getBounds2D();
        AffineTransform rotation698 = AffineTransform.getRotateInstance(
                Math.toRadians(221),
                bounds698.getCenterX(), bounds698.getCenterY()
        );
        Shape rotated698 = rotation698.createTransformedShape(qc698);
        g2d.setColor(new Color(9, 22, 45));
        BasicStroke bs698 = new BasicStroke(
                2.97f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs698);
        g2d.draw(rotated698);

        // Ellipse
        Ellipse2D.Double ellipse699 = new Ellipse2D.Double(
                138.5, 201.34,
                12.04, 54.25
        );
        Rectangle2D bounds699 = ellipse699.getBounds2D();
        AffineTransform rotation699 = AffineTransform.getRotateInstance(
                Math.toRadians(134.15),
                bounds699.getCenterX(), bounds699.getCenterY()
        );
        Shape rotated699 = rotation699.createTransformedShape(ellipse699);
        g2d.setColor(new Color(9, 11, 43));
        g2d.fill(rotated699);

    }

    public static void drawDetails54(Graphics2D g2d) {

        // Arc
        Arc2D.Double arc700 = new Arc2D.Double(
                437.83, 344.59,
                13.32, 5.39,
                0, 272, Arc2D.PIE
        );
        Rectangle2D bounds700 = arc700.getBounds2D();
        AffineTransform rotation700 = AffineTransform.getRotateInstance(
                Math.toRadians(30),
                bounds700.getCenterX(), bounds700.getCenterY()
        );
        Shape rotated700 = rotation700.createTransformedShape(arc700);
        g2d.setColor(new Color(203, 171, 148));
        g2d.fill(rotated700);

        // Line
        Line2D.Double line701 = new Line2D.Double(
                382.86, 412.53,
                405.04, 412.53
        );
        Rectangle2D bounds701 = line701.getBounds2D();
        AffineTransform rotation701 = AffineTransform.getRotateInstance(
                Math.toRadians(180),
                bounds701.getCenterX(), bounds701.getCenterY()
        );
        Shape rotated701 = rotation701.createTransformedShape(line701);
        g2d.setColor(new Color(26, 25, 97));
        BasicStroke bs701 = new BasicStroke(
                2.85f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs701);
        g2d.draw(rotated701);

        // Rectangle
        Rectangle2D.Double rectangle702 = new Rectangle2D.Double(
                273.9, 411.29,
                8.44, 23.2
        );
        Rectangle2D bounds702 = rectangle702.getBounds2D();
        AffineTransform rotation702 = AffineTransform.getRotateInstance(
                Math.toRadians(-29.74),
                bounds702.getCenterX(), bounds702.getCenterY()
        );
        Shape rotated702 = rotation702.createTransformedShape(rectangle702);
        g2d.setColor(new Color(2, 32, 94));
        g2d.fill(rotated702);

        // Rectangle
        Rectangle2D.Double rectangle703 = new Rectangle2D.Double(
                341.58, 318.28,
                11.1, 8.56
        );
        g2d.setColor(new Color(61, 54, 70));
        g2d.fill(rectangle703);

        // Area / transformation
        GeneralPath boundary704_1 = new GeneralPath();
        boundary704_1.moveTo(269, 83);
        boundary704_1.lineTo(252, 103);
        boundary704_1.lineTo(241, 132);
        boundary704_1.lineTo(237, 137);
        boundary704_1.lineTo(219, 151);
        boundary704_1.lineTo(222, 158);
        boundary704_1.lineTo(211, 191);
        boundary704_1.lineTo(206, 210);
        boundary704_1.lineTo(199, 213);
        boundary704_1.lineTo(203, 220);
        boundary704_1.lineTo(206, 234);
        boundary704_1.lineTo(201, 250);
        boundary704_1.lineTo(222, 256);
        boundary704_1.lineTo(228, 228);
        boundary704_1.lineTo(227, 211);
        boundary704_1.lineTo(242, 188);
        boundary704_1.lineTo(248, 148);
        boundary704_1.lineTo(266, 125);
        boundary704_1.closePath();
        Area area704 = new Area(boundary704_1);
        GeneralPath boundary704_2 = new GeneralPath();
        boundary704_2.moveTo(212, 249);
        boundary704_2.lineTo(214, 248);
        boundary704_2.lineTo(217, 249);
        boundary704_2.lineTo(218, 251);
        boundary704_2.lineTo(216, 253);
        boundary704_2.lineTo(213, 253);
        boundary704_2.lineTo(212, 252);
        boundary704_2.closePath();
        area704.subtract(new Area(boundary704_2));
        GeneralPath boundary704_3 = new GeneralPath();
        boundary704_3.moveTo(219, 220);
        boundary704_3.lineTo(222, 219);
        boundary704_3.lineTo(223, 221);
        boundary704_3.lineTo(220, 222);
        boundary704_3.closePath();
        area704.subtract(new Area(boundary704_3));
        g2d.setColor(new Color(14, 27, 50));
        g2d.fill(area704);

        // Arc
        Arc2D.Double arc705 = new Arc2D.Double(
                145.39, 354.78,
                13.56, 12.17,
                0, 166, Arc2D.PIE
        );
        Rectangle2D bounds705 = arc705.getBounds2D();
        AffineTransform rotation705 = AffineTransform.getRotateInstance(
                Math.toRadians(319),
                bounds705.getCenterX(), bounds705.getCenterY()
        );
        Shape rotated705 = rotation705.createTransformedShape(arc705);
        g2d.setColor(new Color(125, 147, 186));
        g2d.fill(rotated705);

        // Square
        Rectangle2D.Double square706 = new Rectangle2D.Double(
                123.1, 301.84,
                14.68, 14.68
        );
        g2d.setColor(new Color(43, 47, 94));
        g2d.fill(square706);

        // Area / transformation
        Ellipse2D.Double outer707 = new Ellipse2D.Double(
                419.66, 345.45,
                30.24, 22.14
        );
        Ellipse2D.Double cutout707 = new Ellipse2D.Double(
                419.66 + 30.24 * 0.28,
                345.45 - 22.14 * 0.12,
                30.24, 22.14
        );
        Area area707 = new Area(outer707);
        area707.subtract(new Area(cutout707));
        Rectangle2D bounds707 = area707.getBounds2D();
        AffineTransform rotation707 = AffineTransform.getRotateInstance(
                Math.toRadians(63),
                bounds707.getCenterX(), bounds707.getCenterY()
        );
        Shape rotated707 = rotation707.createTransformedShape(area707);
        g2d.setColor(new Color(38, 33, 55));
        g2d.fill(rotated707);

        // Rectangle
        Rectangle2D.Double rectangle708 = new Rectangle2D.Double(
                326.49, 227.82,
                8.01, 9.01
        );
        g2d.setColor(new Color(21, 45, 146));
        g2d.fill(rectangle708);

    }

    public static void drawDetails55(Graphics2D g2d) {

        // Area / transformation
        GeneralPath boundary709_1 = new GeneralPath();
        boundary709_1.moveTo(152.04, 266.02);
        boundary709_1.lineTo(148.04, 271.02);
        boundary709_1.lineTo(145.04, 269.02);
        boundary709_1.lineTo(147.04, 277.02);
        boundary709_1.lineTo(145.04, 280.02);
        boundary709_1.lineTo(145.04, 285.02);
        boundary709_1.lineTo(145.04, 289.02);
        boundary709_1.lineTo(145.04, 299.02);
        boundary709_1.lineTo(154.04, 307.02);
        boundary709_1.lineTo(156.04, 307.02);
        boundary709_1.lineTo(163.04, 294.02);
        boundary709_1.lineTo(161.04, 289.02);
        boundary709_1.lineTo(162.04, 286.02);
        boundary709_1.lineTo(157.04, 283.02);
        boundary709_1.lineTo(156.04, 279.02);
        boundary709_1.lineTo(159.04, 277.02);
        boundary709_1.lineTo(152.04, 269.02);
        boundary709_1.lineTo(153.04, 268.02);
        boundary709_1.closePath();
        Area area709 = new Area(boundary709_1);
        GeneralPath boundary709_2 = new GeneralPath();
        boundary709_2.moveTo(148.04, 278.02);
        boundary709_2.lineTo(149.04, 277.02);
        boundary709_2.lineTo(151.04, 278.02);
        boundary709_2.lineTo(152.04, 280.02);
        boundary709_2.lineTo(150.04, 282.02);
        boundary709_2.lineTo(148.04, 280.02);
        boundary709_2.closePath();
        area709.subtract(new Area(boundary709_2));
        g2d.setColor(new Color(8, 17, 51));
        g2d.fill(area709);

        // Area / transformation
        Ellipse2D.Double outer710 = new Ellipse2D.Double(
                356.44, 280.88,
                15.02, 16.08
        );
        Ellipse2D.Double cutout710 = new Ellipse2D.Double(
                356.44 + 15.02 * 0.28,
                280.88 - 16.08 * 0.12,
                15.02, 16.08
        );
        Area area710 = new Area(outer710);
        area710.subtract(new Area(cutout710));
        Rectangle2D bounds710 = area710.getBounds2D();
        AffineTransform rotation710 = AffineTransform.getRotateInstance(
                Math.toRadians(28),
                bounds710.getCenterX(), bounds710.getCenterY()
        );
        Shape rotated710 = rotation710.createTransformedShape(area710);
        g2d.setColor(new Color(74, 104, 211));
        g2d.fill(rotated710);

        // Square
        Rectangle2D.Double square711 = new Rectangle2D.Double(
                177.78, 398.98,
                18.35, 18.35
        );
        g2d.setColor(new Color(17, 35, 97));
        g2d.fill(square711);

        // Quadratic curve
        QuadCurve2D.Double qc712 = new QuadCurve2D.Double(
                536.03, 276.99,
                551.95, 263.97,
                567.86, 276.99
        );
        Rectangle2D bounds712 = qc712.getBounds2D();
        AffineTransform rotation712 = AffineTransform.getRotateInstance(
                Math.toRadians(226),
                bounds712.getCenterX(), bounds712.getCenterY()
        );
        Shape rotated712 = rotation712.createTransformedShape(qc712);
        g2d.setColor(new Color(66, 113, 186));
        BasicStroke bs712 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs712);
        g2d.draw(rotated712);

        // Circle
        Ellipse2D.Double circle713 = new Ellipse2D.Double(
                255.06, 261.94,
                8.96, 8.96
        );
        Rectangle2D bounds713 = circle713.getBounds2D();
        AffineTransform rotation713 = AffineTransform.getRotateInstance(
                Math.toRadians(160),
                bounds713.getCenterX(), bounds713.getCenterY()
        );
        Shape rotated713 = rotation713.createTransformedShape(circle713);
        g2d.setColor(new Color(104, 117, 156));
        g2d.fill(rotated713);

        // Rectangle
        Rectangle2D.Double rectangle714 = new Rectangle2D.Double(
                425.9, 123.94,
                29.09, 14.35
        );
        g2d.setColor(new Color(30, 85, 181));
        g2d.fill(rectangle714);

        // Arc
        Arc2D.Double arc715 = new Arc2D.Double(
                540.81, 244.63,
                14.03, 6.4,
                0, 302, Arc2D.PIE
        );
        Rectangle2D bounds715 = arc715.getBounds2D();
        AffineTransform rotation715 = AffineTransform.getRotateInstance(
                Math.toRadians(265),
                bounds715.getCenterX(), bounds715.getCenterY()
        );
        Shape rotated715 = rotation715.createTransformedShape(arc715);
        g2d.setColor(new Color(34, 84, 169));
        g2d.fill(rotated715);

        // Cubic curve
        CubicCurve2D.Double cc716 = new CubicCurve2D.Double(
                355.49, 304.35,
                358.72, 300.62,
                363.02, 308.08,
                366.25, 304.35
        );
        Rectangle2D bounds716 = cc716.getBounds2D();
        AffineTransform rotation716 = AffineTransform.getRotateInstance(
                Math.toRadians(34),
                bounds716.getCenterX(), bounds716.getCenterY()
        );
        Shape rotated716 = rotation716.createTransformedShape(cc716);
        g2d.setColor(new Color(81, 87, 162));
        BasicStroke bs716 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs716);
        g2d.draw(rotated716);

        // Rectangle
        Rectangle2D.Double rectangle717 = new Rectangle2D.Double(
                665.46, 80.08,
                12.09, 58.98
        );
        Rectangle2D bounds717 = rectangle717.getBounds2D();
        AffineTransform rotation717 = AffineTransform.getRotateInstance(
                Math.toRadians(-52.43),
                bounds717.getCenterX(), bounds717.getCenterY()
        );
        Shape rotated717 = rotation717.createTransformedShape(rectangle717);
        g2d.setColor(new Color(36, 37, 86));
        g2d.fill(rotated717);

    }

    public static void drawDetails56(Graphics2D g2d) {

        // Area / transformation
        GeneralPath boundary718_1 = new GeneralPath();
        boundary718_1.moveTo(484, 44);
        boundary718_1.lineTo(502, 86);
        boundary718_1.lineTo(505, 84);
        boundary718_1.lineTo(525, 96);
        boundary718_1.lineTo(544, 98);
        boundary718_1.lineTo(556, 117);
        boundary718_1.lineTo(589, 145);
        boundary718_1.lineTo(609, 201);
        boundary718_1.lineTo(633, 185);
        boundary718_1.lineTo(647, 180);
        boundary718_1.lineTo(653, 178);
        boundary718_1.lineTo(606, 145);
        boundary718_1.lineTo(593, 152);
        boundary718_1.lineTo(587, 114);
        boundary718_1.lineTo(560, 95);
        boundary718_1.lineTo(537, 79);
        boundary718_1.lineTo(511, 37);
        boundary718_1.lineTo(508, 59);
        boundary718_1.closePath();
        Area area718 = new Area(boundary718_1);
        GeneralPath boundary718_2 = new GeneralPath();
        boundary718_2.moveTo(623, 184);
        boundary718_2.lineTo(624, 182);
        boundary718_2.lineTo(626, 183);
        boundary718_2.lineTo(624, 185);
        boundary718_2.closePath();
        area718.subtract(new Area(boundary718_2));
        GeneralPath boundary718_3 = new GeneralPath();
        boundary718_3.moveTo(627, 168);
        boundary718_3.lineTo(628, 166);
        boundary718_3.lineTo(630, 167);
        boundary718_3.lineTo(628, 169);
        boundary718_3.closePath();
        area718.subtract(new Area(boundary718_3));
        g2d.setColor(new Color(7, 23, 78));
        g2d.fill(area718);

        // General path
        GeneralPath gp719 = new GeneralPath();
        gp719.moveTo(325.16, 265.77);
        gp719.lineTo(317.16, 265.77);
        gp719.lineTo(317.16, 269.77);
        gp719.lineTo(309.16, 278.77);
        gp719.lineTo(302.16, 284.77);
        gp719.lineTo(294.16, 291.77);
        gp719.lineTo(294.16, 291.77);
        gp719.lineTo(289.16, 296.77);
        gp719.lineTo(284.16, 303.77);
        gp719.lineTo(287.16, 301.77);
        gp719.lineTo(297.16, 294.77);
        gp719.lineTo(299.16, 292.77);
        gp719.lineTo(299.16, 289.77);
        gp719.lineTo(298.16, 287.77);
        gp719.lineTo(303.16, 286.77);
        gp719.lineTo(304.16, 287.77);
        gp719.lineTo(308.16, 280.77);
        gp719.lineTo(316.16, 271.77);
        gp719.closePath();
        g2d.setColor(new Color(0, 0, 41));
        g2d.fill(gp719);

        // Rectangle
        Rectangle2D.Double rectangle720 = new Rectangle2D.Double(
                413.14, 276.24,
                34.94, 8.75
        );
        Rectangle2D bounds720 = rectangle720.getBounds2D();
        AffineTransform rotation720 = AffineTransform.getRotateInstance(
                Math.toRadians(-61.19),
                bounds720.getCenterX(), bounds720.getCenterY()
        );
        Shape rotated720 = rotation720.createTransformedShape(rectangle720);
        g2d.setColor(new Color(30, 39, 141));
        g2d.fill(rotated720);

        // Area / transformation
        GeneralPath boundary721_1 = new GeneralPath();
        boundary721_1.moveTo(434, 49);
        boundary721_1.lineTo(428, 67);
        boundary721_1.lineTo(434, 82);
        boundary721_1.lineTo(461, 84);
        boundary721_1.lineTo(473, 101);
        boundary721_1.lineTo(492, 108);
        boundary721_1.lineTo(509, 108);
        boundary721_1.lineTo(532, 125);
        boundary721_1.lineTo(540, 149);
        boundary721_1.lineTo(550, 185);
        boundary721_1.lineTo(564, 198);
        boundary721_1.lineTo(561, 180);
        boundary721_1.lineTo(550, 129);
        boundary721_1.lineTo(527, 108);
        boundary721_1.lineTo(506, 91);
        boundary721_1.lineTo(479, 82);
        boundary721_1.lineTo(456, 80);
        boundary721_1.lineTo(438, 74);
        boundary721_1.closePath();
        Area area721 = new Area(boundary721_1);
        GeneralPath boundary721_2 = new GeneralPath();
        boundary721_2.moveTo(539, 141);
        boundary721_2.lineTo(542, 138);
        boundary721_2.lineTo(545, 137);
        boundary721_2.lineTo(549, 140);
        boundary721_2.lineTo(548, 143);
        boundary721_2.lineTo(544, 143);
        boundary721_2.lineTo(543, 144);
        boundary721_2.closePath();
        area721.subtract(new Area(boundary721_2));
        GeneralPath boundary721_3 = new GeneralPath();
        boundary721_3.moveTo(502, 105);
        boundary721_3.lineTo(503, 103);
        boundary721_3.lineTo(505, 104);
        boundary721_3.lineTo(503, 106);
        boundary721_3.closePath();
        area721.subtract(new Area(boundary721_3));
        g2d.setColor(new Color(19, 35, 137));
        g2d.fill(area721);

        // Rectangle
        Rectangle2D.Double rectangle722 = new Rectangle2D.Double(
                328.38, 376.17,
                12.8, 12.88
        );
        g2d.setColor(new Color(55, 41, 189));
        g2d.fill(rectangle722);

        // Cubic curve
        CubicCurve2D.Double cc723 = new CubicCurve2D.Double(
                590.51, 104.35,
                593.6, 98.49,
                597.71, 110.2,
                600.79, 104.35
        );
        Rectangle2D bounds723 = cc723.getBounds2D();
        AffineTransform rotation723 = AffineTransform.getRotateInstance(
                Math.toRadians(214),
                bounds723.getCenterX(), bounds723.getCenterY()
        );
        Shape rotated723 = rotation723.createTransformedShape(cc723);
        g2d.setColor(new Color(137, 159, 228));
        BasicStroke bs723 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs723);
        g2d.draw(rotated723);

        // Ellipse
        Ellipse2D.Double ellipse724 = new Ellipse2D.Double(
                464.95, 332.35,
                9.07, 39.03
        );
        Rectangle2D bounds724 = ellipse724.getBounds2D();
        AffineTransform rotation724 = AffineTransform.getRotateInstance(
                Math.toRadians(160.74),
                bounds724.getCenterX(), bounds724.getCenterY()
        );
        Shape rotated724 = rotation724.createTransformedShape(ellipse724);
        g2d.setColor(new Color(2, 23, 79));
        g2d.fill(rotated724);

        // Rectangle
        Rectangle2D.Double rectangle725 = new Rectangle2D.Double(
                268.22, 324.59,
                11.38, 11.68
        );
        g2d.setColor(new Color(107, 134, 197));
        g2d.fill(rectangle725);

    }

    public static void drawDetails57(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse726 = new Ellipse2D.Double(
                703.94, 225.96,
                9.28, 49.58
        );
        Rectangle2D bounds726 = ellipse726.getBounds2D();
        AffineTransform rotation726 = AffineTransform.getRotateInstance(
                Math.toRadians(78.35),
                bounds726.getCenterX(), bounds726.getCenterY()
        );
        Shape rotated726 = rotation726.createTransformedShape(ellipse726);
        g2d.setColor(new Color(33, 36, 53));
        g2d.fill(rotated726);

        // Circle
        Ellipse2D.Double circle727 = new Ellipse2D.Double(
                387.86, 86.12,
                42.27, 42.27
        );
        g2d.setColor(new Color(10, 18, 46));
        g2d.fill(circle727);

        // Rectangle
        Rectangle2D.Double rectangle728 = new Rectangle2D.Double(
                316.13, 379.6,
                31.23, 69.17
        );
        Rectangle2D bounds728 = rectangle728.getBounds2D();
        AffineTransform rotation728 = AffineTransform.getRotateInstance(
                Math.toRadians(-73.91),
                bounds728.getCenterX(), bounds728.getCenterY()
        );
        Shape rotated728 = rotation728.createTransformedShape(rectangle728);
        g2d.setColor(new Color(26, 29, 23));
        g2d.fill(rotated728);

        // Area / transformation
        Ellipse2D.Double outer729 = new Ellipse2D.Double(
                635.15, 181.69,
                28.39, 26.58
        );
        Ellipse2D.Double cutout729 = new Ellipse2D.Double(
                635.15 + 28.39 * 0.28,
                181.69 - 26.58 * 0.12,
                28.39, 26.58
        );
        Area area729 = new Area(outer729);
        area729.subtract(new Area(cutout729));
        Rectangle2D bounds729 = area729.getBounds2D();
        AffineTransform rotation729 = AffineTransform.getRotateInstance(
                Math.toRadians(265),
                bounds729.getCenterX(), bounds729.getCenterY()
        );
        Shape rotated729 = rotation729.createTransformedShape(area729);
        g2d.setColor(new Color(62, 75, 96));
        g2d.fill(rotated729);

        // Rectangle
        Rectangle2D.Double rectangle730 = new Rectangle2D.Double(
                665.13, 236.22,
                4.85, 17.7
        );
        Rectangle2D bounds730 = rectangle730.getBounds2D();
        AffineTransform rotation730 = AffineTransform.getRotateInstance(
                Math.toRadians(-75.96),
                bounds730.getCenterX(), bounds730.getCenterY()
        );
        Shape rotated730 = rotation730.createTransformedShape(rectangle730);
        g2d.setColor(new Color(60, 70, 89));
        g2d.fill(rotated730);

        // Rectangle
        Rectangle2D.Double rectangle731 = new Rectangle2D.Double(
                263.08, 281.76,
                20.88, 14.62
        );
        Rectangle2D bounds731 = rectangle731.getBounds2D();
        AffineTransform rotation731 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds731.getCenterX(), bounds731.getCenterY()
        );
        Shape rotated731 = rotation731.createTransformedShape(rectangle731);
        g2d.setColor(new Color(38, 80, 148));
        g2d.fill(rotated731);

        // Rectangle
        Rectangle2D.Double rectangle732 = new Rectangle2D.Double(
                259.19, 300.48,
                13.04, 16.28
        );
        g2d.setColor(new Color(0, 16, 55));
        g2d.fill(rectangle732);

        // Circle
        Ellipse2D.Double circle733 = new Ellipse2D.Double(
                524.26, 335.48,
                21.05, 21.05
        );
        Rectangle2D bounds733 = circle733.getBounds2D();
        AffineTransform rotation733 = AffineTransform.getRotateInstance(
                Math.toRadians(264),
                bounds733.getCenterX(), bounds733.getCenterY()
        );
        Shape rotated733 = rotation733.createTransformedShape(circle733);
        g2d.setColor(new Color(37, 95, 187));
        g2d.fill(rotated733);

        // Rectangle
        Rectangle2D.Double rectangle734 = new Rectangle2D.Double(
                466.34, 266.65,
                15.71, 6.54
        );
        g2d.setColor(new Color(90, 156, 221));
        g2d.fill(rectangle734);

        // Area / transformation
        GeneralPath boundary735_1 = new GeneralPath();
        boundary735_1.moveTo(559.24, 33.34);
        boundary735_1.lineTo(573.24, 42.34);
        boundary735_1.lineTo(577.24, 42.34);
        boundary735_1.lineTo(580.24, 45.34);
        boundary735_1.lineTo(603.24, 54.34);
        boundary735_1.lineTo(611.24, 55.34);
        boundary735_1.lineTo(624.24, 59.34);
        boundary735_1.lineTo(634.24, 59.34);
        boundary735_1.lineTo(628.24, 57.34);
        boundary735_1.lineTo(611.24, 46.34);
        boundary735_1.lineTo(606.24, 20.34);
        boundary735_1.lineTo(605.24, 5.34);
        boundary735_1.lineTo(599.24, 3.34);
        boundary735_1.lineTo(603.24, 38.34);
        boundary735_1.lineTo(596.24, 46.34);
        boundary735_1.lineTo(590.24, 40.34);
        boundary735_1.lineTo(574.24, 37.34);
        boundary735_1.lineTo(568.24, 31.34);
        boundary735_1.closePath();
        Area area735 = new Area(boundary735_1);
        GeneralPath boundary735_2 = new GeneralPath();
        boundary735_2.moveTo(602.24, 49.34);
        boundary735_2.lineTo(605.24, 51.34);
        boundary735_2.lineTo(603.24, 53.34);
        boundary735_2.lineTo(600.24, 51.34);
        boundary735_2.closePath();
        area735.subtract(new Area(boundary735_2));
        GeneralPath boundary735_3 = new GeneralPath();
        boundary735_3.moveTo(597.24, 45.34);
        boundary735_3.lineTo(601.24, 48.34);
        boundary735_3.lineTo(599.24, 50.34);
        boundary735_3.lineTo(595.24, 47.34);
        boundary735_3.closePath();
        area735.subtract(new Area(boundary735_3));
        g2d.setColor(new Color(41, 36, 24));
        g2d.fill(area735);

        // Ellipse
        Ellipse2D.Double ellipse736 = new Ellipse2D.Double(
                634.89, 243.91,
                8.49, 7.83
        );
        Rectangle2D bounds736 = ellipse736.getBounds2D();
        AffineTransform rotation736 = AffineTransform.getRotateInstance(
                Math.toRadians(279),
                bounds736.getCenterX(), bounds736.getCenterY()
        );
        Shape rotated736 = rotation736.createTransformedShape(ellipse736);
        g2d.setColor(new Color(5, 23, 67));
        g2d.fill(rotated736);

        // Rectangle
        Rectangle2D.Double rectangle737 = new Rectangle2D.Double(
                164.44, 274.73,
                10.24, 7.05
        );
        g2d.setColor(new Color(55, 54, 138));
        g2d.fill(rectangle737);

    }

    public static void drawDetails58(Graphics2D g2d) {

        // General path
        GeneralPath gp738 = new GeneralPath();
        gp738.moveTo(495.21, 195.84);
        gp738.lineTo(509.36, 170.75);
        gp738.lineTo(523.52, 192.7);
        gp738.lineTo(509.36, 202.11);
        gp738.closePath();
        Rectangle2D bounds738 = gp738.getBounds2D();
        AffineTransform rotation738 = AffineTransform.getRotateInstance(
                Math.toRadians(39),
                bounds738.getCenterX(), bounds738.getCenterY()
        );
        Shape rotated738 = rotation738.createTransformedShape(gp738);
        g2d.setColor(new Color(57, 109, 211));
        g2d.fill(rotated738);

        // Rectangle
        Rectangle2D.Double rectangle739 = new Rectangle2D.Double(
                404.03, 287.94,
                16.39, 3.86
        );
        Rectangle2D bounds739 = rectangle739.getBounds2D();
        AffineTransform rotation739 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds739.getCenterX(), bounds739.getCenterY()
        );
        Shape rotated739 = rotation739.createTransformedShape(rectangle739);
        g2d.setColor(new Color(74, 93, 225));
        g2d.fill(rotated739);

        // Area / transformation
        Ellipse2D.Double outer740 = new Ellipse2D.Double(
                396.84, 332.59,
                23.06, 10.04
        );
        Ellipse2D.Double cutout740 = new Ellipse2D.Double(
                396.84 + 23.06 * 0.28,
                332.59 - 10.04 * 0.12,
                23.06, 10.04
        );
        Area area740 = new Area(outer740);
        area740.subtract(new Area(cutout740));
        Rectangle2D bounds740 = area740.getBounds2D();
        AffineTransform rotation740 = AffineTransform.getRotateInstance(
                Math.toRadians(240),
                bounds740.getCenterX(), bounds740.getCenterY()
        );
        Shape rotated740 = rotation740.createTransformedShape(area740);
        g2d.setColor(new Color(87, 81, 119));
        g2d.fill(rotated740);

        // Ellipse
        Ellipse2D.Double ellipse741 = new Ellipse2D.Double(
                362.86, 337.37,
                10.56, 16.8
        );
        Rectangle2D bounds741 = ellipse741.getBounds2D();
        AffineTransform rotation741 = AffineTransform.getRotateInstance(
                Math.toRadians(13.72),
                bounds741.getCenterX(), bounds741.getCenterY()
        );
        Shape rotated741 = rotation741.createTransformedShape(ellipse741);
        g2d.setColor(new Color(23, 24, 56));
        g2d.fill(rotated741);

        // Rectangle
        Rectangle2D.Double rectangle742 = new Rectangle2D.Double(
                295.52, 347.13,
                8.97, 10.08
        );
        g2d.setColor(new Color(27, 45, 111));
        g2d.fill(rectangle742);

        // Ellipse
        Ellipse2D.Double ellipse743 = new Ellipse2D.Double(
                206.34, 311.86,
                17.9, 8.96
        );
        Rectangle2D bounds743 = ellipse743.getBounds2D();
        AffineTransform rotation743 = AffineTransform.getRotateInstance(
                Math.toRadians(19),
                bounds743.getCenterX(), bounds743.getCenterY()
        );
        Shape rotated743 = rotation743.createTransformedShape(ellipse743);
        g2d.setColor(new Color(0, 12, 56));
        g2d.fill(rotated743);

        // Rectangle
        Rectangle2D.Double rectangle744 = new Rectangle2D.Double(
                502.99, 375.34,
                11.41, 14.53
        );
        g2d.setColor(new Color(0, 25, 114));
        g2d.fill(rectangle744);

        // Rectangle
        Rectangle2D.Double rectangle745 = new Rectangle2D.Double(
                312.43, 154.89,
                32.09, 15.02
        );
        Rectangle2D bounds745 = rectangle745.getBounds2D();
        AffineTransform rotation745 = AffineTransform.getRotateInstance(
                Math.toRadians(-45),
                bounds745.getCenterX(), bounds745.getCenterY()
        );
        Shape rotated745 = rotation745.createTransformedShape(rectangle745);
        g2d.setColor(new Color(58, 107, 161));
        g2d.fill(rotated745);

        // Circle
        Ellipse2D.Double circle746 = new Ellipse2D.Double(
                550.02, 360.79,
                22.85, 22.85
        );
        Rectangle2D bounds746 = circle746.getBounds2D();
        AffineTransform rotation746 = AffineTransform.getRotateInstance(
                Math.toRadians(50),
                bounds746.getCenterX(), bounds746.getCenterY()
        );
        Shape rotated746 = rotation746.createTransformedShape(circle746);
        g2d.setColor(new Color(4, 63, 159));
        g2d.fill(rotated746);

        // Ellipse
        Ellipse2D.Double ellipse747 = new Ellipse2D.Double(
                464.27, 382,
                16.13, 61.71
        );
        Rectangle2D bounds747 = ellipse747.getBounds2D();
        AffineTransform rotation747 = AffineTransform.getRotateInstance(
                Math.toRadians(102.42),
                bounds747.getCenterX(), bounds747.getCenterY()
        );
        Shape rotated747 = rotation747.createTransformedShape(ellipse747);
        g2d.setColor(new Color(31, 34, 43));
        g2d.fill(rotated747);

        // Circle
        Ellipse2D.Double circle748 = new Ellipse2D.Double(
                299.69, 295.94,
                9.33, 9.33
        );
        Rectangle2D bounds748 = circle748.getBounds2D();
        AffineTransform rotation748 = AffineTransform.getRotateInstance(
                Math.toRadians(123),
                bounds748.getCenterX(), bounds748.getCenterY()
        );
        Shape rotated748 = rotation748.createTransformedShape(circle748);
        g2d.setColor(new Color(80, 125, 199));
        g2d.fill(rotated748);

        // Square
        Rectangle2D.Double square749 = new Rectangle2D.Double(
                377.72, 323.55,
                12.05, 12.05
        );
        g2d.setColor(new Color(211, 194, 234));
        g2d.fill(square749);

        // Rectangle
        Rectangle2D.Double rectangle750 = new Rectangle2D.Double(
                359.46, 320.37,
                11.52, 11.44
        );
        g2d.setColor(new Color(201, 189, 218));
        g2d.fill(rectangle750);

    }

    public static void drawDetails59(Graphics2D g2d) {

        // General path
        GeneralPath gp751 = new GeneralPath();
        gp751.moveTo(624, 210);
        gp751.lineTo(619, 212);
        gp751.lineTo(613, 220);
        gp751.lineTo(608, 225);
        gp751.lineTo(606, 228);
        gp751.lineTo(604, 235);
        gp751.lineTo(583, 270);
        gp751.lineTo(578, 278);
        gp751.lineTo(567, 296);
        gp751.lineTo(559, 306);
        gp751.lineTo(565, 314);
        gp751.lineTo(567, 307);
        gp751.lineTo(581, 286);
        gp751.lineTo(590, 272);
        gp751.lineTo(600, 253);
        gp751.lineTo(612, 234);
        gp751.lineTo(615, 225);
        gp751.lineTo(621, 216);
        gp751.closePath();
        g2d.setColor(new Color(162, 188, 247));
        g2d.fill(gp751);

        // Rectangle
        Rectangle2D.Double rectangle752 = new Rectangle2D.Double(
                404.79, 178.62,
                12.51, 9.55
        );
        g2d.setColor(new Color(10, 18, 48));
        g2d.fill(rectangle752);

        // Square
        Rectangle2D.Double square753 = new Rectangle2D.Double(
                247.86, 344.54,
                8.9, 8.9
        );
        g2d.setColor(new Color(90, 121, 215));
        g2d.fill(square753);

        // Cubic curve
        CubicCurve2D.Double cc754 = new CubicCurve2D.Double(
                635.02, 121.74,
                640.1, 115.26,
                646.86, 128.21,
                651.93, 121.74
        );
        Rectangle2D bounds754 = cc754.getBounds2D();
        AffineTransform rotation754 = AffineTransform.getRotateInstance(
                Math.toRadians(12),
                bounds754.getCenterX(), bounds754.getCenterY()
        );
        Shape rotated754 = rotation754.createTransformedShape(cc754);
        g2d.setColor(new Color(6, 13, 52));
        BasicStroke bs754 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs754);
        g2d.draw(rotated754);

        // Square
        Rectangle2D.Double square755 = new Rectangle2D.Double(
                575.86, 315.14,
                13.5, 13.5
        );
        g2d.setColor(new Color(87, 124, 203));
        g2d.fill(square755);

        // Square
        Rectangle2D.Double square756 = new Rectangle2D.Double(
                362.61, 173.41,
                13.91, 13.91
        );
        g2d.setColor(new Color(10, 20, 54));
        g2d.fill(square756);

        // Square
        Rectangle2D.Double square757 = new Rectangle2D.Double(
                433.91, 237.48,
                15.05, 15.05
        );
        g2d.setColor(new Color(26, 40, 122));
        g2d.fill(square757);

        // General path
        GeneralPath gp758 = new GeneralPath();
        gp758.moveTo(459, 282);
        gp758.lineTo(454, 285);
        gp758.lineTo(449, 300);
        gp758.lineTo(454, 306);
        gp758.lineTo(450, 310);
        gp758.lineTo(446, 307);
        gp758.lineTo(450, 310);
        gp758.lineTo(454, 319);
        gp758.lineTo(461, 339);
        gp758.lineTo(459, 335);
        gp758.lineTo(456, 312);
        gp758.lineTo(465, 319);
        gp758.lineTo(480, 318);
        gp758.lineTo(481, 312);
        gp758.lineTo(478, 304);
        gp758.lineTo(475, 302);
        gp758.lineTo(472, 298);
        gp758.lineTo(468, 294);
        gp758.closePath();
        g2d.setColor(new Color(0, 17, 60));
        g2d.fill(gp758);

        // Square
        Rectangle2D.Double square759 = new Rectangle2D.Double(
                473.78, 426.74,
                8.97, 8.97
        );
        g2d.setColor(new Color(80, 71, 67));
        g2d.fill(square759);

        // Circle
        Ellipse2D.Double circle760 = new Ellipse2D.Double(
                715.9, 142.38,
                8.53, 8.53
        );
        Rectangle2D bounds760 = circle760.getBounds2D();
        AffineTransform rotation760 = AffineTransform.getRotateInstance(
                Math.toRadians(166),
                bounds760.getCenterX(), bounds760.getCenterY()
        );
        Shape rotated760 = rotation760.createTransformedShape(circle760);
        g2d.setColor(new Color(85, 133, 171));
        g2d.fill(rotated760);

        // Line
        Line2D.Double line761 = new Line2D.Double(
                488.97, 296.98,
                512.41, 296.98
        );
        Rectangle2D bounds761 = line761.getBounds2D();
        AffineTransform rotation761 = AffineTransform.getRotateInstance(
                Math.toRadians(10),
                bounds761.getCenterX(), bounds761.getCenterY()
        );
        Shape rotated761 = rotation761.createTransformedShape(line761);
        g2d.setColor(new Color(0, 10, 49));
        BasicStroke bs761 = new BasicStroke(
                2.96f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs761);
        g2d.draw(rotated761);

        // Rectangle
        Rectangle2D.Double rectangle762 = new Rectangle2D.Double(
                172.72, 303.94,
                6.75, 4.82
        );
        Rectangle2D bounds762 = rectangle762.getBounds2D();
        AffineTransform rotation762 = AffineTransform.getRotateInstance(
                Math.toRadians(-75.96),
                bounds762.getCenterX(), bounds762.getCenterY()
        );
        Shape rotated762 = rotation762.createTransformedShape(rectangle762);
        g2d.setColor(new Color(21, 20, 80));
        g2d.fill(rotated762);

        // Circle
        Ellipse2D.Double circle763 = new Ellipse2D.Double(
                249.45, 354.62,
                14.14, 14.14
        );
        Rectangle2D bounds763 = circle763.getBounds2D();
        AffineTransform rotation763 = AffineTransform.getRotateInstance(
                Math.toRadians(190),
                bounds763.getCenterX(), bounds763.getCenterY()
        );
        Shape rotated763 = rotation763.createTransformedShape(circle763);
        g2d.setColor(new Color(3, 46, 156));
        g2d.fill(rotated763);

    }

}

class witchPart7 {

    public static void drawPart(Graphics2D g2d) {
        drawDetails60(g2d);
        drawDetails61(g2d);
        drawDetails62(g2d);
        drawDetails63(g2d);
        drawDetails64(g2d);
        drawDetails65(g2d);
        drawDetails66(g2d);
        drawDetails67(g2d);
        drawDetails68(g2d);
        drawDetails69(g2d);
    }

    public static void drawDetails60(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle764 = new Rectangle2D.Double(
                405.06, 145.16,
                11.12, 37.51
        );
        Rectangle2D bounds764 = rectangle764.getBounds2D();
        AffineTransform rotation764 = AffineTransform.getRotateInstance(
                Math.toRadians(-78.69),
                bounds764.getCenterX(), bounds764.getCenterY()
        );
        Shape rotated764 = rotation764.createTransformedShape(rectangle764);
        g2d.setColor(new Color(38, 46, 116));
        g2d.fill(rotated764);

        // General path
        GeneralPath gp765 = new GeneralPath();
        gp765.moveTo(216, 365);
        gp765.lineTo(214, 358);
        gp765.lineTo(207, 351);
        gp765.lineTo(206, 346);
        gp765.lineTo(202, 344);
        gp765.lineTo(205, 350);
        gp765.lineTo(210, 358);
        gp765.lineTo(203, 359);
        gp765.lineTo(186, 358);
        gp765.lineTo(188, 361);
        gp765.lineTo(180, 360);
        gp765.lineTo(173, 349);
        gp765.lineTo(179, 362);
        gp765.lineTo(181, 361);
        gp765.lineTo(187, 364);
        gp765.lineTo(191, 362);
        gp765.lineTo(192, 357);
        gp765.lineTo(203, 362);
        gp765.closePath();
        g2d.setColor(new Color(104, 118, 171));
        g2d.fill(gp765);

        // Ellipse
        Ellipse2D.Double ellipse766 = new Ellipse2D.Double(
                266.05, 353.73,
                15.73, 5.58
        );
        Rectangle2D bounds766 = ellipse766.getBounds2D();
        AffineTransform rotation766 = AffineTransform.getRotateInstance(
                Math.toRadians(300),
                bounds766.getCenterX(), bounds766.getCenterY()
        );
        Shape rotated766 = rotation766.createTransformedShape(ellipse766);
        g2d.setColor(new Color(0, 14, 147));
        g2d.fill(rotated766);

        // Rectangle
        Rectangle2D.Double rectangle767 = new Rectangle2D.Double(
                412.29, 216.21,
                18.33, 24
        );
        g2d.setColor(new Color(81, 109, 213));
        g2d.fill(rectangle767);

        // Circle
        Ellipse2D.Double circle768 = new Ellipse2D.Double(
                456.54, 363.21,
                11.65, 11.65
        );
        Rectangle2D bounds768 = circle768.getBounds2D();
        AffineTransform rotation768 = AffineTransform.getRotateInstance(
                Math.toRadians(128),
                bounds768.getCenterX(), bounds768.getCenterY()
        );
        Shape rotated768 = rotation768.createTransformedShape(circle768);
        g2d.setColor(new Color(16, 15, 43));
        g2d.fill(rotated768);

        // Area / transformation
        Ellipse2D.Double outer769 = new Ellipse2D.Double(
                687.11, 141.31,
                34.25, 19.17
        );
        Ellipse2D.Double cutout769 = new Ellipse2D.Double(
                687.11 + 34.25 * 0.28,
                141.31 - 19.17 * 0.12,
                34.25, 19.17
        );
        Area area769 = new Area(outer769);
        area769.subtract(new Area(cutout769));
        Rectangle2D bounds769 = area769.getBounds2D();
        AffineTransform rotation769 = AffineTransform.getRotateInstance(
                Math.toRadians(24),
                bounds769.getCenterX(), bounds769.getCenterY()
        );
        Shape rotated769 = rotation769.createTransformedShape(area769);
        g2d.setColor(new Color(5, 6, 42));
        g2d.fill(rotated769);

        // General path
        GeneralPath gp770 = new GeneralPath();
        gp770.moveTo(381.07, 180.81);
        gp770.lineTo(386.96, 174.02);
        gp770.lineTo(392.84, 179.96);
        gp770.lineTo(386.96, 182.51);
        gp770.closePath();
        Rectangle2D bounds770 = gp770.getBounds2D();
        AffineTransform rotation770 = AffineTransform.getRotateInstance(
                Math.toRadians(106),
                bounds770.getCenterX(), bounds770.getCenterY()
        );
        Shape rotated770 = rotation770.createTransformedShape(gp770);
        g2d.setColor(new Color(218, 225, 255));
        g2d.fill(rotated770);

        // Rectangle
        Rectangle2D.Double rectangle771 = new Rectangle2D.Double(
                303.18, 182.97,
                11.02, 7.97
        );
        g2d.setColor(new Color(54, 86, 146));
        g2d.fill(rectangle771);

        // Rectangle
        Rectangle2D.Double rectangle772 = new Rectangle2D.Double(
                610.44, 95.23,
                14.94, 11.94
        );
        g2d.setColor(new Color(1, 7, 42));
        g2d.fill(rectangle772);

        // Area / transformation
        Ellipse2D.Double outer773 = new Ellipse2D.Double(
                634.65, 234.57,
                17.65, 9.13
        );
        Ellipse2D.Double cutout773 = new Ellipse2D.Double(
                634.65 + 17.65 * 0.28,
                234.57 - 9.13 * 0.12,
                17.65, 9.13
        );
        Area area773 = new Area(outer773);
        area773.subtract(new Area(cutout773));
        Rectangle2D bounds773 = area773.getBounds2D();
        AffineTransform rotation773 = AffineTransform.getRotateInstance(
                Math.toRadians(175),
                bounds773.getCenterX(), bounds773.getCenterY()
        );
        Shape rotated773 = rotation773.createTransformedShape(area773);
        g2d.setColor(new Color(0, 7, 67));
        g2d.fill(rotated773);

        // Ellipse
        Ellipse2D.Double ellipse774 = new Ellipse2D.Double(
                684.08, 87.89,
                14.46, 15.52
        );
        Rectangle2D bounds774 = ellipse774.getBounds2D();
        AffineTransform rotation774 = AffineTransform.getRotateInstance(
                Math.toRadians(34),
                bounds774.getCenterX(), bounds774.getCenterY()
        );
        Shape rotated774 = rotation774.createTransformedShape(ellipse774);
        g2d.setColor(new Color(1, 1, 31));
        g2d.fill(rotated774);

    }

    public static void drawDetails61(Graphics2D g2d) {

        // Quadratic curve
        QuadCurve2D.Double qc775 = new QuadCurve2D.Double(
                299.93, 318.9,
                307.93, 313.28,
                315.93, 318.9
        );
        Rectangle2D bounds775 = qc775.getBounds2D();
        AffineTransform rotation775 = AffineTransform.getRotateInstance(
                Math.toRadians(294),
                bounds775.getCenterX(), bounds775.getCenterY()
        );
        Shape rotated775 = rotation775.createTransformedShape(qc775);
        g2d.setColor(new Color(0, 5, 53));
        BasicStroke bs775 = new BasicStroke(
                3.25f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs775);
        g2d.draw(rotated775);

        // Quadratic curve
        QuadCurve2D.Double qc776 = new QuadCurve2D.Double(
                447.33, 187.99,
                456.01, 184.89,
                464.68, 187.99
        );
        Rectangle2D bounds776 = qc776.getBounds2D();
        AffineTransform rotation776 = AffineTransform.getRotateInstance(
                Math.toRadians(48),
                bounds776.getCenterX(), bounds776.getCenterY()
        );
        Shape rotated776 = rotation776.createTransformedShape(qc776);
        g2d.setColor(new Color(50, 99, 182));
        BasicStroke bs776 = new BasicStroke(
                3.01f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs776);
        g2d.draw(rotated776);

        // General path
        GeneralPath gp777 = new GeneralPath();
        gp777.moveTo(415.39, 190.34);
        gp777.lineTo(421.97, 185.4);
        gp777.lineTo(428.56, 189.72);
        gp777.lineTo(421.97, 191.57);
        gp777.closePath();
        Rectangle2D bounds777 = gp777.getBounds2D();
        AffineTransform rotation777 = AffineTransform.getRotateInstance(
                Math.toRadians(258),
                bounds777.getCenterX(), bounds777.getCenterY()
        );
        Shape rotated777 = rotation777.createTransformedShape(gp777);
        g2d.setColor(new Color(130, 188, 255));
        g2d.fill(rotated777);

        // Line
        Line2D.Double line778 = new Line2D.Double(
                547.33, 304.35,
                557.01, 304.35
        );
        Rectangle2D bounds778 = line778.getBounds2D();
        AffineTransform rotation778 = AffineTransform.getRotateInstance(
                Math.toRadians(251),
                bounds778.getCenterX(), bounds778.getCenterY()
        );
        Shape rotated778 = rotation778.createTransformedShape(line778);
        g2d.setColor(new Color(0, 15, 63));
        BasicStroke bs778 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs778);
        g2d.draw(rotated778);

        // General path
        GeneralPath gp779 = new GeneralPath();
        gp779.moveTo(279.07, 377.17);
        gp779.lineTo(284.56, 368.31);
        gp779.lineTo(290.06, 376.06);
        gp779.lineTo(284.56, 379.38);
        gp779.closePath();
        Rectangle2D bounds779 = gp779.getBounds2D();
        AffineTransform rotation779 = AffineTransform.getRotateInstance(
                Math.toRadians(285),
                bounds779.getCenterX(), bounds779.getCenterY()
        );
        Shape rotated779 = rotation779.createTransformedShape(gp779);
        g2d.setColor(new Color(0, 13, 141));
        g2d.fill(rotated779);

        // General path
        GeneralPath gp780 = new GeneralPath();
        gp780.moveTo(668, 0);
        gp780.lineTo(686, 12);
        gp780.lineTo(683, 20);
        gp780.lineTo(688, 21);
        gp780.lineTo(683, 28);
        gp780.lineTo(685, 27);
        gp780.lineTo(700, 35);
        gp780.lineTo(702, 41);
        gp780.lineTo(710, 35);
        gp780.lineTo(699, 34);
        gp780.lineTo(690, 22);
        gp780.lineTo(692, 20);
        gp780.lineTo(704, 17);
        gp780.lineTo(705, 11);
        gp780.lineTo(698, 7);
        gp780.lineTo(695, 4);
        gp780.lineTo(683, 11);
        gp780.lineTo(676, 14);
        gp780.closePath();
        g2d.setColor(new Color(16, 12, 21));
        g2d.fill(gp780);

        // General path
        GeneralPath gp781 = new GeneralPath();
        gp781.moveTo(547.31, 207.34);
        gp781.lineTo(550.31, 215.34);
        gp781.lineTo(551.31, 225.34);
        gp781.lineTo(563.31, 238.34);
        gp781.lineTo(566.31, 246.34);
        gp781.lineTo(565.31, 254.34);
        gp781.lineTo(567.31, 259.34);
        gp781.lineTo(569.31, 259.34);
        gp781.lineTo(572.31, 261.34);
        gp781.lineTo(581.31, 259.34);
        gp781.lineTo(585.31, 252.34);
        gp781.lineTo(584.31, 256.34);
        gp781.lineTo(578.31, 247.34);
        gp781.lineTo(565.31, 229.34);
        gp781.lineTo(569.31, 227.34);
        gp781.lineTo(567.31, 227.34);
        gp781.lineTo(563.31, 211.34);
        gp781.lineTo(554.31, 207.34);
        gp781.closePath();
        g2d.setColor(new Color(32, 78, 151));
        g2d.fill(gp781);

        // Circle
        Ellipse2D.Double circle782 = new Ellipse2D.Double(
                283.15, 181.19,
                16.32, 16.32
        );
        Rectangle2D bounds782 = circle782.getBounds2D();
        AffineTransform rotation782 = AffineTransform.getRotateInstance(
                Math.toRadians(58),
                bounds782.getCenterX(), bounds782.getCenterY()
        );
        Shape rotated782 = rotation782.createTransformedShape(circle782);
        g2d.setColor(new Color(41, 75, 127));
        g2d.fill(rotated782);

        // Square
        Rectangle2D.Double square783 = new Rectangle2D.Double(
                228.89, 350.38,
                17.01, 17.01
        );
        g2d.setColor(new Color(0, 37, 116));
        g2d.fill(square783);

        // General path
        GeneralPath gp784 = new GeneralPath();
        gp784.moveTo(531.42, 328.43);
        gp784.lineTo(539.13, 322.19);
        gp784.lineTo(546.84, 327.65);
        gp784.lineTo(539.13, 329.98);
        gp784.closePath();
        Rectangle2D bounds784 = gp784.getBounds2D();
        AffineTransform rotation784 = AffineTransform.getRotateInstance(
                Math.toRadians(315),
                bounds784.getCenterX(), bounds784.getCenterY()
        );
        Shape rotated784 = rotation784.createTransformedShape(gp784);
        g2d.setColor(new Color(0, 13, 60));
        g2d.fill(rotated784);

    }

    public static void drawDetails62(Graphics2D g2d) {

        // Cubic curve
        CubicCurve2D.Double cc785 = new CubicCurve2D.Double(
                466.25, 143.08,
                474.45, 137.8,
                485.38, 148.36,
                493.58, 143.08
        );
        Rectangle2D bounds785 = cc785.getBounds2D();
        AffineTransform rotation785 = AffineTransform.getRotateInstance(
                Math.toRadians(110),
                bounds785.getCenterX(), bounds785.getCenterY()
        );
        Shape rotated785 = rotation785.createTransformedShape(cc785);
        g2d.setColor(new Color(42, 90, 203));
        BasicStroke bs785 = new BasicStroke(
                3.01f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs785);
        g2d.draw(rotated785);

        // Rectangle
        Rectangle2D.Double rectangle786 = new Rectangle2D.Double(
                569.06, 337.82,
                14.43, 5.64
        );
        g2d.setColor(new Color(2, 23, 79));
        g2d.fill(rectangle786);

        // Square
        Rectangle2D.Double square787 = new Rectangle2D.Double(
                200.42, 256.87,
                7.68, 7.68
        );
        g2d.setColor(new Color(7, 18, 61));
        g2d.fill(square787);

        // Area / transformation
        GeneralPath boundary788_1 = new GeneralPath();
        boundary788_1.moveTo(186.14, 323.61);
        boundary788_1.lineTo(192.14, 324.61);
        boundary788_1.lineTo(184.14, 329.61);
        boundary788_1.lineTo(186.14, 329.61);
        boundary788_1.lineTo(193.14, 324.61);
        boundary788_1.lineTo(198.14, 327.61);
        boundary788_1.lineTo(202.14, 330.61);
        boundary788_1.lineTo(205.14, 331.61);
        boundary788_1.lineTo(202.14, 340.61);
        boundary788_1.lineTo(197.14, 343.61);
        boundary788_1.lineTo(199.14, 343.61);
        boundary788_1.lineTo(206.14, 340.61);
        boundary788_1.lineTo(210.14, 335.61);
        boundary788_1.lineTo(209.14, 333.61);
        boundary788_1.lineTo(205.14, 330.61);
        boundary788_1.lineTo(198.14, 327.61);
        boundary788_1.lineTo(196.14, 324.61);
        boundary788_1.lineTo(192.14, 321.61);
        boundary788_1.closePath();
        Area area788 = new Area(boundary788_1);
        GeneralPath boundary788_2 = new GeneralPath();
        boundary788_2.moveTo(205.14, 337.61);
        boundary788_2.lineTo(207.14, 336.61);
        boundary788_2.lineTo(208.14, 338.61);
        boundary788_2.lineTo(206.14, 339.61);
        boundary788_2.closePath();
        area788.subtract(new Area(boundary788_2));
        g2d.setColor(new Color(0, 4, 60));
        g2d.fill(area788);

        // Square
        Rectangle2D.Double square789 = new Rectangle2D.Double(
                572.36, 356.26,
                8.9, 8.9
        );
        g2d.setColor(new Color(0, 52, 143));
        g2d.fill(square789);

        // Rectangle
        Rectangle2D.Double rectangle790 = new Rectangle2D.Double(
                370.07, 389.02,
                5.31, 20.26
        );
        Rectangle2D bounds790 = rectangle790.getBounds2D();
        AffineTransform rotation790 = AffineTransform.getRotateInstance(
                Math.toRadians(-63.44),
                bounds790.getCenterX(), bounds790.getCenterY()
        );
        Shape rotated790 = rotation790.createTransformedShape(rectangle790);
        g2d.setColor(new Color(32, 25, 134));
        g2d.fill(rotated790);

        // Square
        Rectangle2D.Double square791 = new Rectangle2D.Double(
                485.32, 219.38,
                8.59, 8.59
        );
        g2d.setColor(new Color(76, 146, 223));
        g2d.fill(square791);

        // Rectangle
        Rectangle2D.Double rectangle792 = new Rectangle2D.Double(
                374.02, 265.06,
                19.33, 12.63
        );
        g2d.setColor(new Color(233, 252, 252));
        g2d.fill(rectangle792);

        // Rectangle
        Rectangle2D.Double rectangle793 = new Rectangle2D.Double(
                268.48, 62.88,
                2.64, 33.31
        );
        Rectangle2D bounds793 = rectangle793.getBounds2D();
        AffineTransform rotation793 = AffineTransform.getRotateInstance(
                Math.toRadians(-19.65),
                bounds793.getCenterX(), bounds793.getCenterY()
        );
        Shape rotated793 = rotation793.createTransformedShape(rectangle793);
        g2d.setColor(new Color(11, 30, 90));
        g2d.fill(rotated793);

        // Quadratic curve
        QuadCurve2D.Double qc794 = new QuadCurve2D.Double(
                618.75, 226.09,
                626.09, 216.95,
                633.42, 226.09
        );
        Rectangle2D bounds794 = qc794.getBounds2D();
        AffineTransform rotation794 = AffineTransform.getRotateInstance(
                Math.toRadians(161),
                bounds794.getCenterX(), bounds794.getCenterY()
        );
        Shape rotated794 = rotation794.createTransformedShape(qc794);
        g2d.setColor(new Color(7, 29, 98));
        BasicStroke bs794 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs794);
        g2d.draw(rotated794);

        // Ellipse
        Ellipse2D.Double ellipse795 = new Ellipse2D.Double(
                524.6, 363.35,
                9.86, 11.3
        );
        Rectangle2D bounds795 = ellipse795.getBounds2D();
        AffineTransform rotation795 = AffineTransform.getRotateInstance(
                Math.toRadians(246),
                bounds795.getCenterX(), bounds795.getCenterY()
        );
        Shape rotated795 = rotation795.createTransformedShape(ellipse795);
        g2d.setColor(new Color(1, 25, 90));
        g2d.fill(rotated795);

        // Area / transformation
        Ellipse2D.Double outer796 = new Ellipse2D.Double(
                134.01, 349.21,
                30.32, 17.11
        );
        Ellipse2D.Double cutout796 = new Ellipse2D.Double(
                134.01 + 30.32 * 0.28,
                349.21 - 17.11 * 0.12,
                30.32, 17.11
        );
        Area area796 = new Area(outer796);
        area796.subtract(new Area(cutout796));
        Rectangle2D bounds796 = area796.getBounds2D();
        AffineTransform rotation796 = AffineTransform.getRotateInstance(
                Math.toRadians(115),
                bounds796.getCenterX(), bounds796.getCenterY()
        );
        Shape rotated796 = rotation796.createTransformedShape(area796);
        g2d.setColor(new Color(43, 48, 96));
        g2d.fill(rotated796);

    }

    public static void drawDetails63(Graphics2D g2d) {

        // Circle
        Ellipse2D.Double circle797 = new Ellipse2D.Double(
                371.8, 375.64,
                7.92, 7.92
        );
        g2d.setColor(new Color(114, 118, 236));
        g2d.fill(circle797);

        // Rectangle
        Rectangle2D.Double rectangle798 = new Rectangle2D.Double(
                362.9, 432.36,
                22.39, 16.99
        );
        Rectangle2D bounds798 = rectangle798.getBounds2D();
        AffineTransform rotation798 = AffineTransform.getRotateInstance(
                Math.toRadians(-82.88),
                bounds798.getCenterX(), bounds798.getCenterY()
        );
        Shape rotated798 = rotation798.createTransformedShape(rectangle798);
        g2d.setColor(new Color(13, 19, 45));
        g2d.fill(rotated798);

        // Line
        Line2D.Double line799 = new Line2D.Double(
                513.74, 404.35,
                538.44, 404.35
        );
        Rectangle2D bounds799 = line799.getBounds2D();
        AffineTransform rotation799 = AffineTransform.getRotateInstance(
                Math.toRadians(91),
                bounds799.getCenterX(), bounds799.getCenterY()
        );
        Shape rotated799 = rotation799.createTransformedShape(line799);
        g2d.setColor(new Color(5, 18, 102));
        BasicStroke bs799 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs799);
        g2d.draw(rotated799);

        // Ellipse
        Ellipse2D.Double ellipse800 = new Ellipse2D.Double(
                329.35, 86.8,
                2.88, 42.24
        );
        Rectangle2D bounds800 = ellipse800.getBounds2D();
        AffineTransform rotation800 = AffineTransform.getRotateInstance(
                Math.toRadians(134.46),
                bounds800.getCenterX(), bounds800.getCenterY()
        );
        Shape rotated800 = rotation800.createTransformedShape(ellipse800);
        g2d.setColor(new Color(46, 58, 78));
        g2d.fill(rotated800);

        // Ellipse
        Ellipse2D.Double ellipse801 = new Ellipse2D.Double(
                606.73, 289.13,
                9.02, 30.67
        );
        Rectangle2D bounds801 = ellipse801.getBounds2D();
        AffineTransform rotation801 = AffineTransform.getRotateInstance(
                Math.toRadians(31.61),
                bounds801.getCenterX(), bounds801.getCenterY()
        );
        Shape rotated801 = rotation801.createTransformedShape(ellipse801);
        g2d.setColor(new Color(82, 118, 194));
        g2d.fill(rotated801);

        // Quadratic curve
        QuadCurve2D.Double qc802 = new QuadCurve2D.Double(
                497.4, 326.09,
                504.35, 322.7,
                511.3, 326.09
        );
        Rectangle2D bounds802 = qc802.getBounds2D();
        AffineTransform rotation802 = AffineTransform.getRotateInstance(
                Math.toRadians(196),
                bounds802.getCenterX(), bounds802.getCenterY()
        );
        Shape rotated802 = rotation802.createTransformedShape(qc802);
        g2d.setColor(new Color(134, 160, 229));
        BasicStroke bs802 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs802);
        g2d.draw(rotated802);

        // Line
        Line2D.Double line803 = new Line2D.Double(
                429.83, 195.65,
                448.43, 195.65
        );
        Rectangle2D bounds803 = line803.getBounds2D();
        AffineTransform rotation803 = AffineTransform.getRotateInstance(
                Math.toRadians(154),
                bounds803.getCenterX(), bounds803.getCenterY()
        );
        Shape rotated803 = rotation803.createTransformedShape(line803);
        g2d.setColor(new Color(142, 196, 239));
        BasicStroke bs803 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs803);
        g2d.draw(rotated803);

        // Quadratic curve
        QuadCurve2D.Double qc804 = new QuadCurve2D.Double(
                448.67, 209.06,
                460.51, 198.1,
                472.35, 209.06
        );
        Rectangle2D bounds804 = qc804.getBounds2D();
        AffineTransform rotation804 = AffineTransform.getRotateInstance(
                Math.toRadians(174),
                bounds804.getCenterX(), bounds804.getCenterY()
        );
        Shape rotated804 = rotation804.createTransformedShape(qc804);
        g2d.setColor(new Color(2, 14, 73));
        BasicStroke bs804 = new BasicStroke(
                3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs804);
        g2d.draw(rotated804);

        // Cubic curve
        CubicCurve2D.Double cc805 = new CubicCurve2D.Double(
                251.99, 330.3,
                256.19, 325.46,
                261.78, 335.14,
                265.98, 330.3
        );
        Rectangle2D bounds805 = cc805.getBounds2D();
        AffineTransform rotation805 = AffineTransform.getRotateInstance(
                Math.toRadians(182),
                bounds805.getCenterX(), bounds805.getCenterY()
        );
        Shape rotated805 = rotation805.createTransformedShape(cc805);
        g2d.setColor(new Color(62, 106, 185));
        BasicStroke bs805 = new BasicStroke(
                2.95f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs805);
        g2d.draw(rotated805);

        // Rectangle
        Rectangle2D.Double rectangle806 = new Rectangle2D.Double(
                215.58, 325.59,
                11.77, 12.38
        );
        g2d.setColor(new Color(9, 9, 139));
        g2d.fill(rectangle806);

        // Quadratic curve
        QuadCurve2D.Double qc807 = new QuadCurve2D.Double(
                544.48, 342.72,
                552.54, 338.88,
                560.59, 342.72
        );
        Rectangle2D bounds807 = qc807.getBounds2D();
        AffineTransform rotation807 = AffineTransform.getRotateInstance(
                Math.toRadians(80),
                bounds807.getCenterX(), bounds807.getCenterY()
        );
        Shape rotated807 = rotation807.createTransformedShape(qc807);
        g2d.setColor(new Color(0, 9, 57));
        BasicStroke bs807 = new BasicStroke(
                3.16f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs807);
        g2d.draw(rotated807);

        // Square
        Rectangle2D.Double square808 = new Rectangle2D.Double(
                254.12, 246.85,
                17.14, 17.14
        );
        g2d.setColor(new Color(27, 57, 111));
        g2d.fill(square808);

    }

    public static void drawDetails64(Graphics2D g2d) {

        // Area / transformation
        Ellipse2D.Double outer809 = new Ellipse2D.Double(
                388.99, 390.62,
                22.03, 10.07
        );
        Ellipse2D.Double cutout809 = new Ellipse2D.Double(
                388.99 + 22.03 * 0.28,
                390.62 - 10.07 * 0.12,
                22.03, 10.07
        );
        Area area809 = new Area(outer809);
        area809.subtract(new Area(cutout809));
        Rectangle2D bounds809 = area809.getBounds2D();
        AffineTransform rotation809 = AffineTransform.getRotateInstance(
                Math.toRadians(160),
                bounds809.getCenterX(), bounds809.getCenterY()
        );
        Shape rotated809 = rotation809.createTransformedShape(area809);
        g2d.setColor(new Color(68, 59, 195));
        g2d.fill(rotated809);

        // Rectangle
        Rectangle2D.Double rectangle810 = new Rectangle2D.Double(
                229.02, 318.34,
                11.67, 9.88
        );
        g2d.setColor(new Color(0, 16, 58));
        g2d.fill(rectangle810);

        // Cubic curve
        CubicCurve2D.Double cc811 = new CubicCurve2D.Double(
                456.03, 447.16,
                465.23, 438.55,
                477.49, 455.77,
                486.69, 447.16
        );
        Rectangle2D bounds811 = cc811.getBounds2D();
        AffineTransform rotation811 = AffineTransform.getRotateInstance(
                Math.toRadians(45),
                bounds811.getCenterX(), bounds811.getCenterY()
        );
        Shape rotated811 = rotation811.createTransformedShape(cc811);
        g2d.setColor(new Color(11, 8, 5));
        BasicStroke bs811 = new BasicStroke(
                2.81f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs811);
        g2d.draw(rotated811);

        // Square
        Rectangle2D.Double square812 = new Rectangle2D.Double(
                254.98, 50.64,
                10.22, 10.22
        );
        g2d.setColor(new Color(8, 18, 44));
        g2d.fill(square812);

        // Rectangle
        Rectangle2D.Double rectangle813 = new Rectangle2D.Double(
                651.1, 26.03,
                19.42, 11.87
        );
        g2d.setColor(new Color(28, 24, 28));
        g2d.fill(rectangle813);

        // General path
        GeneralPath gp814 = new GeneralPath();
        gp814.moveTo(494.31, 271.55);
        gp814.lineTo(509.56, 253.63);
        gp814.lineTo(524.8, 269.31);
        gp814.lineTo(509.56, 276.03);
        gp814.closePath();
        Rectangle2D bounds814 = gp814.getBounds2D();
        AffineTransform rotation814 = AffineTransform.getRotateInstance(
                Math.toRadians(174),
                bounds814.getCenterX(), bounds814.getCenterY()
        );
        Shape rotated814 = rotation814.createTransformedShape(gp814);
        g2d.setColor(new Color(91, 145, 213));
        g2d.fill(rotated814);

        // Square
        Rectangle2D.Double square815 = new Rectangle2D.Double(
                574.65, 173.76,
                33.3, 33.3
        );
        g2d.setColor(new Color(7, 39, 93));
        g2d.fill(square815);

        // Rectangle
        Rectangle2D.Double rectangle816 = new Rectangle2D.Double(
                613.01, 144.33,
                13.84, 6.62
        );
        g2d.setColor(new Color(153, 174, 225));
        g2d.fill(rectangle816);

        // General path
        GeneralPath gp817 = new GeneralPath();
        gp817.moveTo(635.25, 89.6);
        gp817.lineTo(634.25, 92.6);
        gp817.lineTo(648.25, 100.6);
        gp817.lineTo(649.25, 97.6);
        gp817.lineTo(646.25, 94.6);
        gp817.lineTo(645.25, 91.6);
        gp817.lineTo(641.25, 91.6);
        gp817.closePath();
        g2d.setColor(new Color(63, 65, 139));
        g2d.fill(gp817);

        // Rectangle
        Rectangle2D.Double rectangle818 = new Rectangle2D.Double(
                563.47, 149.02,
                5.6, 61.13
        );
        Rectangle2D bounds818 = rectangle818.getBounds2D();
        AffineTransform rotation818 = AffineTransform.getRotateInstance(
                Math.toRadians(-1.79),
                bounds818.getCenterX(), bounds818.getCenterY()
        );
        Shape rotated818 = rotation818.createTransformedShape(rectangle818);
        g2d.setColor(new Color(17, 84, 160));
        g2d.fill(rotated818);

        // Ellipse
        Ellipse2D.Double ellipse819 = new Ellipse2D.Double(
                277.28, 299.67,
                15.83, 30.46
        );
        Rectangle2D bounds819 = ellipse819.getBounds2D();
        AffineTransform rotation819 = AffineTransform.getRotateInstance(
                Math.toRadians(46.16),
                bounds819.getCenterX(), bounds819.getCenterY()
        );
        Shape rotated819 = rotation819.createTransformedShape(ellipse819);
        g2d.setColor(new Color(39, 91, 173));
        g2d.fill(rotated819);

        // Circle
        Ellipse2D.Double circle820 = new Ellipse2D.Double(
                639.19, 63.96,
                25.91, 25.91
        );
        Rectangle2D bounds820 = circle820.getBounds2D();
        AffineTransform rotation820 = AffineTransform.getRotateInstance(
                Math.toRadians(316),
                bounds820.getCenterX(), bounds820.getCenterY()
        );
        Shape rotated820 = rotation820.createTransformedShape(circle820);
        g2d.setColor(new Color(0, 3, 32));
        g2d.fill(rotated820);

    }

    public static void drawDetails65(Graphics2D g2d) {

        // Area / transformation
        GeneralPath boundary821_1 = new GeneralPath();
        boundary821_1.moveTo(434.7, 300.67);
        boundary821_1.lineTo(428.7, 322.67);
        boundary821_1.lineTo(423.7, 318.67);
        boundary821_1.lineTo(421.7, 327.67);
        boundary821_1.lineTo(434.7, 332.67);
        boundary821_1.lineTo(445.7, 340.67);
        boundary821_1.lineTo(455.7, 347.67);
        boundary821_1.lineTo(459.7, 350.67);
        boundary821_1.lineTo(463.7, 356.67);
        boundary821_1.lineTo(471.7, 362.67);
        boundary821_1.lineTo(465.7, 352.67);
        boundary821_1.lineTo(463.7, 345.67);
        boundary821_1.lineTo(457.7, 337.67);
        boundary821_1.lineTo(454.7, 329.67);
        boundary821_1.lineTo(452.7, 329.67);
        boundary821_1.lineTo(449.7, 319.67);
        boundary821_1.lineTo(443.7, 305.67);
        boundary821_1.lineTo(442.7, 303.67);
        boundary821_1.closePath();
        Area area821 = new Area(boundary821_1);
        GeneralPath boundary821_2 = new GeneralPath();
        boundary821_2.moveTo(451.7, 328.67);
        boundary821_2.lineTo(453.7, 330.67);
        boundary821_2.lineTo(452.7, 332.67);
        boundary821_2.lineTo(449.7, 330.67);
        boundary821_2.closePath();
        area821.subtract(new Area(boundary821_2));
        GeneralPath boundary821_3 = new GeneralPath();
        boundary821_3.moveTo(444.7, 317.67);
        boundary821_3.lineTo(447.7, 319.67);
        boundary821_3.lineTo(446.7, 320.67);
        boundary821_3.lineTo(451.7, 326.67);
        boundary821_3.lineTo(449.7, 328.67);
        boundary821_3.lineTo(448.7, 327.67);
        boundary821_3.lineTo(445.7, 326.67);
        boundary821_3.lineTo(445.7, 322.67);
        boundary821_3.closePath();
        area821.subtract(new Area(boundary821_3));
        g2d.setColor(new Color(22, 24, 42));
        g2d.fill(area821);

        // Square
        Rectangle2D.Double square822 = new Rectangle2D.Double(
                639.94, 249.87,
                36.95, 36.95
        );
        Rectangle2D bounds822 = square822.getBounds2D();
        AffineTransform rotation822 = AffineTransform.getRotateInstance(
                Math.toRadians(-40.91),
                bounds822.getCenterX(), bounds822.getCenterY()
        );
        Shape rotated822 = rotation822.createTransformedShape(square822);
        g2d.setColor(new Color(6, 17, 62));
        g2d.fill(rotated822);

        // Rectangle
        Rectangle2D.Double rectangle823 = new Rectangle2D.Double(
                339.66, 372.84,
                17.64, 12.86
        );
        g2d.setColor(new Color(74, 65, 195));
        g2d.fill(rectangle823);

        // Quadratic curve
        QuadCurve2D.Double qc824 = new QuadCurve2D.Double(
                295.32, 279.5,
                307.58, 264.35,
                319.85, 279.5
        );
        Rectangle2D bounds824 = qc824.getBounds2D();
        AffineTransform rotation824 = AffineTransform.getRotateInstance(
                Math.toRadians(40),
                bounds824.getCenterX(), bounds824.getCenterY()
        );
        Shape rotated824 = rotation824.createTransformedShape(qc824);
        g2d.setColor(new Color(81, 123, 207));
        BasicStroke bs824 = new BasicStroke(
                3.09f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs824);
        g2d.draw(rotated824);

        // Rectangle
        Rectangle2D.Double rectangle825 = new Rectangle2D.Double(
                641.95, 192.7,
                9.09, 6.82
        );
        g2d.setColor(new Color(0, 7, 44));
        g2d.fill(rectangle825);

        // Area / transformation
        GeneralPath boundary826_1 = new GeneralPath();
        boundary826_1.moveTo(159, 256);
        boundary826_1.lineTo(161, 265);
        boundary826_1.lineTo(165, 278);
        boundary826_1.lineTo(175, 272);
        boundary826_1.lineTo(175, 284);
        boundary826_1.lineTo(175, 298);
        boundary826_1.lineTo(176, 291);
        boundary826_1.lineTo(178, 292);
        boundary826_1.lineTo(180, 303);
        boundary826_1.lineTo(184, 312);
        boundary826_1.lineTo(191, 316);
        boundary826_1.lineTo(180, 317);
        boundary826_1.lineTo(191, 318);
        boundary826_1.lineTo(196, 314);
        boundary826_1.lineTo(206, 304);
        boundary826_1.lineTo(206, 304);
        boundary826_1.lineTo(182, 277);
        boundary826_1.lineTo(172, 262);
        boundary826_1.closePath();
        Area area826 = new Area(boundary826_1);
        GeneralPath boundary826_2 = new GeneralPath();
        boundary826_2.moveTo(189, 305);
        boundary826_2.lineTo(190, 306);
        boundary826_2.lineTo(189, 309);
        boundary826_2.lineTo(187, 307);
        boundary826_2.closePath();
        area826.subtract(new Area(boundary826_2));
        GeneralPath boundary826_3 = new GeneralPath();
        boundary826_3.moveTo(174, 287);
        boundary826_3.lineTo(176, 286);
        boundary826_3.lineTo(177, 288);
        boundary826_3.lineTo(176, 289);
        boundary826_3.closePath();
        area826.subtract(new Area(boundary826_3));
        g2d.setColor(new Color(112, 116, 193));
        g2d.fill(area826);

        // Rectangle
        Rectangle2D.Double rectangle827 = new Rectangle2D.Double(
                317.42, 426.98,
                25.95, 15.09
        );
        Rectangle2D bounds827 = rectangle827.getBounds2D();
        AffineTransform rotation827 = AffineTransform.getRotateInstance(
                Math.toRadians(-50.19),
                bounds827.getCenterX(), bounds827.getCenterY()
        );
        Shape rotated827 = rotation827.createTransformedShape(rectangle827);
        g2d.setColor(new Color(9, 12, 17));
        g2d.fill(rotated827);

        // Square
        Rectangle2D.Double square828 = new Rectangle2D.Double(
                520.75, 94.39,
                24.41, 24.41
        );
        g2d.setColor(new Color(14, 30, 125));
        g2d.fill(square828);

        // Square
        Rectangle2D.Double square829 = new Rectangle2D.Double(
                590.64, 1.99,
                16.91, 16.91
        );
        g2d.setColor(new Color(25, 23, 16));
        g2d.fill(square829);

        // Rectangle
        Rectangle2D.Double rectangle830 = new Rectangle2D.Double(
                422.79, 84.48,
                25.7, 4.75
        );
        Rectangle2D bounds830 = rectangle830.getBounds2D();
        AffineTransform rotation830 = AffineTransform.getRotateInstance(
                Math.toRadians(-10.01),
                bounds830.getCenterX(), bounds830.getCenterY()
        );
        Shape rotated830 = rotation830.createTransformedShape(rectangle830);
        g2d.setColor(new Color(5, 12, 34));
        g2d.fill(rotated830);

    }

    public static void drawDetails66(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse831 = new Ellipse2D.Double(
                425.41, 65.71,
                13.17, 17.24
        );
        Rectangle2D bounds831 = ellipse831.getBounds2D();
        AffineTransform rotation831 = AffineTransform.getRotateInstance(
                Math.toRadians(187),
                bounds831.getCenterX(), bounds831.getCenterY()
        );
        Shape rotated831 = rotation831.createTransformedShape(ellipse831);
        g2d.setColor(new Color(19, 40, 127));
        g2d.fill(rotated831);

        // Area / transformation
        GeneralPath boundary832_1 = new GeneralPath();
        boundary832_1.moveTo(392.44, 84.16);
        boundary832_1.lineTo(392.44, 88.16);
        boundary832_1.lineTo(395.44, 92.16);
        boundary832_1.lineTo(397.44, 93.16);
        boundary832_1.lineTo(398.44, 92.16);
        boundary832_1.lineTo(401.44, 92.16);
        boundary832_1.lineTo(404.44, 90.16);
        boundary832_1.lineTo(404.44, 85.16);
        boundary832_1.lineTo(403.44, 83.16);
        boundary832_1.lineTo(400.44, 81.16);
        boundary832_1.lineTo(395.44, 81.16);
        boundary832_1.closePath();
        Area area832 = new Area(boundary832_1);
        GeneralPath boundary832_2 = new GeneralPath();
        boundary832_2.moveTo(397.44, 84.16);
        boundary832_2.lineTo(400.44, 84.16);
        boundary832_2.lineTo(402.44, 86.16);
        boundary832_2.lineTo(402.44, 89.16);
        boundary832_2.lineTo(400.44, 91.16);
        boundary832_2.lineTo(397.44, 91.16);
        boundary832_2.lineTo(395.44, 89.16);
        boundary832_2.lineTo(395.44, 86.16);
        boundary832_2.closePath();
        area832.subtract(new Area(boundary832_2));
        g2d.setColor(new Color(72, 57, 0));
        g2d.fill(area832);

        // Ellipse
        Ellipse2D.Double ellipse833 = new Ellipse2D.Double(
                503.84, 88.41,
                10.69, 5.93
        );
        Rectangle2D bounds833 = ellipse833.getBounds2D();
        AffineTransform rotation833 = AffineTransform.getRotateInstance(
                Math.toRadians(79),
                bounds833.getCenterX(), bounds833.getCenterY()
        );
        Shape rotated833 = rotation833.createTransformedShape(ellipse833);
        g2d.setColor(new Color(81, 112, 197));
        g2d.fill(rotated833);

        // Ellipse
        Ellipse2D.Double ellipse834 = new Ellipse2D.Double(
                487.06, 403.56,
                13.26, 5
        );
        Rectangle2D bounds834 = ellipse834.getBounds2D();
        AffineTransform rotation834 = AffineTransform.getRotateInstance(
                Math.toRadians(131),
                bounds834.getCenterX(), bounds834.getCenterY()
        );
        Shape rotated834 = rotation834.createTransformedShape(ellipse834);
        g2d.setColor(new Color(120, 121, 160));
        g2d.fill(rotated834);

        // Square
        Rectangle2D.Double square835 = new Rectangle2D.Double(
                570.95, 141.14,
                25.9, 25.9
        );
        g2d.setColor(new Color(4, 36, 95));
        g2d.fill(square835);

        // Rectangle
        Rectangle2D.Double rectangle836 = new Rectangle2D.Double(
                385.71, 117.18,
                15.39, 21.96
        );
        Rectangle2D bounds836 = rectangle836.getBounds2D();
        AffineTransform rotation836 = AffineTransform.getRotateInstance(
                Math.toRadians(-75.96),
                bounds836.getCenterX(), bounds836.getCenterY()
        );
        Shape rotated836 = rotation836.createTransformedShape(rectangle836);
        g2d.setColor(new Color(12, 20, 49));
        g2d.fill(rotated836);

        // Area / transformation
        Ellipse2D.Double outer837 = new Ellipse2D.Double(
                629.38, 160.82,
                12.74, 12.58
        );
        Ellipse2D.Double cutout837 = new Ellipse2D.Double(
                629.38 + 12.74 * 0.28,
                160.82 - 12.58 * 0.12,
                12.74, 12.58
        );
        Area area837 = new Area(outer837);
        area837.subtract(new Area(cutout837));
        Rectangle2D bounds837 = area837.getBounds2D();
        AffineTransform rotation837 = AffineTransform.getRotateInstance(
                Math.toRadians(223),
                bounds837.getCenterX(), bounds837.getCenterY()
        );
        Shape rotated837 = rotation837.createTransformedShape(area837);
        g2d.setColor(new Color(5, 5, 46));
        g2d.fill(rotated837);

        // Cubic curve
        CubicCurve2D.Double cc838 = new CubicCurve2D.Double(
                592.8, 231.09,
                596.91, 226.57,
                602.39, 235.61,
                606.5, 231.09
        );
        Rectangle2D bounds838 = cc838.getBounds2D();
        AffineTransform rotation838 = AffineTransform.getRotateInstance(
                Math.toRadians(158),
                bounds838.getCenterX(), bounds838.getCenterY()
        );
        Shape rotated838 = rotation838.createTransformedShape(cc838);
        g2d.setColor(new Color(7, 29, 89));
        BasicStroke bs838 = new BasicStroke(
                2.89f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs838);
        g2d.draw(rotated838);

        // Rectangle
        Rectangle2D.Double rectangle839 = new Rectangle2D.Double(
                643.09, 179.14,
                17.55, 3.59
        );
        Rectangle2D bounds839 = rectangle839.getBounds2D();
        AffineTransform rotation839 = AffineTransform.getRotateInstance(
                Math.toRadians(-22.62),
                bounds839.getCenterX(), bounds839.getCenterY()
        );
        Shape rotated839 = rotation839.createTransformedShape(rectangle839);
        g2d.setColor(new Color(3, 13, 43));
        g2d.fill(rotated839);

        // Square
        Rectangle2D.Double square840 = new Rectangle2D.Double(
                537.68, 34.92,
                23.98, 23.98
        );
        g2d.setColor(new Color(9, 25, 73));
        g2d.fill(square840);

        // Ellipse
        Ellipse2D.Double ellipse841 = new Ellipse2D.Double(
                437.58, 266.74,
                19.02, 37.36
        );
        Rectangle2D bounds841 = ellipse841.getBounds2D();
        AffineTransform rotation841 = AffineTransform.getRotateInstance(
                Math.toRadians(170.79),
                bounds841.getCenterX(), bounds841.getCenterY()
        );
        Shape rotated841 = rotation841.createTransformedShape(ellipse841);
        g2d.setColor(new Color(7, 23, 76));
        g2d.fill(rotated841);

        // Circle
        Ellipse2D.Double circle842 = new Ellipse2D.Double(
                654.22, 96.56,
                9.34, 9.34
        );
        g2d.setColor(new Color(8, 13, 50));
        g2d.fill(circle842);

    }

    public static void drawDetails67(Graphics2D g2d) {

        // Line
        Line2D.Double line843 = new Line2D.Double(
                570.29, 282.61,
                586.24, 282.61
        );
        Rectangle2D bounds843 = line843.getBounds2D();
        AffineTransform rotation843 = AffineTransform.getRotateInstance(
                Math.toRadians(150),
                bounds843.getCenterX(), bounds843.getCenterY()
        );
        Shape rotated843 = rotation843.createTransformedShape(line843);
        g2d.setColor(new Color(177, 210, 255));
        BasicStroke bs843 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs843);
        g2d.draw(rotated843);

        // Area / transformation
        Ellipse2D.Double outer844 = new Ellipse2D.Double(
                457.71, 260.37,
                15.36, 18.18
        );
        Ellipse2D.Double cutout844 = new Ellipse2D.Double(
                457.71 + 15.36 * 0.28,
                260.37 - 18.18 * 0.12,
                15.36, 18.18
        );
        Area area844 = new Area(outer844);
        area844.subtract(new Area(cutout844));
        Rectangle2D bounds844 = area844.getBounds2D();
        AffineTransform rotation844 = AffineTransform.getRotateInstance(
                Math.toRadians(163),
                bounds844.getCenterX(), bounds844.getCenterY()
        );
        Shape rotated844 = rotation844.createTransformedShape(area844);
        g2d.setColor(new Color(67, 112, 177));
        g2d.fill(rotated844);

        // Line
        Line2D.Double line845 = new Line2D.Double(
                465.18, 355.72,
                488.81, 355.72
        );
        Rectangle2D bounds845 = line845.getBounds2D();
        AffineTransform rotation845 = AffineTransform.getRotateInstance(
                Math.toRadians(38),
                bounds845.getCenterX(), bounds845.getCenterY()
        );
        Shape rotated845 = rotation845.createTransformedShape(line845);
        g2d.setColor(new Color(0, 23, 95));
        BasicStroke bs845 = new BasicStroke(
                2.97f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs845);
        g2d.draw(rotated845);

        // Area / transformation
        Ellipse2D.Double outer846 = new Ellipse2D.Double(
                594.99, 35.07,
                18.31, 9.93
        );
        Ellipse2D.Double cutout846 = new Ellipse2D.Double(
                594.99 + 18.31 * 0.28,
                35.07 - 9.93 * 0.12,
                18.31, 9.93
        );
        Area area846 = new Area(outer846);
        area846.subtract(new Area(cutout846));
        Rectangle2D bounds846 = area846.getBounds2D();
        AffineTransform rotation846 = AffineTransform.getRotateInstance(
                Math.toRadians(7),
                bounds846.getCenterX(), bounds846.getCenterY()
        );
        Shape rotated846 = rotation846.createTransformedShape(area846);
        g2d.setColor(new Color(98, 98, 114));
        g2d.fill(rotated846);

        // Line
        Line2D.Double line847 = new Line2D.Double(
                313.02, 264.94,
                328.15, 264.94
        );
        Rectangle2D bounds847 = line847.getBounds2D();
        AffineTransform rotation847 = AffineTransform.getRotateInstance(
                Math.toRadians(7),
                bounds847.getCenterX(), bounds847.getCenterY()
        );
        Shape rotated847 = rotation847.createTransformedShape(line847);
        g2d.setColor(new Color(50, 62, 140));
        BasicStroke bs847 = new BasicStroke(
                3.16f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs847);
        g2d.draw(rotated847);

        // Rectangle
        Rectangle2D.Double rectangle848 = new Rectangle2D.Double(
                500.88, 25.92,
                23.72, 12.74
        );
        g2d.setColor(new Color(18, 24, 34));
        g2d.fill(rectangle848);

        // General path
        GeneralPath gp849 = new GeneralPath();
        gp849.moveTo(704, 85);
        gp849.lineTo(701, 91);
        gp849.lineTo(706, 97);
        gp849.lineTo(712, 117);
        gp849.lineTo(712, 123);
        gp849.lineTo(717, 128);
        gp849.lineTo(718, 135);
        gp849.lineTo(725, 142);
        gp849.lineTo(717, 153);
        gp849.lineTo(712, 164);
        gp849.lineTo(717, 174);
        gp849.lineTo(721, 175);
        gp849.lineTo(721, 164);
        gp849.lineTo(727, 144);
        gp849.lineTo(729, 140);
        gp849.lineTo(721, 111);
        gp849.lineTo(708, 91);
        gp849.lineTo(705, 92);
        gp849.closePath();
        g2d.setColor(new Color(26, 21, 58));
        g2d.fill(gp849);

        // Circle
        Ellipse2D.Double circle850 = new Ellipse2D.Double(
                264.99, 331.63,
                9.14, 9.14
        );
        Rectangle2D bounds850 = circle850.getBounds2D();
        AffineTransform rotation850 = AffineTransform.getRotateInstance(
                Math.toRadians(300),
                bounds850.getCenterX(), bounds850.getCenterY()
        );
        Shape rotated850 = rotation850.createTransformedShape(circle850);
        g2d.setColor(new Color(9, 78, 173));
        g2d.fill(rotated850);

        // Rectangle
        Rectangle2D.Double rectangle851 = new Rectangle2D.Double(
                394, 321.04,
                12.37, 15.18
        );
        g2d.setColor(new Color(224, 211, 234));
        g2d.fill(rectangle851);

        // General path
        GeneralPath gp852 = new GeneralPath();
        gp852.moveTo(642.97, 130.57);
        gp852.lineTo(652.17, 118.61);
        gp852.lineTo(661.38, 129.08);
        gp852.lineTo(652.17, 133.56);
        gp852.closePath();
        Rectangle2D bounds852 = gp852.getBounds2D();
        AffineTransform rotation852 = AffineTransform.getRotateInstance(
                Math.toRadians(354),
                bounds852.getCenterX(), bounds852.getCenterY()
        );
        Shape rotated852 = rotation852.createTransformedShape(gp852);
        g2d.setColor(new Color(65, 77, 146));
        g2d.fill(rotated852);

        // Ellipse
        Ellipse2D.Double ellipse853 = new Ellipse2D.Double(
                624.19, 232.65,
                12.49, 12.96
        );
        Rectangle2D bounds853 = ellipse853.getBounds2D();
        AffineTransform rotation853 = AffineTransform.getRotateInstance(
                Math.toRadians(292),
                bounds853.getCenterX(), bounds853.getCenterY()
        );
        Shape rotated853 = rotation853.createTransformedShape(ellipse853);
        g2d.setColor(new Color(81, 125, 195));
        g2d.fill(rotated853);

    }

    public static void drawDetails68(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle854 = new Rectangle2D.Double(
                493.01, 106.37,
                22.2, 13.95
        );
        g2d.setColor(new Color(17, 31, 170));
        g2d.fill(rectangle854);

        // Ellipse
        Ellipse2D.Double ellipse855 = new Ellipse2D.Double(
                389.18, 160.19,
                5.18, 13.62
        );
        Rectangle2D bounds855 = ellipse855.getBounds2D();
        AffineTransform rotation855 = AffineTransform.getRotateInstance(
                Math.toRadians(132.38),
                bounds855.getCenterX(), bounds855.getCenterY()
        );
        Shape rotated855 = rotation855.createTransformedShape(ellipse855);
        g2d.setColor(new Color(11, 14, 52));
        g2d.fill(rotated855);

        // General path
        GeneralPath gp856 = new GeneralPath();
        gp856.moveTo(422.15, 64.2);
        gp856.lineTo(427.89, 57.92);
        gp856.lineTo(433.63, 63.42);
        gp856.lineTo(427.89, 65.78);
        gp856.closePath();
        Rectangle2D bounds856 = gp856.getBounds2D();
        AffineTransform rotation856 = AffineTransform.getRotateInstance(
                Math.toRadians(316),
                bounds856.getCenterX(), bounds856.getCenterY()
        );
        Shape rotated856 = rotation856.createTransformedShape(gp856);
        g2d.setColor(new Color(66, 108, 197));
        g2d.fill(rotated856);

        // Area / transformation
        GeneralPath boundary857_1 = new GeneralPath();
        boundary857_1.moveTo(324, 274);
        boundary857_1.lineTo(320, 280);
        boundary857_1.lineTo(320, 287);
        boundary857_1.lineTo(313, 296);
        boundary857_1.lineTo(313, 299);
        boundary857_1.lineTo(306, 305);
        boundary857_1.lineTo(307, 315);
        boundary857_1.lineTo(317, 318);
        boundary857_1.lineTo(319, 317);
        boundary857_1.lineTo(324, 309);
        boundary857_1.lineTo(326, 310);
        boundary857_1.lineTo(327, 304);
        boundary857_1.lineTo(331, 296);
        boundary857_1.lineTo(329, 294);
        boundary857_1.lineTo(326, 291);
        boundary857_1.lineTo(332, 292);
        boundary857_1.lineTo(332, 292);
        boundary857_1.lineTo(328, 285);
        boundary857_1.closePath();
        Area area857 = new Area(boundary857_1);
        GeneralPath boundary857_2 = new GeneralPath();
        boundary857_2.moveTo(315, 308);
        boundary857_2.lineTo(317, 309);
        boundary857_2.lineTo(317, 312);
        boundary857_2.lineTo(316, 313);
        boundary857_2.lineTo(314, 312);
        boundary857_2.lineTo(314, 309);
        boundary857_2.closePath();
        area857.subtract(new Area(boundary857_2));
        GeneralPath boundary857_3 = new GeneralPath();
        boundary857_3.moveTo(318, 303);
        boundary857_3.lineTo(320, 302);
        boundary857_3.lineTo(321, 304);
        boundary857_3.lineTo(319, 305);
        boundary857_3.closePath();
        area857.subtract(new Area(boundary857_3));
        g2d.setColor(new Color(3, 18, 58));
        g2d.fill(area857);

        // General path
        GeneralPath gp858 = new GeneralPath();
        gp858.moveTo(659.27, 187.08);
        gp858.lineTo(658.27, 191.08);
        gp858.lineTo(656.27, 194.08);
        gp858.lineTo(654.27, 204.08);
        gp858.lineTo(653.27, 205.08);
        gp858.lineTo(653.27, 220.08);
        gp858.lineTo(654.27, 221.08);
        gp858.lineTo(655.27, 228.08);
        gp858.lineTo(657.27, 228.08);
        gp858.lineTo(657.27, 224.08);
        gp858.lineTo(656.27, 223.08);
        gp858.lineTo(655.27, 216.08);
        gp858.lineTo(656.27, 215.08);
        gp858.lineTo(656.27, 205.08);
        gp858.lineTo(657.27, 204.08);
        gp858.lineTo(657.27, 201.08);
        gp858.lineTo(659.27, 195.08);
        gp858.lineTo(661.27, 192.08);
        gp858.closePath();
        g2d.setColor(new Color(54, 58, 53));
        g2d.fill(gp858);

        // Square
        Rectangle2D.Double square859 = new Rectangle2D.Double(
                550.53, 59.03,
                29.37, 29.37
        );
        g2d.setColor(new Color(5, 14, 54));
        g2d.fill(square859);

        // Cubic curve
        CubicCurve2D.Double cc860 = new CubicCurve2D.Double(
                463.49, 426.09,
                467.13, 422.11,
                472, 430.07,
                475.64, 426.09
        );
        Rectangle2D bounds860 = cc860.getBounds2D();
        AffineTransform rotation860 = AffineTransform.getRotateInstance(
                Math.toRadians(40),
                bounds860.getCenterX(), bounds860.getCenterY()
        );
        Shape rotated860 = rotation860.createTransformedShape(cc860);
        g2d.setColor(new Color(161, 146, 121));
        BasicStroke bs860 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs860);
        g2d.draw(rotated860);

        // Rectangle
        Rectangle2D.Double rectangle861 = new Rectangle2D.Double(
                425.11, 257.98,
                19.07, 6.25
        );
        Rectangle2D bounds861 = rectangle861.getBounds2D();
        AffineTransform rotation861 = AffineTransform.getRotateInstance(
                Math.toRadians(-80.54),
                bounds861.getCenterX(), bounds861.getCenterY()
        );
        Shape rotated861 = rotation861.createTransformedShape(rectangle861);
        g2d.setColor(new Color(54, 63, 170));
        g2d.fill(rotated861);

        // Ellipse
        Ellipse2D.Double ellipse862 = new Ellipse2D.Double(
                497.16, 419.43,
                6.79, 14.21
        );
        Rectangle2D bounds862 = ellipse862.getBounds2D();
        AffineTransform rotation862 = AffineTransform.getRotateInstance(
                Math.toRadians(152.87),
                bounds862.getCenterX(), bounds862.getCenterY()
        );
        Shape rotated862 = rotation862.createTransformedShape(ellipse862);
        g2d.setColor(new Color(24, 25, 32));
        g2d.fill(rotated862);

        // General path
        GeneralPath gp863 = new GeneralPath();
        gp863.moveTo(320.92, 385.03);
        gp863.lineTo(327.03, 378.87);
        gp863.lineTo(333.13, 384.26);
        gp863.lineTo(327.03, 386.57);
        gp863.closePath();
        Rectangle2D bounds863 = gp863.getBounds2D();
        AffineTransform rotation863 = AffineTransform.getRotateInstance(
                Math.toRadians(224),
                bounds863.getCenterX(), bounds863.getCenterY()
        );
        Shape rotated863 = rotation863.createTransformedShape(gp863);
        g2d.setColor(new Color(77, 55, 204));
        g2d.fill(rotated863);

    }

    public static void drawDetails69(Graphics2D g2d) {

        // General path
        GeneralPath gp864 = new GeneralPath();
        gp864.moveTo(430, 218);
        gp864.lineTo(428, 222);
        gp864.lineTo(422, 226);
        gp864.lineTo(421, 226);
        gp864.lineTo(424, 225);
        gp864.lineTo(436, 232);
        gp864.lineTo(428, 237);
        gp864.lineTo(425, 236);
        gp864.lineTo(428, 240);
        gp864.lineTo(422, 254);
        gp864.lineTo(427, 257);
        gp864.lineTo(424, 247);
        gp864.lineTo(434, 243);
        gp864.lineTo(433, 235);
        gp864.lineTo(436, 235);
        gp864.lineTo(443, 234);
        gp864.lineTo(447, 233);
        gp864.lineTo(433, 222);
        gp864.closePath();
        g2d.setColor(new Color(53, 78, 187));
        g2d.fill(gp864);

        // Circle
        Ellipse2D.Double circle865 = new Ellipse2D.Double(
                286.74, 376.84,
                7, 7
        );
        g2d.setColor(new Color(52, 139, 223));
        g2d.fill(circle865);

        // Area / transformation
        Ellipse2D.Double outer866 = new Ellipse2D.Double(
                289.66, 340.34,
                29.38, 23.67
        );
        Ellipse2D.Double cutout866 = new Ellipse2D.Double(
                289.66 + 29.38 * 0.28,
                340.34 - 23.67 * 0.12,
                29.38, 23.67
        );
        Area area866 = new Area(outer866);
        area866.subtract(new Area(cutout866));
        Rectangle2D bounds866 = area866.getBounds2D();
        AffineTransform rotation866 = AffineTransform.getRotateInstance(
                Math.toRadians(58),
                bounds866.getCenterX(), bounds866.getCenterY()
        );
        Shape rotated866 = rotation866.createTransformedShape(area866);
        g2d.setColor(new Color(2, 22, 97));
        g2d.fill(rotated866);

        // Rectangle
        Rectangle2D.Double rectangle867 = new Rectangle2D.Double(
                407.72, 182.88,
                5.08, 11.58
        );
        Rectangle2D bounds867 = rectangle867.getBounds2D();
        AffineTransform rotation867 = AffineTransform.getRotateInstance(
                Math.toRadians(-66.04),
                bounds867.getCenterX(), bounds867.getCenterY()
        );
        Shape rotated867 = rotation867.createTransformedShape(rectangle867);
        g2d.setColor(new Color(13, 17, 53));
        g2d.fill(rotated867);

        // Area / transformation
        GeneralPath boundary868_1 = new GeneralPath();
        boundary868_1.moveTo(408.71, 344.28);
        boundary868_1.lineTo(404.71, 345.28);
        boundary868_1.lineTo(400.71, 347.28);
        boundary868_1.lineTo(400.71, 350.28);
        boundary868_1.lineTo(392.71, 362.28);
        boundary868_1.lineTo(387.71, 366.28);
        boundary868_1.lineTo(385.71, 364.28);
        boundary868_1.lineTo(381.71, 364.28);
        boundary868_1.lineTo(374.71, 361.28);
        boundary868_1.lineTo(376.71, 368.28);
        boundary868_1.lineTo(380.71, 371.28);
        boundary868_1.lineTo(384.71, 371.28);
        boundary868_1.lineTo(388.71, 372.28);
        boundary868_1.lineTo(394.71, 371.28);
        boundary868_1.lineTo(397.71, 371.28);
        boundary868_1.lineTo(401.71, 368.28);
        boundary868_1.lineTo(401.71, 362.28);
        boundary868_1.lineTo(404.71, 350.28);
        boundary868_1.closePath();
        Area area868 = new Area(boundary868_1);
        GeneralPath boundary868_2 = new GeneralPath();
        boundary868_2.moveTo(385.71, 369.28);
        boundary868_2.lineTo(387.71, 367.28);
        boundary868_2.lineTo(389.71, 368.28);
        boundary868_2.lineTo(388.71, 370.28);
        boundary868_2.closePath();
        area868.subtract(new Area(boundary868_2));
        GeneralPath boundary868_3 = new GeneralPath();
        boundary868_3.moveTo(400.71, 366.28);
        boundary868_3.lineTo(401.71, 368.28);
        boundary868_3.lineTo(399.71, 370.28);
        boundary868_3.lineTo(398.71, 368.28);
        boundary868_3.closePath();
        area868.subtract(new Area(boundary868_3));
        g2d.setColor(new Color(61, 59, 156));
        g2d.fill(area868);

        // Line
        Line2D.Double line869 = new Line2D.Double(
                394.84, 286.96,
                413.86, 286.96
        );
        Rectangle2D bounds869 = line869.getBounds2D();
        AffineTransform rotation869 = AffineTransform.getRotateInstance(
                Math.toRadians(126),
                bounds869.getCenterX(), bounds869.getCenterY()
        );
        Shape rotated869 = rotation869.createTransformedShape(line869);
        g2d.setColor(new Color(130, 134, 246));
        BasicStroke bs869 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs869);
        g2d.draw(rotated869);

        // Area / transformation
        Ellipse2D.Double outer870 = new Ellipse2D.Double(
                526.94, 294.84,
                26.42, 32.48
        );
        Ellipse2D.Double cutout870 = new Ellipse2D.Double(
                526.94 + 26.42 * 0.28,
                294.84 - 32.48 * 0.12,
                26.42, 32.48
        );
        Area area870 = new Area(outer870);
        area870.subtract(new Area(cutout870));
        Rectangle2D bounds870 = area870.getBounds2D();
        AffineTransform rotation870 = AffineTransform.getRotateInstance(
                Math.toRadians(338),
                bounds870.getCenterX(), bounds870.getCenterY()
        );
        Shape rotated870 = rotation870.createTransformedShape(area870);
        g2d.setColor(new Color(0, 21, 63));
        g2d.fill(rotated870);

        // General path
        GeneralPath gp871 = new GeneralPath();
        gp871.moveTo(415.88, 155.27);
        gp871.lineTo(420.88, 161.27);
        gp871.lineTo(424.88, 163.27);
        gp871.lineTo(431.88, 169.27);
        gp871.lineTo(433.88, 169.27);
        gp871.lineTo(441.88, 174.27);
        gp871.lineTo(448.88, 177.27);
        gp871.lineTo(455.88, 179.27);
        gp871.lineTo(457.88, 181.27);
        gp871.lineTo(462.88, 181.27);
        gp871.lineTo(450.88, 174.27);
        gp871.lineTo(448.88, 174.27);
        gp871.lineTo(439.88, 170.27);
        gp871.lineTo(437.88, 168.27);
        gp871.lineTo(435.88, 168.27);
        gp871.lineTo(431.88, 164.27);
        gp871.lineTo(427.88, 163.27);
        gp871.lineTo(423.88, 159.27);
        gp871.closePath();
        g2d.setColor(new Color(20, 31, 118));
        g2d.fill(gp871);

    }

}

class witchPart8 {

    public static void drawPart(Graphics2D g2d) {
        drawDetails70(g2d);
        drawDetails71(g2d);
        drawDetails72(g2d);
        drawDetails73(g2d);
        drawDetails74(g2d);
        drawDetails75(g2d);
        drawDetails76(g2d);
        drawDetails77(g2d);
        drawDetails78(g2d);
        drawDetails79(g2d);
    }

    public static void drawDetails70(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse872 = new Ellipse2D.Double(
                270.14, 339.64,
                6.7, 15.51
        );
        Rectangle2D bounds872 = ellipse872.getBounds2D();
        AffineTransform rotation872 = AffineTransform.getRotateInstance(
                Math.toRadians(39.77),
                bounds872.getCenterX(), bounds872.getCenterY()
        );
        Shape rotated872 = rotation872.createTransformedShape(ellipse872);
        g2d.setColor(new Color(60, 118, 206));
        g2d.fill(rotated872);

        // Rectangle
        Rectangle2D.Double rectangle873 = new Rectangle2D.Double(
                277.51, 287.68,
                9.89, 5.35
        );
        g2d.setColor(new Color(36, 86, 165));
        g2d.fill(rectangle873);

        // Square
        Rectangle2D.Double square874 = new Rectangle2D.Double(
                376.49, 187.92,
                10.64, 10.64
        );
        g2d.setColor(new Color(100, 122, 180));
        g2d.fill(square874);

        // Ellipse
        Ellipse2D.Double ellipse875 = new Ellipse2D.Double(
                498.71, 41.72,
                15.91, 21.41
        );
        Rectangle2D bounds875 = ellipse875.getBounds2D();
        AffineTransform rotation875 = AffineTransform.getRotateInstance(
                Math.toRadians(152.73),
                bounds875.getCenterX(), bounds875.getCenterY()
        );
        Shape rotated875 = rotation875.createTransformedShape(ellipse875);
        g2d.setColor(new Color(5, 18, 61));
        g2d.fill(rotated875);

        // General path
        GeneralPath gp876 = new GeneralPath();
        gp876.moveTo(573.44, 33.9);
        gp876.lineTo(574.44, 35.9);
        gp876.lineTo(575.44, 35.9);
        gp876.lineTo(581.44, 41.9);
        gp876.lineTo(575.44, 35.9);
        gp876.lineTo(576.44, 34.9);
        gp876.lineTo(591.44, 39.9);
        gp876.lineTo(589.44, 32.9);
        gp876.lineTo(587.44, 32.9);
        gp876.lineTo(579.44, 28.9);
        gp876.lineTo(580.44, 29.9);
        gp876.lineTo(578.44, 34.9);
        gp876.closePath();
        g2d.setColor(new Color(75, 74, 68));
        g2d.fill(gp876);

        // Square
        Rectangle2D.Double square877 = new Rectangle2D.Double(
                310.79, 388.13,
                12.84, 12.84
        );
        g2d.setColor(new Color(25, 25, 61));
        g2d.fill(square877);

        // General path
        GeneralPath gp878 = new GeneralPath();
        gp878.moveTo(454.72, 312.16);
        gp878.lineTo(458.72, 334.16);
        gp878.lineTo(467.72, 346.16);
        gp878.lineTo(467.72, 345.16);
        gp878.lineTo(465.72, 338.16);
        gp878.lineTo(464.72, 326.16);
        gp878.lineTo(478.72, 337.16);
        gp878.lineTo(498.72, 354.16);
        gp878.lineTo(504.72, 354.16);
        gp878.lineTo(517.72, 361.16);
        gp878.lineTo(522.72, 366.16);
        gp878.lineTo(526.72, 361.16);
        gp878.lineTo(498.72, 327.16);
        gp878.lineTo(477.72, 303.16);
        gp878.lineTo(482.72, 311.16);
        gp878.lineTo(476.72, 309.16);
        gp878.lineTo(476.72, 320.16);
        gp878.lineTo(463.72, 319.16);
        gp878.closePath();
        g2d.setColor(new Color(0, 20, 73));
        g2d.fill(gp878);

        // Line
        Line2D.Double line879 = new Line2D.Double(
                405.78, 173.91,
                420.31, 173.91
        );
        Rectangle2D bounds879 = line879.getBounds2D();
        AffineTransform rotation879 = AffineTransform.getRotateInstance(
                Math.toRadians(30),
                bounds879.getCenterX(), bounds879.getCenterY()
        );
        Shape rotated879 = rotation879.createTransformedShape(line879);
        g2d.setColor(new Color(118, 144, 220));
        BasicStroke bs879 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs879);
        g2d.draw(rotated879);

        // Square
        Rectangle2D.Double square880 = new Rectangle2D.Double(
                421.5, 111.51,
                9.17, 9.17
        );
        g2d.setColor(new Color(0, 6, 32));
        g2d.fill(square880);

        // General path
        GeneralPath gp881 = new GeneralPath();
        gp881.moveTo(482.45, 94.65);
        gp881.lineTo(486.96, 85.73);
        gp881.lineTo(491.47, 93.53);
        gp881.lineTo(486.96, 96.88);
        gp881.closePath();
        Rectangle2D bounds881 = gp881.getBounds2D();
        AffineTransform rotation881 = AffineTransform.getRotateInstance(
                Math.toRadians(290),
                bounds881.getCenterX(), bounds881.getCenterY()
        );
        Shape rotated881 = rotation881.createTransformedShape(gp881);
        g2d.setColor(new Color(73, 98, 165));
        g2d.fill(rotated881);

        // Ellipse
        Ellipse2D.Double ellipse882 = new Ellipse2D.Double(
                562.4, 255.35,
                14.52, 26.97
        );
        Rectangle2D bounds882 = ellipse882.getBounds2D();
        AffineTransform rotation882 = AffineTransform.getRotateInstance(
                Math.toRadians(42.72),
                bounds882.getCenterX(), bounds882.getCenterY()
        );
        Shape rotated882 = rotation882.createTransformedShape(ellipse882);
        g2d.setColor(new Color(51, 97, 171));
        g2d.fill(rotated882);

        // Square
        Rectangle2D.Double square883 = new Rectangle2D.Double(
                129.46, 355.7,
                9.48, 9.48
        );
        g2d.setColor(new Color(8, 16, 57));
        g2d.fill(square883);

        // Arc
        Arc2D.Double arc884 = new Arc2D.Double(
                218.66, 340.19,
                29.29, 14.29,
                0, 101, Arc2D.PIE
        );
        Rectangle2D bounds884 = arc884.getBounds2D();
        AffineTransform rotation884 = AffineTransform.getRotateInstance(
                Math.toRadians(280),
                bounds884.getCenterX(), bounds884.getCenterY()
        );
        Shape rotated884 = rotation884.createTransformedShape(arc884);
        g2d.setColor(new Color(4, 35, 152));
        g2d.fill(rotated884);

    }

    public static void drawDetails71(Graphics2D g2d) {

        // General path
        GeneralPath gp885 = new GeneralPath();
        gp885.moveTo(492.9, 402.15);
        gp885.lineTo(489.9, 397.15);
        gp885.lineTo(474.9, 396.15);
        gp885.lineTo(457.9, 396.15);
        gp885.lineTo(450.9, 396.15);
        gp885.lineTo(435.9, 399.15);
        gp885.lineTo(426.9, 398.15);
        gp885.lineTo(421.9, 398.15);
        gp885.lineTo(414.9, 397.15);
        gp885.lineTo(418.9, 403.15);
        gp885.lineTo(419.9, 401.15);
        gp885.lineTo(427.9, 403.15);
        gp885.lineTo(425.9, 399.15);
        gp885.lineTo(433.9, 400.15);
        gp885.lineTo(447.9, 402.15);
        gp885.lineTo(464.9, 401.15);
        gp885.lineTo(470.9, 400.15);
        gp885.lineTo(480.9, 405.15);
        gp885.closePath();
        g2d.setColor(new Color(33, 32, 93));
        g2d.fill(gp885);

        // Rectangle
        Rectangle2D.Double rectangle886 = new Rectangle2D.Double(
                395.88, 176.3,
                12.24, 3.74
        );
        Rectangle2D bounds886 = rectangle886.getBounds2D();
        AffineTransform rotation886 = AffineTransform.getRotateInstance(
                Math.toRadians(-6.34),
                bounds886.getCenterX(), bounds886.getCenterY()
        );
        Shape rotated886 = rotation886.createTransformedShape(rectangle886);
        g2d.setColor(new Color(0, 5, 38));
        g2d.fill(rotated886);

        // Square
        Rectangle2D.Double square887 = new Rectangle2D.Double(
                585.32, 328.53,
                15.02, 15.02
        );
        g2d.setColor(new Color(6, 40, 111));
        g2d.fill(square887);

        // Ellipse
        Ellipse2D.Double ellipse888 = new Ellipse2D.Double(
                364.77, 317.02,
                20.04, 8.52
        );
        Rectangle2D bounds888 = ellipse888.getBounds2D();
        AffineTransform rotation888 = AffineTransform.getRotateInstance(
                Math.toRadians(172),
                bounds888.getCenterX(), bounds888.getCenterY()
        );
        Shape rotated888 = rotation888.createTransformedShape(ellipse888);
        g2d.setColor(new Color(236, 228, 255));
        g2d.fill(rotated888);

        // Rectangle
        Rectangle2D.Double rectangle889 = new Rectangle2D.Double(
                344.69, 156.15,
                23.66, 9.43
        );
        g2d.setColor(new Color(10, 25, 65));
        g2d.fill(rectangle889);

        // Line
        Line2D.Double line890 = new Line2D.Double(
                337.69, 391.3,
                358.6, 391.3
        );
        Rectangle2D bounds890 = line890.getBounds2D();
        AffineTransform rotation890 = AffineTransform.getRotateInstance(
                Math.toRadians(189),
                bounds890.getCenterX(), bounds890.getCenterY()
        );
        Shape rotated890 = rotation890.createTransformedShape(line890);
        g2d.setColor(new Color(27, 3, 126));
        BasicStroke bs890 = new BasicStroke(
                3.16f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs890);
        g2d.draw(rotated890);

        // Rectangle
        Rectangle2D.Double rectangle891 = new Rectangle2D.Double(
                382.04, 94.78,
                16.51, 13.77
        );
        g2d.setColor(new Color(11, 20, 49));
        g2d.fill(rectangle891);

        // Rectangle
        Rectangle2D.Double rectangle892 = new Rectangle2D.Double(
                482.85, 68.13,
                16.45, 5.81
        );
        Rectangle2D bounds892 = rectangle892.getBounds2D();
        AffineTransform rotation892 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds892.getCenterX(), bounds892.getCenterY()
        );
        Shape rotated892 = rotation892.createTransformedShape(rectangle892);
        g2d.setColor(new Color(7, 31, 142));
        g2d.fill(rotated892);

        // Cubic curve
        CubicCurve2D.Double cc893 = new CubicCurve2D.Double(
                513.81, 337.62,
                521.62, 321.48,
                532.05, 353.76,
                539.87, 337.62
        );
        Rectangle2D bounds893 = cc893.getBounds2D();
        AffineTransform rotation893 = AffineTransform.getRotateInstance(
                Math.toRadians(177),
                bounds893.getCenterX(), bounds893.getCenterY()
        );
        Shape rotated893 = rotation893.createTransformedShape(cc893);
        g2d.setColor(new Color(85, 134, 212));
        BasicStroke bs893 = new BasicStroke(
                3.1f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs893);
        g2d.draw(rotated893);

        // General path
        GeneralPath gp894 = new GeneralPath();
        gp894.moveTo(323.3, 139.61);
        gp894.lineTo(321.3, 141.61);
        gp894.lineTo(318.3, 147.61);
        gp894.lineTo(315.3, 150.61);
        gp894.lineTo(311.3, 160.61);
        gp894.lineTo(308.3, 167.61);
        gp894.lineTo(310.3, 175.61);
        gp894.lineTo(322.3, 176.61);
        gp894.lineTo(318.3, 175.61);
        gp894.lineTo(319.3, 171.61);
        gp894.lineTo(319.3, 168.61);
        gp894.lineTo(323.3, 166.61);
        gp894.lineTo(323.3, 165.61);
        gp894.lineTo(327.3, 156.61);
        gp894.lineTo(329.3, 154.61);
        gp894.lineTo(332.3, 149.61);
        gp894.lineTo(334.3, 148.61);
        gp894.lineTo(322.3, 142.61);
        gp894.closePath();
        g2d.setColor(new Color(49, 91, 141));
        g2d.fill(gp894);

        // General path
        GeneralPath gp895 = new GeneralPath();
        gp895.moveTo(477.34, 298.03);
        gp895.lineTo(484.38, 291.5);
        gp895.lineTo(491.42, 297.21);
        gp895.lineTo(484.38, 299.66);
        gp895.closePath();
        Rectangle2D bounds895 = gp895.getBounds2D();
        AffineTransform rotation895 = AffineTransform.getRotateInstance(
                Math.toRadians(71),
                bounds895.getCenterX(), bounds895.getCenterY()
        );
        Shape rotated895 = rotation895.createTransformedShape(gp895);
        g2d.setColor(new Color(96, 154, 224));
        g2d.fill(rotated895);

    }

    public static void drawDetails72(Graphics2D g2d) {

        // Rectangle
        Rectangle2D.Double rectangle896 = new Rectangle2D.Double(
                403.5, 289.5,
                17, 4
        );
        Rectangle2D bounds896 = rectangle896.getBounds2D();
        AffineTransform rotation896 = AffineTransform.getRotateInstance(
                Math.toRadians(-90),
                bounds896.getCenterX(), bounds896.getCenterY()
        );
        Shape rotated896 = rotation896.createTransformedShape(rectangle896);
        g2d.setColor(new Color(83, 106, 207));
        g2d.fill(rotated896);

        // General path
        GeneralPath gp897 = new GeneralPath();
        gp897.moveTo(366.28, 273.31);
        gp897.lineTo(377.99, 261.36);
        gp897.lineTo(389.71, 271.82);
        gp897.lineTo(377.99, 276.3);
        gp897.closePath();
        Rectangle2D bounds897 = gp897.getBounds2D();
        AffineTransform rotation897 = AffineTransform.getRotateInstance(
                Math.toRadians(78),
                bounds897.getCenterX(), bounds897.getCenterY()
        );
        Shape rotated897 = rotation897.createTransformedShape(gp897);
        g2d.setColor(new Color(243, 254, 254));
        g2d.fill(rotated897);

        // Area / transformation
        GeneralPath boundary898_1 = new GeneralPath();
        boundary898_1.moveTo(261.07, 268.75);
        boundary898_1.lineTo(261.07, 270.75);
        boundary898_1.lineTo(268.07, 273.75);
        boundary898_1.lineTo(270.07, 276.75);
        boundary898_1.lineTo(275.07, 279.75);
        boundary898_1.lineTo(283.07, 282.75);
        boundary898_1.lineTo(286.07, 281.75);
        boundary898_1.lineTo(286.07, 275.75);
        boundary898_1.lineTo(277.07, 274.75);
        boundary898_1.lineTo(270.07, 275.75);
        boundary898_1.lineTo(274.07, 268.75);
        boundary898_1.lineTo(285.07, 272.75);
        boundary898_1.lineTo(284.07, 266.75);
        boundary898_1.lineTo(291.07, 263.75);
        boundary898_1.lineTo(281.07, 266.75);
        boundary898_1.lineTo(282.07, 258.75);
        boundary898_1.lineTo(275.07, 262.75);
        boundary898_1.lineTo(266.07, 271.75);
        boundary898_1.closePath();
        Area area898 = new Area(boundary898_1);
        GeneralPath boundary898_2 = new GeneralPath();
        boundary898_2.moveTo(285.07, 278.75);
        boundary898_2.lineTo(287.07, 277.75);
        boundary898_2.lineTo(288.07, 279.75);
        boundary898_2.lineTo(286.07, 280.75);
        boundary898_2.closePath();
        area898.subtract(new Area(boundary898_2));
        GeneralPath boundary898_3 = new GeneralPath();
        boundary898_3.moveTo(282.07, 275.75);
        boundary898_3.lineTo(283.07, 278.75);
        boundary898_3.lineTo(281.07, 279.75);
        boundary898_3.lineTo(280.07, 277.75);
        boundary898_3.closePath();
        area898.subtract(new Area(boundary898_3));
        g2d.setColor(new Color(45, 77, 149));
        g2d.fill(area898);

        // Line
        Line2D.Double line899 = new Line2D.Double(
                284.12, 415.46,
                303.09, 415.46
        );
        Rectangle2D bounds899 = line899.getBounds2D();
        AffineTransform rotation899 = AffineTransform.getRotateInstance(
                Math.toRadians(11),
                bounds899.getCenterX(), bounds899.getCenterY()
        );
        Shape rotated899 = rotation899.createTransformedShape(line899);
        g2d.setColor(new Color(72, 60, 49));
        BasicStroke bs899 = new BasicStroke(
                3.25f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs899);
        g2d.draw(rotated899);

        // Area / transformation
        GeneralPath boundary900_1 = new GeneralPath();
        boundary900_1.moveTo(448.15, 152.87);
        boundary900_1.lineTo(449.15, 154.87);
        boundary900_1.lineTo(457.15, 161.87);
        boundary900_1.lineTo(467.15, 162.87);
        boundary900_1.lineTo(475.15, 165.87);
        boundary900_1.lineTo(491.15, 171.87);
        boundary900_1.lineTo(494.15, 173.87);
        boundary900_1.lineTo(504.15, 174.87);
        boundary900_1.lineTo(513.15, 173.87);
        boundary900_1.lineTo(523.15, 169.87);
        boundary900_1.lineTo(533.15, 161.87);
        boundary900_1.lineTo(533.15, 156.87);
        boundary900_1.lineTo(514.15, 155.87);
        boundary900_1.lineTo(513.15, 156.87);
        boundary900_1.lineTo(501.15, 157.87);
        boundary900_1.lineTo(494.15, 157.87);
        boundary900_1.lineTo(493.15, 156.87);
        boundary900_1.lineTo(467.15, 155.87);
        boundary900_1.closePath();
        Area area900 = new Area(boundary900_1);
        GeneralPath boundary900_2 = new GeneralPath();
        boundary900_2.moveTo(484.15, 166.87);
        boundary900_2.lineTo(486.15, 165.87);
        boundary900_2.lineTo(487.15, 167.87);
        boundary900_2.lineTo(485.15, 168.87);
        boundary900_2.closePath();
        area900.subtract(new Area(boundary900_2));
        g2d.setColor(new Color(0, 9, 37));
        g2d.fill(area900);

        // Circle
        Ellipse2D.Double circle901 = new Ellipse2D.Double(
                468.88, 97.45,
                8.4, 8.4
        );
        Rectangle2D bounds901 = circle901.getBounds2D();
        AffineTransform rotation901 = AffineTransform.getRotateInstance(
                Math.toRadians(41),
                bounds901.getCenterX(), bounds901.getCenterY()
        );
        Shape rotated901 = rotation901.createTransformedShape(circle901);
        g2d.setColor(new Color(79, 102, 190));
        g2d.fill(rotated901);

        // Circle
        Ellipse2D.Double circle902 = new Ellipse2D.Double(
                508.15, 308.38,
                18.48, 18.48
        );
        Rectangle2D bounds902 = circle902.getBounds2D();
        AffineTransform rotation902 = AffineTransform.getRotateInstance(
                Math.toRadians(330),
                bounds902.getCenterX(), bounds902.getCenterY()
        );
        Shape rotated902 = rotation902.createTransformedShape(circle902);
        g2d.setColor(new Color(60, 123, 205));
        g2d.fill(rotated902);

        // General path
        GeneralPath gp903 = new GeneralPath();
        gp903.moveTo(597, 116);
        gp903.lineTo(596, 121);
        gp903.lineTo(595, 127);
        gp903.lineTo(591, 136);
        gp903.lineTo(607, 140);
        gp903.lineTo(614, 140);
        gp903.lineTo(624, 149);
        gp903.lineTo(630, 153);
        gp903.lineTo(640, 157);
        gp903.lineTo(652, 174);
        gp903.lineTo(659, 173);
        gp903.lineTo(654, 164);
        gp903.lineTo(640, 149);
        gp903.lineTo(629, 153);
        gp903.lineTo(638, 146);
        gp903.lineTo(626, 133);
        gp903.lineTo(616, 126);
        gp903.lineTo(606, 119);
        gp903.closePath();
        g2d.setColor(new Color(122, 148, 205));
        g2d.fill(gp903);

    }

    public static void drawDetails73(Graphics2D g2d) {

        // General path
        GeneralPath gp904 = new GeneralPath();
        gp904.moveTo(669.72, 288.53);
        gp904.lineTo(663.72, 292.53);
        gp904.lineTo(651.72, 295.53);
        gp904.lineTo(647.72, 297.53);
        gp904.lineTo(648.72, 307.53);
        gp904.lineTo(653.72, 310.53);
        gp904.lineTo(651.72, 323.53);
        gp904.lineTo(650.72, 327.53);
        gp904.lineTo(635.72, 320.53);
        gp904.lineTo(634.72, 315.53);
        gp904.lineTo(639.72, 303.53);
        gp904.lineTo(634.72, 307.53);
        gp904.lineTo(631.72, 318.53);
        gp904.lineTo(644.72, 330.53);
        gp904.lineTo(649.72, 332.53);
        gp904.lineTo(662.72, 331.53);
        gp904.lineTo(660.72, 316.53);
        gp904.lineTo(660.72, 305.53);
        gp904.closePath();
        g2d.setColor(new Color(76, 64, 66));
        g2d.fill(gp904);

        // Square
        Rectangle2D.Double square905 = new Rectangle2D.Double(
                670.59, 281.71,
                14.05, 14.05
        );
        g2d.setColor(new Color(11, 25, 79));
        g2d.fill(square905);

        // Rectangle
        Rectangle2D.Double rectangle906 = new Rectangle2D.Double(
                342.46, 363.48,
                17.21, 11.18
        );
        g2d.setColor(new Color(35, 33, 96));
        g2d.fill(rectangle906);

        // Cubic curve
        CubicCurve2D.Double cc907 = new CubicCurve2D.Double(
                282.83, 295.27,
                290.93, 283.97,
                301.74, 306.57,
                309.84, 295.27
        );
        Rectangle2D bounds907 = cc907.getBounds2D();
        AffineTransform rotation907 = AffineTransform.getRotateInstance(
                Math.toRadians(298),
                bounds907.getCenterX(), bounds907.getCenterY()
        );
        Shape rotated907 = rotation907.createTransformedShape(cc907);
        g2d.setColor(new Color(15, 39, 83));
        BasicStroke bs907 = new BasicStroke(
                3.17f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs907);
        g2d.draw(rotated907);

        // Cubic curve
        CubicCurve2D.Double cc908 = new CubicCurve2D.Double(
                310.02, 278.26,
                314.44, 274.66,
                320.34, 281.86,
                324.76, 278.26
        );
        Rectangle2D bounds908 = cc908.getBounds2D();
        AffineTransform rotation908 = AffineTransform.getRotateInstance(
                Math.toRadians(284),
                bounds908.getCenterX(), bounds908.getCenterY()
        );
        Shape rotated908 = rotation908.createTransformedShape(cc908);
        g2d.setColor(new Color(87, 129, 213));
        BasicStroke bs908 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs908);
        g2d.draw(rotated908);

        // Rectangle
        Rectangle2D.Double rectangle909 = new Rectangle2D.Double(
                331.38, 436.89,
                12.53, 8.64
        );
        g2d.setColor(new Color(1, 38, 106));
        g2d.fill(rectangle909);

        // Rectangle
        Rectangle2D.Double rectangle910 = new Rectangle2D.Double(
                575.7, 202.01,
                22.52, 13.38
        );
        g2d.setColor(new Color(9, 43, 103));
        g2d.fill(rectangle910);

        // Ellipse
        Ellipse2D.Double ellipse911 = new Ellipse2D.Double(
                595.2, 5.22,
                21.1, 13.31
        );
        Rectangle2D bounds911 = ellipse911.getBounds2D();
        AffineTransform rotation911 = AffineTransform.getRotateInstance(
                Math.toRadians(200),
                bounds911.getCenterX(), bounds911.getCenterY()
        );
        Shape rotated911 = rotation911.createTransformedShape(ellipse911);
        g2d.setColor(new Color(28, 24, 20));
        g2d.fill(rotated911);

        // Rectangle
        Rectangle2D.Double rectangle912 = new Rectangle2D.Double(
                497.25, 399.33,
                4.78, 12.12
        );
        Rectangle2D bounds912 = rectangle912.getBounds2D();
        AffineTransform rotation912 = AffineTransform.getRotateInstance(
                Math.toRadians(-30.96),
                bounds912.getCenterX(), bounds912.getCenterY()
        );
        Shape rotated912 = rotation912.createTransformedShape(rectangle912);
        g2d.setColor(new Color(0, 21, 131));
        g2d.fill(rotated912);

        // Quadratic curve
        QuadCurve2D.Double qc913 = new QuadCurve2D.Double(
                592, 156.91,
                603.52, 143.99,
                615.04, 156.91
        );
        Rectangle2D bounds913 = qc913.getBounds2D();
        AffineTransform rotation913 = AffineTransform.getRotateInstance(
                Math.toRadians(306),
                bounds913.getCenterX(), bounds913.getCenterY()
        );
        Shape rotated913 = rotation913.createTransformedShape(qc913);
        g2d.setColor(new Color(5, 29, 71));
        BasicStroke bs913 = new BasicStroke(
                3.09f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs913);
        g2d.draw(rotated913);

        // Circle
        Ellipse2D.Double circle914 = new Ellipse2D.Double(
                442.91, 252.27,
                17.94, 17.94
        );
        Rectangle2D bounds914 = circle914.getBounds2D();
        AffineTransform rotation914 = AffineTransform.getRotateInstance(
                Math.toRadians(102),
                bounds914.getCenterX(), bounds914.getCenterY()
        );
        Shape rotated914 = rotation914.createTransformedShape(circle914);
        g2d.setColor(new Color(20, 32, 83));
        g2d.fill(rotated914);

        // Square
        Rectangle2D.Double square915 = new Rectangle2D.Double(
                293.78, 423.91,
                31.05, 31.05
        );
        g2d.setColor(new Color(12, 15, 15));
        g2d.fill(square915);

        // Circle
        Ellipse2D.Double circle916 = new Ellipse2D.Double(
                508.3, 74.18,
                18.74, 18.74
        );
        Rectangle2D bounds916 = circle916.getBounds2D();
        AffineTransform rotation916 = AffineTransform.getRotateInstance(
                Math.toRadians(3),
                bounds916.getCenterX(), bounds916.getCenterY()
        );
        Shape rotated916 = rotation916.createTransformedShape(circle916);
        g2d.setColor(new Color(5, 25, 106));
        g2d.fill(rotated916);

    }

    public static void drawDetails74(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse917 = new Ellipse2D.Double(
                468.01, 276.57,
                8.07, 22.43
        );
        Rectangle2D bounds917 = ellipse917.getBounds2D();
        AffineTransform rotation917 = AffineTransform.getRotateInstance(
                Math.toRadians(146.64),
                bounds917.getCenterX(), bounds917.getCenterY()
        );
        Shape rotated917 = rotation917.createTransformedShape(ellipse917);
        g2d.setColor(new Color(98, 157, 228));
        g2d.fill(rotated917);

        // Rectangle
        Rectangle2D.Double rectangle918 = new Rectangle2D.Double(
                630.25, 253.32,
                9.06, 6.41
        );
        g2d.setColor(new Color(105, 138, 179));
        g2d.fill(rectangle918);

        // General path
        GeneralPath gp919 = new GeneralPath();
        gp919.moveTo(412, 313);
        gp919.lineTo(405, 313);
        gp919.lineTo(402, 314);
        gp919.lineTo(395, 319);
        gp919.lineTo(394, 318);
        gp919.lineTo(395, 321);
        gp919.lineTo(398, 325);
        gp919.lineTo(400, 323);
        gp919.lineTo(404, 326);
        gp919.lineTo(403, 323);
        gp919.closePath();
        g2d.setColor(new Color(215, 209, 253));
        g2d.fill(gp919);

        // Area / transformation
        Ellipse2D.Double outer920 = new Ellipse2D.Double(
                623.48, 185.41,
                23.59, 18.96
        );
        Ellipse2D.Double cutout920 = new Ellipse2D.Double(
                623.48 + 23.59 * 0.28,
                185.41 - 18.96 * 0.12,
                23.59, 18.96
        );
        Area area920 = new Area(outer920);
        area920.subtract(new Area(cutout920));
        Rectangle2D bounds920 = area920.getBounds2D();
        AffineTransform rotation920 = AffineTransform.getRotateInstance(
                Math.toRadians(134),
                bounds920.getCenterX(), bounds920.getCenterY()
        );
        Shape rotated920 = rotation920.createTransformedShape(area920);
        g2d.setColor(new Color(77, 95, 111));
        g2d.fill(rotated920);

        // Ellipse
        Ellipse2D.Double ellipse921 = new Ellipse2D.Double(
                614.03, 56.21,
                28.92, 22.58
        );
        Rectangle2D bounds921 = ellipse921.getBounds2D();
        AffineTransform rotation921 = AffineTransform.getRotateInstance(
                Math.toRadians(156),
                bounds921.getCenterX(), bounds921.getCenterY()
        );
        Shape rotated921 = rotation921.createTransformedShape(ellipse921);
        g2d.setColor(new Color(7, 10, 38));
        g2d.fill(rotated921);

        // Ellipse
        Ellipse2D.Double ellipse922 = new Ellipse2D.Double(
                674.08, 242.92,
                4.97, 18.94
        );
        Rectangle2D bounds922 = ellipse922.getBounds2D();
        AffineTransform rotation922 = AffineTransform.getRotateInstance(
                Math.toRadians(105.22),
                bounds922.getCenterX(), bounds922.getCenterY()
        );
        Shape rotated922 = rotation922.createTransformedShape(ellipse922);
        g2d.setColor(new Color(52, 58, 68));
        g2d.fill(rotated922);

        // Rectangle
        Rectangle2D.Double rectangle923 = new Rectangle2D.Double(
                160, 274.53,
                10.43, 7.47
        );
        g2d.setColor(new Color(92, 90, 170));
        g2d.fill(rectangle923);

        // General path
        GeneralPath gp924 = new GeneralPath();
        gp924.moveTo(468.42, 276.03);
        gp924.lineTo(476.94, 267.11);
        gp924.lineTo(485.45, 274.91);
        gp924.lineTo(476.94, 278.26);
        gp924.closePath();
        Rectangle2D bounds924 = gp924.getBounds2D();
        AffineTransform rotation924 = AffineTransform.getRotateInstance(
                Math.toRadians(191),
                bounds924.getCenterX(), bounds924.getCenterY()
        );
        Shape rotated924 = rotation924.createTransformedShape(gp924);
        g2d.setColor(new Color(93, 156, 224));
        g2d.fill(rotated924);

        // Rectangle
        Rectangle2D.Double rectangle925 = new Rectangle2D.Double(
                350.96, 381.53,
                11.12, 6.91
        );
        g2d.setColor(new Color(88, 78, 229));
        g2d.fill(rectangle925);

        // Ellipse
        Ellipse2D.Double ellipse926 = new Ellipse2D.Double(
                377.08, 125.72,
                19.82, 39.24
        );
        Rectangle2D bounds926 = ellipse926.getBounds2D();
        AffineTransform rotation926 = AffineTransform.getRotateInstance(
                Math.toRadians(73.12),
                bounds926.getCenterX(), bounds926.getCenterY()
        );
        Shape rotated926 = rotation926.createTransformedShape(ellipse926);
        g2d.setColor(new Color(25, 32, 74));
        g2d.fill(rotated926);

        // Rectangle
        Rectangle2D.Double rectangle927 = new Rectangle2D.Double(
                504.33, 120.43,
                15.63, 16.55
        );
        g2d.setColor(new Color(31, 57, 192));
        g2d.fill(rectangle927);

        // Rectangle
        Rectangle2D.Double rectangle928 = new Rectangle2D.Double(
                281.97, 315.44,
                13.55, 13.87
        );
        g2d.setColor(new Color(52, 102, 180));
        g2d.fill(rectangle928);

        // Rectangle
        Rectangle2D.Double rectangle929 = new Rectangle2D.Double(
                423.67, 292.49,
                18.85, 13.32
        );
        g2d.setColor(new Color(24, 34, 84));
        g2d.fill(rectangle929);

        // Square
        Rectangle2D.Double square930 = new Rectangle2D.Double(
                273.53, 300.76,
                9.46, 9.46
        );
        g2d.setColor(new Color(8, 25, 59));
        g2d.fill(square930);

        // Circle
        Ellipse2D.Double circle931 = new Ellipse2D.Double(
                300.58, 265.6,
                10.98, 10.98
        );
        g2d.setColor(new Color(78, 112, 191));
        g2d.fill(circle931);

    }

    public static void drawDetails75(Graphics2D g2d) {

        // General path
        GeneralPath gp932 = new GeneralPath();
        gp932.moveTo(572.21, 99.59);
        gp932.lineTo(586.96, 77.49);
        gp932.lineTo(601.7, 96.83);
        gp932.lineTo(586.96, 105.12);
        gp932.closePath();
        Rectangle2D bounds932 = gp932.getBounds2D();
        AffineTransform rotation932 = AffineTransform.getRotateInstance(
                Math.toRadians(246),
                bounds932.getCenterX(), bounds932.getCenterY()
        );
        Shape rotated932 = rotation932.createTransformedShape(gp932);
        g2d.setColor(new Color(6, 16, 59));
        g2d.fill(rotated932);

        // Circle
        Ellipse2D.Double circle933 = new Ellipse2D.Double(
                389.98, 291.75,
                16.25, 16.25
        );
        g2d.setColor(new Color(130, 145, 228));
        g2d.fill(circle933);

        // General path
        GeneralPath gp934 = new GeneralPath();
        gp934.moveTo(602, 217);
        gp934.lineTo(593, 219);
        gp934.lineTo(594, 227);
        gp934.lineTo(597, 234);
        gp934.lineTo(599, 228);
        gp934.lineTo(602, 226);
        gp934.closePath();
        g2d.setColor(new Color(10, 34, 90));
        g2d.fill(gp934);

        // Circle
        Ellipse2D.Double circle935 = new Ellipse2D.Double(
                463.48, 423.23,
                12.16, 12.16
        );
        Rectangle2D bounds935 = circle935.getBounds2D();
        AffineTransform rotation935 = AffineTransform.getRotateInstance(
                Math.toRadians(312),
                bounds935.getCenterX(), bounds935.getCenterY()
        );
        Shape rotated935 = rotation935.createTransformedShape(circle935);
        g2d.setColor(new Color(48, 46, 37));
        g2d.fill(rotated935);

        // Arc
        Arc2D.Double arc936 = new Arc2D.Double(
                397.87, 231.27,
                28.39, 37.91,
                0, 103, Arc2D.PIE
        );
        Rectangle2D bounds936 = arc936.getBounds2D();
        AffineTransform rotation936 = AffineTransform.getRotateInstance(
                Math.toRadians(211),
                bounds936.getCenterX(), bounds936.getCenterY()
        );
        Shape rotated936 = rotation936.createTransformedShape(arc936);
        g2d.setColor(new Color(89, 118, 231));
        g2d.fill(rotated936);

        // Rectangle
        Rectangle2D.Double rectangle937 = new Rectangle2D.Double(
                436.09, 318.14,
                7, 39.95
        );
        Rectangle2D bounds937 = rectangle937.getBounds2D();
        AffineTransform rotation937 = AffineTransform.getRotateInstance(
                Math.toRadians(-62.45),
                bounds937.getCenterX(), bounds937.getCenterY()
        );
        Shape rotated937 = rotation937.createTransformedShape(rectangle937);
        g2d.setColor(new Color(41, 32, 53));
        g2d.fill(rotated937);

        // Ellipse
        Ellipse2D.Double ellipse938 = new Ellipse2D.Double(
                268.5, 334.43,
                19.52, 9.39
        );
        Rectangle2D bounds938 = ellipse938.getBounds2D();
        AffineTransform rotation938 = AffineTransform.getRotateInstance(
                Math.toRadians(143),
                bounds938.getCenterX(), bounds938.getCenterY()
        );
        Shape rotated938 = rotation938.createTransformedShape(ellipse938);
        g2d.setColor(new Color(48, 103, 188));
        g2d.fill(rotated938);

        // Ellipse
        Ellipse2D.Double ellipse939 = new Ellipse2D.Double(
                317.52, 246.02,
                6.58, 20.59
        );
        Rectangle2D bounds939 = ellipse939.getBounds2D();
        AffineTransform rotation939 = AffineTransform.getRotateInstance(
                Math.toRadians(7.56),
                bounds939.getCenterX(), bounds939.getCenterY()
        );
        Shape rotated939 = rotation939.createTransformedShape(ellipse939);
        g2d.setColor(new Color(9, 20, 61));
        g2d.fill(rotated939);

        // Square
        Rectangle2D.Double square940 = new Rectangle2D.Double(
                634.31, 260.1,
                9.64, 9.64
        );
        g2d.setColor(new Color(16, 29, 74));
        g2d.fill(square940);

        // Quadratic curve
        QuadCurve2D.Double qc941 = new QuadCurve2D.Double(
                402.19, 278.26,
                408.7, 271.88,
                415.2, 278.26
        );
        Rectangle2D bounds941 = qc941.getBounds2D();
        AffineTransform rotation941 = AffineTransform.getRotateInstance(
                Math.toRadians(123),
                bounds941.getCenterX(), bounds941.getCenterY()
        );
        Shape rotated941 = rotation941.createTransformedShape(qc941);
        g2d.setColor(new Color(255, 255, 254));
        BasicStroke bs941 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs941);
        g2d.draw(rotated941);

        // Line
        Line2D.Double line942 = new Line2D.Double(
                372.93, 196.16,
                390.72, 196.16
        );
        Rectangle2D bounds942 = line942.getBounds2D();
        AffineTransform rotation942 = AffineTransform.getRotateInstance(
                Math.toRadians(4),
                bounds942.getCenterX(), bounds942.getCenterY()
        );
        Shape rotated942 = rotation942.createTransformedShape(line942);
        g2d.setColor(new Color(160, 178, 225));
        BasicStroke bs942 = new BasicStroke(
                2.88f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs942);
        g2d.draw(rotated942);

        // Cubic curve
        CubicCurve2D.Double cc943 = new CubicCurve2D.Double(
                523.79, 113.04,
                533, 97.58,
                545.27, 128.5,
                554.47, 113.04
        );
        Rectangle2D bounds943 = cc943.getBounds2D();
        AffineTransform rotation943 = AffineTransform.getRotateInstance(
                Math.toRadians(191),
                bounds943.getCenterX(), bounds943.getCenterY()
        );
        Shape rotated943 = rotation943.createTransformedShape(cc943);
        g2d.setColor(new Color(38, 59, 144));
        BasicStroke bs943 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs943);
        g2d.draw(rotated943);

    }

    public static void drawDetails76(Graphics2D g2d) {

        // Cubic curve
        CubicCurve2D.Double cc944 = new CubicCurve2D.Double(
                600.39, 203.11,
                605.11, 200.21,
                611.4, 206.02,
                616.12, 203.11
        );
        Rectangle2D bounds944 = cc944.getBounds2D();
        AffineTransform rotation944 = AffineTransform.getRotateInstance(
                Math.toRadians(288),
                bounds944.getCenterX(), bounds944.getCenterY()
        );
        Shape rotated944 = rotation944.createTransformedShape(cc944);
        g2d.setColor(new Color(6, 31, 68));
        BasicStroke bs944 = new BasicStroke(
                2.96f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs944);
        g2d.draw(rotated944);

        // Ellipse
        Ellipse2D.Double ellipse945 = new Ellipse2D.Double(
                703.14, 164.92,
                12.17, 10.46
        );
        Rectangle2D bounds945 = ellipse945.getBounds2D();
        AffineTransform rotation945 = AffineTransform.getRotateInstance(
                Math.toRadians(200),
                bounds945.getCenterX(), bounds945.getCenterY()
        );
        Shape rotated945 = rotation945.createTransformedShape(ellipse945);
        g2d.setColor(new Color(1, 0, 28));
        g2d.fill(rotated945);

        // Arc
        Arc2D.Double arc946 = new Arc2D.Double(
                173.32, 308.88,
                9.83, 7.24,
                0, 228, Arc2D.OPEN
        );
        Rectangle2D bounds946 = arc946.getBounds2D();
        AffineTransform rotation946 = AffineTransform.getRotateInstance(
                Math.toRadians(253),
                bounds946.getCenterX(), bounds946.getCenterY()
        );
        Shape rotated946 = rotation946.createTransformedShape(arc946);
        g2d.setColor(new Color(8, 18, 69));
        BasicStroke bs946 = new BasicStroke(
                2.83f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs946);
        g2d.draw(rotated946);

        // Quadratic curve
        QuadCurve2D.Double qc947 = new QuadCurve2D.Double(
                556.57, 27.13,
                570.8, 20.54,
                585.02, 27.13
        );
        Rectangle2D bounds947 = qc947.getBounds2D();
        AffineTransform rotation947 = AffineTransform.getRotateInstance(
                Math.toRadians(262),
                bounds947.getCenterX(), bounds947.getCenterY()
        );
        Shape rotated947 = rotation947.createTransformedShape(qc947);
        g2d.setColor(new Color(23, 21, 16));
        BasicStroke bs947 = new BasicStroke(
                2.98f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs947);
        g2d.draw(rotated947);

        // Quadratic curve
        QuadCurve2D.Double qc948 = new QuadCurve2D.Double(
                486.27, 90.64,
                496.7, 81.13,
                507.13, 90.64
        );
        Rectangle2D bounds948 = qc948.getBounds2D();
        AffineTransform rotation948 = AffineTransform.getRotateInstance(
                Math.toRadians(154),
                bounds948.getCenterX(), bounds948.getCenterY()
        );
        Shape rotated948 = rotation948.createTransformedShape(qc948);
        g2d.setColor(new Color(2, 14, 85));
        BasicStroke bs948 = new BasicStroke(
                2.76f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs948);
        g2d.draw(rotated948);

        // Line
        Line2D.Double line949 = new Line2D.Double(
                253.98, 348.39,
                266.15, 348.39
        );
        Rectangle2D bounds949 = line949.getBounds2D();
        AffineTransform rotation949 = AffineTransform.getRotateInstance(
                Math.toRadians(12),
                bounds949.getCenterX(), bounds949.getCenterY()
        );
        Shape rotated949 = rotation949.createTransformedShape(line949);
        g2d.setColor(new Color(15, 66, 185));
        BasicStroke bs949 = new BasicStroke(
                3.08f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs949);
        g2d.draw(rotated949);

        // Quadratic curve
        QuadCurve2D.Double qc950 = new QuadCurve2D.Double(
                577.46, 21.74,
                591.3, 9.78,
                605.15, 21.74
        );
        Rectangle2D bounds950 = qc950.getBounds2D();
        AffineTransform rotation950 = AffineTransform.getRotateInstance(
                Math.toRadians(67),
                bounds950.getCenterX(), bounds950.getCenterY()
        );
        Shape rotated950 = rotation950.createTransformedShape(qc950);
        g2d.setColor(new Color(9, 5, 0));
        BasicStroke bs950 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs950);
        g2d.draw(rotated950);

        // Ellipse
        Ellipse2D.Double ellipse951 = new Ellipse2D.Double(
                580.63, 340.83,
                12.66, 5.29
        );
        Rectangle2D bounds951 = ellipse951.getBounds2D();
        AffineTransform rotation951 = AffineTransform.getRotateInstance(
                Math.toRadians(350),
                bounds951.getCenterX(), bounds951.getCenterY()
        );
        Shape rotated951 = rotation951.createTransformedShape(ellipse951);
        g2d.setColor(new Color(8, 59, 161));
        g2d.fill(rotated951);

        // Rectangle
        Rectangle2D.Double rectangle952 = new Rectangle2D.Double(
                418, 272.59,
                15.49, 3.76
        );
        Rectangle2D bounds952 = rectangle952.getBounds2D();
        AffineTransform rotation952 = AffineTransform.getRotateInstance(
                Math.toRadians(-57.53),
                bounds952.getCenterX(), bounds952.getCenterY()
        );
        Shape rotated952 = rotation952.createTransformedShape(rectangle952);
        g2d.setColor(new Color(86, 97, 181));
        g2d.fill(rotated952);

        // Rectangle
        Rectangle2D.Double rectangle953 = new Rectangle2D.Double(
                182.46, 281.87,
                9, 10.17
        );
        g2d.setColor(new Color(136, 143, 201));
        g2d.fill(rectangle953);

        // General path
        GeneralPath gp954 = new GeneralPath();
        gp954.moveTo(656.4, 119.86);
        gp954.lineTo(656.4, 121.86);
        gp954.lineTo(670.4, 137.86);
        gp954.lineTo(671.4, 140.86);
        gp954.lineTo(679.4, 146.86);
        gp954.lineTo(680.4, 148.86);
        gp954.lineTo(679.4, 151.86);
        gp954.lineTo(688.4, 140.86);
        gp954.lineTo(674.4, 130.86);
        gp954.lineTo(666.4, 126.86);
        gp954.closePath();
        g2d.setColor(new Color(54, 60, 123));
        g2d.fill(gp954);

    }

    public static void drawDetails77(Graphics2D g2d) {

        // Ellipse
        Ellipse2D.Double ellipse955 = new Ellipse2D.Double(
                551.66, 20.45,
                3.85, 31.29
        );
        Rectangle2D bounds955 = ellipse955.getBounds2D();
        AffineTransform rotation955 = AffineTransform.getRotateInstance(
                Math.toRadians(108.18),
                bounds955.getCenterX(), bounds955.getCenterY()
        );
        Shape rotated955 = rotation955.createTransformedShape(ellipse955);
        g2d.setColor(new Color(2, 11, 35));
        g2d.fill(rotated955);

        // Rectangle
        Rectangle2D.Double rectangle956 = new Rectangle2D.Double(
                381.87, 338.53,
                19.43, 9.58
        );
        g2d.setColor(new Color(118, 109, 183));
        g2d.fill(rectangle956);

        // Line
        Line2D.Double line957 = new Line2D.Double(
                522.57, 334.78,
                547, 334.78
        );
        Rectangle2D bounds957 = line957.getBounds2D();
        AffineTransform rotation957 = AffineTransform.getRotateInstance(
                Math.toRadians(308),
                bounds957.getCenterX(), bounds957.getCenterY()
        );
        Shape rotated957 = rotation957.createTransformedShape(line957);
        g2d.setColor(new Color(0, 42, 127));
        BasicStroke bs957 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs957);
        g2d.draw(rotated957);

        // Line
        Line2D.Double line958 = new Line2D.Double(
                566.35, 276.5,
                594.19, 276.5
        );
        Rectangle2D bounds958 = line958.getBounds2D();
        AffineTransform rotation958 = AffineTransform.getRotateInstance(
                Math.toRadians(280),
                bounds958.getCenterX(), bounds958.getCenterY()
        );
        Shape rotated958 = rotation958.createTransformedShape(line958);
        g2d.setColor(new Color(176, 203, 255));
        BasicStroke bs958 = new BasicStroke(
                3.26f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs958);
        g2d.draw(rotated958);

        // Quadratic curve
        QuadCurve2D.Double qc959 = new QuadCurve2D.Double(
                133.74, 373.91,
                147.83, 368.68,
                161.91, 373.91
        );
        Rectangle2D bounds959 = qc959.getBounds2D();
        AffineTransform rotation959 = AffineTransform.getRotateInstance(
                Math.toRadians(231),
                bounds959.getCenterX(), bounds959.getCenterY()
        );
        Shape rotated959 = rotation959.createTransformedShape(qc959);
        g2d.setColor(new Color(45, 56, 129));
        BasicStroke bs959 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs959);
        g2d.draw(rotated959);

        // Arc
        Arc2D.Double arc960 = new Arc2D.Double(
                516.28, 26.68,
                17.02, 7.49,
                0, 105, Arc2D.OPEN
        );
        Rectangle2D bounds960 = arc960.getBounds2D();
        AffineTransform rotation960 = AffineTransform.getRotateInstance(
                Math.toRadians(326),
                bounds960.getCenterX(), bounds960.getCenterY()
        );
        Shape rotated960 = rotation960.createTransformedShape(arc960);
        g2d.setColor(new Color(18, 12, 9));
        BasicStroke bs960 = new BasicStroke(
                3.68f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs960);
        g2d.draw(rotated960);

        // Arc
        Arc2D.Double arc961 = new Arc2D.Double(
                424.76, 399.84,
                11.93, 12.68,
                0, 226, Arc2D.PIE
        );
        Rectangle2D bounds961 = arc961.getBounds2D();
        AffineTransform rotation961 = AffineTransform.getRotateInstance(
                Math.toRadians(223),
                bounds961.getCenterX(), bounds961.getCenterY()
        );
        Shape rotated961 = rotation961.createTransformedShape(arc961);
        g2d.setColor(new Color(56, 52, 63));
        g2d.fill(rotated961);

        // Rectangle
        Rectangle2D.Double rectangle962 = new Rectangle2D.Double(
                656.19, 202.09,
                9.3, 4.65
        );
        Rectangle2D bounds962 = rectangle962.getBounds2D();
        AffineTransform rotation962 = AffineTransform.getRotateInstance(
                Math.toRadians(-45),
                bounds962.getCenterX(), bounds962.getCenterY()
        );
        Shape rotated962 = rotation962.createTransformedShape(rectangle962);
        g2d.setColor(new Color(0, 0, 40));
        g2d.fill(rotated962);

        // Rectangle
        Rectangle2D.Double rectangle963 = new Rectangle2D.Double(
                576.35, 228.78,
                16.76, 11.99
        );
        g2d.setColor(new Color(9, 41, 103));
        g2d.fill(rectangle963);

        // Ellipse
        Ellipse2D.Double ellipse964 = new Ellipse2D.Double(
                653.55, 158.55,
                14.65, 13.34
        );
        Rectangle2D bounds964 = ellipse964.getBounds2D();
        AffineTransform rotation964 = AffineTransform.getRotateInstance(
                Math.toRadians(177),
                bounds964.getCenterX(), bounds964.getCenterY()
        );
        Shape rotated964 = rotation964.createTransformedShape(ellipse964);
        g2d.setColor(new Color(100, 128, 185));
        g2d.fill(rotated964);

        // Ellipse
        Ellipse2D.Double ellipse965 = new Ellipse2D.Double(
                581.19, 146.17,
                2.59, 65.38
        );
        Rectangle2D bounds965 = ellipse965.getBounds2D();
        AffineTransform rotation965 = AffineTransform.getRotateInstance(
                Math.toRadians(166.2),
                bounds965.getCenterX(), bounds965.getCenterY()
        );
        Shape rotated965 = rotation965.createTransformedShape(ellipse965);
        g2d.setColor(new Color(6, 79, 172));
        g2d.fill(rotated965);

        // Quadratic curve
        QuadCurve2D.Double qc966 = new QuadCurve2D.Double(
                290.52, 286.96,
                295.65, 282.19,
                300.79, 286.96
        );
        Rectangle2D bounds966 = qc966.getBounds2D();
        AffineTransform rotation966 = AffineTransform.getRotateInstance(
                Math.toRadians(330),
                bounds966.getCenterX(), bounds966.getCenterY()
        );
        Shape rotated966 = rotation966.createTransformedShape(qc966);
        g2d.setColor(new Color(87, 126, 198));
        BasicStroke bs966 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs966);
        g2d.draw(rotated966);

    }

    public static void drawDetails78(Graphics2D g2d) {

        // Circle
        Ellipse2D.Double circle967 = new Ellipse2D.Double(
                656.66, 325.26,
                21.47, 21.47
        );
        g2d.setColor(new Color(36, 36, 61));
        g2d.fill(circle967);

        // Square
        Rectangle2D.Double square968 = new Rectangle2D.Double(
                498.67, 390.88,
                11.36, 11.36
        );
        g2d.setColor(new Color(10, 43, 165));
        g2d.fill(square968);

        // Ellipse
        Ellipse2D.Double ellipse969 = new Ellipse2D.Double(
                592.12, 113.52,
                4.03, 12.32
        );
        Rectangle2D bounds969 = ellipse969.getBounds2D();
        AffineTransform rotation969 = AffineTransform.getRotateInstance(
                Math.toRadians(8.78),
                bounds969.getCenterX(), bounds969.getCenterY()
        );
        Shape rotated969 = rotation969.createTransformedShape(ellipse969);
        g2d.setColor(new Color(15, 37, 78));
        g2d.fill(rotated969);

        // Square
        Rectangle2D.Double square970 = new Rectangle2D.Double(
                665.53, 296.55,
                21.31, 21.31
        );
        g2d.setColor(new Color(7, 12, 49));
        g2d.fill(square970);

        // Rectangle
        Rectangle2D.Double rectangle971 = new Rectangle2D.Double(
                311.86, 354.94,
                56.97, 13.54
        );
        Rectangle2D bounds971 = rectangle971.getBounds2D();
        AffineTransform rotation971 = AffineTransform.getRotateInstance(
                Math.toRadians(-3.18),
                bounds971.getCenterX(), bounds971.getCenterY()
        );
        Shape rotated971 = rotation971.createTransformedShape(rectangle971);
        g2d.setColor(new Color(24, 26, 61));
        g2d.fill(rotated971);

        // Arc
        Arc2D.Double arc972 = new Arc2D.Double(
                630.28, 71.64,
                13.73, 18.53,
                0, 239, Arc2D.PIE
        );
        Rectangle2D bounds972 = arc972.getBounds2D();
        AffineTransform rotation972 = AffineTransform.getRotateInstance(
                Math.toRadians(130),
                bounds972.getCenterX(), bounds972.getCenterY()
        );
        Shape rotated972 = rotation972.createTransformedShape(arc972);
        g2d.setColor(new Color(0, 4, 37));
        g2d.fill(rotated972);

        // Rectangle
        Rectangle2D.Double rectangle973 = new Rectangle2D.Double(
                630.85, 172.45,
                12.05, 16.39
        );
        Rectangle2D bounds973 = rectangle973.getBounds2D();
        AffineTransform rotation973 = AffineTransform.getRotateInstance(
                Math.toRadians(-81.87),
                bounds973.getCenterX(), bounds973.getCenterY()
        );
        Shape rotated973 = rotation973.createTransformedShape(rectangle973);
        g2d.setColor(new Color(10, 18, 59));
        g2d.fill(rotated973);

        // Rectangle
        Rectangle2D.Double rectangle974 = new Rectangle2D.Double(
                629.2, 186.86,
                40.85, 7.05
        );
        Rectangle2D bounds974 = rectangle974.getBounds2D();
        AffineTransform rotation974 = AffineTransform.getRotateInstance(
                Math.toRadians(-31.26),
                bounds974.getCenterX(), bounds974.getCenterY()
        );
        Shape rotated974 = rotation974.createTransformedShape(rectangle974);
        g2d.setColor(new Color(29, 37, 60));
        g2d.fill(rotated974);

        // Square
        Rectangle2D.Double square975 = new Rectangle2D.Double(
                336.04, 445.45,
                8.68, 8.68
        );
        g2d.setColor(new Color(8, 49, 118));
        g2d.fill(square975);

        // Circle
        Ellipse2D.Double circle976 = new Ellipse2D.Double(
                377.67, 186.05,
                9.89, 9.89
        );
        Rectangle2D bounds976 = circle976.getBounds2D();
        AffineTransform rotation976 = AffineTransform.getRotateInstance(
                Math.toRadians(350),
                bounds976.getCenterX(), bounds976.getCenterY()
        );
        Shape rotated976 = rotation976.createTransformedShape(circle976);
        g2d.setColor(new Color(89, 107, 167));
        g2d.fill(rotated976);

        // General path
        GeneralPath gp977 = new GeneralPath();
        gp977.moveTo(611, 141);
        gp977.lineTo(613, 145);
        gp977.lineTo(616, 147);
        gp977.lineTo(620, 148);
        gp977.lineTo(621, 151);
        gp977.lineTo(625, 154);
        gp977.lineTo(626, 156);
        gp977.lineTo(628, 157);
        gp977.lineTo(635, 158);
        gp977.lineTo(639, 160);
        gp977.lineTo(640, 163);
        gp977.lineTo(648, 170);
        gp977.lineTo(651, 174);
        gp977.lineTo(649, 171);
        gp977.lineTo(640, 158);
        gp977.lineTo(633, 157);
        gp977.lineTo(627, 153);
        gp977.lineTo(616, 143);
        gp977.closePath();
        g2d.setColor(new Color(167, 175, 224));
        g2d.fill(gp977);

        // Ellipse
        Ellipse2D.Double ellipse978 = new Ellipse2D.Double(
                313.3, 265.18,
                8.19, 8.77
        );
        Rectangle2D bounds978 = ellipse978.getBounds2D();
        AffineTransform rotation978 = AffineTransform.getRotateInstance(
                Math.toRadians(86),
                bounds978.getCenterX(), bounds978.getCenterY()
        );
        Shape rotated978 = rotation978.createTransformedShape(ellipse978);
        g2d.setColor(new Color(18, 28, 94));
        g2d.fill(rotated978);

        // Rectangle
        Rectangle2D.Double rectangle979 = new Rectangle2D.Double(
                655.85, 288.23,
                21.55, 3.35
        );
        Rectangle2D bounds979 = rectangle979.getBounds2D();
        AffineTransform rotation979 = AffineTransform.getRotateInstance(
                Math.toRadians(-26.56),
                bounds979.getCenterX(), bounds979.getCenterY()
        );
        Shape rotated979 = rotation979.createTransformedShape(rectangle979);
        g2d.setColor(new Color(99, 80, 80));
        g2d.fill(rotated979);

    }

    public static void drawDetails79(Graphics2D g2d) {

        // Quadratic curve
        QuadCurve2D.Double qc980 = new QuadCurve2D.Double(
                585.74, 95.42,
                600.89, 89.06,
                616.05, 95.42
        );
        Rectangle2D bounds980 = qc980.getBounds2D();
        AffineTransform rotation980 = AffineTransform.getRotateInstance(
                Math.toRadians(114),
                bounds980.getCenterX(), bounds980.getCenterY()
        );
        Shape rotated980 = rotation980.createTransformedShape(qc980);
        g2d.setColor(new Color(3, 11, 53));
        BasicStroke bs980 = new BasicStroke(
                3.07f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs980);
        g2d.draw(rotated980);

        // Square
        Rectangle2D.Double square981 = new Rectangle2D.Double(
                548.32, 119.78,
                8.31, 8.31
        );
        g2d.setColor(new Color(34, 47, 124));
        g2d.fill(square981);

        // General path
        GeneralPath gp982 = new GeneralPath();
        gp982.moveTo(576, 0);
        gp982.lineTo(576, 21);
        gp982.lineTo(578, 23);
        gp982.lineTo(578, 25);
        gp982.lineTo(580, 28);
        gp982.lineTo(584, 29);
        gp982.lineTo(589, 32);
        gp982.lineTo(591, 32);
        gp982.lineTo(592, 31);
        gp982.lineTo(591, 29);
        gp982.lineTo(591, 0);
        gp982.closePath();
        g2d.setColor(new Color(42, 39, 27));
        g2d.fill(gp982);

        // Line
        Line2D.Double line983 = new Line2D.Double(
                462.52, 272.46,
                474.1, 272.46
        );
        Rectangle2D bounds983 = line983.getBounds2D();
        AffineTransform rotation983 = AffineTransform.getRotateInstance(
                Math.toRadians(214),
                bounds983.getCenterX(), bounds983.getCenterY()
        );
        Shape rotated983 = rotation983.createTransformedShape(line983);
        g2d.setColor(new Color(0, 12, 76));
        BasicStroke bs983 = new BasicStroke(
                3.12f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs983);
        g2d.draw(rotated983);

        // Ellipse
        Ellipse2D.Double ellipse984 = new Ellipse2D.Double(
                459.71, 267.96,
                8.81, 24.5
        );
        Rectangle2D bounds984 = ellipse984.getBounds2D();
        AffineTransform rotation984 = AffineTransform.getRotateInstance(
                Math.toRadians(146.64),
                bounds984.getCenterX(), bounds984.getCenterY()
        );
        Shape rotated984 = rotation984.createTransformedShape(ellipse984);
        g2d.setColor(new Color(101, 162, 225));
        g2d.fill(rotated984);

        // Quadratic curve
        QuadCurve2D.Double qc985 = new QuadCurve2D.Double(
                448.86, 356.52,
                456.52, 351.89,
                464.19, 356.52
        );
        Rectangle2D bounds985 = qc985.getBounds2D();
        AffineTransform rotation985 = AffineTransform.getRotateInstance(
                Math.toRadians(222),
                bounds985.getCenterX(), bounds985.getCenterY()
        );
        Shape rotated985 = rotation985.createTransformedShape(qc985);
        g2d.setColor(new Color(164, 129, 110));
        BasicStroke bs985 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs985);
        g2d.draw(rotated985);

        // Rectangle
        Rectangle2D.Double rectangle986 = new Rectangle2D.Double(
                623.44, 49.21,
                20.26, 11.46
        );
        g2d.setColor(new Color(26, 19, 21));
        g2d.fill(rectangle986);

        // Ellipse
        Ellipse2D.Double ellipse987 = new Ellipse2D.Double(
                513.13, 334.41,
                19.27, 8.91
        );
        Rectangle2D bounds987 = ellipse987.getBounds2D();
        AffineTransform rotation987 = AffineTransform.getRotateInstance(
                Math.toRadians(10),
                bounds987.getCenterX(), bounds987.getCenterY()
        );
        Shape rotated987 = rotation987.createTransformedShape(ellipse987);
        g2d.setColor(new Color(50, 118, 205));
        g2d.fill(rotated987);

        // Ellipse
        Ellipse2D.Double ellipse988 = new Ellipse2D.Double(
                415.72, 302.46,
                12.03, 12.46
        );
        Rectangle2D bounds988 = ellipse988.getBounds2D();
        AffineTransform rotation988 = AffineTransform.getRotateInstance(
                Math.toRadians(357),
                bounds988.getCenterX(), bounds988.getCenterY()
        );
        Shape rotated988 = rotation988.createTransformedShape(ellipse988);
        g2d.setColor(new Color(48, 57, 118));
        g2d.fill(rotated988);

        // General path
        GeneralPath gp989 = new GeneralPath();
        gp989.moveTo(292.97, 268.37);
        gp989.lineTo(297.22, 261.31);
        gp989.lineTo(301.46, 267.49);
        gp989.lineTo(297.22, 270.14);
        gp989.closePath();
        Rectangle2D bounds989 = gp989.getBounds2D();
        AffineTransform rotation989 = AffineTransform.getRotateInstance(
                Math.toRadians(355),
                bounds989.getCenterX(), bounds989.getCenterY()
        );
        Shape rotated989 = rotation989.createTransformedShape(gp989);
        g2d.setColor(new Color(2, 13, 56));
        g2d.fill(rotated989);

        // General path
        GeneralPath gp990 = new GeneralPath();
        gp990.moveTo(370.73, 153.44);
        gp990.lineTo(368.73, 156.44);
        gp990.lineTo(365.73, 156.44);
        gp990.lineTo(364.73, 157.44);
        gp990.lineTo(365.73, 166.44);
        gp990.lineTo(363.73, 172.44);
        gp990.lineTo(362.73, 183.44);
        gp990.lineTo(364.73, 182.44);
        gp990.lineTo(369.73, 182.44);
        gp990.lineTo(369.73, 178.44);
        gp990.lineTo(370.73, 177.44);
        gp990.lineTo(370.73, 160.44);
        gp990.lineTo(372.73, 158.44);
        gp990.lineTo(372.73, 154.44);
        gp990.closePath();
        g2d.setColor(new Color(4, 13, 36));
        g2d.fill(gp990);

        // Square
        Rectangle2D.Double square991 = new Rectangle2D.Double(
                477.44, 84.07,
                9.54, 9.54
        );
        g2d.setColor(new Color(12, 22, 117));
        g2d.fill(square991);

    }

}

class witchPart9 {

    public static void drawPart(Graphics2D g2d) {
        drawDetails80(g2d);
    }

    public static void drawDetails80(Graphics2D g2d) {

        // General path
        GeneralPath gp992 = new GeneralPath();
        gp992.moveTo(640, 198);
        gp992.lineTo(638, 196);
        gp992.lineTo(628, 206);
        gp992.lineTo(622, 196);
        gp992.lineTo(619, 199);
        gp992.lineTo(620, 199);
        gp992.lineTo(627, 205);
        gp992.lineTo(626, 206);
        gp992.lineTo(616, 208);
        gp992.lineTo(597, 217);
        gp992.lineTo(606, 214);
        gp992.lineTo(611, 213);
        gp992.lineTo(612, 211);
        gp992.lineTo(619, 208);
        gp992.lineTo(627, 208);
        gp992.lineTo(629, 205);
        gp992.lineTo(635, 204);
        gp992.lineTo(634, 203);
        gp992.closePath();
        g2d.setColor(new Color(39, 44, 71));
        g2d.fill(gp992);

        // Ellipse
        Ellipse2D.Double ellipse993 = new Ellipse2D.Double(
                302.2, 364.76,
                14.11, 10.73
        );
        Rectangle2D bounds993 = ellipse993.getBounds2D();
        AffineTransform rotation993 = AffineTransform.getRotateInstance(
                Math.toRadians(4),
                bounds993.getCenterX(), bounds993.getCenterY()
        );
        Shape rotated993 = rotation993.createTransformedShape(ellipse993);
        g2d.setColor(new Color(17, 19, 119));
        g2d.fill(rotated993);

        // Rectangle
        Rectangle2D.Double rectangle994 = new Rectangle2D.Double(
                646.63, 286.97,
                11.19, 7.14
        );
        g2d.setColor(new Color(0, 15, 62));
        g2d.fill(rectangle994);

        // General path
        GeneralPath gp995 = new GeneralPath();
        gp995.moveTo(598.42, 104.52);
        gp995.lineTo(609.42, 120.52);
        gp995.lineTo(617.42, 125.52);
        gp995.lineTo(626.42, 132.52);
        gp995.lineTo(635.42, 140.52);
        gp995.lineTo(639.42, 144.52);
        gp995.lineTo(643.42, 145.52);
        gp995.lineTo(643.42, 148.52);
        gp995.lineTo(638.42, 150.52);
        gp995.lineTo(637.42, 151.52);
        gp995.lineTo(644.42, 148.52);
        gp995.lineTo(656.42, 164.52);
        gp995.lineTo(659.42, 172.52);
        gp995.lineTo(669.42, 165.52);
        gp995.lineTo(665.42, 159.52);
        gp995.lineTo(663.42, 155.52);
        gp995.lineTo(633.42, 122.52);
        gp995.lineTo(608.42, 106.52);
        gp995.closePath();
        g2d.setColor(new Color(98, 123, 186));
        g2d.fill(gp995);

        // Quadratic curve
        QuadCurve2D.Double qc996 = new QuadCurve2D.Double(
                453.89, 357.75,
                459.58, 352.07,
                465.26, 357.75
        );
        Rectangle2D bounds996 = qc996.getBounds2D();
        AffineTransform rotation996 = AffineTransform.getRotateInstance(
                Math.toRadians(313),
                bounds996.getCenterX(), bounds996.getCenterY()
        );
        Shape rotated996 = rotation996.createTransformedShape(qc996);
        g2d.setColor(new Color(39, 28, 43));
        BasicStroke bs996 = new BasicStroke(
                3.03f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs996);
        g2d.draw(rotated996);

        // Line
        Line2D.Double line997 = new Line2D.Double(
                624.63, 200,
                653.63, 200
        );
        Rectangle2D bounds997 = line997.getBounds2D();
        AffineTransform rotation997 = AffineTransform.getRotateInstance(
                Math.toRadians(206),
                bounds997.getCenterX(), bounds997.getCenterY()
        );
        Shape rotated997 = rotation997.createTransformedShape(line997);
        g2d.setColor(new Color(97, 116, 153));
        BasicStroke bs997 = new BasicStroke(
                3.04f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND
        );
        g2d.setStroke(bs997);
        g2d.draw(rotated997);

        // General path
        GeneralPath gp998 = new GeneralPath();
        gp998.moveTo(642.96, 203.95);
        gp998.lineTo(640.96, 204.95);
        gp998.lineTo(640.96, 206.95);
        gp998.lineTo(637.96, 208.95);
        gp998.lineTo(634.96, 212.95);
        gp998.lineTo(638.96, 214.95);
        gp998.lineTo(637.96, 221.95);
        gp998.lineTo(639.96, 225.95);
        gp998.lineTo(645.96, 227.95);
        gp998.lineTo(644.96, 221.95);
        gp998.lineTo(640.96, 223.95);
        gp998.lineTo(638.96, 222.95);
        gp998.lineTo(638.96, 220.95);
        gp998.lineTo(643.96, 212.95);
        gp998.lineTo(644.96, 214.95);
        gp998.lineTo(645.96, 213.95);
        gp998.lineTo(646.96, 203.95);
        gp998.closePath();
        g2d.setColor(new Color(0, 11, 55));
        g2d.fill(gp998);

        // Ellipse
        Ellipse2D.Double ellipse999 = new Ellipse2D.Double(
                628.96, 194.86,
                6.74, 14.15
        );
        Rectangle2D bounds999 = ellipse999.getBounds2D();
        AffineTransform rotation999 = AffineTransform.getRotateInstance(
                Math.toRadians(59.97),
                bounds999.getCenterX(), bounds999.getCenterY()
        );
        Shape rotated999 = rotation999.createTransformedShape(ellipse999);
        g2d.setColor(new Color(40, 50, 68));
        g2d.fill(rotated999);

        // General path
        GeneralPath gp1000 = new GeneralPath();
        gp1000.moveTo(636.58, 233.01);
        gp1000.lineTo(647.83, 226.14);
        gp1000.lineTo(659.07, 232.15);
        gp1000.lineTo(647.83, 234.73);
        gp1000.closePath();
        Rectangle2D bounds1000 = gp1000.getBounds2D();
        AffineTransform rotation1000 = AffineTransform.getRotateInstance(
                Math.toRadians(161),
                bounds1000.getCenterX(), bounds1000.getCenterY()
        );
        Shape rotated1000 = rotation1000.createTransformedShape(gp1000);
        g2d.setColor(new Color(12, 22, 59));
        g2d.fill(rotated1000);

    }

}

