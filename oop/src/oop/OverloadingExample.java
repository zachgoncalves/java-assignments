
package oop;

public class OverloadingExample {
    
    public static void handles(int i) {
        System.out.println(i + " is an int!");
    }
    
    public static void handles(double d) {
        System.out.println(d + " is a double!");
    }    
    public static void main(String[] args) {
       handles(4); 
       handles(4.0);
    }
}
