import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HeseBuilder hese = new HeseBuilder();
        hese.addBun();
        hese.addMeat();
        hese.addSalad();
        ArrayList<Burger> heseBurgir = hese.getBurger();

        McBuilder mc = new McBuilder();
        mc.addBun();
        mc.addMeat();
        mc.addSalad();
        StringBuilder mcBurgir = mc.getBurger();

        System.out.println("Hesburger: ");
        for(Burger burger : heseBurgir) {
            System.out.println(burger.getName());
        }
        System.out.println("McDonalds: ");
        System.out.println(mcBurgir.toString());


    }
}