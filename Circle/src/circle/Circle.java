
package circle;

import java.util.ArrayList;

public class Circle {
    
    public final int NUM_DEGRESS = 360; 
    public final double PI = 3.141592;
    public double radius; 
    public double x;
    public double y;
    
    public Circle() {
        this.radius = 1; 
        this.x = 0;
        this.y = 0;
    }
    
    public Circle(double radius) {
        this();
        this.radius = radius;
    }    
    
    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y; 
    }
    
    public String toString() {
        return radius + " [" + x + ", " + y + "]"; 
    }
    
    public static void main(String[] arg) {
        ArrayList list = new ArrayList();
        for (int i = 0; i <1000000; i++) {
            Circle c = new Circle(i);
            list.add(c);
        }
        
        Circle c = new Circle(15, 2, 5);
        System.out.println(c);  
        
        
    }
}
