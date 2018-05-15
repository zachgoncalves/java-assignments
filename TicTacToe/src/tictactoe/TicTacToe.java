
package tictactoe;

import java.util.*;

public class TicTacToe {

    private static final int NUM_ROWS_AND_COLS = 3;
    
    private static final char[] markFor = {'X', 'O'};

    private char[][] board;   
    private int currentPlayer = 0;  

   
    private void initBoard() {
        board = new char[NUM_ROWS_AND_COLS][NUM_ROWS_AND_COLS];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }    
    
    private boolean hasWinner(int rowPlayed, int colPlayed) {

        // check if row is a winner
	boolean foundWinner = true;
	for (int i = 0; i < board[rowPlayed].length; i++) {
	    if (board[rowPlayed][i] != board[rowPlayed][colPlayed]) {
		foundWinner = false;
	    }
	}
	if (foundWinner) return true;

	// check if column is a winner
	foundWinner = true;
	for (int i = 0; i < board.length; i++) {
	    if (board[i][colPlayed] != board[rowPlayed][colPlayed]) {
		foundWinner = false;
	    }
	}
	if (foundWinner) return true;

        // check if top left to bottom right is a winner
	foundWinner = true;
	for (int i = 0; i < board.length; i++) {
	    if (board[i][i] != board[rowPlayed][colPlayed]) {
		foundWinner = false;
	    }
	}
	if (foundWinner) return true;

        // check if bottom left to top right is a winner
	foundWinner = true;
	for (int i = 0; i < board.length; i++) {
	    if (board[i][NUM_ROWS_AND_COLS-i-1] != board[rowPlayed][colPlayed]) {
		foundWinner = false;
	    }
	}
	if (foundWinner) return true;

        return false;
    }
    
    private boolean isBoardFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;  
                }
            }
        }
        return true;
    }
    
    private boolean isPositionEmpty(int row, int col) {
        if (row < 0 || row >= board.length ||
	        col < 0 || col >= board[row].length) {
            System.out.println("No Such Position: " + row + "," + col);
            System.out.println("Exiting Program");
            System.exit(0);
        }
        
        return board[row][col] == ' ';
    }
    
    private void setPosition(int row, int col) {
        if (row < 0 || row >= board.length ||
	        col < 0 || col >= board[row].length) {
            System.out.println("No Such Position: " + row + "," + col);
            System.out.println("Exiting Program");
            System.exit(0);
        }
        
	board[row][col] = markFor[currentPlayer];

    }
    
    private void printBoard() {
        int i, j;
        for (i = 0; i < board.length; i++) {
            for (j = 0; j < board[i].length; j++) {
                System.out.print("[" + board[i][j] + "] ");
            }
            System.out.println();
        }
    }
    
    public void play() {
        initBoard();
        System.out.println("Lets play Tic Tac Toe!");
        System.out.println("Player 1 (X) goes first.");
        
        boolean noWinner = true;
        Scanner keyboard = new Scanner(System.in);

        while(noWinner){
            printBoard(); 
            
            int desiredRow;
            int desiredCol;

            System.out.println("Player " + markFor[currentPlayer] +": It is your turn.");
            
            System.out.println("Please enter row between 0 and "+ (NUM_ROWS_AND_COLS - 1)+":");
            desiredRow = keyboard.nextInt();
            System.out.println("Please enter column between 0 and "+ (NUM_ROWS_AND_COLS - 1)+":");
            desiredCol = keyboard.nextInt();
            
            boolean isValidRow = false;
            boolean isValidCol = false;
            while(!isValidRow || !isValidCol) {
                if (desiredRow < 0 || desiredRow >= NUM_ROWS_AND_COLS) {
                    System.out.println("Please enter a valid row.");
                    isValidRow = false;
                } else {
                    isValidRow = true;
                }
                if (desiredCol < 0 || desiredCol >= NUM_ROWS_AND_COLS) {
                    System.out.println("Please enter a valid column");
                    isValidCol = false;
                } else {
                    isValidCol = true;
                }
                if (isValidRow && isValidCol) {
                    if (!isPositionEmpty(desiredRow, desiredCol)) {
                        System.out.println("This spot is already filled.");
                        isValidCol = false;
                        isValidRow = false;
                    }
                }
                if (!isValidRow) {
                    System.out.println("Please enter new row.");
                    desiredRow = keyboard.nextInt();
                }
                if (!isValidCol) {
                    System.out.println("Please enter new column.");
                    desiredCol = keyboard.nextInt();
                }
            }
            
            setPosition(desiredRow, desiredCol);
            
            if (hasWinner(desiredRow, desiredCol)) {
                System.out.println("Player " + markFor[currentPlayer] + " wins!");
                printBoard();
                noWinner = false;
            }
            else if (isBoardFull()) {
                System.out.println("The game is tied, everybody wins! (or loses)");
                printBoard();
                noWinner = false;
            }

            currentPlayer = 1 - currentPlayer;
            
        }

        System.out.println("Thanks for playing!");
        
    }

}
