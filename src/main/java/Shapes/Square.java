package Shapes;

import java.awt.*;

public class Square extends Rectangle {
    public Square(int width, Point point_top_corner, Color color) {
        super(width,width,point_top_corner,color); //i.e. when square is instantiated, so is the instantiation of width, height,top_corner_coordinates and color)
    }

}
