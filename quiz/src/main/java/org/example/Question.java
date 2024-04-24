package org.example;
import java.util.Set;

abstract class Question {
    String questionText;
    String correctAnswer;

    Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    abstract boolean isAnswerCorrect(String answer);
}

class MultipleChoiceQuestion extends Question {
    String[] options;

    MultipleChoiceQuestion(String questionText, String correctAnswer, String[] options) {
        super(questionText, correctAnswer);
        this.options = options;
    }

    @Override
    boolean isAnswerCorrect(String answer) {
        return answer.equals(correctAnswer);
    }
}

class CheckboxQuestion extends Question {
    String[] correctAnswers;

    CheckboxQuestion(String questionText, String[] correctAnswers) {
        super(questionText, null);
        this.correctAnswers = correctAnswers;
    }

    @Override
    boolean isAnswerCorrect(String answer) {
        String[] answers = answer.split(",");
        if (answers.length != correctAnswers.length) {
            return false;
        }
        return false;
    }
}
