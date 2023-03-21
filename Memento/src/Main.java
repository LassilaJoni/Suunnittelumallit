public class Main {
    public static void main(String[] args) {
       Guesser guesser = new Guesser();

       for(int i = 0; i < 5; i++) {
           Person customer = new Person(guesser);
           new Thread(customer, "Guesser " + (i +1)).start();
       }
    }
}