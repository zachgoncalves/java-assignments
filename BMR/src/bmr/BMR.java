package bmr;

/**
 *
 * @author tug64510
 */

import java.util.Scanner;

public class BMR {

    public static void main(String[] args) {
        double weight, height, age, gender; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Plese enter your weight (in pounds.)");
        weight = input.nextInt(); 
            

        System.out.println("Please enter your height (in inches.)");
        height =  input.nextInt();
        
        System.out.println("Please enter your age (in years.)");
        age = input.nextInt();
        
        double woman = 655.1 + (4.35*weight) + (4.7*height) - (4.7*age);
        double chocof = (int) (woman / 214);
        
        double man = 66 + (6.2*weight) + (12.7*height) - (6.76*age);
        double chocom = (int) (man / 214);
   
    
        System.out.println("If you are a woman, you should eat " + chocof + " chocolate bars");
        System.out.println("If you are a man, you should eat " + chocom + " chocolate bars");
        
    }
    
}