
package primetest;

import java.util.Scanner;

public class PrimeTest {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean done = false;
        
        while(!done){ 
            System.out.println("Enter any number, and I will tell you if it is prime.");
            String input = kb.nextLine();
            
            int x = Integer.parseInt(input);
            boolean isPrime = true;
            
            for(int i = 2; i <= Math.sqrt(x); i++) {
                if(x % i == 0) {
                    isPrime = false; 
                    System.out.println(i);
                }
            }

            if(isPrime) {
                System.out.println("The number was prime.");
            } else {
                System.out.println("The number was not prime.");
            }
            
            System.out.println("Are you done? Enter y/n");
            input = kb.nextLine();
            if(input.equals("y")) {
                done = true;
            }
        }
        
        
    }
    
}
