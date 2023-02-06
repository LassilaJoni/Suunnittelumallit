public class Main {
    public static void main(String[] args) {
        Laiteosa muistipiiri = new Muistipiiri(60);
        Laiteosa prosessori = new Prosessori(400);
        Laiteosa verkkokortti = new Verkkokortti(50);
        Laiteosa naytonohjain = new Naytonohjain(550);
        Laiteosa emolevy = new Emolevy(520);


        emolevy.lisaaOsa(muistipiiri);
        emolevy.lisaaOsa(prosessori);
        emolevy.lisaaOsa(verkkokortti);
        emolevy.lisaaOsa(naytonohjain);

        Laiteosa kotelo = new Kotelo(120);
        kotelo.lisaaOsa(emolevy);

        double hinta = kotelo.getHinta();
        System.out.println("Tietokoneen hinta: " + hinta + " euroa");
    }
}