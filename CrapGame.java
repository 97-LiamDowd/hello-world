package PracticeAssesment2;

import javax.swing.JOptionPane;
import java.util.Random;

public class CrapGame {
    public static void main(String[] args){

        //Decleration of variables used in Game
        int userGuess = 0;
        String numbers[] = {"1", "2", "3", "4", "4", "5", "6"};
        int computerGuess = 0;
        int winnings = 0;
        int diceTotal = 0;
        int button = 0;
        Random random = new Random();
        boolean win = true;

        //Game Start - This is the message that will first appear
        JOptionPane.showMessageDialog(null, "Welcome to CRAPPS!!!");

        //begin the loop
        //The users will give input and the computers guess will be randomized
        //The winnings will be looped and each win will stack the prize
        for(int i = 0; i < 5; i++);

            //giving the user options to choose between 1 and 6
            button = JOptionPane.showOptionDialog(null,
                                                "Pick a dice value",
                                                "CRAPS",
                                                JOptionPane.YES_NO_CANCEL_OPTION,
                                                JOptionPane.QUESTION_MESSAGE,
                                                null,
                                                numbers, numbers[0]);
            
            //making the first number of choice 1 and never 0
            userGuess = button +1;

            //making the computers generate anumber between 1 and 6
            computerGuess = 1+ random.nextInt(6);

    }//end of main method

}//end of class
