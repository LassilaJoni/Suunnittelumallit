import javax.security.auth.Subject;
import java.util.Observable;
import java.util.Observer;


class DigitalClock implements Observer {

    private ClockTimer timer;

    public DigitalClock(ClockTimer clockTimer) {
        timer = clockTimer;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
    }
}
