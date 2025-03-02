import java.util.Scanner;

public class FullNameFormatter {
    public static void main(String[] args) {
       
        Scanner userInputScanner = new Scanner(System.in);

        
        System.out.print("Enter your full name (First Middle Last): ");
        String completeName = userInputScanner.nextLine();

        
        userInputScanner.close();

        
        String[] nameComponents = completeName.split(" ");

        // Check if there are exactly three parts (First, Middle, Last)
        if (nameComponents.length == 3) {
            String firstName = nameComponents[0];
            String middleName = nameComponents[1];
            String lastName = nameComponents[2];

            // Get the middle initial
            char middleInitial = middleName.charAt(0);

            // Format and display the output
            System.out.println(lastName + ", " + firstName + " " + middleInitial + ".");
        } else {
            System.out.println("Error: Please enter your name in the format 'First Middle Last'.");
        }
    }
}
