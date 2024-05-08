
import java.time.LocalDate;
import java.util.UUID;

public class Maain {
    public static void main(String[] args) {
        Book [] books = new
                Book[3];
        books[0] = new Book(
                UUID.randomUUID(),
                "C#",
                "Author name",
                "Programming book",
                300,
                LocalDate.of(2002,9,28)
        );
        books[1] = new Book();
        books[1].setUuid(UUID.randomUUID());
        books[1].setTitle("Java");
        books[1].setAuthor("Game Gosling");
        books[1].setGenre("Java Programming Language");
        books[1].setPages(300);
        books[1].setPublishedDate(LocalDate.now());
//        book2
        books[2] = new Book();
        books[2].setUuid(UUID.randomUUID());
        books[2].setTitle("Python");
        books[2].setAuthor("Kaka");
        books[2].setGenre("Python");
        books[2].setPages(400);
        books[2].setPublishedDate(LocalDate.of(2003,7,3));
        for(Book book : books){
            System.out.println(book);
        }
    }
}