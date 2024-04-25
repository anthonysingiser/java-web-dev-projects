package org.example;
import java.util.Set;

abstract class Question {
    String questionText;
    String correctAnswer;

    Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
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
    public String getQuestionText() {
        StringBuilder questionBuilder = new StringBuilder(questionText);
        char optionLetter = 'A';
        for (String option : options) {
            questionBuilder.append("\n").append(optionLetter).append(") ").append(option);
            optionLetter++;
        }
        return questionBuilder.toString();
    }

    @Override
    boolean isAnswerCorrect(String answer) {
        int answerIndex = answer.toUpperCase().charAt(0) - 'A';
        return answerIndex >= 0 && answerIndex < options.length && options[answerIndex].equals(correctAnswer);
    }
}

class TrueFalseQuestion extends Question {
    TrueFalseQuestion(String questionText, String correctAnswer) {
        super(questionText, correctAnswer);
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
        String[] userAnswers = answer.split(", ");
        if (userAnswers.length != correctAnswers.length) {
            return false;
        }
        for (String userAnswer : userAnswers) {
            boolean found = false;
            for (String correctAnswer : correctAnswers) {
                if (userAnswer.equals(correctAnswer)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
