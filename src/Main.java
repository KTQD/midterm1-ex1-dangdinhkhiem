public class Main {
    public static void main(String[] args) {


        MP3 mp3 = new MP3("My MP3", "This is an MP3 player", "1234", 49.99f, 180);


        System.out.println("MP3 Information:");
        mp3.showInfo();
        System.out.println();


        Book book = new Book("My Book", "This is a book", "5678", 19.99f, "John Doe", 200, "Fiction");


        System.out.println("Book Information:");
        book.showInfo();
    }
}
