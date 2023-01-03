package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". number: ");
            num = scanner.nextInt();
            sum += num;
        }

        System.out.println(sum);
    }
}
