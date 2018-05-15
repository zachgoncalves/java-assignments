
package whiledemo;

import java.util.Scanner; 

public class WhileDemo {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Please enter your grades.");
        System.out.println("Would you like to enter a number?");
        
        String choice = kb.nextLine();
        int sum = 0;
        int count = 0;
        
        while(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
            System.out.println("Enter a number");
            int input = Integer.parseInt( kb.nextLine() ); 
            
            sum += input; // sum = sum + input
            count++; // short for count = count + 1
            
            System.out.println(sum);
            System.out.println(sum/count);
            
            System.out.println("Would you like to enter another number?");
            choice = kb.nextLine();
        }
        
        /*
        do {
            input = kb.nextInt();
 
            if(input >= 0) {
                sum = sum + input;
                count++;
            }
        } while(input >= 0);
        
       
        while(input >= 0) {
            sum = sum + input;
            input = kb.nextInt();
            if(input >= 0 ) {
                count++;
            }
            
        }
        */
                
        
    }
    
}
