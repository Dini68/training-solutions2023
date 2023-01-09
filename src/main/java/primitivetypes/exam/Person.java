package primitivetypes.exam;

import java.time.LocalDate;

public class Person {

    private final String name;
    private final LocalDate dayOfBirth;
    private final int zipCode;
    private final double average;

    public Person(String name, LocalDate dayOfBirth,
                  int zipCode, double average) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.zipCode = zipCode;
        this.average = average;
    }

    @Override
    public String toString() {
        return "name= " + name + ", dayOfBirth= " + dayOfBirth +
                ", zipCode= " + zipCode + ", average= " + average;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAverage() {
        return average;
    }
}
