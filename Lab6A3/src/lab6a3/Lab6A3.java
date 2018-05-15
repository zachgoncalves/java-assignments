
package lab6a3;

public class Lab6A3 {
    
    public static void main(String[] args) {
        Movie First = new Movie(); 
        First.setMovieName("Defiance");
        First.setMovieRating("M");
        First.addReview(5);
        First.addReview(3);
        First.addReview(4);
        First.addReview(2);
        First.addReview(1);
        
        System.out.println(First.getMovieName() + "\nRated: " + First.getMovieRating() + "\n" + "It has " + First.getAverage() + " stars out of 5.");
        
        Movie Second = new Movie(); 
        Second.setMovieName("Hunger Games");
        Second.setMovieRating("PG-13");
        Second.addReview(4);
        Second.addReview(4);
        Second.addReview(2);
        Second.addReview(2);
        Second.addReview(1);
        
        System.out.println(Second.getMovieName() + "\nRated: " + Second.getMovieRating() + "\n" + "It has " + Second.getAverage() + " stars out of 5.");
    }

}
