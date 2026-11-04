/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csfgraphics;

/**
 *
 * @author donnaacula
 */
import java.awt.*;
import javax.swing.*;

public class LineAlgoBresenham extends JPanel{
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Starting and ending points
        int x1 = 50, y1 = 50;
        int x2 = 400, y2 = 300;

        drawBresenham(g2d, x1, y1, x2, y2);
    }
    
    public void drawBresenham(Graphics2D g2d,
                              int x1, int y1,
                              int x2, int y2) {

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        int error = dx - dy;

        while (true) {

            // Draw one pixel
            g2d.setColor(Color.blue);
      
            g2d.fillRect(x1, y1, 5, 5);

            // Stop when endpoint is reached
            if (x1 == x2 && y1 == y2) {
                break;
            }

            int error2 = 2 * error;

            if (error2 > -dy) {
                error -= dy;
                x1 += sx;
            }

            if (error2 < dx) {
                error += dx;
                y1 += sy;
            }
        }
    }
    
 public static void main(String[] args) {

        JFrame frame = new JFrame(" Line Drawing Bresenham Algorithm ");

        LineAlgoBresenham panel = new LineAlgoBresenham();

        frame.add(panel);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}