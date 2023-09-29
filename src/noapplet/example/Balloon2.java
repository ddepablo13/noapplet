package noapplet.example;
import noapplet.NoApplet;


public class Balloon2 extends Balloon {
    @Override
    protected void updateSize() {
        super.updateSize();

        int width = getWidth();
        int height = getHeight();

        if (radius * 2 >= width || radius * 2 >= height || radius <= 10) {
            step = -step;
        }

        radius += step;
    }
}

