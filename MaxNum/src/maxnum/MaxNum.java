
package maxnum;

import java.util.Scanner;

public class MaxNum {

    public static void main(String[] args) {
        
        System.out.println("Please enter numbers, and I will tell you the largest. Enter a negative number to stop.");
        
        Scanner kb = new Scanner(System.in);
        
        int input;
        int largest = 0; 
        
        do {
            input = kb.nextInt();
            if(input > largest) {
                largest = input;
            }
            
        } while(input >= 0);
        
        System.out.println(largest);
        
    }
    
}
