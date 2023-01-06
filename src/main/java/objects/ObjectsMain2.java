package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain2 {

    public static void main(String[] args) {

        Book[] bookArr = {new Book(), new Book(), new Book()};

        List<Book> books =
                Arrays.asList(new Book(), new Book(), new Book());

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book());
        bookList.add(new Book());
        bookList.add(new Book());

        System.out.println(Arrays.toString(bookArr));
        System.out.println(books);
        System.out.println(bookList);
    }
}
