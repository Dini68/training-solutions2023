package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        String menu = "1. Felhasználók listázása\n2. Felhasználó felvétele\nTöbbi: Kilépés";

        System.out.println(menu);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        String num = scanner.nextLine();

        if (num.equals("1")) {
            System.out.println("Felhasználók listázása");
        }
        else if (num.equals("2")) {
            System.out.println("Felhasználók felvétele");
        }

    }
}
