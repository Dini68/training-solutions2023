package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ExamRegistration er = new ExamRegistration();

        String name = er.getName();

        LocalDate dayOfBirth = er.getLocalDate();

        int zipCode = er. getZipCode();

        double average = er. getAverage();

        Person person1 = new Person(name, dayOfBirth,
                zipCode, average);

        Exam exam = new Exam();
        exam.addPerson(person1);

        System.out.println(exam.getPersons());
    }

    private String getName() {
        System.out.print("Name: ");
        return scanner.nextLine();
    }

    private double getAverage() {
        System.out.print("Average: ");
        String averageStr = scanner.nextLine();
        return Double.parseDouble(averageStr);
    }

    private int getZipCode() {
        System.out.print("Zip code: ");
        String zipCodeStr = scanner.nextLine();
        return Integer.parseInt(zipCodeStr);
    }

    private LocalDate getLocalDate() {
        System.out.print("Day of birth (yyyy.hh.dd): ");
        String dayOfBirthStr = scanner.nextLine();
        return LocalDate.of(
                Integer.parseInt(dayOfBirthStr.substring(0, 4)),
                Integer.parseInt(dayOfBirthStr.substring(5, 7)),
                Integer.parseInt(dayOfBirthStr.substring(8))
            );
    }
}
