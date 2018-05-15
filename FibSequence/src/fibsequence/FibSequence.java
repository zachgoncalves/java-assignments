
package fibsequence;

public class FibSequence {

    public static void main(String[] args) {
        int limit = 4000000;
        int fib = 1;
        int fibn1 = 1;
        int fibn2 = 0;
        
        long sum = 0;
        while (fib < limit) {
            if(fib % 2 == 0) {
                System.out.println(sum);
                sum += fib;
            }
            
            System.out.println(fib);
            fibn2 = fibn1;
            fibn1 = fib;
            fib = fibn1 + fibn2;
        }
       
        System.out.println(sum);
    }
    
}
