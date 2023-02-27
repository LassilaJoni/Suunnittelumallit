public class CharmanderState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charmander attacks");
    }

    @Override
    public void run() {
        System.out.println("Charmander runs");
    }

    @Override
    public void rest() {
        System.out.println("Charmander rests");
    }
}
