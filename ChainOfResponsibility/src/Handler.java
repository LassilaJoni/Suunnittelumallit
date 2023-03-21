public interface Handler {

    void setNextHandler(Handler nextHandler);
    void handleRequest(double percentage);
}
