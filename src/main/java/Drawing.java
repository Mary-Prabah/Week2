import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas {//It extends the already existing method Canvas

    private Circle circle;

    //overwrites the paint method
    public void paint(Graphics g) {
        g.setColor(Color.red); // the colour of the line
        g.drawLine (0,0,0,0); // draws a line
        circle.draw(g);
    }


    public Drawing(int radius,Point center, Color color) {
        this.circle = new Circle (radius, center, color); // i.e. the "circle" in the class, not the instance
    //i.e. the parameters put into the constructor (radius, centre and color of this.circle are
        //the same as the one in Drawing(...)
    }
}
