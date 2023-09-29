package noapplet.example;
import noapplet.NoApplet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Balloon extends NoApplet {
    protected int radius = 10;
    protected int step = 5;
    protected Timer timer;

    public Balloon() {
        timer = new Timer(15, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateSize();
                repaint();
            }
        });
    }

    @Override
    public void init() {
        super.init();
        timer.start();
    }

    @Override
    public void stop() {
        super.stop();
        timer.stop();
    }

    protected void updateSize() {
        radius += step;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        int x = getWidth() / 2 - radius;
        int y = getHeight() / 2 - radius;
        g.fillOval(x, y, 2 * radius, 2 * radius);
    }
}

