// Bihasa, Christian Louie A. | 4CSD
import java.awt.*;
import java.awt.geom.*;

public class mp1Bihasa extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("Bihasa, Christian Louie A. | 4CSD", 10, 50);
        
        // Label font
        Font labelFont = new Font("Arial", Font.PLAIN, 12);
        
        // a.) Line
        Path2D.Double lines = new Path2D.Double();
        lines.moveTo(50, 475); // Point A
        lines.lineTo(500, 125); // Point B
        lines.lineTo(300, 300); // Point C
        lines.lineTo(450, 500); // Point D
        lines.lineTo(200, 375); // Point E
        lines.closePath();
        
        g2d.setColor(Color.BLACK);
        g2d.draw(lines);
        g2d.setFont(labelFont);
        g2d.drawString("Lines", 50, 450);
        
        // b.) QuadCurve
        QuadCurve2D.Double quad = new QuadCurve2D.Double(175, 500, 200, 300, 400, 550); // P1(175, 500), C1(200, 300), P2(400, 550) 
        g2d.setColor(Color.GREEN);
        g2d.draw(quad);
        
        g2d.setColor(Color.BLACK);
        g2d.drawString("QuadCurve", 175, 515);
        
        // c.) CubicCurve
        CubicCurve2D.Double cubic = new CubicCurve2D.Double(375, 300, 450, 550, 550, 450, 575, 350); // P1(375,300), C1(450,550), C2(550,450), P2(575,350)
        g2d.setColor(Color.BLUE);
        g2d.draw(cubic);
        
        g2d.setColor(Color.BLACK);
        g2d.drawString("CubicCurve", 375, 290);
        
        // d.) Rectangle
        Rectangle2D.Double rect = new Rectangle2D.Double(100, 100, 150, 200); // P1(100,100), width = 150, height = 200
        g2d.setColor(Color.RED);
        g2d.draw(rect);
        
        g2d.setColor(Color.BLACK);
        g2d.drawString("Rectangle", 100, 95); 
        
        // e.) Ellipse
        // Equation: (((x - 100)^2)/400) + (((y - 90)^2)/900) = 1
        // Center: (x = 100, y = 90)
        // a = sqrt(400) = 20; 2a = 40 => Width
        // b = sqrt(900) = 30; 2a = 60 => Height
        // top-left corner: x = 100 - 20 = 80; y = 90 - 30 = 60
        Ellipse2D.Double elli1 = new Ellipse2D.Double(80, 60, 40, 60);
        g2d.setColor(Color.YELLOW);
        g2d.draw(elli1);
        
        g2d.setColor(Color.BLACK);
        g2d.drawString("Ellipse", 65, 65);
        
        // f.) Arc
        Arc2D.Double arc_pie = new Arc2D.Double(300, 50, 100, 75, 15, 75, Arc2D.PIE); // Bounding rectangle: (300, 50, 100, 75), start = 15, extend = 75, type = PIE
        g2d.setColor(Color.ORANGE);
        g2d.draw(arc_pie);
        
        g2d.setColor(Color.BLACK);
        g2d.drawString("Arc: Pie", 345, 105);
    }
    
    public static void main(String[] args) {
        mp1Bihasa mp = new mp1Bihasa();
        mp.setTitle("Machine Problem 1");
        mp.setBackground(Color.WHITE);
        mp.setSize(600, 600);
        mp.setVisible(true);
    }
}
