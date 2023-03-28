import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        pokemon.performActions();

        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(pokemon);
        Bonus bonusVisitor = new Bonus(10);

        while (true) {
            int action = (int) (Math.random() * 4);
            switch (action) {
                case 0:
                    pokemon.attack();
                    break;
                case 1:
                    pokemon.run();
                    break;
                case 2:
                    pokemon.rest();
                    break;
                case 3:
                    pokemon.accept(bonusVisitor);
                    break;
            }
            try {
                Thread.sleep(2000); // Repeat action every 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}