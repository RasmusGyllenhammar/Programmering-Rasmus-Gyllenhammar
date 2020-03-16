package Talspelet;

import java.util.Scanner;

public class TalSpelet {
   static Scanner input = new Scanner(System.in);
   protected static int limitedAmountOfGuesses;

   public static void main(String[] args) {

    chooseDifficulty();

    }

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
}
