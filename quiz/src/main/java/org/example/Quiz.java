package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    public List<Question> questions;

    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String userAnswer = scanner.nextLine();
            if (question.isAnswerCorrect(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
        }
        scanner.close();
    }

    public void gradeQuiz() {
        int correctAnswers = 0;
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String userAnswer = scanner.nextLine();
            if (question.isAnswerCorrect(userAnswer)) {
                correctAnswers++;
            }
        }
        scanner.close();
        System.out.println("You scored " + correctAnswers + " out of " + questions.size());
    }
}