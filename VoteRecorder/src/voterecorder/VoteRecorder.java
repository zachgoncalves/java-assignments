package voterecorder;

import java.util.Scanner;

public class VoteRecorder {

    private static String nameCandidatePresident1, nameCandidatePresident2;

    private static String nameCandidateVicePresident1, nameCandidateVicePresident2;

    private static int votesCandidatePresident1, votesCandidatePresident2;

    private static int votesCandidateVicePresident1, votesCandidateVicePresident2;

    private int myVoteForPresident, myVoteForVicePresident;

    public static void setCandidatesPresident(String name1, String name2) {
        nameCandidatePresident1 = name1;
        nameCandidatePresident2 = name2;
    }

    public static void setCandidatesVicePresident(String name1, String name2) {
        nameCandidateVicePresident1 = name1;
        nameCandidateVicePresident2 = name2;
    }

    public static void resetVotes() {
        votesCandidatePresident1 = 0;
        votesCandidatePresident2 = 0;
        votesCandidateVicePresident1 = 0;
        votesCandidateVicePresident2 = 0;
    }

    public static String getCurrentVotePresident() {
        return nameCandidatePresident1 + " has " + votesCandidatePresident1 + " votes, and " + nameCandidatePresident2 + " has " + votesCandidatePresident2 + " votes.";

    }

    public static String getCurrentVoteVicePresident() {
        return nameCandidateVicePresident1 + " has " + votesCandidateVicePresident1 + " votes, and " + nameCandidateVicePresident2 + " has " + votesCandidateVicePresident2 + " votes.";

    }

    public void getAndConfirmVotes() {
        if (confirmVotes()) {
            recordVotes();
        } else {
            System.out.println("Votes not recorded.");
        }
    }

    private int getAVote(String name1, String name2) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Press 1 for " + name1 + " or 2 for " + name2);
        int answer = kb.nextInt();
        return answer;
    }

    private void getVotes() {
        myVoteForPresident = getAVote(nameCandidatePresident1, nameCandidatePresident2);
        myVoteForVicePresident = getAVote(nameCandidateVicePresident1, nameCandidateVicePresident2);

    }

    private boolean confirmVotes() {
        //a private method that displays a persons vote for pres- ident and vice president,
        // asks whether the voter is happy with these choices, and returns true or false according to a yes-or-no response

        getVotes();

        switch (myVoteForPresident) {
            case 0:
                System.out.println("No vote for President will be casted.");
                break;
            case 1:
                System.out.println("You voted for Presidential Candidate " + nameCandidatePresident1);
                break;
            case 2:
                System.out.println("You voted for Presidential Candidate " + nameCandidatePresident2);
                break;
            default:
                break;
        }

        switch (myVoteForVicePresident) {
            case 0:
                System.out.println("No vote for Vice President will be casted.");
                break;
            case 1:
                System.out.println("You voted for Vice Presidential Candidate " + nameCandidateVicePresident1);
                break;
            case 2:
                System.out.println("You voted for Vice Presidential Candidate " + nameCandidateVicePresident2);
                break;
            default:
                break;
        }
        System.out.println("Are you satisfied with these results? Enter 'Yes' or 'No'");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        return choice.equalsIgnoreCase("Yes");
    }

    private void recordVotes() {
        if (myVoteForPresident == 0) {
            System.out.println("You did not vote for President.");
        }
        if (myVoteForPresident == 1) {
            votesCandidatePresident1++;
        }
        if (myVoteForPresident == 2) {
            votesCandidatePresident2++;
        }
        if (myVoteForVicePresident == 0) {
            System.out.println("You did not vote for Vice President.");
        }
        if (myVoteForVicePresident == 1) {
            votesCandidateVicePresident1++;
        }
        if (myVoteForVicePresident == 2) {
            votesCandidateVicePresident2++;
        }
    }

}
