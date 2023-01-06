package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {

        List<String> favouriteThings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Favorite film: ");
        favouriteThings.add(scanner.nextLine());

        System.out.print("Favorite actor: ");
        favouriteThings.add(scanner.nextLine());

        System.out.print("Favorite animal: ");
        favouriteThings.add(scanner.nextLine());

        System.out.print("Favorite music: ");
        favouriteThings.add(scanner.nextLine());

        System.out.println(favouriteThings.size());
        for (String s: favouriteThings) {
            System.out.println(s);
        }
    }
}
