import java.awt.*;
public class Circle {//Class
    private int radius;
    private Point center;
    private Color color;

    public Circle(int radius, Point center, Color color){//method
        this.radius = radius;
        this.center = center;
        this.color = color;
    }

    public void draw(Graphics g){
        g.fillOval(center.x - radius, center.y - radius, 2 * radius, 2 * radius);
        // i.e. it starts from the uppermost place and then goes down from it!! I.E. it does NOT start at the centre
        g.setColor(color);
    }


}
