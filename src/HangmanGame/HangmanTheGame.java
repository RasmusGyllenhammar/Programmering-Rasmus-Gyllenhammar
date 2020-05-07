package HangmanGame;

import java.util.Random;
import java.util.Scanner;

public class HangmanTheGame {
    static Scanner _input = new Scanner(System.in);
    protected static Random randomize = new Random();
    protected static String[] unknownWordsToGuessOn = {};
    protected static int amountOfGuesses = 7;
    protected static int GuessCounter = 0;

    public static void main(String[] args) {
        greeting();

        chooseDifficulty();
        randomizeTheWord();
        resetWordProgress();

    }

    public static void greeting(){
        System.out.println("hello, and welcome to the game Hangman! You will have to guess the right word; letter by letter! You can only guess wrong 7 times and after that you will lose \n " + "You could also play with a friend, where one of you choose a word from a list and the other try to guess it");
    }

    public static void playMultiplayer(){

        System.out.println("Would you like to play with a friend? if so press 1 or press 2 to play ALONE");

      int playWithFriend = _input.nextInt();
        switch (playWithFriend){
            case 1:
                System.out.println("Ah, play multiplayer");


            case 2:
                System.out.println("OK, play alone");
        }

    }

    public static void chooseDifficulty(){

        System.out.println("what difficulty would you like to play? Press 1(complex words), or 2(common words)");

       int difficulty = _input.nextInt();

        switch (difficulty){
            case 1:
                System.out.println("ah, ok you want more complex words huh? Good luck");
                unknownWordsToGuessOn = new String[]{"southkorea", "earthflax", "nti"};
                break;

            case 2:
                System.out.println("ah, ok you want more COMMON WORDS, GOOD LUCK");
                unknownWordsToGuessOn = new String[]{"goodmorning", "hello", "kebab"};
                break;
        }

    }

    public static char[] randomizeTheWord(){
           char[] makeRandomWord = unknownWordsToGuessOn[randomize.nextInt(unknownWordsToGuessOn.length)].toCharArray();
        System.out.println(makeRandomWord); // kollar det slumpade ordet innan det görs om till understräck
           return makeRandomWord;
    }

    public static void resetWordProgress(){

        char[] wordReplacedByUnderScore = new char[randomizeTheWord().length];

        for(int i = 0; i < wordReplacedByUnderScore.length; i++){
          wordReplacedByUnderScore[i] = '_';
        }

        System.out.println(wordReplacedByUnderScore); //Skriver ut det slumpade ordet i en 

    }

    public static void rematchOrNot(int playAgain){
        playAgain = _input.nextInt();

    }

    public static void updateWordProgress(){

    }

    public static void wrongGuess(){

    }



    public static boolean hasWon(char[] win){

        return true;
    }

    public static void printHangmanPhase(){


    }

    public static void game(){

    }
}
