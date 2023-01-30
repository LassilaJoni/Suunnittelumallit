import Clothes.Hat;
import Clothes.Shirt;
import Clothes.Shoes;

public class Jasper {
        private Hat hat;
        private Shirt shirt;
        private Shoes shoes;

        public Jasper(OutfitFactory outfitFactory) {
            hat = outfitFactory.createHat();
            shirt = outfitFactory.createShirt();
            shoes = outfitFactory.createShoes();
        }

        public String currentOutfit() {
            return hat + ", " + shirt + ", " + shoes;
        }
}