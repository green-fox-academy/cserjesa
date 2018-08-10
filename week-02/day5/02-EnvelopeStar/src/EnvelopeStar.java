import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {

        int x;
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, 300, 295);
        graphics.setColor(Color.green);
        for (x = 0; x < 147; x += 10) {
            toCenter(graphics, 150, x, x + 150, 147);
            toCenter(graphics, 150, x, 150 - x, 147);
            toCenter(graphics, 150, 295 - x, x + 150, 147);
            toCenter(graphics, 150, 295 - x, 150 - x, 147);
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