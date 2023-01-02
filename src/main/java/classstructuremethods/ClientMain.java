package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        client.setName(scanner.nextLine());

        System.out.print("Year of birth: ");
        client.setYear(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Address: ");
        client.setAddress(scanner.nextLine());

        System.out.println("Name: " + client.getName());
        System.out.println("Year of birth: " + client.getYear());
        System.out.println("Address: " + client.getAddress());

        System.out.print("New Address: ");
        client.migrate(scanner.nextLine());
        System.out.println("The address has changed: "
                + client.getAddress());

    }
}
