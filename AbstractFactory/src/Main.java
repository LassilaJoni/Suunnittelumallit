public class Main {
    public static void main(String[] args) {
        OutfitFactory outfitFactory = new AdidasFactory();
        Jasper jasper = new Jasper(outfitFactory);
        System.out.println("Jasper is a student wearing: " + jasper.currentOutfit());

        outfitFactory = new BossFactory();
        jasper = new Jasper(outfitFactory);
        System.out.println("Jasper is now the best software developer and wears : " + jasper.currentOutfit());
    }
}