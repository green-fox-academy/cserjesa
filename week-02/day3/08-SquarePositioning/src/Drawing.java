import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.

        int x[] = {50, 110, 170};
        int y[] = {50, 110, 170};
        for (int k = 0; k < 3; k++) {
            toCenter(graphics, x[k], y[k]);
        }
    }

    public static void toCenter(Graphics graphics, int x, int y) {
        graphics.fillRect(x, y, 50, 50);
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