package weektwo;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private final List<String> titles = new ArrayList<>();

    public void add(String title) {
        titles.add(title);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> findBooks = new ArrayList<>();

        for (String title: titles) {
            if (title.toLowerCase().startsWith(prefix.toLowerCase())) {
                findBooks.add(title);
            }
        }

        return findBooks;
    }

    public List<String> getTitles() {
        return titles;
    }

    public static void main(String[] args) {

        Books books = new Books();

        books.add("Java alapok");
        books.add("Java haladó");
        books.add("Python alapok");

        System.out.println(books.getTitles());

        System.out.println(books.findAllByPrefix("Java"));
        System.out.println(books.findAllByPrefix("Python"));
        System.out.println(books.findAllByPrefix("java"));
    }
}
