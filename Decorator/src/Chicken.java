public class Chicken extends PizzaDecorator {

    public Chicken(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return decPizza.getDescription() + " Chicken";
    }

    public double getPrice() {
        return decPizza.getPrice() + 3.50;
    }



}
