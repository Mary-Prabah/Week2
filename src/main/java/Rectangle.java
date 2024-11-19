import java.awt.*;

public class Rectangle {

    private int width;
    private int height;
    private Point corner;
    private Color color;
    //As it is not static, it is NOT class specific but INSTANCE specific

    public Rectangle(int width, int height, Point top_corner_coordinates, Color color) {
        this.width = width;
        this.height = height;
        this.corner = top_corner_coordinates;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.fillRect(corner.x, corner.y, width, height);
        g.setColor(color);
    }
    //It is a method of the class Rectangle, so it is one of its attributes. I.e. rectangle.draw(g)!!}
}