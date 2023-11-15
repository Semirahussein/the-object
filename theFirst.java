import java.time.LocalDate;
import java.time.Period;

class theFirst {
        public static void main(String[] args) {
                student freshman = new student("semi", "2001-12-05");
                // freshman.studname = ;
                // freshman.birth = LocalDate.parse();
                student unfreshman = new student("abudi", "1993-03-06");
                // unfreshman.studname = ;
                // unfreshman.birth = LocalDate.parse();
                // unfreshman.section = 'E';
                thebook thebook = new thebook("my vampire system", "JKS", "2020-03-10");
                // thebook.title = ;
                // thebook.author = ;
                // thebook.publishedDate = LocalDate.parse();
                // thebook.age();
                System.out.printf("%s was born in whatever is: %s. and she is now %d years old.",
                                freshman.studname, freshman.birth.toString(), freshman.age());
                System.out.printf("%s has got merried with %s and he was born in %s and now he is %d years old.",
                                unfreshman.studname, freshman.studname, unfreshman.birth.toString(), unfreshman.age());
                System.out.printf(
                                "i have been reading the book with the title %s that is written by %s and  published in %s and now it has been %d years.",
                                thebook.title, thebook.author, thebook.publishedDate.toString(), thebook.period());
                /*
                 * system.out.
                 * printf("i have been reading the book with the title %s that is written by %s and published in %s."
                 * ,
                 * thebook.title, thebook.author, thebook.publishedDate.toString);
                 * 
                 */ }
}
