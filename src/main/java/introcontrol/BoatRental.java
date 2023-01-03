package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of Persons: ");
        int persons = scanner.nextInt();

        if (persons < 3) {
            System.out.println("2-person boat is rented, " +
                    "and 8 more people can go");
        } else if (persons == 3) {
            System.out.println("3-person boat is rented, " +
                    "and 7 more people can go");
        } else if (persons < 6) {
            System.out.println("5-person boat is rented, " +
                    "and 5 more people can go");
        } else if (persons < 8) {
            System.out.println("5- and 2-person boat is rented, " +
                    "and 3 more people can go");
        } else if (persons == 8) {
            System.out.println("5- and 3-person boat is rented, " +
                    "and 2 more people can go");
        } else if (persons < 11) {
            System.out.println("5- and 3- and 2 person boat is rented, " +
                    "and 0 more people can go");
        } else {
            System.out.println("5- and 3- and 2 person boat is rented, " +
                    "and " + (persons - 10) + " people waiting for the boat");
        }
    }
}
