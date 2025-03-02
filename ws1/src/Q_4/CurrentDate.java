import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDate {
    public static void main(String[] args) {
        
        LocalDate currentDate = LocalDate.now();

        
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMM yyyy");

      
        String formattedCurrentDate = currentDate.format(dateFormatter);

        
        System.out.println("Current Date: " + formattedCurrentDate);
    }
}
