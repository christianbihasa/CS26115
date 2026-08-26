import java.awt.*;
import java.awt.geom.*;

public class string_geom extends Frame{
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(8.0f);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Serif", Font.BOLD, 35));

        // Task 1: Draw the String
        g2d.drawString("Bihasa_First Programming in Graphics", 100, 75);

        //  Task 2: Drawing Lines, Polylines, QuadCurve, CubicCurve
        Line2D.Double l1 = new Line2D.Double(50, 100, 100, 170);
        Line2D.Double l2 = new Line2D.Double(100, 170, 200, 80);
        g2d.setColor(Color.RED);
        g2d.draw(l1);
        g2d.setColor(Color.GREEN);
        g2d.draw(l2);
        QuadCurve2D.Double qc1 = new QuadCurve2D.Double(100, 175, 175, 250, 250, 200);
        CubicCurve2D.Double cc1 = new CubicCurve2D.Double(120, 180, 175, 250, 220, 255, 280, 170);
        g2d.setColor(Color.BLUE);
        g2d.draw(qc1);
        g2d.setColor(Color.MAGENTA);
        g2d.draw(cc1);

        // Task 3: Drawing Rectangle/Square and Circle/Ellipse
        Rectangle2D.Double rec1 = new Rectangle2D.Double(100, 300, 200, 300);
        g2d.draw(rec1);
        g2d.setColor(Color.CYAN);
        g2d.fill(rec1);

        // Task 3 (Continuation): Drawing Circle/Ellipse
        // Equation: (x - 100)^2 / 6400 + (y - 90)^2 / 10,000 = 1
        // C(100, 90) 
        // a = 100, a2 = 200 = h
        // b = 80, b2 = 160 = w
        // x = 100 - 80 = 20; y = 190 - 100 = 90
        Ellipse2D.Double elli1 = new Ellipse2D.Double(20, 90, 160, 200);
        g2d.setColor(Color.PINK);
        g2d.draw(elli1);

        // Task 4: Drawing Arc (pie, chord, open)
        Rectangle2D.Double rec2 = new Rectangle2D.Double(375, 275, 120, 100);
        Arc2D.Double arc_open = new Arc2D.Double(rec2, 30, 45, Arc2D.OPEN);
        g2d.setColor(Color.BLUE);
        g2d.draw(arc_open);
        Arc2D.Double arc_chord = new Arc2D.Double(rec2, 90, 60, Arc2D.CHORD);
        g2d.draw(arc_chord);
        Arc2D.Double arc_pie = new Arc2D.Double(rec2, 200,45, Arc2D.PIE);
        g2d.draw(arc_pie);

        // Task 5: General Path
        GeneralPath gp = new GeneralPath();
        gp.moveTo(50, 50);
        gp.lineTo(50, 200);
        gp.quadTo(150, 500, 250, 200);
        gp.curveTo(350, 100, 150, 150, 100, 100);
        gp.lineTo(50, 50);
        g2d.setColor(Color.RED);
        //g2d.fill(gp);

        Rectangle2D.Double rec3 = new Rectangle2D.Double(50, 80, 200, 200);
        g2d.setColor(Color.BLUE);
        //g2d.fill(rec3);

        // Area declaration
        Area A = new Area(gp);
        Area B = new Area(rec3);

        // Operators
        g2d.setColor(Color.CYAN);
        //A.add(B);
        //g2d.fill(A);

        //A.intersect(B);
        //g2d.fill(B);

        //A.subtract(B);
        //g2d.fill(A);

        //B.subtract(A);
        //g2d.fill(B);

        //A.exclusiveOr(B);
        //g2d.fill(A);

        Area u = new Area(A);
        u.add(B);
        g2d.fill(u);

        //Area diff = new Area(B);
        //diff.subtract(A);
        //g2d.fill(diff);

        // Intersection of Union and Difference
        //Area C = new Area(u);
        //C.intersect(diff);
        //g2d.fill(C);
    }

    public static void main(String[] args) {
        string_geom sg = new string_geom();
        sg.setTitle("String & Basic Geom in Java");
        sg.setBackground(Color.WHITE);
        sg.setSize(500, 500);
        sg.setForeground(Color.BLUE);
        sg.setVisible(true);
    }
}
