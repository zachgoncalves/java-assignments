
package oop;

import java.util.Scanner;

public class PlayPen {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int happyAge = kb.nextInt();
        Dog d = new Dog();
        d.name  = "Max";
        d.age   = happyAge;
        d.breed = "Terrier";
        
        System.out.println(d.name);
        d.bark();
        d.dogYears();
        
        String r = "rock"; 
        d.catchObject("Stick");
        d.catchObject(r);
        
    }
    
}
