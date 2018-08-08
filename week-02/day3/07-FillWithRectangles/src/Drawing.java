import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.
        Color[] colors = {Color.green, Color.blue, Color.red, Color.cyan};
        int rectangles[] = {50, 100, 150, 200};
        for (int sor = 0; sor < 4; sor++) {
            toCenter(graphics, rectangles[sor], colors[sor]);
        }
    }

    public static void toCenter(Graphics graphics, int x, Color colors) {
        graphics.setColor(colors);
        graphics.fillRect(x, x, 40, x / 3);
    }


    //    Don't touch the code below
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