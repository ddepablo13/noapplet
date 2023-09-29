package noapplet.example;
import java.awt.Graphics;
import java.awt.Color;

public class Rectangle extends Shape {
    private int width, height;

    /**
     * @param x location of rectangle
     * @param y location of rectangle
     * @param c color of rectangle
     * @param width of rectangle
     * @param height of rectangle
     */
    public Rectangle(int x, int y, Color c, int width, int height) {
        super(x, y, c);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.drawRect(x, y, width, height);
    }
}

