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
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, d.width, d.height);
        g.setFont(new Font("San-serif", Font.BOLD, 24));
        g.setColor(new Color(255, 215,0));
        g.drawString("Hello CS 3331!", 60, 40);
    }

    public static void main(String[] args) {
    	//new HelloWorld().run();
    	// or specify optional parameters such as the window size
        new HelloWorld(new String[] {"width=330", "height=550"}).run();
    }
}
