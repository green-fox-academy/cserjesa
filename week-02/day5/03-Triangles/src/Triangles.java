import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        int x;
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, 300, 300);
        graphics.setColor(Color.black);
        for (x = 0; x < 280; x += 20) {
            lineDraw(graphics, x, 280, x / 2 + 140, x);
            lineDraw(graphics, 280 - x, 280, 140 - x / 2, x);
            lineDraw(graphics, x / 2, 280 - x, 280 - x / 2, 280 - x);
        }
    }

    public static void lineDraw(Graphics graphics, int x, int y, int x1, int y1) {
        graphics.drawLine(x, y, x1, y1);
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