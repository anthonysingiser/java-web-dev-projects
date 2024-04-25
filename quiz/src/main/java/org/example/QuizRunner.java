package org.example;

import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Create questions
        MultipleChoiceQuestion mcq = new MultipleChoiceQuestion("What is the capital of France?", "Paris", new String[]{"London", "Paris", "Berlin", "Madrid"});
        TrueFalseQuestion tfq = new TrueFalseQuestion("Is Java a statically typed language?", "True");
        CheckboxQuestion cbq = new CheckboxQuestion("Which of the following languages are statically typed?", new String[]{"Java", "C++"});

        // Add questions to the quiz
        quiz.addQuestion(mcq);
        quiz.addQuestion(tfq);
        quiz.addQuestion(cbq);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Run the quiz
        for (Question question : quiz.questions) {
            System.out.println(question.questionText);
            String userAnswer = scanner.nextLine();
            if (question.isAnswerCorrect(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
        }
        //grade quiz
        int correctAnswers = 0;
        for (Question question : quiz.questions) {
            System.out.println(question.questionText);
            String userAnswer = scanner.nextLine();
            if (question.isAnswerCorrect(userAnswer)) {
                correctAnswers++;
            }
        }
        System.out.println("You scored " + correctAnswers + " out of " + quiz.questions.size());
        // Close the Scanner
        scanner.close();
    }
}