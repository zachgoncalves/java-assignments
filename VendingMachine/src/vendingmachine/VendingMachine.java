package vendingmachine;

import java.util.Scanner; 


public class VendingMachine {

    public static void main(String[] args) {
        
        int originalAmount, amount, quarters, dimes, nickels, pennies;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of cents from 1 to 99 cents. ");
        
        originalAmount = keyboard.nextInt();
                
        amount = originalAmount;       
        quarters = amount / 25; 
        System.out.println(quarters + " quarters");

        amount = amount % 25;       
        dimes = amount / 10;
        System.out.println(dimes + " dimes");
        
        amount = amount % 10;
        nickels = amount / 5;
        if(nickels != 0) {
            System.out.println(nickels + " nickels");
        }
                
        amount = amount % 5;
        pennies = amount / 1; 
        System.out.println(pennies + " pennies");
        
        

    }
    
}
