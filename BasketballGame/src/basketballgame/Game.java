
package basketballgame;

public class Game {
    
    public static void main(String[] args) {
        boolean homeTeam = true;
        boolean awayTeam = false;
        
        BasketballGame a = new BasketballGame("Philadelphia 76ers", "Los Angeles Lakers");
        BasketballGame c = new BasketballGame("clintons", "trumps");
        
        
        BasketballGame b = new BasketballGame();
        b.setTeams("Dogs", "Cats");
        b.penaltyShot(homeTeam);
        b.threePointer(awayTeam);
        System.out.println(b.getWinning() + " " + b.getHomeScore() + " - " + b.getAwayScore());
        
        System.out.println(a);
    }
}
