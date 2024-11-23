package Shapes;

import java.awt.*;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Circle extends Shape implements Shape_interface {//Class
    private int radius;
    //placed here so that they can be used by other methods in the class

    public Circle(int radius, Point center, Color color) {
        super(center, color);//i.e. when circle is instantiated, so is the instantiation of center and color
        //as in Shapes.Shape, there were already instantiate (i.e. private Point center etc...)
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(center.x - radius, center.y - radius, 2 * radius, 2 * radius);

    }
}
//Constructors in Java do not have a return type, not even void.
    // You should omit the return type completely.

/*
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(center.x - radius, center.y - radius, 2 * radius, 2 * radius);
        // i.e. it starts from the uppermost place and then goes down from it!! I.E. it does NOT start at the centre
    }


    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }
}
*/
