public class Bonus implements PokemonVisitor{
    int bonusPoint;

    public Bonus(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
    @Override
    public void visit(CharizardState charizardState) {
        System.out.println("Charizard gets " + bonusPoint + " bonus points");
    }

    @Override
    public void visit(CharmeleonState charmeleonState) {
        System.out.println("Charmeleon gets " + bonusPoint + " bonus points");
    }

    @Override
    public void visit(CharmanderState charmanderState) {
        System.out.println("Charander gets " + bonusPoint + " bonus points");
    }
}
