public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command screenUp = new ScreenUpCommand(screen);
        Command screenDown = new ScreenDownCommand(screen);
        WallButton button1 = new WallButton(screenUp);
        WallButton button2 = new WallButton(screenDown);
        button1.push();
        button2.push();
    }
}