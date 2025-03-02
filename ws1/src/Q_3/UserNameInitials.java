import java.util.Scanner;

public class UserNameInitials {
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);

        
        System.out.print("Enter your given name: ");
        String givenName = inputScanner.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = inputScanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = inputScanner.nextLine();

        
        String middleInitial = middleName.charAt(0) + ".";

       
        System.out.println("Formatted Name: " + givenName + " " + middleInitial + " " + surname);

       
        inputScanner.close();
    }
}
