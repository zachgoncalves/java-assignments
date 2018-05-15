
package possystem;

import java.util.ArrayList;
import java.util.Scanner;

public class POSSystem {
    
    public static void main(String[] args) {
        
    }
    
    public static void populateMenu() {
        ArrayList menu = new ArrayList();
        System.out.println("Please type which menu items you would like to add, seperate with a comma by their price. Type finish to stop inputting items.");
        Scanner input = new Scanner(System.in);
        String key = "finish";
        String menuItem = input.nextLine();
        if(!key.equals(menuItem)) {
            menu.add(menuItem);
        }
        while(!key.equalsIgnoreCase(menuItem)) {
            menuItem = input.nextLine();
            menu.add(menuItem);
            if(key.equals(menuItem)) {
                menu.remove(menuItem);
            }
        }
    }
    
    public static void printMenu(ArrayList inputMenu) {

    }
    
    public static void menuList() {

    }        

    
    public static int calculateCost(int mainDish, int sideDish, int drink) {
        int cost = 0; 
        return cost;
    }
    
}
