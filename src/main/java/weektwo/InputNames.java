package weektwo;

import java.util.Arrays;
import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + ". név: ");
            names[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(names));
    }
}
