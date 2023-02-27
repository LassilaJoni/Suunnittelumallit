public abstract class PizzaDecorator implements Pizza {
    protected Pizza decPizza;

    public PizzaDecorator(Pizza newPizza) {
        decPizza = newPizza;
    }
    @Override
    public String getDescription() {
        return decPizza.getDescription();
    }

    @Override
    public double getPrice() {
        return decPizza.getPrice();
    }
}
