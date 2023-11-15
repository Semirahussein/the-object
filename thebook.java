
import java.time.LocalDate;
import java.time.Period;

public class thebook {
    public String title;
    public String author;
    public LocalDate publishedDate;

    thebook(String title, String author, String publishedDate) {
        this.title = title;
        this.author = author;
        this.publishedDate = LocalDate.parse(publishedDate);
    }

    public int period() {
        int age = Period.between(this.publishedDate, LocalDate.now()).getYears();
        return age;
    }
}