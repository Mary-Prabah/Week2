import java.awt.*;
public class Circle extends Shape {//Class
    private int radius;
    //placed here so that they can be used by other methods in the class

    public Circle(int radius, Point center, Color color){
        super(center, color);//i.e. when circle is instantiated, so is the instantiation of center and color
        //as in Shape, there were already instantiate (i.e. private Point center etc...)
        this.radius = radius;
    }
//Constructors in Java do not have a return type, not even void.
    // You should omit the return type completely.

    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(center.x - radius, center.y - radius, 2 * radius, 2 * radius);
        // i.e. it starts from the uppermost place and then goes down from it!! I.E. it does NOT start at the centre
    }


}
