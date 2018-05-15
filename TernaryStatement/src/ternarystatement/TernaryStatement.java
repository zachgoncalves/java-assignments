
package ternarystatement;

import java.util.Scanner;


public class TernaryStatement {

    public static void main(String[] args) {
       
        while(true) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter a:");
        int a = kb.nextInt();
        
        System.out.println("Enter b:");        
        int b = kb.nextInt();
        
        int c = a > b ? a + 1 : a;
          /*  if(a > b) {           This is the ternary statement, but expanded as an if statement.
                c = a + 1;          It reads that c equals a + 1 if a > b, otherwise c = a. 
            } else {
                c = a; 
            }  */
        System.out.println("c is " + c);
   
        }
        
    }
    
}
