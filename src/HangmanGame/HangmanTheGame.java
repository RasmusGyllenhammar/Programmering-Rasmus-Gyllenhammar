package HangmanGame;



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


    public static void main(String[] args) {
        greeting();
        /**
         * Kollar ifall man vill köra igen tills i slutet om man trycker på valfri bokstav så stängs det av. Eller om man trycker på y så fortsätter det.
         */
        while (true) {
            playMultiplayer();
            System.out.println("would you like to play again? press y to play again or press any other character to stop");
            char yes = errorSearchFromInput();
            if (yes == 'y') {
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

    /**
     * Har en switch case och utifrån sitt svar så kollar den ifall man vill spela det eller inte
     */
    public static void playMultiplayer() {

        System.out.println("Would you like to play with a friend? if so press 'y' or press 'f' to play ALONE");

        char playWithFriend = errorSearchFromInput();

        guessCounter = 0; //nollställer

        switch (playWithFriend) {
            case 'y':
                System.out.println("Ah, you want to play multiplayer");
                chooseWord();
                randomizeTheWord(); // har den här för den gör om min array till en String och slumpar bara på ett ord
                game();
                break;


            case 'f':
                System.out.println("OK, play alone");
                chooseDifficulty();
                randomizeTheWord();
                game();
                break;
            default:
                System.out.println("wrong char - type y or f");
                playMultiplayer();
                break;

        }

    }

    /**
     * Om man nu valt att spela multiplayer så får man välja vilket ord som sin kompis ska gissa på med en switch case
     */
    public static void chooseWord() {
        System.out.println("Choose a word you would like your friend to guess on. Press 'y' if u want the word: multiplayer \n" + "or press 'f' if you want the word: alone");

        char chooseWord = errorSearchFromInput();

        switch (chooseWord) {
            case 'y':
                unknownWordsToGuessOn = new String[]{"multiplayer"};
                break;

            case 'f':
                unknownWordsToGuessOn = new String[]{"alone"};
                break;
            default:
                System.out.println("wrong char - type either y or f");
                chooseWord();
                break;
        }
    }

    /**
     * Om man valt att spela själv så får man välja vilken svårigshetsgrad man vill köra på dvs komplexa eller mer vanliga ord med en switch case
     */
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
                unknownWordsToGuessOn = new String[]{"goodmorning", "shawarma", "kebab"};
                break;
            default:
                System.out.println("wrong char - type y or f");
                chooseDifficulty();
                break;
        }

    }

    /**
     * Här slumpas ordet och gör den till en String
     */
    public static void randomizeTheWord() {
        makeRandomWord = unknownWordsToGuessOn[randomize.nextInt(unknownWordsToGuessOn.length)];


    }

    /**
     * Tar in det slumpade ordet och gör om den till en char[] och i en for-loop gör om den till '_' och skriver ut det
     *
     * @return skickar tillbaka char[]
     */
    public static char[] resetWordProgress() {

        char[] wordReplacedByUnderScore = new char[makeRandomWord.length()];

        for (int i = 0; i < wordReplacedByUnderScore.length; i++) {
            wordReplacedByUnderScore[i] = '_';
        }
        // System.out.println(makeRandomWord);  kollar det slumpade ordet innan det görs om till understräck
        System.out.println(String.copyValueOf(wordReplacedByUnderScore));
        ; //Skriver ut det slumpade ordet i "_"
        return wordReplacedByUnderScore;

    }

    /**
     * Här kollar vi om ens gissningar stämmer och isåfall ersätter det med den bokstaven man gissade på, och skriver ut hur långt man har kommmit
     *
     * @param playerguess, detta är för inputen sedan i game-metoden
     */
    public static void updateWordProgress(char playerguess) {


        for (int i = 0; i < wordProgress.length; i++) {
            if (makeRandomWord.charAt(i) == playerguess) {
                wordProgress[i] = playerguess; //återställde innan nör jag kallade på resetwordpgroessmetoden

            }


        }
        System.out.println(String.copyValueOf(wordProgress));


    }

    /**
     * min felsökning bland inputen, använder isLetter och kollar ifall ens input är en char om den inte är det så kallar den på sig själv igen tills man skrivit rätt, en recursiv metod
     *
     * @return skickar tillbaka antingen inputen om den var giltig eller sig själv och får då börja om
     */
    public static char errorSearchFromInput() {
        char inputFromPlayer = _input.nextLine().toLowerCase().charAt(0);

        if (Character.isLetter(inputFromPlayer)) {

            return inputFromPlayer;
        } else {
            System.out.println("Wrong input - type a character to move on");
            return errorSearchFromInput();


        }

    }

    /**
     * denna metoden ökar guessCounter och kallar på bilderna på hangman, Sedan kallar jag på denna metoden när man gissat fel, alltså när inputen inte finns i ordet
     */
    public static void wrongGuess() {
        guessCounter++;
        printHangmanPhase();

    }

    /**
     * Kollar om det finns några understreck kvar i en array och ifall det finns så har man inte vunnit
     *
     * @param win Vi har en array som jämför med understräck, en plats för wordProgress längre ner
     * @return skickar tillbaka true om det inte finns några understreck annars returnerar den false och man har inte vunnit
     */
    public static boolean hasWon(char[] win) {
        for (int i = 0; i < win.length; i++) {
            if (win[i] == '_')
                return false;
        }

        return true;
    }

    /**
     * Här är bilderna och en text som säger hur många gissningar man har kvar i samband med bilderna och på sista så visar man vilket ord det var om man nu inte vann
     * Den är baserad på guessCounter och gubben ökar i samband med den
     */
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
                System.out.println("THAT WAS NOT IN THE WORD and sorry, you lost unfortunately");
                System.out.println("The word was:" + " " + makeRandomWord);
                break;

        }

    }

    /**
     * Här är självaste spelet och kallar på metoderna och en while-loop som går tills man antingen har förlorat(inga gissnignar kvar) eller gissat rätt.
     * Sedan har vi en ArrayList med och kollar ifall gissningen redan blev gissad på.
     */
    public static void game() {

        boolean youWon = false;
        wordProgress = resetWordProgress();// gör så att när man kallar på metoden i for loopen(i sig) att den inte återställs varje gång
        while (!youWon && guessCounter < amountOfGuesses) {
            char playerguess = errorSearchFromInput(); //ska ta in errorsearchfrom input

            updateWordProgress(playerguess); // gissar och kollar ifall det stämmer


            if (hasWon(wordProgress)) { // kollar om man har vunnit
                youWon = true;
                System.out.println("that was the right word, you have won! Congrats!!");


            } else if (!makeRandomWord.contains(Character.toString(playerguess))) { // inte gissat rätt så kallar den på wrongGuess och hangman kommer
                wrongGuess();


            }


        }


    }


}




