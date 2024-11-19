import java.awt.*;
public class Circle {//Class
    private int radius;
    private Point center;
    private Color color;
    //placed here so that they can be used by other methods in the class

    public Circle(int radius, Point center, Color color){//method
        this.radius = radius;
        this.center = center;
        this.color = color;
    }
//Constructors in Java do not have a return type, not even void.
    // You should omit the return type completely.

    public void draw(Graphics g){
        g.fillOval(center.x - radius, center.y - radius, 2 * radius, 2 * radius);
        // i.e. it starts from the uppermost place and then goes down from it!! I.E. it does NOT start at the centre
        g.setColor(color);
    }


}
