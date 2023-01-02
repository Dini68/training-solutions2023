package statements;

public class Time {

    private final int hour;
    private final int minute;
    private final int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInMinutes() {
        return 60 * hour + minute;
    }

    public int getInSeconds() {
        return getInMinutes() * 60 + second;
    }

    public boolean earlierThan(Time anotherTime) {
        return getInSeconds() < anotherTime.getInSeconds();
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
