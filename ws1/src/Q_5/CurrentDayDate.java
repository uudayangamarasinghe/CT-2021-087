import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CurrentDayDate {
    public static void main(String[] args) {
        
        LocalDate currentDate = LocalDate.now();

       
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.ENGLISH);

       
        String formattedCurrentDate = currentDate.format(dateFormatter);
        System.out.println(formattedCurrentDate);
    }
}
