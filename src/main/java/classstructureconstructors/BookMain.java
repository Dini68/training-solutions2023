package classstructureconstructors;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Reg number: ");
        String regNum = scanner.nextLine();

        Book book = new Book(author, title);
        book.register(regNum);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Reg number: " + book.getRegNumber());
    }

}
