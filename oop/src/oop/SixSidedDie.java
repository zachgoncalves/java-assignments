
package oop;

public class SixSidedDie {
    
    public static final int NUM_SIDES = 6;
    private int top; 
    
    public SixSidedDie() {
        this(1);
    }
    
    public SixSidedDie(int initialValue) {
        top = initialValue;
    }
    
    public int roll() {
        int newVal = (int) (Math.random() * 5 + 1);
        System.out.println(newVal);
        
        return top;
    }
    
    private void setTop(int i) {
        top = i;
    }
    
    public static void main(String[] args) {
        SixSidedDie d = new SixSidedDie();
        int numDice = 100;
        SixSidedDie[] dice = new SixSidedDie[numDice]; 
        
        for(int i = 0; i < numDice; i++) {
            dice[i] = new SixSidedDie();
        }
        
        for(SixSidedDie die : dice) {
            System.out.println(die.roll());
        }        
        
    }

}
