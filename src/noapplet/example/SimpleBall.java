package noapplet.example;
import java.awt.Color;
import java.awt.Graphics;

public class SimpleBall implements Ball {
    private int x, y;
    private int dx, dy;
    private int radius;
    private Color color;

    public SimpleBall(int x, int y, int dx, int dy, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void move() {
        x += dx;
        y += dy;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public void checkCollisionWithWalls(int width, int height) {
        if (x < radius || x > width - radius) {
            dx = -dx;
        }
        if (y < radius || y > height - radius) {
            dy = -dy;
        }
    }
    @Override
    public void checkCollisionWithBall(Ball other) {
        if (other instanceof SimpleBall) {
            SimpleBall otherBall = (SimpleBall) other;
            int dx = otherBall.x - this.x;
            int dy = otherBall.y - this.y;
            double distance = Math.sqrt(dx * dx + dy * dy);

            // Swap velocities to simulate a bounce, MAKE THIS A REALISTIC BOUNCE
            if (distance < this.radius + otherBall.radius) {
                int tempDx = this.dx;
                int tempDy = this.dy;
                this.dx = otherBall.dx;
                this.dy = otherBall.dy;
                otherBall.dx = tempDx;
                otherBall.dy = tempDy;
            }
        }
    }

}

