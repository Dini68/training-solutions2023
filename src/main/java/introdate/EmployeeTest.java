package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Year of birth: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Month of birth: ");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Day of birth: ");
        int day = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(year, month, day, name);

        System.out.println("Name: " + employee.getName());
        System.out.println("Birth: " + employee.getDateOfBirth());
        System.out.println("Begin: " + employee.getBeginEmployment());

        System.out.print("New name: ");
        String newName = scanner.nextLine();
        employee.setName(newName);

        System.out.println("Modified name: " + employee.getName());
        System.out.println("Birth: " + employee.getDateOfBirth());
        System.out.println("Begin: " + employee.getBeginEmployment());

    }
}
