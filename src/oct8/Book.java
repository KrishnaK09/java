package oct8;

public class Book {
    private String title;
    private String author;


    public Book() {
        this("unknown","unknown");
    }

    public Book(String title) {
        this(title,"unknown");
    }

    public Book(String title, String author) {

        this.author = author;
        this.title = title;
    }

    public void displaydetail() {
        System.out.println("Title: " + title + " Author: " + author);
    }
}
