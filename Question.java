package com.example.quiz_game;

public class Question {

    private String question;
    private String [] answers;
    private int r_answer;


    public Question (String question, String [] answers, int r_answer) {
        this.question = question;
        this.answers = answers;
        this.r_answer = r_answer;
    }


    // Copy constructor for the updateQuestion method.
    Question (Question q) {
        question = q.question;
        answers = q.answers;
        r_answer = q.r_answer;
    }


    public String getQuestion () {

        return this.question;
    }

    public String [] getAnswers() {

        return this.answers;
    }

    public String getChoice (int a) {
        String eChoice = answers[a];
        return eChoice;
    }

    public int getR_AnswerNumber () {

        return this.r_answer;
    }

    public  String  getR_answer () {
        String ri_answer = answers[r_answer];
        return ri_answer;
    }



}

