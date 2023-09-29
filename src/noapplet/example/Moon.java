package noapplet.example;
import java.awt.*;

public class Moon {
    int x, y, radius;
    double angle, speed;
    Planet planet;
    Color color;

    public Moon(Planet planet, int radius, double speed, Color color) {
        this.planet = planet;
        this.radius = radius;
        this.speed = speed;
        this.angle = 0;
        this.color = color;
    }

    public void update() {
        angle += speed;
        x = (int) (planet.x + radius * Math.cos(angle));
        y = (int) (planet.y + radius * Math.sin(angle));
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - 3, y - 3, 6, 6);
    }
}

