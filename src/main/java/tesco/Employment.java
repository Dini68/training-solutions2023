package tesco;

public enum Employment {

    FORTY_HOURS(40), THIRTY_HOURS(30), TWENTY_HOURS(20);

    private final int hours;

    Employment(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }
}
