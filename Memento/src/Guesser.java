import java.util.Random;

public class Guesser {

    public Memento joinGame() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) +1;

        return new Memento(randomNumber);
    }

    public boolean guess(Memento memento, int guess) {
        return memento.getNumber() == guess;
    }
}
