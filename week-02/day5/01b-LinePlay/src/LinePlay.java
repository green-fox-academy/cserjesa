import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int x;
        Color purple = new Color(148, 0, 211);
        for (x = 0; x < 296; x += 20) {
            graphics.setColor(purple);
            toCenter(graphics, x, 0, 300, x);
            graphics.setColor(Color.green);
            toCenter(graphics, 0, x, x, 295);
        }

    }

    public static void toCenter(Graphics graphics, int x, int y, int x1, int y1) {
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