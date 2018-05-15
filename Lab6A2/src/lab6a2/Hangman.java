
package lab6a2;

public class Hangman {
    private String secretWord; 
    private String disguisedWord;
    private int guessCount;
    private int incorrectGuesses;
    private boolean isFound;
    
    public String getSecretWord() {
        return secretWord;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }
    
    public int getGuessCount() {
        return guessCount;
    }

    public void setGuessCount(int guessCount) {
        this.guessCount = guessCount;
    }
    
    public String getDisguisedWord() {
        return disguisedWord;
    }

    public void setDisguisedWord(String disguisedWord) {
        this.disguisedWord = disguisedWord;
    }
    
    public boolean IsFound() {
        return isFound;
    }

    public void setIsFound(boolean isFound) {
        this.isFound = isFound;
    }
    
    
    public void makeGuess(char a) {
        guessCount++;
        
        if (secretWord.contains(a + "")) {
            
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == a) {
                    disguisedWord = disguisedWord.substring(0, i) + a + disguisedWord.substring(i + 1);
                }
            }
            
        } else {
            incorrectGuesses++; 
        }
        
        if (getDisguisedWord().equals(getSecretWord())) {
            isFound = true;
        }
        
    }
    
    
}


/* 
Consider a class that could be used to play a game of hangman. The class
has the following attributes:
• The secret word
• The disguised word, in which each unknown letter in the secret word
has been replaced with a question mark (?). For example, if the secret
word is abracadabra and the letters a, b and e have been guessed, the
disguised word would be ab?a?a?a?ab?a.
• The number of guesses made.
• The number of incorrect guesses.


The class would have the following methods:
• makeGuess(char c) guesses that character c is in the word.
• getDisguisedWord() returns a String containing correctly guessed letters
in the correct positions and unknown letters replaced with ?.
• getSecretWord() returns the secret word.
• getGuessCount() returns the number of guesses made.
• isFound() returns true if the hidden word has been discovered.
Your task is to implement the class with the above variables and methods,
then implement a “game” of hangman using this class. Your program
doens’t need to draw anything.
*/ 