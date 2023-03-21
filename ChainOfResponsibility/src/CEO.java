public class CEO implements Handler{

    @Override
    public void setNextHandler(Handler nextHandler) {
        System.out.println("CEO is the last handler");
    }

    @Override
    public void handleRequest(double percentage) {
        if(percentage > 5) {
            System.out.println("CEO approves the salary raise of " + percentage);
        }
    }
}
