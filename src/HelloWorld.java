import java.time.LocalDate;
public class HelloWorld {

    public static void main(String[] args) {
        int startYear = 2019;
        int currentYear = LocalDate.now().getYear();
        int diff = currentYear - startYear;
        System.out.println(diff);
        
        //Hello there
    }
}
