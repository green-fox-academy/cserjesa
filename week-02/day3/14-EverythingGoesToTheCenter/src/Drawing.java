import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.


        for (int y = 0; y < 296; y += 295) {
            for (int x = 0; x <= 300; x += 20) {
                toCenter(graphics, x, y);
            }
        }
        for (int x = 0; x < 301; x += 300) {
            for (int y = 0; y <= 300; y += 20) {
                toCenter(graphics, x, y);
            }
        }

    }

    public static void toCenter(Graphics graphics, int x, int y) {
        //Colors just for fun
        graphics.setColor(new Color((int) (Math.random() * 0x1000000)));
        graphics.drawLine(x, y, 150, 147);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}