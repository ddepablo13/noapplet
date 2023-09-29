package noapplet.example;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class Triangle extends Shape {
    private int[] xPoints, yPoints;

    /**
     * @param x indicates center location of the triangle
     * @param y indicates center location of the triangle
     * @param c color of the triangle
     * @param xPoints x location of each corner from the center of triangle
     * @param yPoints y location of each corner from the center of triangle
     */
    public Triangle(int x, int y, Color c, int[] xPoints, int[] yPoints) {
        super(x, y, c);
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillPolygon(new Polygon(xPoints, yPoints, 3));
    }
}
