package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number: ");
        int num = scanner.nextInt();
        System.out.println("Divisible by 3: " + (num % 3 == 0));
    }
}
