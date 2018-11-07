import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        graphics.setColor(new Color(0, 200, 0));
        int box[][] = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int points[][] = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        drawLines(graphics, box);
        drawLines(graphics, points);
    }

    public static void drawLines(Graphics graphics, int[][] x) {
        graphics.drawLine(x[0][0], x[0][1], x[x.length - 1][0], x[x.length - 1][x[x.length - 1].length - 1]);
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x[0].length - 1; j++) {
                graphics.drawLine(x[i][j], x[i][j + 1], x[i + 1][j], x[i + 1][j + 1]);
            }
        }
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


// create a 300x300 canvas.