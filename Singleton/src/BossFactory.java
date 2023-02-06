import Clothes.*;

public class BossFactory implements OutfitFactory {
    private static BossFactory INSTANCE = null;

    private BossFactory() {
    }

    public static BossFactory getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new BossFactory();
        }
        return INSTANCE;
    }
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