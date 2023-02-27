public class Ham extends PizzaDecorator {

    public Ham(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return decPizza.getDescription() + " Ham";
    }

    public double getPrice() {
        return decPizza.getPrice() + 1.50;
    }



}
