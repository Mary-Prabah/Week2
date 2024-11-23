package Shapes;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape implements Shape_interface {

    protected int width;
    protected int height;
    //As it is not static, it is NOT class specific but INSTANCE specific

    public Rectangle(int width, int height, Point top_corner_coordinates, Color color) {
        super(top_corner_coordinates, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
    g.setColor(color);
    g.fillRect (center.x, center.y, width, height);
    }
}
/*
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(center.x, center.y , width, height);

    }

    @Override
    public java.awt.Rectangle getBounds() {
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
    //It is a method of the class Shapes.Rectangle, so it is one of its attributes. I.e. rectangle.draw(g)!!}
}*/
