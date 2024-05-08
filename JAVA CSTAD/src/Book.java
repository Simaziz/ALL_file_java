import java.time.LocalDate;
import java.util.UUID;

public class Book {
    private UUID uuid;
    private String title;
    private String author;
    private String genre;
    private Integer pages;
    private LocalDate publishedDate;
    public Book(){};
    public Book(UUID uuid, String title, String author, String genre, Integer pages, LocalDate publishedDate){
        this.uuid = uuid;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.publishedDate = publishedDate;
    }
    public void setUuid(UUID uuid){
        this.uuid = uuid;
    }
    public UUID getUuid(){
        return this.uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "uuid=" + uuid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", publishedDate=" + publishedDate +
                '}';
    }
}
