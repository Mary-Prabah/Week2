import java.awt.*;

public class Rectangle extends Shape{

    private int width;
    private int height;
    //As it is not static, it is NOT class specific but INSTANCE specific

    public Rectangle (int width, int height, Point top_corner_coordinates, Color color) {
        super(top_corner_coordinates,color);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(center.x, center.y , width, height);

    }
    //It is a method of the class Rectangle, so it is one of its attributes. I.e. rectangle.draw(g)!!}
}