package noapplet.example;

import java.awt.*;

public class Sun {
    int x, y, radius;
    double angle = 0.0;
    int amplitude = 3; // The amount of wobble
    Color color;

    public Sun(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public void update() {
        angle += 0.05; // Speed of wobble
        x = (int) (x + amplitude * Math.sin(angle));
        y = (int) (y + amplitude * Math.cos(angle));
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}
