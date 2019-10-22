package com.example.quiz_game;
import java.util.Random;

public class QuestionRepository extends Question {

    private Question [] questions_arr;

    public QuestionRepository (Question q) {
        super (q.getQuestion(), q.getAnswers(), q.getR_AnswerNumber());
        questions_arr = new Question [] {};
    }

    public static Question randomQuestion (Question [] questions_arr) {

        int rnd = new Random().nextInt(questions_arr.length);
        return questions_arr[rnd];

    }

}
