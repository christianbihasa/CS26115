/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csfgraphics;
import java.awt.*;
import javax.swing.*;

public class LineAlgoDDA extends JPanel{
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
       

        // Starting and ending points
        int x1 = 50, y1 = 50;
        int x2 = 400, y2 = 300;

        drawDDA(g2d, x1, y1, x2, y2);
    }
    
     public void drawDDA(Graphics2D g2d,
                        int x1, int y1,
                        int x2, int y2) {

        int dx = x2 - x1;
        int dy = y2 - y1;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float xIncrement = dx / (float) steps;
        float yIncrement = dy / (float) steps;

        float x = x1;
        float y = y1;

        for (int i = 0; i <= steps; i++) {

            // Draw one pixel
            g2d.setColor(Color.red);
            g2d.fillRect(Math.round(x), Math.round(y), 10, 10);
           
            x += xIncrement;
            y += yIncrement;
        }
    }
    
 public static void main(String[] args) {

        JFrame frame = new JFrame(" Line Drawing Algorithm DDA");
        LineAlgoDDA panel = new LineAlgoDDA();
        frame.add(panel);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}