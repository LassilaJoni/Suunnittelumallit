import java.util.Scanner;

public class GuessNumber extends Game {
    private int numberToGuess;
    private int currentGuess;
    private int numberOfGuesses;

    @Override
    void initializeGame() {
        numberToGuess = (int) (Math.random() * 10) + 1;
        currentGuess = 0;
        numberOfGuesses = 0;
        System.out.println("I'm thinking of a number betweeen 10 and 1.");
    }

    @Override
    void makePlay(int player) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Player %d, enter your guess: ", player+1);
        currentGuess = input.nextInt();

        if(currentGuess != numberToGuess) {
            System.out.println("That's not the number i'm thinking of");
        }

        numberOfGuesses++;
    }

    @Override
    boolean endOfGame() {
        return (currentGuess == numberToGuess);
    }

    @Override
    void printWinner() {
        System.out.println();
        System.out.printf("You guessed the number %d in %d guesses.", numberToGuess, numberOfGuesses);
    }
}
