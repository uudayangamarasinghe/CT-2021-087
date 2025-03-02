import java.util.Scanner;

public class StringInfo {
    public static void main(String[] args) {
      

        Scanner inputScanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String userInput = inputScanner.nextLine();

        
        inputScanner.close();

        
        int stringLength = userInput.length();

        
        if (stringLength > 0) {
            char firstCharacter = userInput.charAt(0);
            char lastCharacter = userInput.charAt(stringLength - 1);

            // Display output
            System.out.println(stringLength);
            System.out.println(firstCharacter);
            System.out.println(lastCharacter);
        } else {
            System.out.println("Error: Empty string entered.");
        }
    }
}
