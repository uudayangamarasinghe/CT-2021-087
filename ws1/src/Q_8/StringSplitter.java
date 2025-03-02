import java.util.Scanner;

public class StringSplitter {
    public static void main(String[] args) {
       
        Scanner userInputScanner = new Scanner(System.in);

       
        System.out.print("Enter a string containing a single exclamation mark (!): ");
        String userInput = userInputScanner.nextLine();

        
        userInputScanner.close();

        
        int exclamationIndex = userInput.indexOf('!');

       
        if (exclamationIndex == -1 || userInput.indexOf('!', exclamationIndex + 1) != -1) {
            System.out.println("Error: The input must contain exactly one exclamation mark.");
            return;
        }

       
        String substringBefore = userInput.substring(0, exclamationIndex).trim();
        String substringAfter = userInput.substring(exclamationIndex + 1).trim();


        System.out.println(substringBefore);
        System.out.println(substringAfter);
    }
}

