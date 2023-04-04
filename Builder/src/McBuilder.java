import java.util.ArrayList;

public class McBuilder extends BurgerBuilder {

    private StringBuilder burgir = new StringBuilder();

    @Override
    void addSalad() {
        burgir.append("Salad");
    }

    @Override
    void addMeat() {
        burgir.append("Meat");
    }

    @Override
    void addBun() {
        burgir.append("Bun");
    }

    @Override
    StringBuilder getBurger() {
        return burgir;
    }
}
