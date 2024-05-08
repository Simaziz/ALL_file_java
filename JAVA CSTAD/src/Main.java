import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Arrays;
class Boook{
    public String UUID;
    public String title;
    public String [] author;
    public Integer page;
    public LocalDate publishDate;

    public Boook(){};
    public Boook(String UUID,String title,String[] author,Integer page , LocalDate publishDate){
        this.UUID=UUID;
        this.title=title;
        this.author=author;
        this.page=page;
        this.publishDate=publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "UUID='" + UUID + '\'' +
                ", title='" + title + '\'' +
                ", author=" + Arrays.toString(author) +
                ", page=" + page +
                ", publishDate=" + publishDate +
                '}';
    }
}
class TextBook extends Boook{
    public TextBook(String UUID , String title,String[] author ,Integer page , LocalDate publishDate ){
        super(UUID , title,author , page,publishDate);
    }

        public void detail(){
            System.out.println("Book uuid: " + super.UUID);
            System.out.println("Book title: " + super.title);
            System.out.println("Book authors: " + Arrays.toString(super.author));
            System.out.println("Book page: " + super.page);
            System.out.println("Book published date: " + super.publishDate);
        }
    }



public class Main {
    public static void main(String[] args) {
        TextBook srunNgoun = new TextBook(
                UUID.randomUUID().toString(),
                "KongFu panda",
                new String[]{"Boren","Borey"},
                300,
                LocalDate.of(2024,2,2)
        );
        srunNgoun.detail();
    }
}