package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy egész számot: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérek egy másik egész számot: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(num1 + " + " + num2);
        System.out.println(num1 + num2);
    }
}
