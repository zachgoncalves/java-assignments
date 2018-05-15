
package lab4a;

import java.util.Scanner;

public class Lab4a {
    
    public static void main(String[] args) {
        System.out.println("Please enter a size from 1 to 50 and I will generate a triangle!");
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        
        // initialization ; precondition ; poststatement 
        for(int i = 1 ; i <= size ; i++) {
            for(int k = 1; k <= i; k++ ) {
                System.out.print("*");
            }
            System.out.print("\n");
            
        }
       
        for(int i = size - 1  ; i > 0 ; i--) {
            for(int k = 1; k <= i; k++ ) {
                System.out.print("*");
            }
            System.out.print("\n");
            
        }    
        
    }
    
}
