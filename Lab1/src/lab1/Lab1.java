
package lab1;

import java.util.*;

public class Lab1 {
    private int[] c;

    public static void main(String[] args) {
       Lab1 A = new Lab1();
       A.show();
       A.enlarge();
       A.fill();
       A.show();
    }

    public Lab1() {
       System.out.println("Enter the array size");
       Scanner keyboard = new Scanner(System.in);
       int n = keyboard.nextInt();
       c = new int[n]; 
       int i = 0;
       
       while (i<n) {
          System.out.println("Enter an integer");
          c[i] = keyboard.nextInt();
          i++;
       }
    }

    // Double the size of the User Supplied Array
    public void enlarge() {        
        
        // Create new array with the enlarged length 
        int[] enlargedArray = new int[c.length * 2];
        
        // Pass User Supplied Array's items into the new array 5
        for(int i = 0; i < c.length; i++) {
            enlargedArray[i] = c[i];
        }
        // Set User Supplied Array to the new Enlarged Array
        c = enlargedArray; 

        // Alert user that array was doubled.
        System.out.println("The Array has been doubled!");
    }

    public void fill() {
       Scanner keyboard=new Scanner(System.in);
       int n=c.length;
       int i=n/2;
       while (i<n)
       {
          System.out.println("Enter an integer");
          c[i]=keyboard.nextInt();
          i++;
       }
    }

    public void show() {
       System.out.println("The array entries are:");
       int i=0;
       int n=c.length;
       while (i<n) {
          System.out.println(c[i]);
          i++;
       }
    }
}




