import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Give number of players: ");
        Scanner scanner = new Scanner(System.in);
        int playerCount = scanner.nextInt();
        Game guessNumber = new GuessNumber();
        guessNumber.playOneGame(playerCount);
    }
}