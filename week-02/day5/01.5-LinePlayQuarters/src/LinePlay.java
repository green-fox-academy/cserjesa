import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int purplex;
        int purpley;
        int purplex1;
        int purpley1;
        int greenx;
        int greeny;
        int greenx1;
        int greeny1;
        int n = 2;
        Color purple = new Color(148, 0, 211);
        for (int m = 1; m <= n; m++) {
            for (int x = 0; x < 291 / n; x += 20 / n) {
                graphics.setColor(purple);
//            toCenter(graphics, x, 0, 300, x);
                purplex = n*(m-1)+m*x;
                purpley = (m-1)*(290/n);
                purplex1 = (290/n)*m;
                purpley1 = n*(m-1)+m*x;
                toCenter(graphics, purplex, purpley, purplex1, purpley1);
                graphics.setColor(Color.green);
//            toCenter(graphics, 0, x, x, 295);
                greenx = (m-1)*(290/n);
                greeny = n*(m-1)+m*x;
                greenx1 = n*(m-1)+m*x;
                greeny1 = (290/n)*m;
                toCenter(graphics, greenx, greeny, greenx1, greeny1);
            }
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