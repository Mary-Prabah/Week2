/*import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;


import java.awt.*;
import java.util.ArrayList;*/
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape_interface;
import Shapes.Square;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends Canvas {//It extends the already existing method Canvas


    ArrayList<Shape_interface> shapes = new ArrayList<>();
    public Drawing() {
        // Create different shapes and add them to the list
        Shape_interface circle =  new Circle(50, new Point(100, 100), Color.yellow);
        Shape_interface rectangle =  new Rectangle(100, 50, new Point(50, 50), Color.red);
        Shape_interface square = new Square(30, new Point(50, 50), Color.blue);

        // Add shapes to the ArrayList
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);
    }


  /*  public Drawing() {
        Shape circle = new Circle(50, new Point(100, 100), Color.yellow);
        Shape rectangle = new Rectangle(100, 50, new Point(50, 50), Color.red);
        Shape square = new Square(30, new Point(50, 50), Color.blue);
        shapes.add(circle);
        shapes.add (rectangle);
        shapes.add (square);
        // You need to put Point!!! Because, before you had not yet instantiated the object of type point!!
        //this.rectangle = new Shapes.Rectangle(100, 50, new Point(50, 50), Color.red);
        //I guess Color is not instantiated because we are using a class method and NOT creating an object

    }*/



 /* //overwrites the paint method
    public void paint(Graphics g) {
        for (Shape shape : shapes) {
            shape.wait(g);

*/

  public void paint(Graphics g) {
       for (Shape_interface shape : shapes) {
           shape.draw(g);
        } ;
   }
/*
        //circle.draw(g); //i.e. calls the drawing method in circle!
        //It is an extension of the Graphics method, so I am not too sure
        //Either way, the color is different for everyone as we said circle is blue,
        //rectangle is red, and square is green
       // rectangle.draw(g);
       // square.draw(g);

*/
}
