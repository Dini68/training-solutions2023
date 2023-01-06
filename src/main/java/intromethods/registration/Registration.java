package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration re = new Registration();

        System.out.print("First name: ");
        String firstname = scanner.nextLine();

        System.out.print("Last ame: ");
        String lastname = scanner.nextLine();

        String fullName = re.concatName(firstname, lastname);

        System.out.print("Year of birth: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Month of birth: ");
        int month = Integer.parseInt(scanner.nextLine());

        System.out.print("Day of birth: ");
        int day = Integer.parseInt(scanner.nextLine());

        LocalDate dateOfBirth = re.concatBirth(year, month, day);

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Person pe = new Person(fullName, dateOfBirth, email);

        System.out.println(pe);

    }

    private String concatName(String firstname,
                                 String lastname) {
        return firstname + " " + lastname;
    }

    private LocalDate concatBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }


}
