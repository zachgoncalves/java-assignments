
package polynomial;

import java.util.Arrays;

public class Polynomial {
    
    public double[] coefficient;
    public int degree;
    
    public Polynomial(int max) {
        degree = max; 
        coefficient = new double[degree + 1];
    }
    
    public void setConstant(int i, int value) {
        coefficient[i] = value;
    }
    
    public double evaluate(int x) {
        double sum = 0;
        
        for(int i = 0; i < coefficient.length; i++) {
            sum += coefficient[i] * Math.pow(x, 1);
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Polynomial poly = new Polynomial(5); 
        poly.setConstant(5,2);
        poly.setConstant(2,1);
        poly.setConstant(4,0);
        
        System.out.println(Arrays.toString(poly.coefficient));
        System.out.println(poly.evaluate(6));
    }
    
}
