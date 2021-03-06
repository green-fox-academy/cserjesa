import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    static Color purple = new Color(148, 0, 211);

    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]


        for (int k = 0; k < 20; k++) {
            toCenter(graphics, 10 * k, 10 * k);
        }
    }

    public static void toCenter(Graphics graphics, int x, int y) {
        graphics.setColor(purple);
        graphics.fillRect(x, y, 10, 10);
        graphics.setColor(Color.black);
        graphics.drawRect(x, y, 10, 10);
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