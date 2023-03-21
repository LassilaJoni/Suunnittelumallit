public class Main {
    public static void main(String[] args) {
        Handler supervisor = new Supervisor();
        Handler headOfUnit = new HeadOfUnit();
        Handler ceo = new CEO();

        supervisor.setNextHandler(headOfUnit);
        headOfUnit.setNextHandler(ceo);

        double[] raises = {1.5, 2.1, 7, 5, 1};

        for(double raise: raises) {
            supervisor.handleRequest(raise);
        }
    }
}