public abstract class Clock implements Cloneable {
    protected String clockType;

    abstract void setHour(int hour);
    abstract void setMinute(int minute);

    public String getClockType() {
        return clockType;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
