
package trivia;

import java.util.Scanner;

public class TriviaController {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        
        Trivia game = new Trivia();
        game.setQuestion("How can the net amount of entropy of the universe be massively decreased?");  
        game.setAnswer("INSUFFICIENT DATA FOR MEANINGFUL ANSWER");
       
        System.out.println(game.getQuestion());
        String guess = userInput.nextLine();
        if(guess.equalsIgnoreCase(game.getAnswer())) {
            System.out.println("Your answer is correct!");
        } else {
            System.out.println("Your answer is incorrect!");
        }
        
        
        Trivia game2 = new Trivia();
        game2.setQuestion("What Harvard dropout co-founded Microsoft?");  
        game2.setAnswer("Bill Gates");
        
        System.out.println(game2.getQuestion());
        guess = userInput.nextLine();
        if(guess.equalsIgnoreCase(game2.getAnswer())) {
            System.out.println("Your answer is correct!");
        } else {
            System.out.println("Your answer is incorrect!");
        }
                
        
    }
         
}

