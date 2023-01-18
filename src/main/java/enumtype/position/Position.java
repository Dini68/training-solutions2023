package enumtype.position;

public enum Position {

    DIRECTORY(1000000, 5000000),
    EMPLOYEE(500000, 100000);

    private int salary;
    private int benefit;

    Position(int salary, int benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public int getBenefit() {
        return benefit;
    }
}
