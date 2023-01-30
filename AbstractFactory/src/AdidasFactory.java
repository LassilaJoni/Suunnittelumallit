import Clothes.*;

public class AdidasFactory implements OutfitFactory {
    @Override
    public Hat createHat() {
        return new AdidasHat();
    }

    @Override
    public Shirt createShirt() {
        return new AdidasShirt();
    }

    @Override
    public Shoes createShoes() {
        return new AdidasShoes();
    }
}