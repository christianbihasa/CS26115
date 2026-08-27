// Bihasa, Christian Louie A. | 4CSD
import java.awt.*;
import java.awt.geom.*;

public class mp2_Bihasa extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("Bihasa, Christian Louie A. | 4CSD", 10, 50);
        
        Font labelFont = new Font("Arial", Font.PLAIN, 12);
        g2d.setFont(labelFont);
        
        // quadTo(controlX, controlY, endX, endY)
        
        // 1.) Draw the given cross in as shown as below using lines and QuadCurves 
        Path2D.Double cross1 = new Path2D.Double();
        cross1.moveTo(250, 280); // Start Point A(250, 280)
        
        // Top Arm
        cross1.lineTo(250, 180); // Point B: Y = 280 - 100 (AB = 100) -> (250, 180)
        cross1.quadTo(250, 140, 290, 140); // Curve BC: Control(250, 180 - 40 = 140), End C(250 + 40 = 290, 180 - 40 = 140)
        cross1.lineTo(310, 140); // Point D: X = 290 + 20 (CD = 20) -> (310, 140)
        cross1.quadTo(350, 140, 350, 180); // Curve DE: Control(310 + 40 = 350, 140), End E(310 + 40 = 350, 140 + 40 = 180)
        cross1.lineTo(350, 280); // Point F: Y = 180 + 100 (EF = 100) -> (350, 280)
        
        // Right Arm
        cross1.lineTo(450, 280); // Line: X = 350 + 100 -> (450, 280)
        cross1.quadTo(490, 280, 490, 320); // Curve: Control(450 + 40 = 490, 280), End(450 + 40 = 490, 280 + 40 = 320)
        cross1.lineTo(490, 340); // Line: Y = 320 + 20 -> (490, 340)
        cross1.quadTo(490, 380, 450, 380); // Curve: Control(490, 340 + 40 = 380), End(490 - 40 = 450, 340 + 40 = 380)
        cross1.lineTo(350, 380); // Line: X = 450 - 100 -> (350, 380)
        
        // Bottom Arm
        cross1.lineTo(350, 480); // Line: Y = 380 + 100 -> (350, 480)
        cross1.quadTo(350, 520, 310, 520); // Curve: Control(350, 480 + 40 = 520), End(350 - 40 = 310, 480 + 40 = 520)
        cross1.lineTo(290, 520); // Line: X = 310 - 20 -> (290, 520)
        cross1.quadTo(250, 520, 250, 480); // Curve: Control(290 - 40 = 250, 520), End(290 - 40 = 250, 520 - 40 = 480)
        cross1.lineTo(250, 380); // Line: Y = 480 - 100 -> (250, 380)
        
        // Left Arm
        cross1.lineTo(150, 380); // Line: X = 250 - 100 -> (150, 380)
        cross1.quadTo(110, 380, 110, 340); // Curve: Control(150 - 40 = 110, 380), End(150 - 40 = 110, 380 - 40 = 340)
        cross1.lineTo(110, 320); // Line: Y = 340 - 20 -> (110, 320)
        cross1.quadTo(110, 280, 150, 280); // Curve: Control(110, 320 - 40 = 280), End(110 + 40 = 150, 320 - 40 = 280)
        cross1.lineTo(250, 280); // Line: X = 150 + 100 -> Back to Start A(250, 280)
        cross1.closePath();

        g2d.setColor(Color.BLACK);
        g2d.draw(cross1);
        g2d.drawString("1.) Cross (Lines & QuadCurves)", 150, 120);
        
        // 2.) Draw the same given cross using GeneralPath class
        GeneralPath cross2 = new GeneralPath();
        cross2.moveTo(255, 285); // Start Point A(255, 285)
        
        // Top Arm
        cross2.lineTo(255, 185); // Point B: Y = 285 - 100 (AB = 100) -> (255, 185)
        cross2.quadTo(255, 145, 295, 145); // Curve BC: Control(255, 185 - 40 = 145), End C(255 + 40 = 295, 185 - 40 = 145)
        cross2.lineTo(315, 145); // Point D: X = 295 + 20 (CD = 20) -> (315, 145)
        cross2.quadTo(355, 145, 355, 185); // Curve DE: Control(315 + 40 = 355, 145), End E(315 + 40 = 355, 145 + 40 = 185)
        cross2.lineTo(355, 285); // Point F: Y = 185 + 100 (EF = 100) -> (355, 285)
        
        // Right Arm
        cross2.lineTo(455, 285); // Line: X = 355 + 100 -> (455, 285)
        cross2.quadTo(495, 285, 495, 325); // Curve: Control(455 + 40 = 495, 285), End(455 + 40 = 495, 285 + 40 = 325)
        cross2.lineTo(495, 345); // Line: Y = 325 + 20 -> (495, 345)
        cross2.quadTo(495, 385, 455, 385); // Curve: Control(495, 345 + 40 = 385), End(495 - 40 = 455, 345 + 40 = 385)
        cross2.lineTo(355, 385); // Line: X = 455 - 100 -> (355, 385)
        
        // Bottom Arm
        cross2.lineTo(355, 485); // Line: Y = 385 + 100 -> (355, 485)
        cross2.quadTo(355, 525, 315, 525); // Curve: Control(355, 485 + 40 = 525), End(355 - 40 = 315, 485 + 40 = 525)
        cross2.lineTo(295, 525); // Line: X = 315 - 20 -> (295, 525)
        cross2.quadTo(255, 525, 255, 485); // Curve: Control(295 - 40 = 255, 525), End(295 - 40 = 255, 525 - 40 = 485)
        cross2.lineTo(255, 385); // Line: Y = 485 - 100 -> (255, 385)
        
        // Left Arm
        cross2.lineTo(155, 385); // Line: X = 255 - 100 -> (155, 385)
        cross2.quadTo(115, 385, 115, 345); // Curve: Control(155 - 40 = 115, 385), End(155 - 40 = 115, 385 - 40 = 345)
        cross2.lineTo(115, 325); // Line: Y = 345 - 20 -> (115, 325)
        cross2.quadTo(115, 285, 155, 285); // Curve: Control(115, 325 - 40 = 285), End(115 + 40 = 155, 325 - 40 = 285)
        cross2.lineTo(255, 285); // Line: X = 155 + 100 -> Back to Start A(255, 285)
        cross2.closePath();

        g2d.setColor(Color.DARK_GRAY);
        g2d.draw(cross2);
        g2d.drawString("2.) Cross (GeneralPath)", 150, 135);
        
        // 3.) Draw the given Christmas tree (as shown below) using GeneralPath class.
        GeneralPath treeFoliage = new GeneralPath();
        treeFoliage.moveTo(350, 150); // Top Peak Point A(350, 150)
        
        // Right Side
        treeFoliage.lineTo(400, 300); // Bottom Right: X = 350 + (150/3) = 400, Y = 150 + 150 = 300
        treeFoliage.lineTo(380, 300); // Top Right: X = 400 - 20 (offset) = 380, Y = 300
        treeFoliage.lineTo(450, 450); // Bottom Right: X = 350 + 2*(150/3) = 450, Y = 150 + 300 = 450
        treeFoliage.lineTo(430, 450); // Top Right: X = 450 - 20 (offset) = 430, Y = 450
        treeFoliage.lineTo(500, 600); // Bottom Right: X = 350 + (300/2) = 500, Y = 150 + 450 = 600
        
        // Bottom Base Line
        treeFoliage.lineTo(200, 600); // Bottom Left: X = 350 - (300/2) = 200, Y = 600
        
        // Left Side
        treeFoliage.lineTo(270, 450); // Top Left: X = (350 - 100) + 20 (offset) = 270, Y = 450
        treeFoliage.lineTo(250, 450); // Bottom Left: X = 350 - 2*(150/3) = 250, Y = 450
        treeFoliage.lineTo(320, 300); // Top Left: X = (350 - 50) + 20 (offset) = 320, Y = 300
        treeFoliage.lineTo(300, 300); // Bottom Left: X = 350 - (150/3) = 300, Y = 300
        treeFoliage.closePath();

        // Base (Trunk): Width = 30, Height = 30
        // X = 350 - (30 / 2) = 335
        // Y = 600 (located below foliage)
        // Width = 30
        // Height = 30
        Rectangle2D.Double treeBase = new Rectangle2D.Double(335, 600, 30, 30);

        // Diamond Star: Vertical/Horizontal distance from A = 20
        GeneralPath treeStar = new GeneralPath();
        treeStar.moveTo(350, 110); // Top Vertex: X = 350, Y = 150 - 20 - 20 = 110
        treeStar.lineTo(370, 130); // Right Vertex: X = 350 + 20 = 370, Y = 150 - 20 = 130
        treeStar.lineTo(350, 150); // Bottom Vertex (Point A): X = 350, Y = 150
        treeStar.lineTo(330, 130); // Left Vertex: X = 350 - 20 = 330, Y = 150 - 20 = 130
        treeStar.closePath();

        g2d.setColor(Color.GREEN);
        g2d.fill(treeFoliage);
        g2d.setColor(Color.GRAY);
        g2d.fill(treeBase);
        g2d.setColor(Color.ORANGE);
        g2d.fill(treeStar);

        g2d.setColor(Color.BLACK);
        g2d.drawString("3.) Christmas Tree", 300, 100);

        // Combined Tree for number 4
        GeneralPath fullTree = new GeneralPath(treeFoliage);
        fullTree.append(treeBase, false);
        fullTree.append(treeStar, false);
        
        // 4.) Convert the cross and christmas tree in Area and determine the following using java only
        Area areaCross = new Area(cross2);
        Area areaTree = new Area(fullTree);

        g2d.setFont(new Font("Arial", Font.BOLD, 14));
        g2d.drawString("4.) Area Operations", 50, 80);
        g2d.setFont(labelFont);

        // 4.1 Union
        Area a1 = new Area(areaCross);
        a1.add(areaTree);                                   
        g2d.setColor(Color.BLACK);
        g2d.drawString("4.1 Union", 50, 100);
        g2d.setColor(Color.BLUE);
        g2d.fill(a1);
        g2d.setColor(Color.BLACK);
        g2d.draw(a1);

        // 4.2 Intersection
        Area a2 = new Area(areaCross);
        a2.intersect(areaTree);                            
        g2d.setColor(Color.BLACK);
        g2d.drawString("4.2 Intersection", 50, 100);
        g2d.setColor(Color.RED);
        g2d.fill(a2);
        g2d.setColor(Color.BLACK);
        g2d.draw(a2);

        // 4.3 Symmetric Difference
        Area a3 = new Area(areaCross);
        a3.exclusiveOr(areaTree);                           
        g2d.setColor(Color.BLACK);
        g2d.drawString("4.3 Symmetric Difference", 50, 100);
        g2d.setColor(Color.MAGENTA);
        g2d.fill(a3);
        g2d.setColor(Color.BLACK);
        g2d.draw(a3);

        // 4.4 Relative Difference (Cross and Tree)
        Area a4 = new Area(areaCross);
        a4.subtract(areaTree);                             
        g2d.setColor(Color.BLACK);
        g2d.drawString("4.4 Relative Difference (Cross - Tree)", 50, 100);
        g2d.setColor(Color.ORANGE);
        g2d.fill(a4);
        g2d.setColor(Color.BLACK);
        g2d.draw(a4);

        // 4.5 Relative Difference (Tree and Cross)
        Area a5 = new Area(areaTree);
        a5.subtract(areaCross);                           
        g2d.setColor(Color.BLACK);
        g2d.drawString("4.5 Relative Difference (Tree - Cross)", 50, 100);
        g2d.setColor(Color.CYAN);
        g2d.fill(a5);
        g2d.setColor(Color.BLACK);
        g2d.draw(a5);                                    
    }
    
    public static void main(String[] args) {
        mp2_Bihasa mp2 = new mp2_Bihasa();
        mp2.setTitle("Machine Problem 2");
        mp2.setBackground(Color.WHITE);
        mp2.setSize(700, 750);
        mp2.setVisible(true);
    }
}

