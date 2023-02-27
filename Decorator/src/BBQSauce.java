public class BBQSauce extends PizzaDecorator {

    public BBQSauce(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return decPizza.getDescription() + " BBQSauce";
    }

    public double getPrice() {
        return decPizza.getPrice() + 2;
    }



}
