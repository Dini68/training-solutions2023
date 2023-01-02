package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. hour: ");
        int hour = scanner.nextInt();
        scanner.nextLine();

        System.out.print("1. minute: ");
        int minute = scanner.nextInt();
        scanner.nextLine();

        System.out.print("1. second: ");
        int second = scanner.nextInt();
        scanner.nextLine();

        Time firstTime = new Time(hour, minute, second);

        System.out.print("2. hour: ");
        hour = scanner.nextInt();
        scanner.nextLine();

        System.out.print("2. minute: ");
        minute = scanner.nextInt();
        scanner.nextLine();

        System.out.print("2. second: ");
        second = scanner.nextInt();
        scanner.nextLine();

        Time anotherTime = new Time(hour, minute, second);

        System.out.println("Az első időpont " + firstTime +
                " = " + firstTime.getInMinutes() + " perc");

        System.out.println("A második időpont " + anotherTime +
                " = " + anotherTime.getInSeconds() + " másodperc");

        System.out.println("Az első korábbi, mint a második: " +
                firstTime.earlierThan(anotherTime));

    }
}
