package lab4b;

import java.util.Scanner;

public class Lab4b {

    public static void main(String[] args) {
        System.out.println("Let's simulate a bouncing ball!");
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a velocity:");
        
        int velocity = kb.nextInt();
        int ballHeight = 0;
        int bounce = 0; 
        
        System.out.println("Time: 0 " + "Height: " + ballHeight);
        
        for (int time = 1; bounce < 5; time++) {
            ballHeight = ballHeight + velocity;
            velocity = velocity - 32;
            
            if(ballHeight < 0) {
                ballHeight = (int) (-.5 * ballHeight); 
                velocity = (int) (-0.5 * velocity);
                bounce++;
                System.out.println("Bounce!");       
            }
            System.out.println("Time: " + time + " Height: " + ballHeight);        }
        
    }

}