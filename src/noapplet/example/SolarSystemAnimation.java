package noapplet.example;
import noapplet.NoApplet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;
public class SolarSystemAnimation extends NoApplet {
    Sun sun;
    Planet planet;
    Planet planet2;
    Planet planet3;
    Moon moon;
    Moon moon2;
    Moon moon3;
    Moon moon4;
    Moon moon5;
    Moon moon6;
    Point[] stars;
    int numStars = 100;
    public SolarSystemAnimation() {
        sun = new Sun(200, 200, 30, Color.YELLOW);
        planet = new Planet(sun, 75, 0.05, Color.RED);
        moon = new Moon(planet, 20, 0.2, Color.GRAY);
        moon3 = new Moon(planet, 10, .5, Color.LIGHT_GRAY);
        planet2 = new Planet(sun, 125, .10, Color.GREEN);
        moon2 = new Moon(planet2,25,.35, Color.cyan);
        planet3 = new Planet(sun, 200,.03, Color.BLUE);
        moon4 = new Moon(planet3,20,.02,Color.yellow);
        moon5 = new Moon(planet3,25,.08,Color.red);
        moon6 = new Moon(planet3,30,.16,Color.green);
    }
    @Override
    public void init() {
        super.init();
        //Stars
        stars = new Point[numStars];
        Random rand = new Random();
        for (int i = 0; i < numStars; i++) {
            int x = rand.nextInt(getWidth());
            int y = rand.nextInt(getHeight());
            stars[i] = new Point(x, y);
        }
        Timer timer = new Timer(50, new ActionListener() {
            @Override
            //UPDATE EACH PLANET
            public void actionPerformed(ActionEvent e) {
                planet.update();
                planet2.update();
                planet3.update();
                moon.update();
                moon2.update();
                moon3.update();
                moon4.update();
                moon5.update();
                moon6.update();
                repaint();
            }
        });
        timer.start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        //Stars
        g.setColor(Color.WHITE);
        for (Point star : stars) {
            g.fillRect(star.x, star.y, 2, 2);
        }
        //PAINT Planets, Moons, Sun
        sun.draw(g);
        planet.draw(g);
        planet2.draw(g);
        planet3.draw(g);
        moon.draw(g);
        moon2.draw(g);
        moon3.draw(g);
        moon4.draw(g);
        moon5.draw(g);
        moon6.draw(g);
        //NAME
        g.setColor(Color.WHITE);
        g.drawString("Daniel De Pablo", 30, 40);
    }
    public static void main(String[] args) {
        new SolarSystemAnimation().run();
    }
}
