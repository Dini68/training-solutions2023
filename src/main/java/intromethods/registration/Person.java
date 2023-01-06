package intromethods.registration;

import java.time.LocalDate;

public class Person {

    private final String name;
    private final LocalDate dateOfBirth;
    private final String email;

    public Person(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDate of birth: " +
                dateOfBirth + "\nEmail: " + email;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }
}
