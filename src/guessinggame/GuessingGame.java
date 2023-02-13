package guessinggame;

import javax.swing.*;
public class GuessingGame{
    public static void main(String[] args){
        int RandomNumber = (int)(Math.random()*100 + 1);
        int userAnswer =0;
        int count = 1;
        while(userAnswer != RandomNumber){
            String response = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100","Guessing Game",3);
       userAnswer = Integer.parseInt(response);
       JOptionPane.showMessageDialog(null,""+ determineGuess(userAnswer,RandomNumber,count));
       count++;
        }
    }
    public static String determineGuess(int userAnswer,int RandomNumber,int count){
    
    if(userAnswer <=0 || userAnswer > 100){
    return "Your Guess is invalid ";
    }
    else if(userAnswer == RandomNumber){
        return "Congratulation!\nTotalGuess:"+ count;
    }
    else if(userAnswer > RandomNumber){
        return "Your Guess is too high, try again.\nTry Number:"+ count;
    }
    else if(userAnswer < RandomNumber){
        return "Your Guess is too low, try again.\nTry Number:"+ count;
    }
    else{
       return "Your Guess is incorrect\nTry Number:"+count; 
    }
    }
    
}