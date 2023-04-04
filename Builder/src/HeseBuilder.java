import java.util.ArrayList;

public class HeseBuilder extends BurgerBuilder {

    private ArrayList<Burger> burgir = new ArrayList<>();

    @Override
    void addSalad() {
        burgir.add(new Salad());
    }

    @Override
    void addMeat() {
        burgir.add(new Meat());
    }

    @Override
    void addBun() {
        burgir.add(new Bun());
    }

    @Override
    ArrayList<Burger> getBurger() {
        return burgir;
    }
}
