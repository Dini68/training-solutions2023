package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Java alapok");

        System.out.println(book.getTitle());

        book.setTitle("Python alapok");

        System.out.println(book.getTitle());
    }
}
