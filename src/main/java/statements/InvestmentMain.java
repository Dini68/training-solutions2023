package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Befektetés összege: ");
        int fund = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kamatláb: ");
        int rate = scanner.nextInt();
        scanner.nextLine();

        Investment in = new Investment(fund, rate);
        System.out.println("Tőke: " + in.getFund());
        System.out.println("Hozam 50 napra: "
                + in.getYield(50));

        System.out.println("Kivett összeg 80 nap után: "
                + in.close(80));

        System.out.println("Kivett összeg 90 nap után: "
                + in.close(90));
    }
}
