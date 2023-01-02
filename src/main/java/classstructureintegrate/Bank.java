package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Owner: ");
        String owner = scanner.nextLine();

        System.out.print("Balance: ");
        int balance = scanner.nextInt();

        BankAccount ba = new BankAccount(accountNumber, owner
                , balance);
        System.out.println(ba.getInfo());

        System.out.print("Deposit: ");
        int amount = scanner.nextInt();
        ba.deposit(amount);
        System.out.println(ba.getInfo());

        System.out.print("Withdraw: ");
        amount = scanner.nextInt();
        ba.withdraw(amount);
        System.out.println(ba.getInfo());

    }
}
