
package arrays;


public class Arrays {

    public static double findMax(double[] arr) {
        double biggest = arr[0];
        
        // find the biggest
        for(double num : arr) {
            if (num > biggest) {
                biggest = num;
            }
            
        }
        
        
        return biggest;
    }
    
    public static void main(String[] args) {
        
        double[] foo = {100.0, Math.PI * 10, Math.pow(10,10), -1, 35};
        
        
    }
    
}
