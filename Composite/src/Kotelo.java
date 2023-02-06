import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {
    private double hinta;
    private List<Laiteosa> osat = new ArrayList<>();

    public Kotelo(double hinta) {
        this.hinta = hinta;
    }

    public void lisaaOsa(Laiteosa osa) {
        osat.add(osa);
    }

    @Override
    public double getHinta() {
        double kokonaisHinta = hinta;
        for (Laiteosa osa : osat) {
            kokonaisHinta += osa.getHinta();
        }
        return kokonaisHinta;
    }
}