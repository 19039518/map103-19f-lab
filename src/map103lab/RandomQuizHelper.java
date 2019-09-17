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
    private String[]questions;
    RandomQuizHelper (){
        
        questions=new String[5];
        questions[0]="What is [+]";
        questions[1]="what is [7+1]";
        questions[2]="what is the color of snow";
        questions[3]="what is class code";
        questions[4]="where are we?";
    }
        public String getQuestions(int questionIndex){
            String currentQuestion="";
             currentQuestion=Questions(questionIndex);
             return currentQuestion;
            
        }
              
        
    }
 

