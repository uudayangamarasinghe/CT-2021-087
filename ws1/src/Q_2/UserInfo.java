import javax.swing.*;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
       
        Scanner inputScanner = new Scanner(System.in);

       
        System.out.print("Enter your given name: ");
        String givenName = inputScanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = inputScanner.nextLine();

       
        String completeName = givenName + " " + surname;

        
        inputScanner.close();

        
        SwingUtilities.invokeLater(() -> {
            
            JFrame userFrame = new JFrame(completeName);

            
            userFrame.setSize(400, 300);

            
            userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
            userFrame.setVisible(true);
        });
    }
}
