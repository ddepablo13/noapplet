package noapplet.example;
import noapplet.NoApplet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BouncingBall extends NoApplet {
    private List<Ball> balls;
    private int numOfBalls = 5; // Number of balls

    @Override
    public void init() {
        super.init();
        balls = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < numOfBalls; i++) {
            int x = (int) (Math.random() * getWidth());
            int y = (int) (Math.random() * getHeight());
            int dx = (int) (Math.random() * 5) - 2;
            int dy = (int) (Math.random() * 5) - 2;
            int radius = 20;
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));  // Generate a random color
            balls.add(new SimpleBall(x, y, dx, dy, radius, color));
        }
    }

    @Override
    public void start() {
        while (true) {
            repaint();
            try {
                Thread.sleep(30); // Sleep for 50 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        for (Ball ball : balls) {
            ball.checkCollisionWithWalls(getWidth(), getHeight());
            ball.move();
            ball.draw(g);
        }

        // Check for collisions between balls
        for (int i = 0; i < balls.size(); i++) {
            for (int j = i + 1; j < balls.size(); j++) {
                balls.get(i).checkCollisionWithBall(balls.get(j));
            }
        }
    }

    public static void main(String[] args) {
        new BouncingBall().run();
    }
}
