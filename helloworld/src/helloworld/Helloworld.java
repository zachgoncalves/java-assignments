package helloworld;

import java.util.Scanner;

public class Helloworld {
    
    public static void printDiamond(){
    
        printUp();
        printV();
        
    }
    
    public static void printUp() {
    
        System.out.println("  *  ");
        System.out.println(" * * ");
        System.out.println("*   *");
        
    }
    
    public static void printV() {
    
        System.out.println("*   *");
        System.out.println(" * * ");
        System.out.println("  *  ");  
    }
    
    
    public static void main(String[] args) {
        String s = "Hello";
        
        int y = 7;
        char c = 'y';
        double a = 7.01;
        boolean b = false;
        
        double acceleration = 20;
        double averageSpeed = 5;
        double timeTraveled = 8.5;
        double distanceTraveled = 0.5 * acceleration * timeTraveled * timeTraveled + averageSpeed * timeTraveled; 
    
        System.out.println(distanceTraveled);
      
        System.out.println("Hello World!");
        Scanner keyboard = new Scanner(System.in);
        
        
        
        Object o = new Object();
        
        System.out.println(o);
        String input = keyboard.nextLine();
        
        System.out.println(input);
        
        String word1 = "Hello, ";
        String word2 = "World!";
        
        // string concadonation 
        System.out.println(word1 + word2);  
        
        printDiamond();
        printV();
        printUp();
        
        int i = 2;  // shorthand values for the operators
        i = i +2;   // i = += 2; 
        i = i +1;   // i++; (increments value by 1) 
        System.out.println(i);
        
    }
    
}
 