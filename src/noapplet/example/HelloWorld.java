package noapplet.example;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import noapplet.NoApplet;

/**
 * Simple NoApplet app to draw a text and an image. The displayed image
 * is obtained from the file <code>res/rabbit.jpg</code>, where
 * <code>res</code> is the resource directory of your Java project.
 * Refer to your IDE to designate the resource directory for your project.
 */
@SuppressWarnings("serial")
public class HelloWorld extends NoApplet {

	public HelloWorld() {
	}

	public HelloWorld(String[] params) {
		super(params);
	}
	
    protected void paintComponent(Graphics g) {
        Dimension d = getSize();
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, d.width, d.height);

        // Draw the Omok board
        int gridSize = 15;
        int cellSize = 30; // Size of each cell in pixels
        int offset = 30; // Offset from the edge of the window

        g.setColor(Color.BLACK);
        for (int i = 0; i < gridSize; i++) {
            // Draw horizontal lines
            g.drawLine(offset, offset + i * cellSize, offset + (gridSize - 1) * cellSize, offset + i * cellSize);
            // Draw vertical lines
            g.drawLine(offset + i * cellSize, offset, offset + i * cellSize, offset + (gridSize - 1) * cellSize);
        }

        // Draw two filled circles (stones) at specific intersections
        int stoneSize = 28; // Size of the stone in pixels

        // Draw a black stone at (5, 5)
        g.setColor(Color.BLACK);
        g.fillOval(offset + 5 * cellSize - stoneSize / 2,
                offset + 5 * cellSize - stoneSize / 2, stoneSize, stoneSize);

        // Draw a white stone at (7, 7)
        g.setColor(Color.WHITE);
        g.fillOval(offset + 7 * cellSize - stoneSize / 2,
                offset + 7 * cellSize - stoneSize / 2, stoneSize, stoneSize);

    }

    public static void main(String[] args) {
    	//new HelloWorld().run();
    	// or specify optional parameters such as the window size
        new HelloWorld(new String[] {"width=550", "height=550"}).run();
    }
}
