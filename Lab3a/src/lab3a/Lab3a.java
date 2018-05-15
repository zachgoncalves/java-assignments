/*
 
Write a program that asks the user to enter the size of a triangle (an integer from 1 to 50). 
Display the triangle by writing lines of asterisks. 
The first line will have one asterisk, the next will have two, and so on,
with each line having one more asterisk than the previous line, up to and 
including the number entered by the user. On the next line write one fewer 
asterisk and continue by decreasing the number of asterisks by 1 for each 
successive line until only one asterisk is displayed.

*/
package lab3a;

import java.util.Scanner;

public class Lab3a {
    
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
