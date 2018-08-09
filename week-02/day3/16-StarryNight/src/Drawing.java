import javax.swing.*;
import java.awt.*;

import static java.lang.Math.abs;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        graphics.fillRect(0, 0, 301, 298);
        int x;
        int y;
        for (int i = 0; i < 390; i++) {
            x = (int) (Math.random() * 300);
            y = (int) (Math.random() * 298);
            stars(graphics, x, y);
        }
    }

    public static void stars(Graphics graphics, int x, int y) {
        graphics.setColor(new Color(abs(y/2-200), abs(y/2-200), abs(y/2-200)));
        graphics.fillRect(x, y, 2, 2);
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