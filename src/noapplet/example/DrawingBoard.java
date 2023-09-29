package noapplet.example;
import noapplet.NoApplet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class DrawingBoard extends NoApplet {
    private List<Shape> shapes;

    /**
     * This method calls the shape class to draw each object with its parameters.
     */
    public DrawingBoard() {
        shapes = new ArrayList<>();
        shapes.add(new Circle(50, 50, Color.RED, 40));
        shapes.add(new Rectangle(100, 100, Color.BLUE, 60, 40));
        shapes.add(new Triangle(200, 200, Color.GREEN, new int[]{150,200,250}, new int[]{250,150,250}));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
        g.setColor(Color.BLACK);
        g.drawString("Daniel De Pablo", 30, 40);
    }

    public static void main(String[] args) {
        new DrawingBoard().run();
    }
}

