public class PizzaImpl implements Pizza {

    @Override
    public String getDescription() {
        return "Pizza with";
    }

    @Override
    public double getPrice() {
        return 2.50;
    }
}
