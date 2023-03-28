import java.util.Timer;
import java.util.TimerTask;

public class Pokemon {
    private PokemonState currState;

    private int xp;

    public Pokemon() {
        currState = new CharmanderState();

        xp = 0;
    }

    public void attack() {
        currState.attack();
    }

    public void run() {
        currState.run();
    }

    public void rest() {
        currState.rest();
    }

    public void accept(PokemonVisitor visitor) {
        currState.accept(visitor);
    }

    public void performActions() {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int xpEarned = (int) (Math.random() * 10) + 1;
                xp += xpEarned;
                System.out.println("Pokemon earned " + xpEarned + " XP!");

                if (xp >= 30 && currState instanceof CharmanderState) {
                    System.out.println("Charmander is evolving into Charmeleon!");
                    currState = new CharmeleonState();
                } else if (xp >= 60 && currState instanceof CharmeleonState) {
                    System.out.println("Charmeleon is evolving into Charizard!");
                    currState = new CharizardState();
                }
            }
        };
        timer.schedule(task, 0, 5000); // Xp every 5 seconds
    }
}
