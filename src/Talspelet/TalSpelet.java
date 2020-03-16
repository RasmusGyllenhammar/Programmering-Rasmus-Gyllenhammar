package Talspelet;

import java.util.Scanner;

public class TalSpelet {
   static Scanner input = new Scanner(System.in);
   protected static int limitedAmountOfGuesses;

   public static void main(String[] args) {
       System.out.println("test");
       chooseDifficulty();
    checkIfGuessIsRight();

    }

    /**
     *
     */
    public static void chooseDifficulty(){
        System.out.println("Welcome summoner, select a difficulty between 1(easy), 2(medium), 3(hard)");

        int difficulty = input.nextInt();

        switch(difficulty){
            case 1:
                System.out.println("You have chosen easy! You will have 10 tries to guess the correct number");
                limitedAmountOfGuesses = 10;
                break;

            case 2:
                System.out.println("You have chosen easy! You will have 7 tries to guess the correct number\"");
                limitedAmountOfGuesses = 7;
                break;

            case 3:
                System.out.println("You have chosen easy! You will have 4 tries to guess the correct number\"");
                limitedAmountOfGuesses = 4;
        }



    }
    public static void checkIfGuessIsRight(){
        System.out.println("Now try to guess the number between 1 - 100");
        boolean win = false;
        //test
        int guessCounter = 0;
        int correctNumber = (int)(100 * Math.random());

        while(win == false) {
            int guess = input.nextInt();
            guessCounter++;

            if(guess == correctNumber && guessCounter < limitedAmountOfGuesses) {
                win = true;
                System.out.println("WOW YOU WON");
                rematchOrNot();
            } else if(guess < correctNumber) {
                System.out.println("Seems like your guess is too low, try a greater number");
            } else if(guess > correctNumber) {
                System.out.println("Seems like your guess is too high, try a lower number");
            }
            if(guessCounter >= limitedAmountOfGuesses){
                System.out.println("You are out of guesses, you lost");
                rematchOrNot();
            }
        }
    }
    public static void rematchOrNot() {
        System.out.println("Do you want to play again? If so, press 1. If not press 2");
        int playAgain = input.nextInt();

        switch (playAgain) {
            case 1:
                chooseDifficulty();
                checkIfGuessIsRight();

            case 2:
                System.out.println("Okay, dont play then :(");
        }
    }

}
