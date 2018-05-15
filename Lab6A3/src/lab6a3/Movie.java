
package lab6a3;

public class Movie {
    
    private String movieName;
    private String movieRating;
    private int oneStar, twoStar, threeStar, fourStar, fiveStar; 

    public String getMovieName() {
        return movieName;
    }  
    
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    public int getOneStar() {
        return oneStar;
    }

    public void setOneStar(int oneStar) {
        this.oneStar = oneStar;
    }
    
    public int getTwoStar() {
        return twoStar;
    }

    public void setTwoStar(int twoStar) {
        this.twoStar = twoStar;
    }

    public int getThreeStar() {
        return threeStar;
    }

    public void setThreeStar(int threeStar) {
        this.threeStar = threeStar;
    }
    
    public int getFourStar() {
        return fourStar;
    }
    
    public void setFourStar(int fourStar) {
        this.fourStar = fourStar;
    }
    
    public int getFiveStar() {
        return fiveStar;
    }
   
    public void setFiveStar(int fiveStar) {
        this.fiveStar = fiveStar;
    }
    
    public void addReview(int stars) {
        if (stars >= 1 && stars <= 5) {
            switch (stars) {
                case 1: 
                    oneStar++; 
                    break;
                case 2:
                    twoStar++;
                    break;
                case 3: 
                    threeStar++;
                    break;
                case 4:
                    fourStar++;
                    break;
                case 5: 
                    fiveStar++;
                    break;
            }

        }
    }
    
    public double getAverage() {
        return ((oneStar + twoStar * 2 + threeStar * 3 + fourStar * 4 + fiveStar * 5) / 5.0);
    }
    
}
