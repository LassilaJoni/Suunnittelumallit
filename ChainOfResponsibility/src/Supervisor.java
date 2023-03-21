public class Supervisor implements Handler{
    private Handler nextHandler;


    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(double percentage) {
        if(percentage <= 2) {
            System.out.println("Supervisor approves the salary raise of " + percentage);
        } else {
            this.nextHandler.handleRequest(percentage);
        }
    }
}
