public class Cheese extends PizzaDecorator {

    public Cheese(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return decPizza.getDescription() + " Cheese";
    }

    public double getPrice() {
        return decPizza.getPrice() + 1.50;
    }



}
