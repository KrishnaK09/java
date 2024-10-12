package oct5;

public class BookDetail {
    String title;
    String author;
    int Yearpublished;
    double price;
    String genre;

    public BookDetail() {
    }

    public BookDetail(String title) {
        this.title = title;
    }

    public BookDetail(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public BookDetail(String title, String author, int Yearpublished, double price, String genre) {
        this.title = title;
        this.author = author;
        this.Yearpublished = Yearpublished;
        this.price = price;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearpublished() {
        return Yearpublished;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearpublished(int yearpublished) {
        this.Yearpublished = yearpublished;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
