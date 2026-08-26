package com.example;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

public class CsdGraphics extends Frame {
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
    }

    public static void main(String[] args) {
        CsdGraphics sg = new CsdGraphics();
        sg.setTitle("String & Basic Geom in Java");
        sg.setBackground(Color.WHITE);
        sg.setSize(500, 500);
        sg.setForeground(Color.BLUE);
        sg.setVisible(true);
    }
}