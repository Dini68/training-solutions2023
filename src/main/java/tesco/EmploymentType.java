package tesco;

public enum EmploymentType {

    WEEKLY_40_HOURS(40), WEEKLY_30_HOURS(30), WEEKLY_20_HOURS(20);

    private final int hours;

    EmploymentType( int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }
}
