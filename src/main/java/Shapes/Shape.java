package Shapes;

import java.awt.*;

public abstract class Shape {
    protected Point center;
    protected Color color;

    public Shape(Point center, Color color) {
        this.center = center;
        this.color = color;
    }

    public abstract void draw(Graphics g);
}

//You have to use implement 'cuz you cannot call an abstract class/method unless it is for "super"