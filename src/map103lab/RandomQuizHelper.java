/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map103lab;

/**
 *
 * @author 19039518
 */
public class RandomQuizHelper {

    private String[] questions = new String[5];
    private String[] answers = new String[5];

    RandomQuizHelper() {

        questions = new String[5];
        questions[0] = "What is 1+1";
        questions[1] = "what is 7+9";
        questions[2] = "what is the color of snow";
        questions[3] = "what is class code";
        questions[4] = "where are we?";

        answers[0] = "2";
        answers[1] = "16";
        answers[2] = "white";
        answers[3] = "103";
        answers[4] = "sault ste. marie";
    }

    public String getQuestion(int questionIndex) {
        String currentQuestion = "";
        currentQuestion = questions[questionIndex];
        return currentQuestion;

    }

    public boolean getResult(int questionNumber, String answer) {
        if (answers[questionNumber].equals(answer)) {

            return true;
        } else {
            return false;

        }

    }
}
