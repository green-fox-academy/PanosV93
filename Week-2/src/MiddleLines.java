import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MiddleLines {
    public static void mainDraw(Graphics graphics){
        // draw a red horizontal line to the canvas' middle.
        Color color = new Color(255,0,0);
        graphics.setColor(color);
        graphics.drawLine(0, HEIGHT /2,WIDTH,HEIGHT/2);

        // draw a green vertical line to the canvas' middle.

        Color color1 = new Color(0,255,0);
        graphics.setColor(color1);
        graphics.drawLine(HEIGHT/2,WIDTH,HEIGHT/2,0);


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
