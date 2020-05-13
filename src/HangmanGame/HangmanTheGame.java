package HangmanGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanTheGame {
    static Scanner _input = new Scanner(System.in);
    protected static Random randomize = new Random();
    protected static String[] unknownWordsToGuessOn = {};
    protected static int amountOfGuesses = 7;
    protected static int guessCounter = 0;
    protected static String makeRandomWord;
    protected static char[] wordProgress;
  //  protected static char playerGuess;


    public static void main(String[] args) {
        greeting();

        chooseDifficulty();
        randomizeTheWord();
       wordProgress = resetWordProgress();// gör så att när man kallar på metoden i for loopen att den inte återställs varje gång.
        game();

        //updateWordProgress();
       // wrongGuess();


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
       _input.nextLine(); //läser in nästa rad, tror siffran är min input

        switch (difficulty){
            case 1:
                System.out.println("ah, ok you want more complex words huh? Good luck");
                unknownWordsToGuessOn = new String[]{"southkorea", "earthflaxxxxxxxxxxxxxxxxxxxxxxxxxx", "nti"};
                break;

            case 2:
                System.out.println("ah, ok you want more COMMON WORDS, GOOD LUCK");
                unknownWordsToGuessOn = new String[]{"goodmorning", "hello", "kebab"};
                break;
        }

    }

    public static void randomizeTheWord(){
           makeRandomWord = unknownWordsToGuessOn[randomize.nextInt(unknownWordsToGuessOn.length)];


    }

    public static char[] resetWordProgress(){

      char[] wordReplacedByUnderScore = new char[makeRandomWord.length()];

        for(int i = 0; i < wordReplacedByUnderScore.length; i++){
          wordReplacedByUnderScore[i] = '_';
        }
      System.out.println(makeRandomWord);; // kollar det slumpade ordet innan det görs om till understräck
       System.out.println(String.copyValueOf(wordReplacedByUnderScore));; //Skriver ut det slumpade ordet i "_"
        return  wordReplacedByUnderScore;

    }

    public static void rematchOrNot(){
       int playAgain = _input.nextInt();
        System.out.println("Would you like to play again? Press 1 to play again or 2 to stop");
       switch (playAgain){
           case 1:
               playMultiplayer();
               break;

           case 2:
               System.out.println("dont play then, goodbye");
               System.exit(0);
               break;
       }

    }

    public static void updateWordProgress(){
        char playerguess = errorSearchFromInput();//ska ta in errorsearchfrom input

            for(int i = 0; i < wordProgress.length; i++){
                if(makeRandomWord.charAt(i) == playerguess){
                    wordProgress[i] = playerguess; //återställde innan nör jag kallade på resetwordpgroessmetoden

                }
                System.out.print(wordProgress[i]);

            }








    }

    public static char errorSearchFromInput(){
        char inputFromPlayer = _input.nextLine().toLowerCase().charAt(0);





            if (Character.isLetter(inputFromPlayer)){

                return inputFromPlayer;
            }
            else{
                System.out.println("Wrong input - type a character to move on");
                errorSearchFromInput();




        }
        return inputFromPlayer;
    }

    public static void wrongGuess(){
        for (int i = 0; i <wordProgress.length;i++){
            if (makeRandomWord.charAt(i) != errorSearchFromInput()){
                guessCounter++;
                printHangmanPhase();


            }

        }



    }



    public static boolean hasWon(char[] win){
        for (int i = 0; i < win.length; i++){
            if (win[i] == '_')
                return false; // kollar om det finns några underscore och ifall det gör det har man inte vunnit, annars returnera true
        }

        return true;
    }

    public static void printHangmanPhase(){

        switch (guessCounter){
            case 1:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("You have 6 guesses left, COME ON");
                break;
            case 2:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("You have 5 guesses left, COME ON");
                break;
            case 3:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("You have 4 guesses left, COME ON");
                break;
            case 4:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("You have 3 guesses left, COME ON");
                break;
            case 5:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("You have 2 guesses left, COME ON");
                break;
            case 6:
                System.out.print(" +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " /    |\n" +
                        "      |\n" +
                        "=========''', '''");
                System.out.println("You have 1 guesses left, COME ON");
                break;
            case 7:
                System.out.print("  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " / \\  |\n" +
                        "      |\n" +
                        "=========''']");
                System.out.println("sorry, you lost unfortunately");
                System.out.println("The word was:" + " " + makeRandomWord);
                break;

        }

    }

    public static void game(){

        boolean youWon = false;

        while (!youWon && guessCounter <= amountOfGuesses){

                updateWordProgress();
                if (hasWon(wordProgress)){
                    youWon = true;
                    System.out.println(", that was the right word, you have won! Congrats!!");
                }


            }


            }

        }




