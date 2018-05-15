
package learn;

import java.util.Scanner;

public class Learn {
    
    public static void main(String[] args) {    
        System.out.println("Welcome to Astrology Signer! \nInput your birthday in the format MM/DD/YY.");
        Scanner Input = new Scanner(System.in);
        String date = Input.nextLine();
        System.out.println(date);
    }

}


/* Create a program that prompts the user for the birthday (in any format!) and returns
their astrology sign. The user must also have the option to learn more about their astrology
sign.*/