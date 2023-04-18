public class ClockHands extends Clock {
    private int hour;
    private int minute;

    public ClockHands() {
        clockType = "Kello viisareilla";
    }

    @Override
    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public Object clone() {
        ClockHands clone = (ClockHands) super.clone();
        clone.setHour(this.hour);
        clone.setMinute(this.minute);
        return clone;
    }

    @Override
    public String toString() {
        return "Kello tyyppi: " + clockType + ", tunti: " + hour + ", Minuutti: " + minute;
    }
}
