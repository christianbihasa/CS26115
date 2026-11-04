// Bihasa, Christian Louie A. | 4CSD
package PrelimProject;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class BihasaCL_ProjectPrelims extends JPanel {

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

    public BihasaCL_ProjectPrelims() {
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

    //  FISH
    private void drawFish(Graphics2D g2d) {
        // Striped tail fin
        GeneralPath tail = new GeneralPath();
        tail.moveTo(108, 362);
        tail.curveTo(103, 359, 94, 364, 88, 365);
        tail.curveTo(82, 366, 76, 367, 70, 368);
        tail.curveTo(64, 369, 58, 371, 53, 373);
        tail.curveTo(48, 375, 41, 378, 38, 380);
        tail.curveTo(35, 382, 35, 384, 35, 386);
        tail.curveTo(35, 388, 38, 391, 40, 393);
        tail.curveTo(42, 395, 46, 396, 48, 399);
        tail.curveTo(50, 402, 50, 407, 52, 409);
        tail.curveTo(54, 411, 58, 409, 62, 409);
        tail.curveTo(66, 409, 70, 408, 75, 407);
        tail.curveTo(81, 406, 90, 404, 95, 402);
        tail.curveTo(101, 400, 104, 398, 108, 395);
        tail.curveTo(112, 392, 120, 392, 120, 386);
        tail.curveTo(120, 381, 113, 366, 108, 362);
        tail.closePath();
        g2d.setColor(fishTail);
        g2d.fill(tail);

        // Dark stripes following the fan of the tail (Lines)
        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(tail);
        g.setColor(fishStripe);
        g.setStroke(new BasicStroke(1.6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        for (int i = 0; i < 8; i++) {
            double y = 368 + i * 5;
            g.draw(new Line2D.Double(118, y, 36, y + 12 - i * 2));
        }
        g.dispose();

        // White belly of the body (General Path)
        GeneralPath belly = new GeneralPath();
        belly.moveTo(178, 314);
        belly.curveTo(175, 307, 166, 325, 160, 330);
        belly.curveTo(154, 335, 147, 339, 140, 344);
        belly.curveTo(133, 349, 125, 354, 118, 358);
        belly.curveTo(111, 362, 98, 366, 100, 368);
        belly.curveTo(102, 370, 120, 371, 130, 372);
        belly.curveTo(140, 373, 152, 373, 160, 373);
        belly.curveTo(168, 373, 177, 382, 180, 372);
        belly.curveTo(183, 362, 181, 321, 178, 314);
        belly.closePath();
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
        g2d.setStroke(new BasicStroke(3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(new QuadCurve2D.Double(102, 372, 140, 377, 180, 375));

        // Rounded head and snout (General Path)
        GeneralPath head = new GeneralPath();
        head.moveTo(452, 312);
        head.curveTo(455, 302, 461, 318, 466, 320);
        head.curveTo(471, 322, 475, 323, 480, 325);
        head.curveTo(485, 327, 491, 329, 496, 330);
        head.curveTo(501, 332, 506, 332, 510, 334);
        head.curveTo(514, 336, 518, 339, 522, 341);
        head.curveTo(526, 344, 529, 346, 532, 349);
        head.curveTo(535, 352, 538, 354, 539, 357);
        head.curveTo(540, 360, 540, 363, 538, 365);
        head.curveTo(536, 367, 531, 369, 526, 371);
        head.curveTo(521, 373, 512, 374, 506, 375);
        head.curveTo(500, 376, 495, 378, 490, 379);
        head.curveTo(485, 380, 479, 382, 474, 383);
        head.curveTo(469, 384, 463, 385, 458, 385);
        head.curveTo(453, 385, 447, 394, 446, 382);
        head.curveTo(445, 370, 449, 322, 452, 312);
        head.closePath();
        g2d.setColor(fishLight);
        g2d.fill(head);

        // Soft shadow under the chin of the fish
        g2d.setColor(new Color(178, 180, 189));
        g2d.fill(new Ellipse2D.Double(462, 366, 64, 18));

        // Small dorsal fin and dark pectoral fin (Ellipses)
        g2d.setColor(fishBlue);
        g2d.fill(new Ellipse2D.Double(450, 309, 18, 10));
        g2d.fill(new Ellipse2D.Double(446, 379, 26, 9));

        // Gill line (Cubic Curve)
        g2d.setColor(new Color(46, 46, 52));
        g2d.setStroke(new BasicStroke(1.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(new CubicCurve2D.Double(484, 330, 470, 342, 465, 362, 472, 380));

        // Drawn-on eye: ring, pupil and teardrop (Ellipse, Circle, Lines, Arc)
        g2d.setColor(new Color(240, 240, 244));
        g2d.fill(new Ellipse2D.Double(487, 342, 21, 19));
        g2d.setColor(new Color(40, 40, 46));
        g2d.setStroke(new BasicStroke(1.6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(new Ellipse2D.Double(487, 342, 21, 19));
        g2d.fill(new Ellipse2D.Double(493, 349, 7.5, 7.5));
        g2d.draw(new Line2D.Double(492, 360, 487, 376));
        g2d.draw(new Line2D.Double(497, 360, 491, 377));
        g2d.draw(new Arc2D.Double(486, 373, 6, 6, 160, 200, Arc2D.OPEN));
    }

    //  SHIRT
    private void drawShirt(Graphics2D g2d) {
        // Grey T-shirt body and shoulders (General Path)
        GeneralPath body = new GeneralPath();
        body.moveTo(0, 788);
        body.curveTo(2, 784, 6, 778, 12, 763);
        body.curveTo(19, 748, 31, 713, 39, 699);
        body.curveTo(47, 685, 44, 687, 58, 680);
        body.curveTo(72, 674, 101, 668, 122, 660);
        body.curveTo(143, 652, 170, 637, 186, 630);
        body.curveTo(202, 623, 197, 623, 216, 620);
        body.curveTo(235, 617, 269, 610, 300, 610);
        body.curveTo(331, 610, 378, 611, 404, 618);
        body.curveTo(430, 625, 442, 644, 458, 650);
        body.curveTo(474, 656, 478, 654, 502, 655);
        body.curveTo(526, 656, 584, 656, 600, 656);
        body.lineTo(WIDTH, HEIGHT);
        body.lineTo(0, HEIGHT);
        body.closePath();
        g2d.setColor(shirtGrey);
        g2d.fill(body);

        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(body);

        // Shadows in the folds of the sleeves (soft General Paths)
        GeneralPath sleeveFoldLeft = new GeneralPath();
        sleeveFoldLeft.moveTo(40, 704);
        sleeveFoldLeft.curveTo(48, 694, 57, 697, 70, 700);
        sleeveFoldLeft.curveTo(83, 703, 107, 714, 120, 720);
        sleeveFoldLeft.curveTo(133, 726, 148, 730, 146, 736);
        sleeveFoldLeft.curveTo(144, 742, 124, 750, 110, 756);
        sleeveFoldLeft.curveTo(96, 762, 74, 769, 60, 770);
        sleeveFoldLeft.curveTo(46, 771, 27, 771, 24, 760);
        sleeveFoldLeft.curveTo(21, 749, 32, 714, 40, 704);
        sleeveFoldLeft.closePath();
        g.setColor(new Color(194, 194, 202));
        g.fill(sleeveFoldLeft);
        GeneralPath sleeveFoldRight = new GeneralPath();
        sleeveFoldRight.moveTo(420, 640);
        sleeveFoldRight.curveTo(424, 633, 435, 650, 440, 660);
        sleeveFoldRight.curveTo(445, 670, 451, 687, 452, 700);
        sleeveFoldRight.curveTo(453, 713, 448, 734, 444, 740);
        sleeveFoldRight.curveTo(440, 746, 432, 743, 428, 736);
        sleeveFoldRight.curveTo(424, 729, 419, 716, 418, 700);
        sleeveFoldRight.curveTo(417, 684, 416, 647, 420, 640);
        sleeveFoldRight.closePath();
        g.setColor(new Color(198, 198, 206));
        g.fill(sleeveFoldRight);

        // Black raglan panels at the bottom (General Paths)
        g.setColor(shirtBlack);
        GeneralPath leftPanel = new GeneralPath();
        leftPanel.moveTo(48, 798);
        leftPanel.curveTo(54, 793, 71, 776, 81, 770);
        leftPanel.curveTo(91, 764, 99, 768, 110, 762);
        leftPanel.curveTo(121, 756, 138, 741, 146, 736);
        leftPanel.curveTo(154, 731, 153, 726, 158, 730);
        leftPanel.curveTo(163, 734, 171, 752, 176, 760);
        leftPanel.curveTo(182, 768, 186, 773, 191, 778);
        leftPanel.curveTo(196, 783, 202, 786, 204, 790);
        leftPanel.curveTo(206, 794, 230, 798, 204, 800);
        leftPanel.curveTo(178, 802, 74, 800, 48, 800);
        leftPanel.curveTo(22, 800, 43, 803, 48, 798);
        leftPanel.closePath();
        g.fill(leftPanel);
        GeneralPath rightPanel = new GeneralPath();
        rightPanel.moveTo(400, 800);
        rightPanel.curveTo(383, 794, 396, 777, 401, 766);
        rightPanel.curveTo(406, 756, 420, 741, 428, 737);
        rightPanel.curveTo(436, 734, 442, 742, 448, 745);
        rightPanel.curveTo(454, 749, 459, 754, 463, 758);
        rightPanel.curveTo(467, 763, 470, 767, 474, 772);
        rightPanel.curveTo(479, 777, 485, 782, 490, 787);
        rightPanel.curveTo(495, 792, 517, 798, 502, 800);
        rightPanel.curveTo(487, 802, 417, 806, 400, 800);
        rightPanel.closePath();
        g.fill(rightPanel);

        // Raglan seams (Cubic Curves)
        g.setColor(new Color(157, 157, 167));
        g.setStroke(new BasicStroke(1.4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g.draw(new CubicCurve2D.Double(168, 640, 152, 670, 148, 705, 157, 733));
        g.draw(new CubicCurve2D.Double(420, 632, 436, 652, 444, 680, 448, 702));
        g.dispose();

        // Ribbed collar band with its stitching (stroked neckline)
        GeneralPath collar = new GeneralPath();
        collar.moveTo(398, 622);
        collar.curveTo(400, 624, 407, 626, 410, 632);
        collar.curveTo(413, 638, 415, 652, 416, 660);
        collar.curveTo(417, 668, 416, 675, 414, 682);
        collar.curveTo(412, 689, 409, 695, 404, 702);
        collar.curveTo(399, 709, 393, 717, 386, 724);
        collar.curveTo(379, 731, 369, 740, 360, 746);
        collar.curveTo(351, 752, 340, 755, 331, 758);
        collar.curveTo(322, 761, 314, 762, 305, 764);
        collar.curveTo(297, 766, 289, 768, 280, 768);
        collar.curveTo(271, 768, 261, 768, 252, 766);
        collar.curveTo(243, 764, 236, 761, 228, 757);
        collar.curveTo(220, 753, 212, 748, 206, 743);
        collar.curveTo(200, 738, 196, 733, 192, 727);
        collar.curveTo(188, 721, 184, 713, 182, 707);
        collar.curveTo(180, 701, 179, 696, 180, 690);
        collar.curveTo(181, 684, 183, 679, 186, 672);
        collar.curveTo(189, 665, 195, 653, 200, 646);
        collar.curveTo(205, 639, 212, 633, 214, 630);
        g2d.setColor(new Color(222, 222, 228));
        g2d.setStroke(new BasicStroke(9f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
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
    private void drawSkin(Graphics2D g2d) {
        // Face and neck outline: right side down, around the neckline, left side up
        GeneralPath skin = new GeneralPath();
        skin.moveTo(250, 290);
        skin.curveTo(254, 281, 255, 277, 263, 272);
        skin.curveTo(271, 267, 284, 261, 297, 262);
        skin.curveTo(310, 263, 328, 272, 340, 276);
        skin.curveTo(352, 280, 358, 282, 368, 288);
        skin.curveTo(378, 294, 391, 305, 398, 312);
        skin.curveTo(405, 319, 407, 323, 410, 330);
        skin.curveTo(413, 337, 413, 348, 414, 356);
        skin.curveTo(415, 364, 417, 371, 418, 378);
        skin.curveTo(419, 385, 420, 393, 421, 400);
        skin.curveTo(422, 407, 422, 412, 422, 420);
        skin.curveTo(422, 428, 420, 438, 419, 446);
        skin.curveTo(418, 454, 419, 463, 418, 470);
        skin.curveTo(418, 477, 417, 485, 416, 490);
        skin.curveTo(415, 496, 412, 499, 410, 503);
        skin.curveTo(408, 507, 405, 508, 403, 512);
        skin.curveTo(401, 516, 399, 521, 397, 526);
        skin.curveTo(395, 531, 392, 537, 389, 542);
        skin.curveTo(387, 547, 383, 550, 382, 556);
        skin.curveTo(381, 562, 381, 570, 381, 578);
        skin.curveTo(381, 586, 381, 596, 382, 602);
        skin.curveTo(383, 608, 385, 611, 388, 614);
        // neckline (shared with the shirt collar)
        skin.curveTo(391, 617, 394, 619, 398, 622);
        skin.curveTo(402, 625, 407, 626, 410, 632);
        skin.curveTo(413, 638, 415, 652, 416, 660);
        skin.curveTo(417, 668, 416, 675, 414, 682);
        skin.curveTo(412, 689, 409, 695, 404, 702);
        skin.curveTo(399, 709, 393, 717, 386, 724);
        skin.curveTo(379, 731, 369, 740, 360, 746);
        skin.curveTo(351, 752, 340, 755, 331, 758);
        skin.curveTo(322, 761, 314, 762, 305, 764);
        skin.curveTo(297, 766, 289, 768, 280, 768);
        skin.curveTo(271, 768, 261, 768, 252, 766);
        skin.curveTo(243, 764, 236, 761, 228, 757);
        skin.curveTo(220, 753, 212, 748, 206, 743);
        skin.curveTo(200, 738, 196, 733, 192, 727);
        skin.curveTo(188, 721, 184, 713, 182, 707);
        skin.curveTo(180, 701, 179, 696, 180, 690);
        skin.curveTo(181, 684, 183, 679, 186, 672);
        skin.curveTo(189, 665, 195, 653, 200, 646);
        skin.curveTo(205, 639, 209, 635, 214, 630);
        // left side of the neck and face, bottom to top
        skin.curveTo(219, 625, 227, 619, 230, 614);
        skin.curveTo(233, 609, 234, 607, 234, 598);
        skin.curveTo(234, 589, 233, 570, 230, 560);
        skin.curveTo(227, 550, 222, 545, 218, 538);
        skin.curveTo(214, 531, 211, 525, 208, 518);
        skin.curveTo(205, 511, 204, 505, 202, 498);
        skin.curveTo(200, 491, 199, 485, 198, 476);
        skin.curveTo(197, 467, 197, 455, 196, 446);
        skin.curveTo(195, 437, 192, 428, 191, 420);
        skin.curveTo(190, 412, 189, 406, 190, 400);
        skin.curveTo(191, 394, 193, 390, 196, 384);
        skin.curveTo(199, 378, 205, 372, 210, 366);
        skin.curveTo(215, 360, 221, 355, 226, 348);
        skin.curveTo(231, 341, 234, 336, 238, 326);
        skin.curveTo(242, 316, 246, 299, 250, 290);
        skin.closePath();
        g2d.setColor(skinBase);
        g2d.fill(skin);

        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(skin);

        // Darker left edge, in the shadow of the curtain (General Path)
        GeneralPath leftEdgeShadow = new GeneralPath();
        leftEdgeShadow.moveTo(190, 330);
        leftEdgeShadow.curveTo(198, 280, 222, 325, 226, 340);
        leftEdgeShadow.curveTo(230, 355, 215, 393, 214, 420);
        leftEdgeShadow.curveTo(213, 447, 216, 477, 220, 500);
        leftEdgeShadow.curveTo(224, 523, 234, 537, 238, 560);
        leftEdgeShadow.curveTo(242, 583, 256, 627, 246, 640);
        leftEdgeShadow.curveTo(236, 653, 189, 692, 180, 640);
        leftEdgeShadow.curveTo(171, 588, 182, 380, 190, 330);
        leftEdgeShadow.closePath();
        g.setColor(new Color(150, 110, 86));
        g.fill(leftEdgeShadow);

        // Highlights: forehead, cheeks, nose bridge and chest
        GeneralPath foreheadLight = new GeneralPath();
        foreheadLight.moveTo(320, 307);
        foreheadLight.curveTo(323, 304, 326, 304, 332, 307);
        foreheadLight.curveTo(338, 310, 350, 317, 358, 324);
        foreheadLight.curveTo(366, 332, 379, 346, 382, 352);
        foreheadLight.curveTo(385, 358, 383, 358, 376, 358);
        foreheadLight.curveTo(369, 359, 348, 355, 338, 355);
        foreheadLight.curveTo(329, 355, 323, 363, 319, 358);
        foreheadLight.curveTo(315, 353, 315, 336, 315, 327);
        foreheadLight.curveTo(315, 319, 317, 310, 320, 307);
        foreheadLight.closePath();
        g.setColor(new Color(205, 163, 129));
        g.fill(foreheadLight);
        GeneralPath noseCheekLight = new GeneralPath();
        noseCheekLight.moveTo(304, 404);
        noseCheekLight.curveTo(306, 402, 309, 399, 313, 401);
        noseCheekLight.curveTo(317, 403, 321, 412, 328, 417);
        noseCheekLight.curveTo(335, 422, 344, 427, 354, 429);
        noseCheekLight.curveTo(364, 431, 377, 430, 387, 429);
        noseCheekLight.curveTo(397, 429, 409, 425, 414, 426);
        noseCheekLight.curveTo(419, 427, 419, 430, 418, 434);
        noseCheekLight.curveTo(417, 438, 415, 449, 410, 452);
        noseCheekLight.curveTo(406, 455, 395, 451, 391, 454);
        noseCheekLight.curveTo(387, 457, 391, 469, 385, 472);
        noseCheekLight.curveTo(379, 475, 364, 476, 356, 474);
        noseCheekLight.curveTo(349, 472, 345, 459, 340, 458);
        noseCheekLight.curveTo(335, 457, 333, 467, 327, 468);
        noseCheekLight.curveTo(321, 470, 309, 468, 302, 467);
        noseCheekLight.curveTo(295, 466, 288, 465, 285, 462);
        noseCheekLight.curveTo(282, 459, 283, 456, 285, 448);
        noseCheekLight.curveTo(287, 440, 296, 419, 299, 412);
        noseCheekLight.curveTo(302, 405, 302, 406, 304, 404);
        noseCheekLight.closePath();
        g.setColor(new Color(205, 163, 129));
        g.fill(noseCheekLight);
        GeneralPath leftCheekLight = new GeneralPath();
        leftCheekLight.moveTo(215, 431);
        leftCheekLight.curveTo(217, 429, 221, 428, 226, 429);
        leftCheekLight.curveTo(231, 430, 237, 435, 243, 436);
        leftCheekLight.curveTo(250, 437, 261, 433, 265, 434);
        leftCheekLight.curveTo(269, 435, 268, 438, 266, 444);
        leftCheekLight.curveTo(264, 450, 256, 465, 251, 470);
        leftCheekLight.curveTo(246, 476, 242, 478, 237, 477);
        leftCheekLight.curveTo(233, 476, 228, 472, 224, 466);
        leftCheekLight.curveTo(220, 460, 217, 448, 215, 442);
        leftCheekLight.curveTo(214, 436, 213, 433, 215, 431);
        leftCheekLight.closePath();
        g.setColor(new Color(198, 156, 122));
        g.fill(leftCheekLight);
        GeneralPath upperLipLight = new GeneralPath();
        upperLipLight.moveTo(310, 508);
        upperLipLight.curveTo(312, 505, 325, 502, 330, 499);
        upperLipLight.curveTo(336, 496, 339, 489, 343, 489);
        upperLipLight.curveTo(347, 489, 352, 495, 353, 498);
        upperLipLight.curveTo(354, 501, 355, 504, 350, 506);
        upperLipLight.curveTo(345, 508, 331, 507, 325, 508);
        upperLipLight.curveTo(319, 510, 319, 515, 316, 515);
        upperLipLight.curveTo(314, 515, 308, 511, 310, 508);
        upperLipLight.closePath();
        g.setColor(new Color(199, 157, 123));
        g.fill(upperLipLight);
        GeneralPath chestLight = new GeneralPath();
        chestLight.moveTo(246, 696);
        chestLight.curveTo(248, 682, 258, 683, 264, 680);
        chestLight.curveTo(270, 677, 276, 676, 284, 677);
        chestLight.curveTo(293, 678, 306, 687, 315, 686);
        chestLight.curveTo(324, 685, 331, 673, 338, 672);
        chestLight.curveTo(345, 671, 353, 668, 356, 678);
        chestLight.curveTo(359, 688, 356, 719, 355, 731);
        chestLight.curveTo(354, 743, 356, 747, 348, 752);
        chestLight.curveTo(340, 758, 319, 761, 308, 764);
        chestLight.curveTo(297, 767, 291, 768, 282, 768);
        chestLight.curveTo(273, 768, 258, 778, 252, 766);
        chestLight.curveTo(246, 754, 244, 710, 246, 696);
        chestLight.closePath();
        g.setColor(new Color(205, 163, 129));
        g.fill(chestLight);

        // Shadows: under the hairline, around the eyes, mouth, chin and neck
        GeneralPath hairlineShadow = new GeneralPath();
        hairlineShadow.moveTo(256, 300);
        hairlineShadow.curveTo(259, 291, 258, 284, 265, 278);
        hairlineShadow.curveTo(272, 273, 286, 267, 298, 267);
        hairlineShadow.curveTo(310, 267, 326, 276, 338, 280);
        hairlineShadow.curveTo(350, 284, 360, 286, 369, 292);
        hairlineShadow.curveTo(378, 298, 388, 310, 394, 316);
        hairlineShadow.curveTo(400, 322, 401, 321, 403, 330);
        hairlineShadow.curveTo(405, 339, 406, 357, 407, 368);
        hairlineShadow.curveTo(408, 379, 411, 394, 410, 398);
        hairlineShadow.curveTo(409, 402, 402, 400, 400, 392);
        hairlineShadow.curveTo(398, 384, 400, 362, 397, 350);
        hairlineShadow.curveTo(395, 338, 391, 330, 385, 322);
        hairlineShadow.curveTo(379, 315, 369, 310, 360, 305);
        hairlineShadow.curveTo(351, 300, 340, 297, 330, 293);
        hairlineShadow.curveTo(320, 290, 308, 283, 300, 284);
        hairlineShadow.curveTo(292, 285, 289, 290, 284, 298);
        hairlineShadow.curveTo(279, 306, 273, 321, 268, 330);
        hairlineShadow.curveTo(263, 339, 259, 348, 254, 352);
        hairlineShadow.curveTo(249, 356, 241, 359, 240, 356);
        hairlineShadow.curveTo(239, 353, 245, 343, 248, 334);
        hairlineShadow.curveTo(251, 325, 253, 309, 256, 300);
        hairlineShadow.closePath();
        g.setColor(new Color(140, 102, 78));
        g.fill(hairlineShadow);
        GeneralPath leftEyeShadow = new GeneralPath();
        leftEyeShadow.moveTo(207, 380);
        leftEyeShadow.curveTo(211, 376, 215, 374, 224, 371);
        leftEyeShadow.curveTo(233, 368, 250, 363, 260, 362);
        leftEyeShadow.curveTo(270, 361, 275, 364, 282, 366);
        leftEyeShadow.curveTo(289, 368, 298, 371, 300, 374);
        leftEyeShadow.curveTo(302, 378, 299, 383, 296, 387);
        leftEyeShadow.curveTo(293, 392, 288, 397, 284, 401);
        leftEyeShadow.curveTo(280, 405, 278, 410, 272, 412);
        leftEyeShadow.curveTo(266, 415, 256, 416, 248, 416);
        leftEyeShadow.curveTo(240, 417, 232, 416, 226, 415);
        leftEyeShadow.curveTo(220, 414, 214, 412, 210, 408);
        leftEyeShadow.curveTo(206, 405, 204, 399, 203, 394);
        leftEyeShadow.curveTo(203, 389, 204, 384, 207, 380);
        leftEyeShadow.closePath();
        g.setColor(new Color(159, 119, 91));
        g.fill(leftEyeShadow);
        GeneralPath rightEyeShadow = new GeneralPath();
        rightEyeShadow.moveTo(350, 386);
        rightEyeShadow.curveTo(352, 384, 360, 380, 366, 379);
        rightEyeShadow.curveTo(372, 378, 382, 380, 387, 381);
        rightEyeShadow.curveTo(392, 382, 396, 385, 398, 387);
        rightEyeShadow.curveTo(400, 390, 401, 394, 401, 396);
        rightEyeShadow.curveTo(401, 399, 400, 402, 396, 402);
        rightEyeShadow.curveTo(392, 403, 384, 401, 377, 399);
        rightEyeShadow.curveTo(370, 397, 357, 394, 352, 392);
        rightEyeShadow.curveTo(348, 390, 348, 388, 350, 386);
        rightEyeShadow.closePath();
        g.setColor(new Color(159, 119, 91));
        g.fill(rightEyeShadow);
        GeneralPath mouthChinShadow = new GeneralPath();
        mouthChinShadow.moveTo(233, 524);
        mouthChinShadow.curveTo(236, 522, 243, 517, 248, 517);
        mouthChinShadow.curveTo(253, 517, 254, 521, 262, 523);
        mouthChinShadow.curveTo(270, 525, 285, 528, 297, 529);
        mouthChinShadow.curveTo(309, 530, 324, 529, 333, 528);
        mouthChinShadow.curveTo(342, 527, 347, 524, 352, 524);
        mouthChinShadow.curveTo(357, 524, 360, 527, 362, 530);
        mouthChinShadow.curveTo(364, 533, 365, 539, 364, 542);
        mouthChinShadow.curveTo(363, 545, 360, 548, 356, 548);
        mouthChinShadow.curveTo(352, 548, 349, 541, 340, 540);
        mouthChinShadow.curveTo(331, 539, 312, 542, 300, 542);
        mouthChinShadow.curveTo(289, 542, 277, 539, 271, 540);
        mouthChinShadow.curveTo(265, 541, 266, 545, 266, 547);
        mouthChinShadow.curveTo(266, 549, 267, 552, 272, 554);
        mouthChinShadow.curveTo(277, 556, 287, 560, 296, 561);
        mouthChinShadow.curveTo(305, 562, 319, 557, 324, 559);
        mouthChinShadow.curveTo(329, 561, 329, 567, 328, 572);
        mouthChinShadow.curveTo(327, 577, 317, 583, 318, 588);
        mouthChinShadow.curveTo(319, 593, 337, 592, 334, 600);
        mouthChinShadow.curveTo(331, 608, 309, 630, 300, 636);
        mouthChinShadow.curveTo(291, 643, 285, 640, 280, 639);
        mouthChinShadow.curveTo(276, 638, 274, 635, 273, 630);
        mouthChinShadow.curveTo(272, 626, 278, 618, 276, 612);
        mouthChinShadow.curveTo(274, 606, 263, 600, 260, 592);
        mouthChinShadow.curveTo(257, 584, 259, 572, 256, 566);
        mouthChinShadow.curveTo(253, 560, 245, 562, 240, 558);
        mouthChinShadow.curveTo(236, 554, 231, 548, 229, 544);
        mouthChinShadow.curveTo(227, 540, 228, 535, 229, 532);
        mouthChinShadow.curveTo(230, 529, 230, 527, 233, 524);
        mouthChinShadow.closePath();
        g.setColor(new Color(157, 118, 90));
        g.fill(mouthChinShadow);
        // Chin: lighter rounded pad above the jawline
        GeneralPath chinLight = new GeneralPath();
        chinLight.moveTo(272, 572);
        chinLight.curveTo(275, 569, 282, 567, 288, 566);
        chinLight.curveTo(294, 565, 300, 565, 306, 565);
        chinLight.curveTo(312, 565, 319, 566, 324, 568);
        chinLight.curveTo(329, 570, 335, 574, 336, 578);
        chinLight.curveTo(337, 582, 335, 588, 332, 592);
        chinLight.curveTo(329, 596, 322, 599, 316, 600);
        chinLight.curveTo(310, 602, 302, 602, 296, 601);
        chinLight.curveTo(290, 600, 284, 598, 280, 595);
        chinLight.curveTo(276, 592, 271, 588, 270, 584);
        chinLight.curveTo(269, 580, 269, 575, 272, 572);
        chinLight.closePath();
        g.setColor(new Color(170, 129, 98));
        g.fill(chinLight);

        // Shadow under the jaw and chin, cast onto the neck
        GeneralPath underJawShadow = new GeneralPath();
        underJawShadow.moveTo(226, 560);
        underJawShadow.curveTo(229, 556, 235, 572, 240, 578);
        underJawShadow.curveTo(245, 584, 251, 590, 258, 594);
        underJawShadow.curveTo(265, 598, 272, 602, 280, 604);
        underJawShadow.curveTo(288, 606, 296, 607, 304, 607);
        underJawShadow.curveTo(312, 607, 320, 605, 328, 602);
        underJawShadow.curveTo(336, 599, 345, 593, 352, 588);
        underJawShadow.curveTo(359, 583, 366, 575, 372, 570);
        underJawShadow.curveTo(378, 565, 383, 551, 386, 556);
        underJawShadow.curveTo(389, 561, 392, 586, 392, 600);
        underJawShadow.curveTo(392, 614, 401, 631, 386, 640);
        underJawShadow.curveTo(371, 649, 326, 652, 300, 652);
        underJawShadow.curveTo(274, 652, 245, 651, 232, 642);
        underJawShadow.curveTo(219, 633, 223, 614, 222, 600);
        underJawShadow.curveTo(221, 586, 223, 564, 226, 560);
        underJawShadow.closePath();
        g.setColor(new Color(136, 98, 74));
        g.fill(underJawShadow);
        g.dispose();

        // Chin line (Arc)
        g2d.setColor(new Color(118, 84, 64));
        g2d.setStroke(new BasicStroke(1.6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(new Arc2D.Double(266, 574, 72, 32, 200, 140, Arc2D.OPEN));

        // Small moles (Circles)
        g2d.setColor(new Color(84, 56, 44));
        g2d.fill(new Ellipse2D.Double(234, 525, 3, 3));
        g2d.fill(new Ellipse2D.Double(408, 436, 2.5, 2.5));
    }

    private void drawEars(Graphics2D g2d) {
        // Left ear, darkened by the curtain's shadow (General Path + Arc)
        GeneralPath leftEar = new GeneralPath();
        leftEar.moveTo(197, 412);
        leftEar.curveTo(195, 402, 189, 410, 186, 410);
        leftEar.curveTo(183, 410, 179, 410, 177, 413);
        leftEar.curveTo(175, 416, 174, 421, 173, 426);
        leftEar.curveTo(173, 431, 173, 437, 174, 442);
        leftEar.curveTo(175, 447, 177, 453, 179, 458);
        leftEar.curveTo(181, 463, 183, 466, 185, 470);
        leftEar.curveTo(187, 474, 189, 479, 191, 482);
        leftEar.curveTo(193, 485, 196, 492, 198, 490);
        leftEar.curveTo(200, 488, 201, 483, 201, 470);
        leftEar.curveTo(201, 457, 200, 422, 197, 412);
        leftEar.closePath();
        g2d.setColor(earShadow);
        g2d.fill(leftEar);
        g2d.setColor(new Color(109, 81, 67));
        g2d.setStroke(new BasicStroke(1.6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(new Arc2D.Double(179, 418, 16, 56, 90, 180, Arc2D.OPEN));

        // Right ear, catching the light (General Path + Arc)
        GeneralPath rightEar = new GeneralPath();
        rightEar.moveTo(415, 420);
        rightEar.curveTo(417, 411, 422, 418, 425, 418);
        rightEar.curveTo(428, 418, 431, 419, 433, 421);
        rightEar.curveTo(435, 423, 437, 425, 438, 428);
        rightEar.curveTo(439, 431, 440, 436, 440, 440);
        rightEar.curveTo(440, 445, 438, 450, 436, 455);
        rightEar.curveTo(434, 460, 431, 464, 428, 468);
        rightEar.curveTo(426, 473, 423, 478, 421, 482);
        rightEar.curveTo(419, 486, 417, 491, 416, 494);
        rightEar.curveTo(415, 497, 414, 504, 413, 500);
        rightEar.curveTo(412, 496, 411, 483, 411, 470);
        rightEar.curveTo(411, 457, 413, 429, 415, 420);
        rightEar.closePath();
        g2d.setColor(new Color(180, 142, 116));
        g2d.fill(rightEar);
        g2d.setColor(new Color(141, 105, 86));
        g2d.setStroke(new BasicStroke(1.6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
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
        Graphics2D ribs = (Graphics2D) g2d.create();
        ribs.clip(straps);
        ribs.setColor(new Color(37, 35, 41));
        for (double y = 598; y < HEIGHT; y += 2.5) {
            ribs.fill(new Rectangle2D.Double(200, y, 210, 0.9));
        }
        ribs.dispose();

        // Lettering on the left strap
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

        // Emblems on the right strap
        g = (Graphics2D) g2d.create();
        g.clip(rightStrap);

        // Mirrored white lettering at the top (Lines + Quadratic Curves)
        g.setColor(new Color(214, 212, 214));
        g.setStroke(new BasicStroke(3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g.draw(new Line2D.Double(385, 604, 400, 625));
        g.draw(new QuadCurve2D.Double(382, 628, 398, 626, 402, 640));
        g.draw(new QuadCurve2D.Double(392, 636, 394, 648, 403, 651));
        g.draw(new QuadCurve2D.Double(380, 645, 388, 658, 403, 666));
        g.draw(new QuadCurve2D.Double(374, 664, 386, 679, 403, 684));

        // Brown and white fleur emblem (General Path + Cubic Curves)
        GeneralPath brownLeaf = new GeneralPath();
        brownLeaf.moveTo(372, 706);
        brownLeaf.curveTo(371, 704, 368, 713, 366, 714);
        brownLeaf.curveTo(364, 715, 361, 711, 360, 712);
        brownLeaf.curveTo(359, 713, 357, 715, 358, 718);
        brownLeaf.curveTo(359, 721, 365, 724, 366, 728);
        brownLeaf.curveTo(367, 732, 366, 736, 365, 742);
        brownLeaf.curveTo(364, 748, 362, 759, 360, 762);
        brownLeaf.curveTo(359, 765, 356, 757, 356, 758);
        brownLeaf.curveTo(356, 759, 358, 769, 360, 768);
        brownLeaf.curveTo(362, 767, 366, 757, 368, 750);
        brownLeaf.curveTo(370, 743, 372, 731, 373, 724);
        brownLeaf.curveTo(374, 717, 373, 708, 372, 706);
        brownLeaf.closePath();
        g.setColor(new Color(137, 104, 82));
        g.fill(brownLeaf);

        g.setColor(new Color(214, 212, 214));
        g.setStroke(new BasicStroke(4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
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
        GeneralPath left = new GeneralPath();
        left.moveTo(206, 383);
        left.curveTo(206, 381, 208, 374, 211, 370);
        left.curveTo(214, 367, 218, 364, 222, 362);
        left.curveTo(226, 360, 232, 360, 237, 359);
        left.curveTo(242, 359, 246, 359, 250, 359);
        left.curveTo(254, 359, 258, 360, 262, 361);
        left.curveTo(266, 362, 269, 365, 272, 366);
        left.curveTo(275, 368, 277, 368, 280, 370);
        left.curveTo(283, 372, 287, 374, 288, 376);
        left.curveTo(289, 378, 290, 380, 287, 380);
        left.curveTo(284, 380, 277, 377, 272, 376);
        left.curveTo(267, 375, 262, 375, 256, 374);
        left.curveTo(251, 374, 244, 373, 239, 373);
        left.curveTo(234, 373, 230, 375, 226, 376);
        left.curveTo(222, 377, 217, 380, 214, 381);
        left.curveTo(211, 382, 207, 385, 206, 383);
        left.closePath();
        g2d.setColor(browDark);
        g2d.fill(left);

        // Right brow: lighter near the nose, arching up and out
        GeneralPath right = new GeneralPath();
        right.moveTo(326, 382);
        right.curveTo(326, 380, 332, 377, 336, 374);
        right.curveTo(340, 371, 346, 366, 350, 364);
        right.curveTo(354, 362, 357, 362, 361, 362);
        right.curveTo(365, 362, 371, 362, 376, 363);
        right.curveTo(381, 364, 385, 366, 389, 367);
        right.curveTo(393, 368, 395, 369, 398, 371);
        right.curveTo(401, 373, 404, 375, 405, 377);
        right.curveTo(406, 379, 406, 381, 404, 381);
        right.curveTo(402, 381, 397, 377, 392, 376);
        right.curveTo(387, 375, 382, 374, 376, 374);
        right.curveTo(371, 374, 364, 374, 359, 375);
        right.curveTo(354, 376, 350, 378, 346, 379);
        right.curveTo(342, 381, 337, 384, 334, 384);
        right.curveTo(331, 385, 326, 384, 326, 382);
        right.closePath();
        g2d.setColor(new Color(66, 48, 40));
        g2d.fill(right);

        // Individual brow hairs, clipped to each brow (Lines)
        Graphics2D leftHairs = (Graphics2D) g2d.create();
        leftHairs.clip(left);
        leftHairs.setStroke(new BasicStroke(0.8f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        leftHairs.setColor(new Color(43, 31, 26));
        for (double x = 208; x < 288; x += 4.5) {
            double lean = 6 + 4 * Math.sin(x * 0.9);
            leftHairs.draw(new Line2D.Double(x, 382, x - lean, 358));
        }
        leftHairs.dispose();

        Graphics2D rightHairs = (Graphics2D) g2d.create();
        rightHairs.clip(right);
        rightHairs.setStroke(new BasicStroke(0.8f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        rightHairs.setColor(new Color(43, 31, 26));
        for (double x = 326; x < 405; x += 4.5) {
            double lean = 6 + 4 * Math.sin(x * 0.9);
            rightHairs.draw(new Line2D.Double(x, 382, x + lean, 358));
        }
        rightHairs.dispose();
    }

    private void drawEyes(Graphics2D g2d) {
        // Left eye: iris centred at (248, 403), radius 11
        // Eye opening: lash line followed by the lower lid
        GeneralPath leftOpening = new GeneralPath();
        leftOpening.moveTo(213, 404);
        leftOpening.curveTo(213, 403, 217, 401, 220, 399);
        leftOpening.curveTo(223, 398, 228, 396, 232, 395);
        leftOpening.curveTo(236, 394, 241, 394, 245, 394);
        leftOpening.curveTo(249, 394, 255, 395, 258, 396);
        leftOpening.curveTo(261, 397, 263, 398, 265, 400);
        leftOpening.curveTo(267, 402, 271, 404, 272, 406);
        leftOpening.curveTo(274, 408, 276, 409, 274, 410);
        leftOpening.curveTo(272, 411, 266, 410, 262, 411);
        leftOpening.curveTo(258, 411, 253, 412, 248, 412);
        leftOpening.curveTo(244, 411, 239, 410, 235, 410);
        leftOpening.curveTo(231, 409, 226, 407, 222, 407);
        leftOpening.curveTo(218, 406, 213, 405, 213, 404);
        leftOpening.closePath();
        g2d.setColor(new Color(128, 104, 92));
        g2d.fill(leftOpening);

        // Iris (Circle) clipped by the lids (Area intersection)
        Area leftIris = new Area(new Ellipse2D.Double(237, 392, 22, 22));
        leftIris.intersect(new Area(leftOpening));
        g2d.setColor(irisColor);
        g2d.fill(leftIris);

        // Pupil (Circle) and catchlight (Square)
        Area leftPupil = new Area(new Ellipse2D.Double(244, 399, 9, 9));
        leftPupil.intersect(new Area(leftOpening));
        g2d.setColor(new Color(8, 6, 6));
        g2d.fill(leftPupil);
        g2d.setColor(new Color(181, 178, 177));
        g2d.fill(new Rectangle2D.Double(251, 398, 2.4, 2.4));

        // Lash line along the upper lid
        GeneralPath leftLash = new GeneralPath();
        leftLash.moveTo(213, 404);
        leftLash.curveTo(214, 403, 217, 401, 220, 399);
        leftLash.curveTo(223, 398, 228, 396, 232, 395);
        leftLash.curveTo(236, 394, 241, 394, 245, 394);
        leftLash.curveTo(249, 394, 255, 395, 258, 396);
        leftLash.curveTo(261, 397, 263, 398, 265, 400);
        leftLash.curveTo(267, 402, 271, 404, 272, 406);
        leftLash.curveTo(274, 408, 274, 409, 274, 410);
        g2d.setColor(lashColor);
        g2d.setStroke(new BasicStroke(2.4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(leftLash);

        // Double-eyelid crease and lower lid
        GeneralPath leftCrease = new GeneralPath();
        leftCrease.moveTo(216, 396);
        leftCrease.curveTo(220, 395, 232, 391, 238, 391);
        leftCrease.curveTo(244, 390, 249, 390, 253, 391);
        leftCrease.curveTo(257, 391, 260, 392, 262, 393);
        leftCrease.curveTo(265, 394, 267, 396, 268, 397);
        g2d.setColor(new Color(118, 84, 65));
        g2d.setStroke(new BasicStroke(1.3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(leftCrease);
        GeneralPath leftLowerLid = new GeneralPath();
        leftLowerLid.moveTo(262, 411);
        leftLowerLid.curveTo(260, 411, 253, 412, 248, 412);
        leftLowerLid.curveTo(244, 411, 239, 410, 235, 410);
        leftLowerLid.curveTo(231, 409, 224, 407, 222, 407);
        g2d.setColor(new Color(142, 104, 80));
        g2d.setStroke(new BasicStroke(1f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(leftLowerLid);

        // Right eye: iris centred at (361.5, 405), radius 11.5
        // Eye opening: lash line followed by the lower lid
        GeneralPath rightOpening = new GeneralPath();
        rightOpening.moveTo(338, 408);
        rightOpening.curveTo(338, 407, 340, 404, 342, 402);
        rightOpening.curveTo(344, 401, 347, 400, 349, 399);
        rightOpening.curveTo(352, 398, 354, 397, 357, 397);
        rightOpening.curveTo(360, 397, 364, 397, 367, 397);
        rightOpening.curveTo(371, 397, 375, 397, 378, 397);
        rightOpening.curveTo(381, 397, 384, 398, 387, 399);
        rightOpening.curveTo(390, 400, 394, 402, 396, 403);
        rightOpening.curveTo(398, 404, 401, 406, 399, 407);
        rightOpening.curveTo(398, 409, 392, 411, 387, 412);
        rightOpening.curveTo(382, 413, 376, 414, 370, 414);
        rightOpening.curveTo(364, 415, 358, 414, 353, 413);
        rightOpening.curveTo(348, 412, 345, 411, 342, 411);
        rightOpening.curveTo(340, 410, 338, 409, 338, 408);
        rightOpening.closePath();
        g2d.setColor(new Color(128, 104, 92));
        g2d.fill(rightOpening);

        // Iris (Circle) clipped by the lids (Area intersection)
        Area rightIris = new Area(new Ellipse2D.Double(350, 394, 23, 23));
        rightIris.intersect(new Area(rightOpening));
        g2d.setColor(irisColor);
        g2d.fill(rightIris);

        // Pupil (Circle) and catchlight (Square)
        Area rightPupil = new Area(new Ellipse2D.Double(357, 401, 9, 9));
        rightPupil.intersect(new Area(rightOpening));
        g2d.setColor(new Color(8, 6, 6));
        g2d.fill(rightPupil);
        g2d.setColor(new Color(181, 178, 177));
        g2d.fill(new Rectangle2D.Double(365, 400, 2.4, 2.4));

        // Lash line along the upper lid
        GeneralPath rightLash = new GeneralPath();
        rightLash.moveTo(338, 408);
        rightLash.curveTo(339, 407, 340, 404, 342, 402);
        rightLash.curveTo(344, 401, 347, 400, 349, 399);
        rightLash.curveTo(352, 398, 354, 397, 357, 397);
        rightLash.curveTo(360, 397, 364, 397, 367, 397);
        rightLash.curveTo(371, 397, 375, 397, 378, 397);
        rightLash.curveTo(381, 397, 384, 398, 387, 399);
        rightLash.curveTo(390, 400, 394, 402, 396, 403);
        rightLash.curveTo(398, 404, 399, 406, 399, 407);
        g2d.setColor(lashColor);
        g2d.setStroke(new BasicStroke(2.4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(rightLash);

        // Double-eyelid crease and lower lid
        GeneralPath rightCrease = new GeneralPath();
        rightCrease.moveTo(344, 397);
        rightCrease.curveTo(346, 397, 349, 395, 353, 394);
        rightCrease.curveTo(357, 393, 364, 393, 370, 393);
        rightCrease.curveTo(376, 393, 383, 395, 387, 396);
        rightCrease.curveTo(391, 397, 395, 398, 396, 399);
        g2d.setColor(new Color(118, 84, 65));
        g2d.setStroke(new BasicStroke(1.3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(rightCrease);
        GeneralPath rightLowerLid = new GeneralPath();
        rightLowerLid.moveTo(387, 412);
        rightLowerLid.curveTo(384, 412, 376, 414, 370, 414);
        rightLowerLid.curveTo(364, 415, 358, 414, 353, 413);
        rightLowerLid.curveTo(348, 412, 344, 411, 342, 411);
        g2d.setColor(new Color(142, 104, 80));
        g2d.setStroke(new BasicStroke(1f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(rightLowerLid);
    }

    private void drawNose(Graphics2D g2d) {
        // Light running down the bridge (soft General Path)
        GeneralPath bridgeLight = new GeneralPath();
        bridgeLight.moveTo(296, 400);
        bridgeLight.curveTo(300, 395, 308, 395, 312, 400);
        bridgeLight.curveTo(316, 405, 317, 421, 318, 430);
        bridgeLight.curveTo(319, 439, 319, 451, 316, 456);
        bridgeLight.curveTo(313, 461, 304, 462, 300, 458);
        bridgeLight.curveTo(296, 454, 291, 442, 290, 432);
        bridgeLight.curveTo(289, 422, 292, 405, 296, 400);
        bridgeLight.closePath();
        g2d.setColor(new Color(208, 167, 134));
        g2d.fill(bridgeLight);

        // Rounded tip catching the light (Circle)
        g2d.setColor(new Color(212, 172, 140));
        g2d.fill(new Ellipse2D.Double(288, 446, 28, 28));

        // Soft shadow under the nose (General Path)
        GeneralPath underNoseShadow = new GeneralPath();
        underNoseShadow.moveTo(271, 481);
        underNoseShadow.curveTo(273, 479, 277, 477, 279, 476);
        underNoseShadow.curveTo(282, 475, 282, 474, 286, 475);
        underNoseShadow.curveTo(290, 476, 299, 479, 304, 480);
        underNoseShadow.curveTo(309, 481, 315, 479, 318, 480);
        underNoseShadow.curveTo(321, 481, 323, 483, 324, 484);
        underNoseShadow.curveTo(325, 485, 327, 487, 326, 488);
        underNoseShadow.curveTo(325, 489, 326, 491, 320, 492);
        underNoseShadow.curveTo(314, 493, 298, 494, 290, 494);
        underNoseShadow.curveTo(282, 494, 276, 492, 272, 491);
        underNoseShadow.curveTo(269, 490, 269, 488, 269, 486);
        underNoseShadow.curveTo(269, 484, 269, 483, 271, 481);
        underNoseShadow.closePath();
        g2d.setColor(new Color(153, 114, 89));
        g2d.fill(underNoseShadow);

        // Nostrils, tilted with a transformation (Ellipses)
        // Left nostril: ellipse 17 x 7 at (283, 484), tilted 0.22 rad
        AffineTransform leftSaved = g2d.getTransform();
        g2d.rotate(0.22, 283, 484);
        g2d.setColor(new Color(62, 38, 32));
        g2d.fill(new Ellipse2D.Double(275, 481, 17, 7));
        g2d.setTransform(leftSaved);
        // Right nostril: ellipse 19 x 7 at (318, 486), tilted -0.12 rad
        AffineTransform rightSaved = g2d.getTransform();
        g2d.rotate(-0.12, 318, 486);
        g2d.setColor(new Color(62, 38, 32));
        g2d.fill(new Ellipse2D.Double(309, 483, 19, 7));
        g2d.setTransform(rightSaved);

        // Wing creases (Cubic Curves)
        g2d.setColor(new Color(163, 124, 96));
        g2d.setStroke(new BasicStroke(1.6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(new CubicCurve2D.Double(272, 456, 262, 468, 264, 482, 276, 488));
        g2d.draw(new CubicCurve2D.Double(332, 458, 342, 470, 340, 484, 327, 490));
    }

    private void drawMouth(Graphics2D g2d) {
        // Faint moustache: a soft shadow band (General Path)...
        GeneralPath moustacheShadow = new GeneralPath();
        moustacheShadow.moveTo(238, 524);
        moustacheShadow.curveTo(241, 522, 252, 518, 262, 516);
        moustacheShadow.curveTo(272, 514, 288, 514, 300, 514);
        moustacheShadow.curveTo(312, 514, 326, 514, 336, 516);
        moustacheShadow.curveTo(346, 518, 356, 524, 358, 526);
        moustacheShadow.curveTo(360, 528, 355, 531, 350, 530);
        moustacheShadow.curveTo(345, 530, 338, 525, 330, 523);
        moustacheShadow.curveTo(322, 522, 310, 521, 300, 521);
        moustacheShadow.curveTo(290, 521, 277, 522, 268, 523);
        moustacheShadow.curveTo(259, 525, 251, 530, 246, 530);
        moustacheShadow.curveTo(241, 530, 235, 526, 238, 524);
        moustacheShadow.closePath();
        g2d.setColor(new Color(162, 123, 94));
        g2d.fill(moustacheShadow);

        // ...with a few sparse hairs, denser toward the corners (Lines)
        g2d.setStroke(new BasicStroke(0.8f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        for (double x = 240; x <= 356; x += 3.1) {
            double t = (x - 297) / 59.0;               // -1 .. 1 across the lip
            double y = 515 + 6 * t * t + 2 * Math.sin(x * 1.7);
            int alpha = Math.abs(t) > 0.65 ? 110 : 45;
            g2d.setColor(new Color(50, 34, 28, alpha));
            g2d.draw(new Line2D.Double(x, y, x + (t < 0 ? -2 : 3), y + 4));
        }

        // Upper lip: thin, dark red-brown band (General Path)
        GeneralPath upper = new GeneralPath();
        upper.moveTo(243, 531);
        upper.curveTo(243, 530, 258, 528, 264, 527);
        upper.curveTo(270, 526, 273, 526, 278, 525);
        upper.curveTo(283, 525, 289, 524, 295, 524);
        upper.curveTo(301, 524, 308, 524, 314, 525);
        upper.curveTo(320, 526, 327, 527, 332, 528);
        upper.curveTo(337, 529, 342, 530, 346, 531);
        upper.curveTo(350, 532, 358, 535, 355, 536);
        upper.curveTo(352, 537, 336, 537, 328, 537);
        upper.curveTo(320, 537, 313, 537, 306, 538);
        upper.curveTo(299, 538, 292, 538, 285, 538);
        upper.curveTo(278, 537, 273, 537, 266, 536);
        upper.curveTo(259, 535, 243, 533, 243, 531);
        upper.closePath();
        g2d.setColor(lipUpperDark);
        g2d.fill(upper);

        // Lower lip: fuller and pink (General Path with a three-step gradient)
        GeneralPath lower = new GeneralPath();
        lower.moveTo(264, 538);
        lower.curveTo(266, 536, 278, 538, 285, 539);
        lower.curveTo(292, 539, 299, 539, 306, 539);
        lower.curveTo(313, 538, 323, 538, 328, 538);
        lower.curveTo(333, 538, 337, 539, 338, 541);
        lower.curveTo(339, 543, 337, 548, 334, 550);
        lower.curveTo(331, 552, 324, 554, 318, 555);
        lower.curveTo(312, 556, 305, 557, 299, 557);
        lower.curveTo(293, 557, 288, 556, 283, 555);
        lower.curveTo(279, 554, 275, 552, 272, 549);
        lower.curveTo(269, 546, 262, 540, 264, 538);
        lower.closePath();
        g2d.setColor(lipLowerMid);
        g2d.fill(lower);

        // Moist highlight on the lower lip (Ellipse)
        g2d.setColor(new Color(224, 154, 149));
        g2d.fill(new Ellipse2D.Double(286, 544, 32, 6));

        // Line between the lips and the shadowed corners
        g2d.setColor(new Color(96, 46, 42));
        g2d.setStroke(new BasicStroke(1.8f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        GeneralPath lipLine = new GeneralPath();
        lipLine.moveTo(243, 531);
        lipLine.curveTo(247, 532, 259, 535, 266, 536);
        lipLine.curveTo(273, 537, 278, 537, 285, 538);
        lipLine.curveTo(292, 538, 299, 538, 306, 538);
        lipLine.curveTo(313, 537, 320, 537, 328, 537);
        lipLine.curveTo(336, 537, 351, 536, 355, 536);
        g2d.draw(lipLine);
        g2d.setColor(new Color(119, 86, 67));
        g2d.fill(new Ellipse2D.Double(240, 526, 16, 9));
        g2d.setColor(new Color(119, 86, 67));
        g2d.fill(new Ellipse2D.Double(342, 530, 16, 9));
    }

    //  HAIR
    private void drawHair(Graphics2D g2d) {
        GeneralPath hair = new GeneralPath();
        hair.moveTo(188, 446);
        // outer silhouette: left side up over the top to the right side
        hair.curveTo(187, 446, 187, 427, 185, 421);
        hair.curveTo(184, 415, 181, 413, 179, 412);
        hair.curveTo(177, 411, 174, 421, 172, 417);
        hair.curveTo(170, 413, 169, 397, 168, 390);
        hair.curveTo(167, 383, 167, 380, 168, 376);
        hair.curveTo(169, 372, 175, 377, 176, 368);
        hair.curveTo(177, 359, 175, 330, 176, 320);
        hair.curveTo(177, 310, 178, 313, 180, 306);
        hair.curveTo(183, 299, 186, 290, 191, 280);
        hair.curveTo(196, 270, 205, 252, 212, 244);
        hair.curveTo(220, 236, 228, 233, 236, 230);
        hair.curveTo(244, 227, 253, 226, 261, 224);
        hair.curveTo(269, 222, 276, 218, 284, 216);
        hair.curveTo(292, 214, 300, 212, 307, 210);
        hair.curveTo(314, 208, 320, 205, 326, 205);
        hair.curveTo(333, 206, 338, 212, 346, 213);
        hair.curveTo(354, 214, 365, 211, 373, 211);
        hair.curveTo(382, 211, 390, 210, 397, 213);
        hair.curveTo(404, 216, 408, 224, 413, 229);
        hair.curveTo(418, 234, 422, 238, 428, 243);
        hair.curveTo(435, 248, 448, 254, 452, 261);
        hair.curveTo(457, 269, 455, 280, 455, 288);
        hair.curveTo(455, 297, 455, 303, 454, 312);
        hair.curveTo(453, 321, 448, 332, 447, 343);
        hair.curveTo(446, 354, 447, 369, 448, 376);
        hair.curveTo(449, 383, 455, 383, 455, 386);
        hair.curveTo(455, 389, 451, 391, 449, 395);
        hair.curveTo(447, 399, 447, 404, 444, 408);
        hair.curveTo(442, 412, 437, 414, 434, 418);
        hair.curveTo(431, 422, 429, 428, 427, 432);
        hair.curveTo(425, 437, 425, 448, 424, 445);
        // inner edge: right temple, forehead hairline, left fringe
        hair.curveTo(423, 442, 422, 423, 420, 416);
        hair.curveTo(418, 409, 415, 407, 413, 402);
        hair.curveTo(411, 397, 410, 393, 409, 386);
        hair.curveTo(408, 379, 408, 370, 407, 360);
        hair.curveTo(406, 350, 404, 333, 402, 326);
        hair.curveTo(400, 319, 400, 322, 394, 316);
        hair.curveTo(388, 310, 377, 298, 368, 292);
        hair.curveTo(359, 286, 347, 283, 338, 280);
        hair.curveTo(329, 277, 323, 276, 316, 274);
        hair.curveTo(309, 272, 303, 267, 298, 267);
        hair.curveTo(293, 267, 290, 270, 286, 273);
        hair.curveTo(282, 276, 276, 281, 272, 286);
        hair.curveTo(268, 291, 265, 297, 262, 303);
        hair.curveTo(259, 309, 257, 316, 254, 322);
        hair.curveTo(251, 328, 249, 333, 246, 338);
        hair.curveTo(243, 343, 237, 347, 238, 351);
        hair.curveTo(239, 355, 247, 358, 250, 360);
        hair.curveTo(253, 362, 257, 362, 256, 364);
        hair.curveTo(255, 366, 248, 371, 243, 372);
        hair.curveTo(238, 373, 232, 370, 228, 370);
        hair.curveTo(224, 370, 222, 372, 218, 374);
        hair.curveTo(214, 376, 210, 377, 206, 381);
        hair.curveTo(202, 385, 199, 394, 196, 400);
        hair.curveTo(194, 407, 192, 412, 191, 420);
        hair.curveTo(190, 428, 189, 446, 188, 446);
        hair.closePath();
        g2d.setColor(hairColor);
        g2d.fill(hair);

        Graphics2D g = (Graphics2D) g2d.create();
        g.clip(hair);

        // Grey sheen across the top and on the upper left (soft General Paths)
        GeneralPath topSheen = new GeneralPath();
        topSheen.moveTo(272, 220);
        topSheen.curveTo(276, 217, 298, 214, 307, 211);
        topSheen.curveTo(316, 208, 318, 203, 324, 204);
        topSheen.curveTo(330, 205, 337, 214, 344, 215);
        topSheen.curveTo(351, 217, 355, 214, 364, 213);
        topSheen.curveTo(373, 212, 389, 208, 397, 211);
        topSheen.curveTo(405, 214, 408, 223, 413, 229);
        topSheen.curveTo(418, 235, 422, 241, 428, 246);
        topSheen.curveTo(435, 251, 449, 256, 452, 261);
        topSheen.curveTo(456, 267, 452, 279, 449, 279);
        topSheen.curveTo(446, 280, 440, 268, 434, 264);
        topSheen.curveTo(429, 260, 422, 255, 416, 254);
        topSheen.curveTo(410, 253, 401, 260, 398, 258);
        topSheen.curveTo(395, 256, 400, 248, 397, 244);
        topSheen.curveTo(394, 241, 388, 240, 382, 237);
        topSheen.curveTo(376, 234, 371, 228, 363, 226);
        topSheen.curveTo(356, 224, 346, 226, 337, 225);
        topSheen.curveTo(328, 224, 319, 217, 310, 218);
        topSheen.curveTo(301, 219, 290, 230, 284, 230);
        topSheen.curveTo(278, 230, 268, 223, 272, 220);
        topSheen.closePath();
        g.setColor(new Color(71, 70, 78));
        g.fill(topSheen);
        GeneralPath leftSheen = new GeneralPath();
        leftSheen.moveTo(206, 254);
        leftSheen.curveTo(212, 249, 226, 239, 232, 239);
        leftSheen.curveTo(238, 239, 238, 249, 241, 252);
        leftSheen.curveTo(244, 255, 252, 254, 252, 257);
        leftSheen.curveTo(252, 260, 246, 268, 242, 272);
        leftSheen.curveTo(238, 276, 235, 279, 230, 280);
        leftSheen.curveTo(225, 282, 215, 283, 210, 281);
        leftSheen.curveTo(205, 279, 199, 273, 198, 268);
        leftSheen.curveTo(197, 264, 200, 259, 206, 254);
        leftSheen.closePath();
        g.setColor(new Color(64, 63, 70));
        g.fill(leftSheen);

        // Strands sweep from the crown down the left side and the fringe (Quadratic Curves)
        double[] leftEnds = {
                300, 268, 284, 276, 270, 290, 260, 308, 252, 326, 242, 344,
                226, 362, 210, 376, 198, 398, 190, 424, 182, 440, 172, 410,
                168, 380, 172, 350, 178, 318, 188, 292, 202, 264, 220, 244,
                244, 230, 270, 222};
        for (int i = 0; i < leftEnds.length / 2; i++) {
            for (int layer = 0; layer < 3; layer++) {
                double jitter = Math.sin((i * 3 + layer) * 12.9898);
                double sx = 334 - (layer * 7 + 3 * jitter);
                double sy = 214 + layer * 3;
                double ex = leftEnds[2 * i] + 4 * jitter;
                double ey = leftEnds[2 * i + 1] + 3 * jitter;
                double cx = sx * 0.3 + ex * 0.7 - 18;
                double cy = sy * 0.65 + ey * 0.35 - 14;

                g.setColor(layer == 1 ? new Color(62, 61, 69)
                                      : new Color(19, 18, 23));
                g.setStroke(new BasicStroke(layer == 1 ? 1.2f : 0.9f));
                g.draw(new QuadCurve2D.Double(sx, sy, cx, cy, ex, ey));
            }
        }

        // Strands sweep from the crown down the right side (Quadratic Curves)
        double[] rightEnds = {
                338, 278, 360, 286, 382, 302, 398, 322, 404, 346, 410, 372,
                416, 396, 424, 420, 432, 438, 440, 416, 446, 396, 448, 370,
                450, 344, 455, 314, 454, 286, 446, 266, 430, 248, 412, 232,
                392, 220, 372, 213};
        for (int i = 0; i < rightEnds.length / 2; i++) {
            for (int layer = 0; layer < 3; layer++) {
                double jitter = Math.sin((i * 3 + layer) * 12.9898);
                double sx = 348 + (layer * 7 + 3 * jitter);
                double sy = 214 + layer * 3;
                double ex = rightEnds[2 * i] + 4 * jitter;
                double ey = rightEnds[2 * i + 1] + 3 * jitter;
                double cx = sx * 0.3 + ex * 0.7 + 18;
                double cy = sy * 0.65 + ey * 0.35 - 14;

                g.setColor(layer == 1 ? new Color(62, 61, 69)
                                      : new Color(19, 18, 23));
                g.setStroke(new BasicStroke(layer == 1 ? 1.2f : 0.9f));
                g.draw(new QuadCurve2D.Double(sx, sy, cx, cy, ex, ey));
            }
        }
        g.dispose();

        // Loose strands falling across the forehead (Cubic Curves)
        g2d.setColor(new Color(49, 40, 36));
        g2d.setStroke(new BasicStroke(1.4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(new CubicCurve2D.Double(296, 272, 288, 300, 300, 336, 303, 372));
        g2d.draw(new CubicCurve2D.Double(306, 272, 318, 300, 302, 340, 306, 386));
        g2d.setStroke(new BasicStroke(1f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(new CubicCurve2D.Double(290, 276, 278, 296, 272, 316, 268, 330));
        g2d.draw(new CubicCurve2D.Double(300, 274, 296, 300, 304, 330, 297, 360));
        g2d.draw(new QuadCurve2D.Double(312, 276, 320, 296, 318, 318));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bihasa, Christian Louie A. | 4CSD");
        BihasaCL_ProjectPrelims panel = new BihasaCL_ProjectPrelims();
        panel.setBackground(Color.WHITE);

        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
