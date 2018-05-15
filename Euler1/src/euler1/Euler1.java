/* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
*/ 
package euler1;


public class Euler1 {

    public static void main(String[] args) {
        
        int x = 3;
        int y = 5;
        int limit = 10000;
        
        int sum = 0;
        // iitialization ; precondition ; poststatement 
        for( int i = 0; i < 1000; i++) {
            System.out.println(i); 
            if (i % 3 == 0  || i % 5 == 0) {
                sum += i;
            } 
        }
        System.out.println(sum);
    
    }
    
}
