
package stringcoll;

import java.util.*;

public class Stringcollclient {
    
   public static final String SENTINEL = "###";

   public static void main(String[] args)
   {
      String value; 
      Scanner keyboard=new Scanner(System.in);
      Stringcoll P=new Stringcoll(), N=new Stringcoll(), L= new Stringcoll();
      
      char add = '+';
      char remove = '-';
      System.out.println("Enter a string by adding a + in front of it, remove a string with a -,  or type ### to quit:");
      value=keyboard.nextLine();
      String insertedString = value.substring(1);
            
      while(!value.equals(SENTINEL)) {
         if (value.charAt(0) == add) {
             P.insert(insertedString); L.insert(insertedString);
         } else if(value.charAt(0) == remove) {
             N.insert(insertedString); L.omit(insertedString);
         }
         System.out.println("Enter next string to be inserted or ### to quit:");
         value=keyboard.nextLine();
         insertedString = value.substring(1);
      }
      System.out.println("\nThe values in collection P are:");
      P.print();
      System.out.println("\nThe values in collection N are:");
      N.print();
      System.out.println("\nThe values in collection L are:");
      L.print();
      if (P.equals(N)) System.out.println("\nP and N are equal.");
      else System.out.println("\nP and N are NOT equal.");
      Stringcoll A=new Stringcoll(); 
      A.copy(L);
      System.out.println("\nThe values in the copy of L are:\n");
      A.print();
   }
    
    
    
}
