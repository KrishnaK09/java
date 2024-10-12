package oct5;

public class Book {
    public static void main(String[] args) {
        BookDetail bd = new BookDetail();
        BookDetail bd2 = new BookDetail("JAVA");
        BookDetail bd3 = new BookDetail("Java","kkkk");
        BookDetail bd4 = new BookDetail("java","kkkk",2005,150,"Learn");

        System.out.println(bd2.getTitle());

        System.out.println(bd3.getAuthor());
        System.out.println(bd3.getAuthor());


        System.out.println(bd4.getYearpublished());
        System.out.println(bd4.getPrice());
        System.out.println(bd4.getGenre());
        

    }
}
