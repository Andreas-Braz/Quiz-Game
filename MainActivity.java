package com.example.quiz_game;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.example.quiz_game.QuestionRepository.randomQuestion;

public class MainActivity extends AppCompatActivity {

    private Button answer1;
    private Button answer2;
    private Button answer3;
    private Button answer4;

    private TextView question;

    private Question q_1, q_2, q_3, q_4, q_5;

    private Question [] questions_arr = new Question[] {};

    private String userAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the questions here.

        q_1 = new Question ("What is the capital of Brazil?",
                new String [] {"São Paulo", "Rio de Janeiro", "Salvador", "Brasilia"}, 3);

        q_2 = new Question ("Ringo Starr was a member from which musical group?",
                new String [] {"The Beatles", "The Rolling Stones", "The Doors", "The Beach Boys"}, 0);

        q_3 = new Question ("Mozart was born in which country?",
                new String [] {"Germany", "Austria", "France", "Belgium"}, 1);

        q_4 = new Question ("What is the name of the little dragon in the animated movie Mulan?",
                new String [] {"Shen Long", "A-ha", "Mushu", "Shyva"}, 2);

        q_5 = new Question ("What does USB stand for in the computer world?",
                new String [] { "Universal Serial Byte","Universal Service Bus", "Unix Serial Bus", "Universal Serial Bus"}, 3);


        // Put the questions in this array.
        questions_arr = new Question[] {q_1, q_2, q_3, q_4, q_5};


        question = (TextView) findViewById(R.id.QuestionRepository);

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        updateQuestion ();

        answer1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText() == userAnswer) {
                    updateQuestion ();
                } else {
                    answer1.setEnabled(false);
                }
            }
        });

        answer2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == userAnswer) {
                    updateQuestion ();
                } else {
                    answer2.setEnabled(false);
                }
            }
        });

        answer3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText() == userAnswer) {
                    updateQuestion ();
                } else {
                    answer3.setEnabled(false);
                }
            }
        });

        answer4.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText() == userAnswer) {
                    updateQuestion ();
                } else {
                    answer4.setEnabled(false);
                }
            }
        });

    }

        public void updateQuestion () {
            Question q = new Question(randomQuestion(questions_arr));
            question.setText(q.getQuestion());
            answer1.setText(q.getChoice(0));
            answer2.setText(q.getChoice(1));
            answer3.setText(q.getChoice(2));
            answer4.setText(q.getChoice(3));
            userAnswer = q.getR_answer();
            answer1.setEnabled(true);
            answer2.setEnabled(true);
            answer3.setEnabled(true);
            answer4.setEnabled(true);

            }

        }

