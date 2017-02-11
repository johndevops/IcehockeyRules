package at.webstube.icehockeyrules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayQuestion();
        displayAnswer();
    }

    public void submitAnswer(View view) {

    }

    private String getAnswer() {
        String answer = "a";
        return answer;
    }

    private int getQuestionNumber() {
        int number = 1;
        return number;
    }

    private void displayQuestion() {
        TextView questionView = (TextView) findViewById(R.id.text_current_question);
        Question q = new Question();
        questionView.setText(q.getQuestion());
    }

    private void displayAnswer() {
        TextView answerView = (TextView) findViewById(R.id.text_current_answer);
        Question q = new Question();
        answerView.setText(q.getAnswers()[0]);
    }

    private String createBulletPointList(String[] answers){
        for (String item: answers) {

        }
    }
}
