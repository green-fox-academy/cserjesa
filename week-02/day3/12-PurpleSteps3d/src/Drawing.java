import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    static Color purple = new Color(148, 0, 211);

    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
        int x1 = 10;
        int y1 = 10;
        for (int sor = 1; sor < 7; sor++) {
            y1 = sor * 10;
            toCenter(graphics, x1, y1);
            x1 = x1 + y1;
        }
    }

    public static void toCenter(Graphics graphics, int x, int y) {
        graphics.setColor(purple);
        graphics.fillRect(x, x, y, y);
        graphics.setColor(Color.black);
        graphics.drawRect(x, x, y, y);
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