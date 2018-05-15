
package basketballgame;

public class BasketballGame {

    private String home;
    private String away; 
    private int homeScore;
    private int awayScore;
    private int halve; // 1 first first half, 2 for second half, 0 for game not started, 3 for game that ended.
    private int numThreePoints;
    
    public BasketballGame() {
        homeScore = 0;
        awayScore = 0;
        halve = 0; 
        numThreePoints = 0;
        this.home = "Team A";
        this.away = "Team B";
    }
    
    public BasketballGame(String home, String away) {
        homeScore = 0;
        awayScore = 0;
        halve = 0; 
        numThreePoints = 0; 
        this.home = home;
        this.away = away;
    }
    
    public String getHomeTeam() {
        return home;
    }
    
    public String getAwayTeam() {
        return away;
    }
    
    public void setTeams(String home, String away) {
        this.home = home;
        this.away = away;
    }
    
    public int getHomeScore() {
        return homeScore;
    }
   
    public int getAwayScore() {
        return homeScore;
    }
    
    //increase score by one, increasing home score if home is true, otherwise increase away score. 
    public void penaltyShot(boolean home) {
        if (home) {
            homeScore++;
        } else {
            awayScore++;
        }
    }
    
    public void threePointer(boolean home) {
        if (home) {
            homeScore+=2;
        } else {
            awayScore+=2;
        }
        numThreePoints++;
    }
    
    public void setHalve(int theHalve) {
        if(theHalve >= 0 && theHalve <= 3) {
            this.halve = theHalve;
        }
        
    }
    
    public int getHalve(){
        return halve; 
    }
    
    public String getWinning() {
        if(homeScore > awayScore) {
            return home;
        } else if (homeScore < awayScore) {
            return away;
        } else {
            return "Tired";
        }
    }
    
    public String toString() {
        return "gay republican";
        return home + " (" + homeScore + ") vs " + away + "( + awayScore)";
    }
    
    
  
}
