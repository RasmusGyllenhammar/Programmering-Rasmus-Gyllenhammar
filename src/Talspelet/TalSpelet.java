package Talspelet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TalSpelet {
   static Scanner input = new Scanner(System.in);
   protected static int limitedAmountOfGuesses; //Antal gissningar man har på sig

   public static void main(String[] args) {

       chooseDifficulty();

    }

    /**
     *
     */
    public static void chooseDifficulty(){

        System.out.println("Welcome Summoner select a difficulty between 1(easy), 2(medium), 3(hard)");

        int difficulty = errorSearchingFromInput();

        switch(difficulty){
            case 1:
                System.out.println("You have chosen easy! You will have 10 tries to guess the correct number");
                limitedAmountOfGuesses = 10;
                checkIfGuessIsRight();
                break;

            case 2:
                System.out.println("You have chosen medium! You will have 7 tries to guess the correct number");
                limitedAmountOfGuesses = 7;
                checkIfGuessIsRight();
                break;

            case 3:
                System.out.println("You have chosen hard! You will have 4 tries to guess the correct number");
                limitedAmountOfGuesses = 4;
                checkIfGuessIsRight();
                break;
        }



    }
    public static void checkIfGuessIsRight(){
        System.out.println("Now try to guess the number between 1 - 100");
        boolean win = false;
        //test
        int guessCounter = 0;  //Håller koll på hur många gissningar man gör
        int correctNumber = (int)(100 * Math.random()); // randomizer en int mellan intervallet 1-100

        while(win == false) {
            int guess = errorSearchingFromInput();
            guessCounter++;

            if(guess == correctNumber && guessCounter < limitedAmountOfGuesses) {
                win = true;
                System.out.println("WOW YOU WON, it took you" + "" + guessCounter + " tries");
                rematchOrNot();
            } else if(guess < correctNumber) {
                System.out.println("Seems like your guess is too low, try a greater number");
            } else if(guess > correctNumber) {
                System.out.println("Seems like your guess is too high, try a lower number");
            }
            if(guessCounter >= limitedAmountOfGuesses){
                System.out.println("You are out of guesses, you lost, the answer was " + correctNumber);

                rematchOrNot();
            }
        }
    }

    /**
     * Kollar på slutet av spelet om man vill köra igen eller inte. Om man vill köra igen så kommer anropa choosingDifficulty
     */
    public static void rematchOrNot() {
        System.out.println("Do you want to play again? If so, press 1. If not press 2");
        int playAgain = errorSearchingFromInput();

        switch (playAgain) {
            case 1:
                chooseDifficulty();


            case 2:
                System.out.println("Okay, dont play then :(");
        }
    }

    /**
     * Try catch, metoden kollar om vi får in den typen av värde vi vill ha vilket i detta fallet är det en int och -
     * om vi inte får det så kommer den säga till vilken typ vi vill ha och göra det tills användaren skriver in rätt typ
     * @return den skickar tillbaka en int = input.nextInt(); för att kunna lösa i varje sitaution användaren får skriva så hen inte gör fel
     */
    public static int errorSearchingFromInput(){
       int inputFromPlayer;

       try{
           inputFromPlayer = input.nextInt();
       }catch (InputMismatchException e) {
           System.out.println("THIS IS THE WRONG INPUT, TYPE AN INTEGER TO MOVE ON");
           input.nextLine();
           return errorSearchingFromInput();
       }

        return inputFromPlayer;
    }

}
