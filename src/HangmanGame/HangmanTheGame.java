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
    protected static ArrayList<Character> playerGuessList = new ArrayList<Character>();



    public static void main(String[] args) {
        greeting();
        /**
         * Kollar ifall
         */
        while(true){
            playMultiplayer();
            System.out.println("would you like to play again? press y to play again or press which ever character to stop");
            char yes = errorSearchFromInput();
            if (yes == 'y'){
                continue;
            }
            break;
        }




    }

    /**
     * Välkommnar spelaren och förklarar hur spelet går till
     */
    public static void greeting() {
        System.out.println("hello, and welcome to the game Hangman! You will have to guess the right word; letter by letter! You can only guess wrong 7 times and after that you will lose \n " + "You could also play with a friend, where one of you choose a word from a list and the other try to guess it");
    }

    public static void playMultiplayer() {

        System.out.println("Would you like to play with a friend? if so press 'y' or press 'f' to play ALONE");

        char playWithFriend = errorSearchFromInput();

       guessCounter = 0; //nollställer
        playerGuessList.clear(); //nollställer listan med inputen
        switch (playWithFriend) {
            case 'y':
                System.out.println("Ah, you want to play multiplayer");
                chooseWord();
                randomizeTheWord();
                game();
                break;


            case 'f':
                System.out.println("OK, play alone");
                chooseDifficulty();
                randomizeTheWord();
                game();
                break;

        }

    }
    public static void chooseWord(){
        System.out.println("Choose a word you would like your friend to guess on. Press 'y' if u want the word: multiplayer \n" + "or press 'f' if you want the word: alone");

        char chooseWord = errorSearchFromInput();

        switch(chooseWord) {
            case 'y':
                unknownWordsToGuessOn = new String[]{"multiplayer"};
                break;

            case 'f':
                unknownWordsToGuessOn = new String[]{"alone"};
                break;
        }
    }

    public static void chooseDifficulty() {

        System.out.println("what difficulty would you like to play? Press 'y'(complex words), or 'f'(common words)");

        char difficulty = errorSearchFromInput();


        switch (difficulty) {
            case 'y':
                System.out.println("ah, ok you want more complex words huh? Good luck");
                unknownWordsToGuessOn = new String[]{"southkorea", "earthflax", "nti"};
                break;

            case 'f':
                System.out.println("ah, ok you want more COMMON WORDS, GOOD LUCK");
                unknownWordsToGuessOn = new String[]{"goodmorning", "hello", "kebab"};
                break;
        }

    }

    public static void randomizeTheWord() {
        makeRandomWord = unknownWordsToGuessOn[randomize.nextInt(unknownWordsToGuessOn.length)];


    }

    public static char[] resetWordProgress() {

        char[] wordReplacedByUnderScore = new char[makeRandomWord.length()];

        for (int i = 0; i < wordReplacedByUnderScore.length; i++) {
            wordReplacedByUnderScore[i] = '_';
        }
        System.out.println(makeRandomWord);
        ; // kollar det slumpade ordet innan det görs om till understräck
        System.out.println(String.copyValueOf(wordReplacedByUnderScore));
        ; //Skriver ut det slumpade ordet i "_"
        return wordReplacedByUnderScore;

    }


    public static void updateWordProgress(char playerguess) {


        for (int i = 0; i < wordProgress.length; i++) {
            if (makeRandomWord.charAt(i) == playerguess) {
                wordProgress[i] = playerguess; //återställde innan nör jag kallade på resetwordpgroessmetoden

            }


        }
        System.out.println(String.copyValueOf(wordProgress));


    }

    public static char errorSearchFromInput() {
        char inputFromPlayer = _input.nextLine().toLowerCase().charAt(0);

        if (Character.isLetter(inputFromPlayer)) {

            return inputFromPlayer;
        } else {
            System.out.println("Wrong input - type a character to move on");
           return errorSearchFromInput();


        }

    }

    public static void wrongGuess() {
        guessCounter++;
        printHangmanPhase();

    }

    /**Kollar om det finns några understreck kvar i en array och ifall det finns så har man inte vunnit
     *
     * @param win Vi har en array som jämför med understräck, en plats för wordProgress längre ner
     * @return skickar tillbaka true om det inte finns några understreck
     */
    public static boolean hasWon(char[] win) {
        for (int i = 0; i < win.length; i++) {
            if (win[i] == '_')
                return false; // kollar om det finns några underscore och ifall det gör det har man inte vunnit, annars returnera true
        }

        return true;
    }

    public static void printHangmanPhase() {

        switch (guessCounter) {
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
                System.out.println("THAT WAS NOT IN THE WORD, COME ON and sorry, you lost unfortunately");
                System.out.println("The word was:" + " " + makeRandomWord);
                break;

        }

    }

    public static void game() {

        boolean youWon = false;
        wordProgress = resetWordProgress();// gör så att när man kallar på metoden i for loopen att den inte återställs varje gång
        while (!youWon && guessCounter < amountOfGuesses) {
            char playerguess = errorSearchFromInput(); //ska ta in errorsearchfrom input
            updateWordProgress(playerguess); // gissar och kollar ifall det stämmer
            playerGuessList.add(playerguess);

            if (hasWon(wordProgress)) { // kollar om man har vunnit
                youWon = true;
                System.out.println("that was the right word, you have won! Congrats!!");
                return;

            }else if(!makeRandomWord.contains(Character.toString(playerguess))){ // inte gissat rätt så kallar den på wrongGuess
                playerGuessList.add(playerguess);
                wrongGuess();



            }
            if (playerGuessList.contains(playerguess)){
                System.out.println("you have already entered this character");
            }




        }



    }


}




