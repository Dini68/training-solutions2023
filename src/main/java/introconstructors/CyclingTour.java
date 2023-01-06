package introconstructors;

import java.time.LocalDate;

public class CyclingTour {

    private final String description;
    private final LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person) {
        this.numberOfPeople += person;
    }

    public void ride(double km) {
        this.kms += km;
    }

    public static void main(String[] args) {
        CyclingTour ct = new CyclingTour("Kékestető",
                LocalDate.of(2023,3,30));

        System.out.println(ct.getDescription());
        System.out.println(ct.getStartTime());
        System.out.println(ct.getNumberOfPeople());
        System.out.println(ct.getKms());

        ct.registerPerson(15);

        ct.ride(25);

        System.out.println(ct.getDescription());
        System.out.println(ct.getStartTime());
        System.out.println(ct.getNumberOfPeople());
        System.out.println(ct.getKms());
    }



}
