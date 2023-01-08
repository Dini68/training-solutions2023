package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

    private final List<String> titles = new ArrayList<>();

    public List<String> getTitles() {
        return titles;
    }

    public void addBook(String title) {
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title,
                                       String author) {
        int index = -1;
        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).equals(title)) {
                index = i;
            }
        }

        if (index != -1) {
            titles.set(index, author + ": " + titles.get(index));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Books books = new Books();

        System.out.print("Number of books: ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.print(i + 1 + ". könyv címe: ");
            books.addBook(scanner.nextLine());
        }
        System.out.println(books.getTitles());

        books.findBookAndSetAuthor("Egri cs", "Gárdonyi");

        System.out.println(books.getTitles());

        books.findBookAndSetAuthor("Egri csillagok",
                "Gárdonyi Géza");

        System.out.println(books.getTitles());
    }
}
