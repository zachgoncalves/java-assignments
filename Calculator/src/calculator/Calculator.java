
package calculator;

import java.util.Scanner;

public class Calculator {
    
    public static String OperationOne   = "Multiplication";
    public static String OperationTwo   = "Division";
    public static String OperationThree = "Addition";
    public static String OperationFour  = "Substraction";
    
    
    public static void main(String[] args) {
        System.out.println("Type which operation you would like to perform. \n Multiplication \n Division \n Addition \n Subtraction \n -------------");
        
        Scanner userReplyRecorder = new Scanner(System.in);
        String userReply = userReplyRecorder.nextLine();
        
        if(userReply.equals(OperationOne)) {
            System.out.println("Type in two numbers you wish to multiply, and then type multiply.");
            boolean isMultiplying = true;
            
            Scanner multiplicationRecorder = new Scanner(System.in);            
            
                double multiplicand = multiplicationRecorder.nextDouble();
                double input1 =  multiplicand;
                 
                multiplicand = multiplicationRecorder.nextDouble();
                double input2 =  multiplicand;
                 
                String trigger = multiplicationRecorder.nextLine();
                
                if(trigger.equals("Multiply")) {
                    System.out.println("The answer is: " + input1 * input2);
                }
                 
            

            
        }
        
    }
    
}
