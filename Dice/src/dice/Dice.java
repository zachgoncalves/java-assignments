
package dice;

public class Dice {
        
    public int sideCount;
    
    public final int roll() {
        return (int) (((Math.random() * sideCount) + 1));
    }
    
}
