import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Bihasa_LT1 extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2d.setStroke(new BasicStroke(2.0f));
        g2d.setColor(Color.BLACK);

        /*
        1. (20 points) Draw the given image below using the (a) basic geometric objects (b) general path using  java and fill the object by magenta. Assume the following dimensions:
        Start Point A(100, 250)
        AB = 50, BC = 50, CD = 50, DE = 300, EF = 200, FG = 300, GH = 50, HI = 50, IJ = 50, JK = 100,
        VERTICAL DISTANCE KL = 50, LM = 300, VERTICAL DISTANCE MN = 50, NA = 100
        */

        // (a) basic geometric objects
        Rectangle2D.Double body = new Rectangle2D.Double(200, 200, 200, 300);       // body rectangle
        Rectangle2D.Double chest = new Rectangle2D.Double(150, 100, 300, 100);      // chest rectangle
        Rectangle2D.Double leftSleeve = new Rectangle2D.Double(100, 150, 50, 100);  // left sleeve rectangle
        Rectangle2D.Double rightSleeve = new Rectangle2D.Double(450, 150, 50, 100); // right sleeve rectangle

        Polygon leftShoulder = new Polygon();
        leftShoulder.addPoint(100, 150); // N
        leftShoulder.addPoint(150, 100); // M
        leftShoulder.addPoint(150, 150); // Inner Corner

        Polygon rightShoulder = new Polygon();
        rightShoulder.addPoint(450, 100); // L
        rightShoulder.addPoint(500, 150); // K
        rightShoulder.addPoint(450, 150); // Inner Corner

        Area shirt1 = new Area(body);
        shirt1.add(new Area(chest));
        shirt1.add(new Area(leftSleeve));
        shirt1.add(new Area(rightSleeve));
        shirt1.add(new Area(leftShoulder));
        shirt1.add(new Area(rightShoulder));
        
        g2d.setColor(Color.BLACK);
        g2d.draw(shirt1);
        
        // (b) general path
        GeneralPath shirt1 = new GeneralPath();
        shirt1.moveTo(100, 250);       // A
        shirt1.lineTo(150, 250);       // B
        shirt1.lineTo(150, 200);       // C
        shirt1.lineTo(200, 200);       // D
        shirt1.lineTo(200, 500);       // E
        shirt1.lineTo(400, 500);       // F
        shirt1.lineTo(400, 200);       // G
        shirt1.lineTo(450, 200);       // H
        shirt1.lineTo(450, 250);       // I
        shirt1.lineTo(500, 250);       // J
        shirt1.lineTo(500, 150);       // K
        shirt1.lineTo(450, 100);       // L
        shirt1.lineTo(150, 100);       // M
        shirt1.lineTo(100, 150);       // N
        shirt1.closePath();            // back to A

        g2d.setColor(Color.MAGENTA);
        g2d.fill(shirt1);

        g2d.setColor(Color.BLACK);
        g2d.draw(shirt1);


        /*
        2. (20 points) Draw the given image below (a) using the basic geometric objects(b) using general path in java, use green to fill the image. Assume the following dimensions:
        Start Point A(100, 350)
        VERTICAL DISTANCE AB = 100, HORIZONTAL DISTANCE AB = 50, BC = 300, VERTICAL DISTANCE
        CD = 100, HORIZONTAL DISTANCE CD = 50, DE = 195, EF = 10, AF = 195, FG = 200, GH = 10,
        HJ = 50, IJ = 100
        */
        
        // (a) using the basic geometric objects
        Rectangle2D.Double hullBase = new Rectangle2D.Double(150, 350, 300, 100);
        Rectangle2D.Double mast = new Rectangle2D.Double(295, 150, 10, 200);

        Polygon leftBow = new Polygon();
        leftBow.addPoint(100, 350); // A
        leftBow.addPoint(150, 350); // Inner top corner
        leftBow.addPoint(150, 450); // B

        Polygon rightBow = new Polygon();
        rightBow.addPoint(500, 350); // D
        rightBow.addPoint(450, 350); // Inner top corner
        rightBow.addPoint(450, 450); // C

        Polygon sail = new Polygon();
        sail.addPoint(305, 150); // H
        sail.addPoint(405, 200); // I
        sail.addPoint(305, 200); // J

        Area boat2 = new Area(hullBase);
        boat2.add(new Area(leftBow));
        boat2.add(new Area(rightBow));
        boat2.add(new Area(mast));
        boat2.add(new Area(sail));

        g2d.setColor(Color.BLACK);
        g2d.draw(boat2);

        // (b) using general path
        GeneralPath boatHull = new GeneralPath();
        boatHull.moveTo(100, 350); // A
        boatHull.lineTo(150, 450); // B
        boatHull.lineTo(450, 450); // C
        boatHull.lineTo(500, 350); // D
        boatHull.closePath();

        GeneralPath mast = new GeneralPath();
        mast.moveTo(295, 350); // E
        mast.lineTo(295, 150); // G
        mast.lineTo(305, 150); // H
        mast.lineTo(305, 350); // F
        mast.closePath();

        GeneralPath sail = new GeneralPath();
        sail.moveTo(305, 150); // H
        sail.lineTo(405, 200); // I
        sail.lineTo(305, 200); // J
        sail.closePath();

        Area boat2 = new Area(boatHull);
        boat2.add(new Area(mast));
        boat2.add(new Area(sail));

        g2d.setColor(Color.GREEN);
        g2d.fill(boat2);

        g2d.setColor(Color.BLACK);
        g2d.draw(boat2);


        /*
        3. (10 points) Determine the (a)  relative difference (Image 1 - image 2)
        */

        GeneralPath shirt3a = new GeneralPath();
        shirt3a.moveTo(100, 250);
        shirt3a.lineTo(150, 250);
        shirt3a.lineTo(150, 200);
        shirt3a.lineTo(200, 200);
        shirt3a.lineTo(200, 500);
        shirt3a.lineTo(400, 500);
        shirt3a.lineTo(400, 200);
        shirt3a.lineTo(450, 200);
        shirt3a.lineTo(450, 250);
        shirt3a.lineTo(500, 250);
        shirt3a.lineTo(500, 150);
        shirt3a.lineTo(450, 100);
        shirt3a.lineTo(150, 100);
        shirt3a.lineTo(100, 150);
        shirt3a.closePath();

        GeneralPath boatHull3a = new GeneralPath();
        boatHull3a.moveTo(100, 350);
        boatHull3a.lineTo(150, 450);
        boatHull3a.lineTo(450, 450);
        boatHull3a.lineTo(500, 350);
        boatHull3a.closePath();

        GeneralPath mast3a = new GeneralPath();
        mast3a.moveTo(295, 350);
        mast3a.lineTo(295, 150);
        mast3a.lineTo(305, 150);
        mast3a.lineTo(305, 350);
        mast3a.closePath();

        GeneralPath sail3a = new GeneralPath();
        sail3a.moveTo(305, 150);
        sail3a.lineTo(405, 200);
        sail3a.lineTo(305, 200);
        sail3a.closePath();

        Area img1Area3a = new Area(shirt3a);

        Area img2Area3a = new Area(boatHull3a);
        img2Area3a.add(new Area(mast3a));
        img2Area3a.add(new Area(sail3a));

        img1Area3a.subtract(img2Area3a);

        g2d.setColor(Color.BLUE);
        g2d.fill(img1Area3a);

        g2d.setColor(Color.BLACK);
        g2d.draw(img1Area3a);


        /*
        3. (10 points) Determine the (b) symmetric difference of the objects in 1 & 2
        */

       GeneralPath shirt3b = new GeneralPath();
       shirt3b.moveTo(100, 250);
       shirt3b.lineTo(150, 250);
       shirt3b.lineTo(150, 200);
       shirt3b.lineTo(200, 200);
       shirt3b.lineTo(200, 500);
       shirt3b.lineTo(400, 500);
       shirt3b.lineTo(400, 200);
       shirt3b.lineTo(450, 200);
       shirt3b.lineTo(450, 250);
       shirt3b.lineTo(500, 250);
       shirt3b.lineTo(500, 150);
       shirt3b.lineTo(450, 100);
       shirt3b.lineTo(150, 100);
       shirt3b.lineTo(100, 150);
       shirt3b.closePath();

       GeneralPath boatHull3b = new GeneralPath();
       boatHull3b.moveTo(100, 350);
       boatHull3b.lineTo(150, 450);
       boatHull3b.lineTo(450, 450);
       boatHull3b.lineTo(500, 350);
       boatHull3b.closePath();

       GeneralPath mast3b = new GeneralPath();
       mast3b.moveTo(295, 350);
       mast3b.lineTo(295, 150);
       mast3b.lineTo(305, 150);
       mast3b.lineTo(305, 350);
       mast3b.closePath();

       GeneralPath sail3b = new GeneralPath();
       sail3b.moveTo(305, 150);
       sail3b.lineTo(405, 200);
       sail3b.lineTo(305, 200);
       sail3b.closePath();

       Area img1Area3b = new Area(shirt3b);

       Area img2Area3b = new Area(boatHull3b);
       img2Area3b.add(new Area(mast3b));
       img2Area3b.add(new Area(sail3b));

       img1Area3b.exclusiveOr(img2Area3b);

       g2d.setColor(Color.BLUE);
       g2d.fill(img1Area3b);

       g2d.setColor(Color.BLACK);
       g2d.draw(img1Area3b);
    }

    public static void main(String[] args) {
        Bihasa_LT1 Lt1 = new Bihasa_LT1();
        Lt1.setTitle("Bihasa, Christian Louie A. | 4CSD");
        Lt1.setBackground(Color.WHITE);
        Lt1.setSize(600, 600);
        Lt1.setVisible(true);

        Lt1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}