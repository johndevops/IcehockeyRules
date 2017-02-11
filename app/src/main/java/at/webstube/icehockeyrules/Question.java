package at.webstube.icehockeyrules;

/**
 * Created by gerald.holzmeister on 10-Feb-17.
 */

public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question() {
        question = "What did Columbus discover?";
        answers = new String[]
                {
                        "America", "Coca Cola", "France", "Nothing"
                };
        correctAnswer = 0;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}