import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        int rectangles[] = {50, 100, 150};
        for (int j = 0; j < 3; j++) {
            toCenter(graphics, rectangles[j]);
        }
    }

    public static void toCenter(Graphics graphics, int x) {
        graphics.drawRect(150 - x / 2, 147 - x / 2, x, x);
    }

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