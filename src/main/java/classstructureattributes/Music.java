package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song song = new Song();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Band: ");
        song.setBand(scanner.nextLine());

        System.out.print("Title: ");
        song.setTitle(scanner.nextLine());

        System.out.print("Length: ");
        song.setLength(scanner.nextInt());

        System.out.println(song.getBand() + " - " +
                song.getTitle() + " (" + song.getLength() + " perc)");

    }
}
