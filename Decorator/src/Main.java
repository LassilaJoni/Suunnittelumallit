public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Chicken(new Cheese(new PizzaImpl()));
        Pizza pizza2 = new Ham(new Cheese(new Bacon (new BBQSauce(new PizzaImpl()))));
        Pizza pizza3 = new Bacon(new Cheese(new Ham(new PizzaImpl())));

        System.out.println("Ingredients: " + pizza1.getDescription() + "\nPrice: " + pizza1.getPrice() + "€");
        System.out.println("Ingredients: " + pizza2.getDescription() + "\nPrice: " + pizza2.getPrice() + "€");
        System.out.println("Ingredients: " + pizza3.getDescription() + "\nPrice: " + pizza3.getPrice() + "€");
    }
}