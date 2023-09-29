package noapplet.example;
import java.awt.*;

public class Planet {
    int x, y, radius;
    double angle, speed;
    Sun sun;
    Color color;

    public Planet(Sun sun, int radius, double speed, Color color) {
        this.sun = sun;
        this.radius = radius;
        this.speed = speed;
        this.angle = 0;
        this.color = color;
    }

    public void update() {
        angle += speed;
        x = (int) (sun.x + radius * Math.cos(angle));
        y = (int) (sun.y + radius * Math.sin(angle));
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - 5, y - 5, 10, 10);
    }
}
