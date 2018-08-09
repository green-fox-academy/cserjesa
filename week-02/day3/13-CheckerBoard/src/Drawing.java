import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int x = 30;
        int y = 0;
        int size = x;
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, 8 * size, 8 * size);
        graphics.setColor(Color.black);
        for (int j = 1; j < 9; j++) {
            for (int i = 1; i < 5; i++) {
                graphics.fillRect(x, y, size, size);
                x += 2 * size;
            }
            y += size;
            if (j % 2 == 0) {
                x = size;
            } else {
                x = 0;
            }
        }
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