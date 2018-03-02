import java.awt.*;
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle implements Shape
{
    // instance variables - replace the example below with your own
    private int l, w;
    private double radius;
    private Color c;
    

    /**
     * Constructor for objects of class Circle
     */
    public Rectangle(int l, int w, double radius, Color c)
    {
        // initialise instance variables
        this.l = l;
        this.w = w;
        this.radius = radius;
        this.c = c;
    }

    /**
     * All shapes must have a draw method
     *
     * @param  g Graphics object must be passed in
     * @return   none
     */
    public void draw(Graphics g){
        g.setColor(c);
        g.fillRect(l, w, (int)radius * 2, (int)radius * 2);
        //String perArea = "Perim: " + perimeter() + " Area: " + area();
        String perArea = "Perim: " + String.format("%.3f", perimeter()) + " Area: " + String.format("%.3f",area());
        g.drawString( perArea, l, w -10);
    }
    /**
     * All shapes must have a perimeter method
     *
     * @param    none
     * @return   perimeter
     */
    public double perimeter(){
        return 2 * (l + w);
    }
    /**
     * All shapes must have an area method
     *
     * @param    none
     * @return   area
     */
    public double area(){
        return l * w;
    }
}
