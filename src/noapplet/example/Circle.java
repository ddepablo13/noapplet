package noapplet.example;
import java.awt.Graphics;
import java.awt.Color;

public class Circle extends Shape {
    private int radius;

    /**
     * @param x indicates the location of the circle
     * @param y indicates the location of the circle
     * @param c is the color of the circle
     * @param radius is the size of the circle
     */
    public Circle(int x, int y, Color c, int radius) {
        super(x, y, c);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.drawOval(x, y, radius, radius);
    }
}
