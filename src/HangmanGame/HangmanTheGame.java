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

    }

    public static void greeting(){
        System.out.println("hello, and welcome to the game Hangman! You will have to guess the right word; letter by letter! You can only guess wrong 7 times and after that you will lose");
    }

    public static void playMultiplayer(){

    }

    public static void chooseDifficulty(){

    }

    public static char[] randomizeTheWord(){

        return randomizeTheWord();
    }

    public static void resetWordProgress(){

    }

    public static void rematchOrNot(int playAgain){
        playAgain = _input.nextInt();

    }

    public static void updateWordProgress(){

    }

    public static void wrongGuess(){

    }

    public static void game(){

    }

    public static boolean hasWon(char[] win){

        return true;
    }

    public static void printHangmanPhase(){

    }
}
