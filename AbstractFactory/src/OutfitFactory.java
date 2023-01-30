import Clothes.Hat;
import Clothes.Shirt;
import Clothes.Shoes;

public interface OutfitFactory {
    Hat createHat();
    Shirt createShirt();
    Shoes createShoes();
}
