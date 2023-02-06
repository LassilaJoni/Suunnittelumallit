import Clothes.*;

public class AdidasFactory implements OutfitFactory {

    private static AdidasFactory INSTANCE = null;

    private AdidasFactory() {
    }

    public static AdidasFactory getInstance() {
        if(INSTANCE == null) {
           INSTANCE = new AdidasFactory();
        }
        return INSTANCE;
    }

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