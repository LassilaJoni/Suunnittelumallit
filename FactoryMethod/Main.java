

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus maitoOpe = new MaitoOpettaja();
        AterioivaOtus limuOpe = new LimuOpettaja();
        
        opettaja.aterioi();
        maitoOpe.aterioi();
        limuOpe.aterioi();
    }
}
