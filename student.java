import java.time.LocalDate;
import java.time.Period;

public class student {
    public String studname;
    public LocalDate birth;
    public char section;

    student(String name, String birth) {
        this.studname = name;
        this.birth = LocalDate.parse(birth);
    }

    public int age() {
        int age = Period.between(this.birth, LocalDate.now()).getYears();
        return age;
    }
}
