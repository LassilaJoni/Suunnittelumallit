public class CharizardState implements PokemonState {

    int bonusPoints = 20;

    public int getBonusPoints() {
        return bonusPoints;
    }
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

    @Override
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}
