
package oop;

public class Arrays {
    
    public static void main(String[] args) {
        
        final int SIZE = 5;
        
        double[] temps;
        double x = 1.0;
        // Base_Type[] Array_Name = new Base_Type[Length];
        temps = new double[SIZE]; 
        
        // array.length is the size of the array 
        for(int i = 0; i < temps.length; i++) {
            temps[i] = 1.0 * 10;
        }
        
        for(int i = 0; i < temps.length; i++) {
            System.out.println(temps[i]);
        }
    }
    
}