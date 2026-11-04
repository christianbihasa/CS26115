// Bihasa, Christian Louie A. | 4CSD
package PrelimProject;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class prelimproject_Bihasa_Helpers extends JPanel {

    // Canvas size
    private static final int WIDTH = 600;
    private static final int HEIGHT = 800;

    // Skin
    private final Color skinBase      = new Color(184, 142, 108);
    private final Color earShadow     = new Color(126, 94, 78);

    // Hair and facial features
    private final Color hairColor     = new Color(30, 29, 34);
    private final Color browDark      = new Color(46, 33, 28);
    private final Color lashColor     = new Color(36, 25, 22);
    private final Color irisColor     = new Color(34, 24, 22);
    private final Color lipUpperDark  = new Color(118, 58, 52);
    private final Color lipLowerMid   = new Color(212, 134, 130);

    // Clothing and lanyard
    private final Color shirtGrey     = new Color(214, 214, 222);
    private final Color shirtBlack    = new Color(40, 40, 45);
    private final Color strapColor    = new Color(42, 40, 46);
    private final Color strapText     = new Color(226, 222, 210);
    private final Color sunYellow     = new Color(236, 200, 52);

    // Plush fish
    private final Color fishLight     = new Color(216, 220, 226);
    private final Color fishBlue      = new Color(70, 92, 114);
    private final Color fishTail      = new Color(132, 154, 174);
    private final Color fishStripe    = new Color(52, 68, 88);

    public prelimproject_Bihasa_Helpers() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                             RenderingHints.VALUE_STROKE_PURE);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                             RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        // Back-to-front drawing order
        drawFish(g2d);
        drawShirt(g2d);
        drawSkin(g2d);
        drawEars(g2d);
        drawLanyard(g2d);
        drawEyebrows(g2d);
        drawEyes(g2d);
        drawNose(g2d);
        drawMouth(g2d);
        drawHair(g2d);
    }

    //  HELPERS
    private GeneralPath smoothPath(boolean closed, double... xy) {
        int n = xy.length / 2;
        GeneralPath path = new GeneralPath();
        path.moveTo(xy[0], xy[1]);

        int segments = closed ? n : n - 1;
        for (int i = 0; i < segments; i++) {
            int i0 = closed ? (i - 1 + n) % n : Math.max(i - 1, 0);
            int i2 = closed ? (i + 1) % n : i + 1;
            int i3 = closed ? (i + 2) % n : Math.min(i + 2, n - 1);

            double c1x = xy[2 * i] + (xy[2 * i2] - xy[2 * i0]) / 6;
            double c1y = xy[2 * i + 1] + (xy[2 * i2 + 1] - xy[2 * i0 + 1]) / 6;
            double c2x = xy[2 * i2] - (xy[2 * i3] - xy[2 * i]) / 6;
            double c2y = xy[2 * i2 + 1] - (xy[2 * i3 + 1] - xy[2 * i + 1]) / 6;
            path.curveTo(c1x, c1y, c2x, c2y, xy[2 * i2], xy[2 * i2 + 1]);
        }
        if (closed) {
            path.closePath();
        }
        return path;
    }

    /** Joins several point lists into one. */
    private double[] join(double[]... parts) {
        int length = 0;
        for (double[] part : parts) {
            length += part.length;
        }
        double[] all = new double[length];
        int pos = 0;
        for (double[] part : parts) {
            System.arraycopy(part, 0, all, pos, part.length);
            pos += part.length;
        }
        return all;
    }

    /** Fills a shape with one flat, solid color. */
    private void flatFill(Graphics2D g2d, Shape shape, Color color) {
        g2d.setColor(color);
        g2d.fill(shape);
    }

    private BasicStroke roundStroke(float width) {
        return new BasicStroke(width, BasicStroke.CAP_ROUND,
                               BasicStroke.JOIN_ROUND);
    }

    //  FIH
    private void drawFish(Graphics2D g2d) {
        drawFishTail(g2d);
        drawFishHead(g2d);
    }

    private void drawFishTail(Graphics2D g2d) {
        // Striped tail fin
        GeneralPath tail = smoothPath(true,
                108, 362, 88, 365, 70, 368, 53, 373, 38, 380, 35, 386,
                40, 393, 48, 399, 52, 409, 62, 409, 75, 407, 95, 402,
                108, 395, 120, 386);
        g2d.setColor(fishTail);
        g2d.fill(tail);

        // Dark stripes following the fan of the tail (Lines)
        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(tail);
        g.setColor(fishStripe);
        g.setStroke(roundStroke(1.6f));
        for (int i = 0; i < 8; i++) {
            double y = 368 + i * 5;
            g.draw(new Line2D.Double(118, y, 36, y + 12 - i * 1.5));
        }
        g.dispose();

        // White belly of the body (General Path)
        GeneralPath belly = smoothPath(true,
                178, 314, 160, 330, 140, 344, 118, 358, 100, 368,
                130, 372, 160, 373, 180, 372);
        g2d.setColor(fishLight);
        g2d.fill(belly);

        // Blue fin along the top and a dark seam along the bottom
        GeneralPath dorsal = new GeneralPath();
        dorsal.moveTo(180, 311);
        dorsal.quadTo(140, 336, 94, 364);
        dorsal.lineTo(99, 366);
        dorsal.quadTo(144, 340, 180, 316);
        dorsal.closePath();
        g2d.setColor(fishBlue);
        g2d.fill(dorsal);

        g2d.setColor(fishStripe);
        g2d.setStroke(roundStroke(3f));
        g2d.draw(new QuadCurve2D.Double(102, 372, 140, 377, 180, 375));
    }

    private void drawFishHead(Graphics2D g2d) {
        // Rounded head and snout (General Path)
        GeneralPath head = smoothPath(true,
                452, 312, 466, 320, 480, 325, 496, 330, 510, 334,
                522, 341, 532, 349, 539, 357, 538, 365, 526, 371,
                506, 375, 490, 379, 474, 383, 458, 385, 446, 382);
        g2d.setColor(fishLight);
        g2d.fill(head);

        // Soft shadow under the chin of the fish
        flatFill(g2d, new Ellipse2D.Double(462, 366, 64, 18),
                 new Color(178, 180, 189));

        // Small dorsal fin and dark pectoral fin (Ellipses)
        g2d.setColor(fishBlue);
        g2d.fill(new Ellipse2D.Double(450, 309, 18, 10));
        g2d.fill(new Ellipse2D.Double(446, 379, 26, 9));

        // Gill line (Cubic Curve)
        g2d.setColor(new Color(46, 46, 52));
        g2d.setStroke(roundStroke(1.5f));
        g2d.draw(new CubicCurve2D.Double(484, 330, 470, 342, 465, 362, 472, 380));

        // Drawn-on eye: ring, pupil and teardrop (Ellipse, Circle, Lines, Arc)
        g2d.setColor(new Color(240, 240, 244));
        g2d.fill(new Ellipse2D.Double(487, 342, 21, 19));
        g2d.setColor(new Color(40, 40, 46));
        g2d.setStroke(roundStroke(1.6f));
        g2d.draw(new Ellipse2D.Double(487, 342, 21, 19));
        g2d.fill(new Ellipse2D.Double(493, 349, 7.5, 7.5));
        g2d.draw(new Line2D.Double(492, 360, 487, 376));
        g2d.draw(new Line2D.Double(497, 360, 491, 377));
        g2d.draw(new Arc2D.Double(486, 373, 6, 6, 160, 200, Arc2D.OPEN));
    }

    //  SHIRT
    private static final double[] NECKLINE = {
        398, 622, 410, 632, 416, 660, 414, 682, 404, 702, 386, 724,
        360, 746, 331, 758, 305, 764, 280, 768, 252, 766, 228, 757,
        206, 743, 192, 727, 182, 707, 180, 690, 186, 672, 200, 646,
        214, 630
    };

    private void drawShirt(Graphics2D g2d) {
        // Grey T-shirt body and shoulders (General Path)
        GeneralPath body = smoothPath(false,
                0, 788, 12, 763, 39, 699, 58, 680, 122, 660,
                186, 630, 216, 620, 300, 610, 404, 618, 458, 650,
                502, 655, 600, 656);
        body.lineTo(WIDTH, HEIGHT);
        body.lineTo(0, HEIGHT);
        body.closePath();
        g2d.setColor(shirtGrey);
        g2d.fill(body);

        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(body);

        // Shadows in the folds of the sleeves (soft General Paths)
        flatFill(g, smoothPath(true, 40, 704, 70, 700, 120, 720, 146, 736,
                               110, 756, 60, 770, 24, 760),
                 new Color(194, 194, 202));
        flatFill(g, smoothPath(true, 420, 640, 440, 660, 452, 700, 444, 740,
                               428, 736, 418, 700),
                 new Color(198, 198, 206));

        // Black raglan panels at the bottom (General Paths)
        g.setColor(shirtBlack);
        g.fill(smoothPath(true,
                48, 798, 81, 770, 110, 762, 146, 736, 158, 730,
                176, 760, 191, 778, 204, 790, 204, 800, 48, 800));
        g.fill(smoothPath(true,
                400, 800, 401, 766, 428, 737, 448, 745, 463, 758,
                474, 772, 490, 787, 502, 800));

        // Raglan seams (Cubic Curves)
        g.setColor(new Color(157, 157, 167));
        g.setStroke(roundStroke(1.4f));
        g.draw(new CubicCurve2D.Double(168, 640, 152, 670, 148, 705, 157, 733));
        g.draw(new CubicCurve2D.Double(420, 632, 436, 652, 444, 680, 448, 702));
        g.dispose();

        // Ribbed collar band with its stitching (stroked neckline)
        GeneralPath collar = smoothPath(false, NECKLINE);
        g2d.setColor(new Color(222, 222, 228));
        g2d.setStroke(roundStroke(9f));
        g2d.draw(collar);
        g2d.setColor(new Color(150, 150, 160));
        g2d.setStroke(new BasicStroke(1.2f));
        AffineTransform saved = g2d.getTransform();
        g2d.translate(300, 690);
        g2d.scale(1.04, 1.03);
        g2d.translate(-300, -690);
        g2d.draw(collar);
        g2d.setTransform(saved);
    }

    //  SKIN: FACE, NECK AND EARS
    private GeneralPath createSkinShape() {
        // Right side of the face and neck, top to bottom
        double[] rightSide = {
            250, 290, 263, 272, 297, 262, 340, 276, 368, 288, 398, 312,
            410, 330, 414, 356, 418, 378, 421, 400, 422, 420, 419, 446,
            418, 470, 416, 490, 410, 503, 403, 512, 397, 526, 389, 542,
            382, 556, 381, 578, 382, 602, 388, 614
        };
        // Left side of the neck and face, bottom to top
        double[] leftSide = {
            230, 614, 234, 598, 230, 560, 218, 538, 208, 518, 202, 498,
            198, 476, 196, 446, 191, 420, 190, 400, 196, 384, 210, 366,
            226, 348, 238, 326
        };
        return smoothPath(true, join(rightSide, NECKLINE, leftSide));
    }

    private void drawSkin(Graphics2D g2d) {
        GeneralPath skin = createSkinShape();
        g2d.setColor(skinBase);
        g2d.fill(skin);

        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(skin);

        // Darker left edge, in the shadow of the curtain (General Path)
        flatFill(g, smoothPath(true, 190, 330, 226, 340, 214, 420, 220, 500,
                               238, 560, 246, 640, 180, 640),
                 new Color(150, 110, 86));

        // Highlights: forehead, cheeks, nose bridge and chest
        flatFill(g, smoothPath(true, 320, 307, 332, 307, 358, 324, 382, 352,
                               376, 358, 338, 355, 319, 358, 315, 327),
                 new Color(205, 163, 129));
        flatFill(g, smoothPath(true, 304, 404, 313, 401, 328, 417, 354, 429,
                               387, 429, 414, 426, 418, 434, 410, 452, 391, 454,
                               385, 472, 356, 474, 340, 458, 327, 468, 302, 467,
                               285, 462, 285, 448, 299, 412),
                 new Color(205, 163, 129));
        flatFill(g, smoothPath(true, 215, 431, 226, 429, 243, 436, 265, 434,
                               266, 444, 251, 470, 237, 477, 224, 466, 215, 442),
                 new Color(198, 156, 122));
        flatFill(g, smoothPath(true, 310, 508, 330, 499, 343, 489, 353, 498,
                               350, 506, 325, 508, 316, 515),
                 new Color(199, 157, 123));
        flatFill(g, smoothPath(true, 246, 696, 264, 680, 284, 677, 315, 686,
                               338, 672, 356, 678, 355, 731, 348, 752, 308, 764,
                               282, 768, 252, 766),
                 new Color(205, 163, 129));

        // Shadows: under the hairline, around the eyes, mouth, chin and neck
        flatFill(g, smoothPath(true, 256, 300, 265, 278, 298, 267, 338, 280,
                               369, 292, 394, 316, 403, 330, 407, 368, 410, 398,
                               400, 392, 397, 350, 385, 322, 360, 305, 330, 293,
                               300, 284, 284, 298, 268, 330, 254, 352, 240, 356,
                               248, 334),
                 new Color(140, 102, 78));
        flatFill(g, smoothPath(true, 207, 380, 224, 371, 260, 362, 282, 366,
                               300, 374, 296, 387, 284, 401, 272, 412, 248, 416,
                               226, 415, 210, 408, 203, 394),
                 new Color(159, 119, 91));
        flatFill(g, smoothPath(true, 350, 386, 366, 379, 387, 381, 398, 387,
                               401, 396, 396, 402, 377, 399, 352, 392),
                 new Color(159, 119, 91));
        flatFill(g, smoothPath(true, 233, 524, 248, 517, 262, 523, 297, 529,
                               333, 528, 352, 524, 362, 530, 364, 542, 356, 548,
                               340, 540, 300, 542, 271, 540, 266, 547, 272, 554,
                               296, 561, 324, 559, 328, 572, 318, 588, 334, 600,
                               300, 636, 280, 639, 273, 630, 276, 612, 260, 592,
                               256, 566, 240, 558, 229, 544, 229, 532),
                 new Color(157, 118, 90));
        // Chin: lighter rounded pad above the jawline
        flatFill(g, smoothPath(true, 272, 572, 288, 566, 306, 565, 324, 568,
                               336, 578, 332, 592, 316, 600, 296, 601, 280, 595,
                               270, 584),
                 new Color(170, 129, 98));

        // Shadow under the jaw and chin, cast onto the neck
        flatFill(g, smoothPath(true, 226, 560, 240, 578, 258, 594, 280, 604,
                               304, 607, 328, 602, 352, 588, 372, 570, 386, 556,
                               392, 600, 386, 640, 300, 652, 232, 642, 222, 600),
                 new Color(136, 98, 74));
        g.dispose();

        // Chin line (Arc)
        g2d.setColor(new Color(118, 84, 64));
        g2d.setStroke(roundStroke(1.6f));
        g2d.draw(new Arc2D.Double(266, 574, 72, 32, 200, 140, Arc2D.OPEN));

        // Small moles (Circles)
        g2d.setColor(new Color(84, 56, 44));
        g2d.fill(new Ellipse2D.Double(233.5, 524.5, 3, 3));
        g2d.fill(new Ellipse2D.Double(407.5, 435.5, 2.5, 2.5));
    }

    private void drawEars(Graphics2D g2d) {
        // Left ear, darkened by the curtain's shadow (General Path + Arc)
        GeneralPath leftEar = smoothPath(true,
                197, 412, 186, 410, 177, 413, 173, 426, 174, 442,
                179, 458, 185, 470, 191, 482, 198, 490, 201, 470);
        g2d.setColor(earShadow);
        g2d.fill(leftEar);
        g2d.setColor(new Color(109, 81, 67));
        g2d.setStroke(roundStroke(1.6f));
        g2d.draw(new Arc2D.Double(179, 418, 16, 56, 90, 180, Arc2D.OPEN));

        // Right ear, catching the light (General Path + Arc)
        GeneralPath rightEar = smoothPath(true,
                415, 420, 425, 418, 433, 421, 438, 428, 440, 440,
                436, 455, 428, 468, 421, 482, 416, 494, 413, 500,
                411, 470);
        g2d.setColor(new Color(180, 142, 116));
        g2d.fill(rightEar);
        g2d.setColor(new Color(141, 105, 86));
        g2d.setStroke(roundStroke(1.6f));
        g2d.draw(new Arc2D.Double(419, 428, 15, 50, -90, 180, Arc2D.OPEN));
    }

    //  LANYARD
    private void drawLanyard(Graphics2D g2d) {
        GeneralPath leftStrap = new GeneralPath();
        leftStrap.moveTo(232, 600);
        leftStrap.lineTo(246, 605);
        leftStrap.lineTo(244, HEIGHT);
        leftStrap.lineTo(203, HEIGHT);
        leftStrap.lineTo(205, 692);
        leftStrap.quadTo(212, 640, 232, 600);
        leftStrap.closePath();

        GeneralPath rightStrap = new GeneralPath();
        rightStrap.moveTo(384, 598);
        rightStrap.lineTo(403, 606);
        rightStrap.lineTo(400, HEIGHT);
        rightStrap.lineTo(352, HEIGHT);
        rightStrap.lineTo(358, 700);
        rightStrap.quadTo(366, 640, 384, 598);
        rightStrap.closePath();

        g2d.setColor(strapColor);
        g2d.fill(leftStrap);
        g2d.fill(rightStrap);

        // Woven ribs across both straps (thin Rectangles clipped to the straps)
        Area straps = new Area(leftStrap);
        straps.add(new Area(rightStrap));
        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(straps);
        g.setColor(new Color(37, 35, 41));
        for (double y = 598; y < HEIGHT; y += 2.5) {
            g.fill(new Rectangle2D.Double(200, y, 210, 0.9));
        }
        g.dispose();

        drawStrapLettering(g2d, leftStrap);
        drawStrapEmblems(g2d, rightStrap);
    }

    private void drawStrapLettering(Graphics2D g2d, Shape leftStrap) {
        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(leftStrap);

        // Lettering runs up the strap; the selfie camera mirrors it
        g.translate(222, HEIGHT);
        g.rotate(-Math.PI / 2);
        g.scale(1, -1);

        g.setColor(strapText);
        g.setFont(new Font("Serif", Font.PLAIN, 31));
        g.drawString("OF SANTO TOMAS", 6f, 8f);

        g.setColor(new Color(214, 206, 170));
        g.setFont(new Font("Serif", Font.PLAIN, 7));
        g.drawString("THE CATHOLIC UNIVERSITY OF THE PHILIPPINES", 0f, 15f);
        g.dispose();
    }

    private void drawStrapEmblems(Graphics2D g2d, Shape rightStrap) {
        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(rightStrap);

        // Mirrored white lettering at the top (Lines + Quadratic Curves)
        g.setColor(new Color(214, 212, 214));
        g.setStroke(roundStroke(3f));
        g.draw(new Line2D.Double(385, 604, 400, 625));
        g.draw(new QuadCurve2D.Double(382, 628, 398, 626, 402, 640));
        g.draw(new QuadCurve2D.Double(392, 636, 394, 648, 403, 651));
        g.draw(new QuadCurve2D.Double(380, 645, 388, 658, 403, 666));
        g.draw(new QuadCurve2D.Double(374, 664, 386, 679, 403, 684));

        // Brown and white fleur emblem (General Path + Cubic Curves)
        GeneralPath brownLeaf = smoothPath(true,
                372, 706, 366, 714, 360, 712, 358, 718, 366, 728,
                365, 742, 360, 762, 356, 758, 360, 768, 368, 750,
                373, 724);
        g.setColor(new Color(137, 104, 82));
        g.fill(brownLeaf);

        g.setColor(new Color(214, 212, 214));
        g.setStroke(roundStroke(4f));
        g.draw(new CubicCurve2D.Double(376, 706, 378, 726, 372, 744, 372, 762));
        g.draw(new CubicCurve2D.Double(378, 728, 384, 716, 398, 720, 396, 732));

        // Partial sun at the bottom: face and rays (Circle + rotated Squares)
        g.translate(373, 806);
        g.setColor(sunYellow);
        g.fill(new Ellipse2D.Double(-24, -24, 48, 48));
        for (int i = 0; i < 12; i++) {
            g.rotate(Math.PI / 6);
            AffineTransform saved = g.getTransform();
            g.translate(32, 0);
            g.rotate(Math.PI / 4);
            g.fill(new Rectangle2D.Double(-6, -6, 12, 12));     // square ray
            g.setTransform(saved);
        }
        g.dispose();
    }

    //  FACIAL FEATURES
    private void drawEyebrows(Graphics2D g2d) {
        // Left brow: thick and level, tapering toward the nose
        GeneralPath left = smoothPath(true,
                206, 383, 211, 370, 222, 362, 237, 359, 250, 359,
                262, 361, 272, 366, 280, 370, 288, 376, 287, 380,
                272, 376, 256, 374, 239, 373, 226, 376, 214, 381);
        g2d.setColor(browDark);
        g2d.fill(left);

        // Right brow: lighter near the nose, arching up and out
        GeneralPath right = smoothPath(true,
                326, 382, 336, 374, 350, 364, 361, 362, 376, 363,
                389, 367, 398, 371, 405, 377, 404, 381, 392, 376,
                376, 374, 359, 375, 346, 379, 334, 384);
        g2d.setColor(new Color(66, 48, 40));
        g2d.fill(right);

        // Individual brow hairs, clipped to each brow (Lines)
        drawBrowHairs(g2d, left, 208, 288, -1);
        drawBrowHairs(g2d, right, 326, 405, 1);
    }

    private void drawBrowHairs(Graphics2D g2d, Shape brow, double fromX,
                               double toX, int outward) {
        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(brow);
        g.setStroke(roundStroke(0.8f));
        g.setColor(new Color(43, 31, 26));
        for (double x = fromX; x < toX; x += 4.5) {
            double lean = 6 + 4 * Math.sin(x * 0.9);
            g.draw(new Line2D.Double(x, 382, x + outward * lean, 358));
        }
        g.dispose();
    }

    private void drawEyes(Graphics2D g2d) {
        // Left eye: outer corner -> lash line -> inner corner, then lower lid
        drawEye(g2d,
                new double[] {213, 404, 220, 399, 232, 395, 245, 394,
                              258, 396, 265, 400, 272, 406, 274, 410},
                new double[] {262, 410.5, 248, 411.5, 235, 409.5, 222, 406.5},
                new double[] {216, 396, 238, 390.5, 253, 390.5, 262, 393, 268, 397},
                248, 403, 11);

        // Right eye: inner corner -> lash line -> outer corner, then lower lid
        drawEye(g2d,
                new double[] {338, 408, 342, 402, 349, 399, 357, 397,
                              367, 396.7, 378, 397, 387, 399, 396, 403, 399, 407},
                new double[] {387, 412, 370, 414.4, 353, 413, 342, 410.5},
                new double[] {344, 397, 353, 394, 370, 392.8, 387, 395.6, 396, 399},
                361.5, 405, 11.5);
    }

    private void drawEye(Graphics2D g2d, double[] lashLine, double[] lowerLid,
                         double[] crease, double irisX, double irisY,
                         double irisR) {
        GeneralPath opening = smoothPath(true, join(lashLine, lowerLid));

        // Shaded white of the eye
        g2d.setColor(new Color(128, 104, 92));
        g2d.fill(opening);

        // Iris with a radial gradient, clipped by the lids (Area intersection)
        Area iris = new Area(new Ellipse2D.Double(irisX - irisR, irisY - irisR,
                                                  2 * irisR, 2 * irisR));
        iris.intersect(new Area(opening));
        g2d.setColor(irisColor);
        g2d.fill(iris);

        // Pupil (Circle) and catchlight (Square)
        Area pupil = new Area(new Ellipse2D.Double(irisX - 4.5, irisY - 4.5, 9, 9));
        pupil.intersect(new Area(opening));
        g2d.setColor(new Color(8, 6, 6));
        g2d.fill(pupil);
        g2d.setColor(new Color(181, 178, 177));
        g2d.fill(new Rectangle2D.Double(irisX + 3, irisY - 5, 2.4, 2.4));

        // Lash line along the upper lid
        GeneralPath lash = smoothPath(false, lashLine);
        g2d.setColor(lashColor);
        g2d.setStroke(roundStroke(2.4f));
        g2d.draw(lash);

        // Double-eyelid crease and lower lid (smooth open paths)
        g2d.setColor(new Color(118, 84, 65));
        g2d.setStroke(roundStroke(1.3f));
        g2d.draw(smoothPath(false, crease));
        g2d.setColor(new Color(142, 104, 80));
        g2d.setStroke(roundStroke(1f));
        g2d.draw(smoothPath(false, lowerLid));
    }

    private void drawNose(Graphics2D g2d) {
        // Light running down the bridge (soft General Path)
        flatFill(g2d, smoothPath(true, 296, 400, 312, 400, 318, 430, 316, 456,
                                 300, 458, 290, 432),
                 new Color(208, 167, 134));

        // Rounded tip catching the light (Circle)
        flatFill(g2d, new Ellipse2D.Double(288, 446, 28, 28), new Color(212, 172, 140));

        // Soft shadow under the nose (General Path)
        flatFill(g2d, smoothPath(true, 271, 481, 279, 476, 286, 475, 304, 480,
                                 318, 480, 324, 484, 326, 488, 320, 492, 290, 494,
                                 272, 491, 269, 486),
                 new Color(153, 114, 89));

        // Nostrils, tilted with a transformation (Ellipses)
        drawNostril(g2d, 283, 484, 17, 7, 0.22);
        drawNostril(g2d, 318, 486, 19, 7, -0.12);

        // Wing creases (Cubic Curves)
        g2d.setColor(new Color(163, 124, 96));
        g2d.setStroke(roundStroke(1.6f));
        g2d.draw(new CubicCurve2D.Double(272, 456, 262, 468, 264, 482, 276, 488));
        g2d.draw(new CubicCurve2D.Double(332, 458, 342, 470, 340, 484, 327, 490));
    }

    private void drawNostril(Graphics2D g2d, double cx, double cy,
                             double w, double h, double tilt) {
        AffineTransform saved = g2d.getTransform();
        g2d.rotate(tilt, cx, cy);
        g2d.setColor(new Color(62, 38, 32));
        g2d.fill(new Ellipse2D.Double(cx - w / 2, cy - h / 2, w, h));
        g2d.setTransform(saved);
    }

    private void drawMouth(Graphics2D g2d) {
        // Faint moustache: a soft shadow band (General Path)...
        flatFill(g2d, smoothPath(true, 238, 524, 262, 516, 300, 514, 336, 516,
                                 358, 526, 350, 530, 330, 523, 300, 521, 268, 523,
                                 246, 530),
                 new Color(162, 123, 94));

        // ...with a few sparse hairs, denser toward the corners (Lines)
        g2d.setStroke(roundStroke(0.8f));
        for (double x = 240; x <= 356; x += 3.1) {
            double t = (x - 297) / 59.0;               // -1 .. 1 across the lip
            double y = 515 + 6 * t * t + 2 * Math.sin(x * 1.7);
            int alpha = Math.abs(t) > 0.65 ? 110 : 45;
            g2d.setColor(new Color(50, 34, 28, alpha));
            g2d.draw(new Line2D.Double(x, y, x + (t < 0 ? -2.5 : 2.5), y + 4));
        }

        // Upper lip: thin, dark red-brown band (General Path)
        GeneralPath upper = smoothPath(true,
                243, 531, 264, 527, 278, 525, 295, 524, 314, 525, 332, 528,
                346, 531, 355, 536, 328, 537, 306, 537.5, 285, 537.5, 266, 536);
        g2d.setColor(lipUpperDark);
        g2d.fill(upper);

        // Lower lip: fuller and pink (General Path with a three-step gradient)
        GeneralPath lower = smoothPath(true,
                264, 538, 285, 538.5, 306, 538.5, 328, 538, 338, 541,
                334, 550, 318, 555, 299, 557, 283, 555, 272, 549);
        g2d.setColor(lipLowerMid);
        g2d.fill(lower);

        // Moist highlight on the lower lip (Ellipse)
        g2d.setColor(new Color(224, 154, 149));
        g2d.fill(new Ellipse2D.Double(286, 544, 32, 6));

        // Line between the lips and the shadowed corners
        g2d.setColor(new Color(96, 46, 42));
        g2d.setStroke(roundStroke(1.8f));
        g2d.draw(smoothPath(false, 243, 531, 266, 536, 285, 537.5, 306, 537.5,
                            328, 537, 355, 536));
        flatFill(g2d, new Ellipse2D.Double(240, 526, 16, 9),
                 new Color(119, 86, 67));
        flatFill(g2d, new Ellipse2D.Double(342, 530, 16, 9),
                 new Color(119, 86, 67));
    }

    //  HAIR
    private GeneralPath createHairShape() {
        return smoothPath(true,
                // outer silhouette: left side up over the top to the right side
                188, 446, 185, 421, 179, 412, 172, 417, 168, 390, 168, 376,
                176, 368, 176, 320, 180, 306, 191, 280, 212, 244, 236, 230,
                261, 224, 284, 216, 307, 210, 326, 205, 346, 213, 373, 211,
                397, 213, 413, 229, 428, 243, 452, 261, 455, 288, 454, 312,
                447, 343, 448, 376, 455, 386, 449, 395, 444, 408, 434, 418,
                427, 432, 424, 445,
                // inner edge: right temple, forehead hairline, left fringe
                420, 416, 413, 402, 409, 386, 407, 360, 402, 326, 394, 316,
                368, 292, 338, 280, 316, 274, 298, 267, 286, 273, 272, 286,
                262, 303, 254, 322, 246, 338, 238, 351, 250, 360, 256, 364,
                243, 372, 228, 370, 218, 374, 206, 381, 196, 400, 191, 420);
    }
    
    private void drawStrandFan(Graphics2D g, double crownX, double crownY,
                               double[] ends, int side) {
        int count = ends.length / 2;
        for (int i = 0; i < count; i++) {
            for (int layer = 0; layer < 3; layer++) {
                double jitter = Math.sin((i * 3 + layer) * 12.9898);
                double sx = crownX + side * (layer * 7 + 3 * jitter);
                double sy = crownY + layer * 3;
                double ex = ends[2 * i] + 4 * jitter;
                double ey = ends[2 * i + 1] + 3 * jitter;
                double cx = sx * 0.3 + ex * 0.7 + side * 18;
                double cy = sy * 0.65 + ey * 0.35 - 14;

                g.setColor(layer == 1 ? new Color(62, 61, 69)
                                      : new Color(19, 18, 23));
                g.setStroke(new BasicStroke(layer == 1 ? 1.2f : 0.9f));
                g.draw(new QuadCurve2D.Double(sx, sy, cx, cy, ex, ey));
            }
        }
    }

    private void drawHair(Graphics2D g2d) {
        GeneralPath hair = createHairShape();
        g2d.setColor(hairColor);
        g2d.fill(hair);

        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(hair);

        // Grey sheen across the top and on the upper left (soft General Paths)
        flatFill(g, smoothPath(true,
                        272, 220, 307, 211, 324, 204, 344, 215, 364, 213,
                        397, 211, 413, 229, 428, 246, 452, 261, 449, 279,
                        434, 264, 416, 254, 398, 258, 397, 244, 382, 237,
                        363, 226, 337, 225, 310, 218, 284, 230),
                 new Color(71, 70, 78));
        flatFill(g, smoothPath(true,
                        206, 254, 232, 239, 241, 252, 252, 257, 242, 272,
                        230, 280, 210, 281, 198, 268),
                 new Color(64, 63, 70));

        // Strands sweep from the crown down the left side and the fringe...
        drawStrandFan(g, 334, 214, new double[] {
                300, 268, 284, 276, 270, 290, 260, 308, 252, 326, 242, 344,
                226, 362, 210, 376, 198, 398, 190, 424, 182, 440, 172, 410,
                168, 380, 172, 350, 178, 318, 188, 292, 202, 264, 220, 244,
                244, 230, 270, 222}, -1);

        // ...and down the right side (Quadratic Curves)
        drawStrandFan(g, 348, 214, new double[] {
                338, 278, 360, 286, 382, 302, 398, 322, 404, 346, 410, 372,
                416, 396, 424, 420, 432, 438, 440, 416, 446, 396, 448, 370,
                450, 344, 455, 314, 454, 286, 446, 266, 430, 248, 412, 232,
                392, 220, 372, 213}, 1);
        g.dispose();

        // Loose strands falling across the forehead (Cubic Curves)
        g2d.setColor(new Color(49, 40, 36));
        g2d.setStroke(roundStroke(1.4f));
        g2d.draw(new CubicCurve2D.Double(296, 272, 288, 300, 300, 336, 303, 372));
        g2d.draw(new CubicCurve2D.Double(306, 272, 318, 300, 302, 340, 306, 386));
        g2d.setStroke(roundStroke(1f));
        g2d.draw(new CubicCurve2D.Double(290, 276, 278, 296, 272, 316, 268, 330));
        g2d.draw(new CubicCurve2D.Double(300, 274, 296, 300, 304, 330, 297, 360));
        g2d.draw(new QuadCurve2D.Double(312, 276, 320, 296, 318, 318));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bihasa, Christian Louie A. | 4CSD");
        prelimproject_Bihasa_Helpers panel = new prelimproject_Bihasa_Helpers();
        panel.setBackground(Color.WHITE);

        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
