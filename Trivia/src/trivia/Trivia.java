
package trivia;

public class Trivia {
    
    private String question; 
    private String answer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    
    public String getAnswer() {
        return answer;
    }  
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    
}

/*

Define a Trivia class that contains information about a single 
trivia question. The question and answer should be defined as 
instance variables of type String. Create accessor and mutator 
methods. In your main method, create two trivia objects with 
questions and answers of your choice. Then for each Trivia 
object, have your program ask the question, input an answer, 
compare the typed answer to the actual to the actual answer, 
and output if the user’s answer was correct or incorrect.

*/
