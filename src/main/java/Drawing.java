import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas {//It extends the already existing method Canvas

    //overwrites the paint method
    public void paint(Graphics g) {
        g.setColor(Color.red); // the colour of the line
        g.drawLine (0,0,0,0); // draws a line
        circle.draw(g);
    }

    private Circle circle;

    public Drawing(int radius,Point center, Color color) {
        this.circle = new Circle (radius, center, color);
    }
}
