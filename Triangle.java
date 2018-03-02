import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle implements Shape
{
    Scanner user = new Scanner(System.in);
    private int height;
    private int width;
    private int x;
    private int y;
    private int[] xCoors;
    private int[] yCoors;
    private Color c;
    
    
    /**
     * Constructor for objects of class Circle
     */
    public Triangle(int a, int b, int d, double radius, Color z)
    {
        // initialise instance variables
        this.height = height;
        this.b = b;
        this.radius = radius;
        this.c = c;
        this.z = z;
    }

    /**
     * All shapes must have a draw method
     *
     * @param  g Graphics object must be passed in
     * @return   none
     */
    public void drawPoints(Graphics g){
    g.setColor(z);
    g.fillPolygon(xValues, yValues, 3);
    // String perArea = "Perim: " + perimeter() + " Area: " + area();
    String perArea = "Perim: " + String.format("%.3f", perimeter()) + " Area: " + String.format("%.3f",area());
    }
    /**
     * All shapes must have a perimeter method
     *
     * @param    none
     * @return   perimeter
     */
    public double perimeter(){
        return a + b + c;
    }
    /**
     * All shapes must have an area method
     *
     * @param    none
     * @return   area
     */
    public double area(){
        return b / 2;
    }
}
