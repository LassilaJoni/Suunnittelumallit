public class CharmeleonState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charmeleon attacks");
    }

    @Override
    public void run() {
        System.out.println("Charmeleon runs");
    }

    @Override
    public void rest() {
        System.out.println("Charmeleon rests");
    }
}
