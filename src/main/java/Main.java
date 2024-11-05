import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(100, 100);
    Drawing drawing = new Drawing(50,point,Color.red);
    Frame frame = new Frame();
    frame.add(drawing);

    //Calling methods of the drawing object
    drawing.setSize(400, 400);
    drawing.setBackground(Color.pink);

    //Calling methods of the frame object
    frame.setLayout(null);
    frame.setSize(800, 600);
    frame.setVisible(true);

    frame.addWindowListener(new WindowAdapter() {
        /*it is how WindowAdapter works. WindowListener would have overwritten every
        method in the WindowListener of frame, but WindowAdapter allows to only overwrite
        the ones we are interested in
         */
        public void windowClosing(WindowEvent e) {
            frame.dispose();
        }
    });


    }
}
