public class CharmanderState implements PokemonState {

    int bonusPoints = 10;

    public int getBonusPoints() {
        return bonusPoints;
    }
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

    @Override
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}
