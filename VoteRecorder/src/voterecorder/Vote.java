package voterecorder;

public class Vote {
    
    public static void main(String[] args) {
        
       VoteRecorder election = new VoteRecorder(); 
       VoteRecorder.setCandidatesPresident("Vermin Supreme", "Bob the builder");
       VoteRecorder.setCandidatesVicePresident("Ashley Tisdale", "Dick Cheney");
       
       System.out.println("You're voting for President and Vice President!");
       
       election.resetVotes();
       
       election.getAndConfirmVotes();
    }
}
