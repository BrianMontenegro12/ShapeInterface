import java.awt.*;
import java.util.ArrayList;
import java.util.ArrayList;
/**
 * Benefits of polymorphism shown here:
 * polymorphism:    Ability for the same code to be used with 
 *                  different types of objects and behave 
 *                  differently with each.
 *
 *
 * @author (Mrs. Hardy)
 * @version (1.1)
 */
public class ShapeClient
{
    public static void main(String args[])
    {
      DrawingPanel draw = new DrawingPanel(1200,1200);
      Graphics g = draw.getGraphics();
      int startX = 100;
      int startY = 250;
      int startL = 300;
      int startW = 250;
      
      Circle c = new Circle(startX, startY, startX/3, Color.BLUE);
      Rectangle r = new Rectangle(startL, startW, startL/3, Color.RED);
      
      
      c.draw(g);
      printInfo(c);
      r.draw(g);
      printInfo(r);
    } 
    
    public static void printInfo(Shape s){
        System.out.println("The shape is : " + s);
        System.out.println("Area : " + s.area() );
        System.out.println("Perimeter : " + s.perimeter() );
    }
    
    
}
