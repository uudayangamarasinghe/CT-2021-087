import java.util.Scanner;

public class OddLengthWord {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner inputScanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an odd-length word: ");
        String userInput = inputScanner.nextLine();

        // Close the scanner
        inputScanner.close();

        // Get the length of the word
        int wordLength = userInput.length();

        // Check if the word has an odd length
        if (wordLength % 2 == 1) {
            int middleIndex = wordLength / 2; // Calculate middle index
            char middleCharacter = userInput.charAt(middleIndex); // Get middle character

            // Display output
            System.out.println("Middle character: " + middleCharacter);
        } else {
            System.out.println("Error: The word must have an odd number of characters.");
        }
    }
}
