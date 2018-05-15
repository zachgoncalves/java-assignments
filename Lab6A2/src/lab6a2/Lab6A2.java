
package lab6a2;

public class Lab6A2 {

    public static void main(String[] args) {
        Hangman game = new Hangman(); 
        
        game.setSecretWord("buffalo");
        game.setDisguisedWord("???????");
        
        System.out.println("The secret word is: " + game.getDisguisedWord());
        
        System.out.println("");
        
        game.makeGuess('f');
        System.out.println("Currently Revealed: " + game.getDisguisedWord());
        System.out.println("Number of guesses: " + game.getGuessCount());
        
        System.out.println("");
        
        game.makeGuess('o');
        System.out.println("Currently Revealed: " + game.getDisguisedWord());
        System.out.println("Number of guesses: " + game.getGuessCount());
        
        System.out.println("");
        
        game.makeGuess('x');
        System.out.println("Currently Revealed: " + game.getDisguisedWord());
        System.out.println("Number of guesses: " + game.getGuessCount());
        
        System.out.println("");
        
        game.makeGuess('c');
        System.out.println("Currently Revealed: " + game.getDisguisedWord());
        System.out.println("Number of guesses: " + game.getGuessCount());
        
        System.out.println("");
        
        game.makeGuess('r');
        System.out.println("Currently Revealed: " + game.getDisguisedWord());
        System.out.println("Number of guesses: " + game.getGuessCount());
        
        if (game.IsFound() == true ) {
            System.out.println("The secret word is " + game.getSecretWord());
        } else {
            System.out.println("You did not find the secret word in time! The word was " + game.getSecretWord());
        }
        
        
    }
    
}
