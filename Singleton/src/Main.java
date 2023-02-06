public class Main {
    public static void main(String[] args) {
        OutfitFactory outfitFactory = AdidasFactory.getInstance();
        Jasper jasper = new Jasper(outfitFactory);
        System.out.println("Jasper is a student wearing: " + jasper.currentOutfit());

        outfitFactory = BossFactory.getInstance();


        jasper = new Jasper(outfitFactory);
        System.out.println("Jasper is now the best software developer and wears : " + jasper.currentOutfit());
    }
}