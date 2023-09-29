package noapplet.example;
import java.awt.Graphics;

public interface Ball {
    void move();
    void draw(Graphics g);
    void checkCollisionWithWalls(int width, int height);
    void checkCollisionWithBall(Ball other);
}

