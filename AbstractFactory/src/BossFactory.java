import Clothes.*;

public class BossFactory implements OutfitFactory {
    @Override
    public Hat createHat() {
        return new BossHat();
    }

    @Override
    public Shirt createShirt() {
        return new BossShirt();
    }

    @Override
    public Shoes createShoes() {
        return new BossShoes();
    }
}