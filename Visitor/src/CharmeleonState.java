public class CharmeleonState implements PokemonState {

    int bonusPoints = 25;

    public int getBonusPoints() {
        return bonusPoints;
    }
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

    @Override
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}
