
package dice;

public class Driver {

    public static int rollAllDice(Dice[] dice) {
        int sum = 0;
        for (Dice d : dice) {
            sum += d.roll();
        }
        return sum;
    }

    public static void main(String[] args) {
        Dice[] player1 = new D4[4];
        Dice[] player2 = new D4[4];

        for (int i = 0; i < player1.length; i++) {
            player1[i] = new D4();
        }

        for (int i = 0; i < player2.length; i++) {
            player2[i] = new D4();
        }

        System.out.println("Each player will roll 4 D4s. The player with the highest sum wins!");

        int p1sum = rollAllDice(player1);
        int p2sum = rollAllDice(player2);

        System.out.println("Player 1: " + p1sum + "\n" + "Player 2: " + p2sum);

        if (p1sum > p2sum) {
            System.out.println("Player 1 wins!");
        } else if (p1sum == p2sum) {
            System.out.println("Draw!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
