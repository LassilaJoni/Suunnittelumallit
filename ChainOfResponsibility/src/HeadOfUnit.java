public class HeadOfUnit implements Handler{
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(double percentage) {
        if(percentage > 2 && percentage <= 5) {
            System.out.println("Head of unit approves the salary raise of " + percentage);
        } else {
            this.nextHandler.handleRequest(percentage);
        }
    }
}
