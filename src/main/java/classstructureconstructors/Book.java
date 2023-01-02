package classstructureconstructors;

public class Book {

    private final String author;
    private final String title;
    private String regNumber;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void register(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
