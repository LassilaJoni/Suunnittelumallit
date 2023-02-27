public class Bacon extends PizzaDecorator {

    public Bacon(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return decPizza.getDescription() + " Bacon";
    }

    public double getPrice() {
        return decPizza.getPrice() + 2;
    }



}
