// Bihasa, Christian Louie A. | 4CSD
package MP3;
    
import java.awt.*;
import javax.swing.*;

public class BihasaDDA extends JPanel {

    // Starting and ending points
    int x1 = 150, y1 = 550;
    int x2 = 850, y2 = 150;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Header text
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("SansSerif", Font.BOLD, 16));
        g2d.drawString("DDA LINE DRAWING ALGORITHM", 20, 30);

        g2d.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g2d.drawString("Starting Point: (" + x1 + ", " + y1 + ")", 20, 55);
        g2d.drawString("Ending Point: (" + x2 + ", " + y2 + ")", 20, 75);

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

        g2d.setColor(Color.RED);
        for (int i = 0; i <= steps; i++) {

            // Round the calculated coordinates and plot the pixel
            g2d.fillRect(Math.round(x), Math.round(y), 2, 2);

            x += xIncrement;
            y += yIncrement;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bihasa, Christian Louie A. | 4CSD");
        BihasaDDA panel = new BihasaDDA();
        panel.setBackground(Color.WHITE);

        frame.add(panel);
        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
