
package lab4c;

public class Lab4c {

    public static void main(String[] args) {
        
        boolean uniqueNumber = false;
        
        int address = 0; 
        int target = 0;
        
        for (address = 1000; address <= 9999; address++) {         
            
            int ones = address % 10;
            int tens = address/10 % 10;
            int hundreds = address/100 % 10; 
            int thousands = address/1000 % 10; 
                      
            
            if ((ones % 2 != 0) && (thousands == 3 * tens) && (ones + tens + hundreds + thousands == 27) && (ones != tens) && (ones != hundreds) && (ones != thousands) && (tens != hundreds) && (tens != thousands) && (hundreds != thousands)) {
                uniqueNumber = true;
                target = address;
            } 
        }
        System.out.println("Batman, we figured it out!");
        System.out.println("The Riddler plans to strike at " + target + " Pennsylvania Avenue, hurry!"); 
        
    }

}
