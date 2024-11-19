import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas {//It extends the already existing method Canvas

    private Circle circle;
    private Rectangle rectangle;

    //overwrites the paint method
    public void paint(Graphics g) {
        g.setColor(Color.red); // the colour of the line
        g.drawLine (0,0,0,0); // draws a line
        circle.draw(g); //i.e. calls the drawing method in circle!
        //It is an extension of the Graphics method, so I am not too sure
        //Either way, the color is different for everyone as we said circle is blue,
        //rectangle is red, and square is green
        rectangle.draw(g);
    }


    public Drawing() {

        this.circle = new Circle (50,new Point (100,100), Color.blue);
        // You need to put Point!!! Because, before you had not yet instantiated the object of type point!!
        this.rectangle = new Rectangle (70,50,new Point (50,50), Color.red);
        //I guess Color is not instantiated because we are using a class method and NOT creating an object

    }
}
