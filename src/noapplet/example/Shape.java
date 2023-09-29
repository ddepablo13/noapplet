package noapplet.example;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    protected int x, y;
    protected Color c;

    /**
     * this is a class where Shape is made into a constructor for
     * each shape to have its own attributes
     * @param x location of shape
     * @param y location of shape
     * @param c color of the shape using draw method
     */
    public Shape(int x, int y, Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public abstract void draw(Graphics g);
}
