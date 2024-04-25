package org.example;

import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Create questions
        MultipleChoiceQuestion mcq = new MultipleChoiceQuestion("What is the capital of France?", "Paris", new String[]{"London", "Paris", "Berlin", "Madrid"});
        TrueFalseQuestion tfq = new TrueFalseQuestion("True or False, Java is a statically typed language?", "True");
        CheckboxQuestion cbq = new CheckboxQuestion("Which of the following languages are statically typed: Java, Javascript, C++, Python", new String[]{"Java", "C++"});

        // Add questions to the quiz
        quiz.addQuestion(mcq);
        quiz.addQuestion(tfq);
        quiz.addQuestion(cbq);

        //Grade the quiz
        quiz.gradeQuiz();
    }
}