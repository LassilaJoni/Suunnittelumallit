import java.util.Random;

public class Person implements Runnable{

    private Guesser guesser;
    private Memento memento;

    public Person(Guesser guesser) {
        this.guesser = guesser;
        this.memento = guesser.joinGame();
    }


    @Override
    public void run() {
        boolean correctGuess = false;

        while(!correctGuess) {
            Random random = new Random();
            int guess = random.nextInt(100) +1;
            correctGuess = guesser.guess(memento, guess);
            if(correctGuess) {
                System.out.println(Thread.currentThread().getName()+ " guessed correct number " + guess);
            }
        }
    }
}
