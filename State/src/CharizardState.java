public class CharizardState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charizard attacks");
    }

    @Override
    public void run() {
        System.out.println("Charizard runs");
    }

    @Override
    public void rest() {
        System.out.println("Charizard rests");
    }
}
