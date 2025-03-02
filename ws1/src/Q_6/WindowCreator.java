import javax.swing.*;
import java.util.Scanner;

public class WindowCreator {
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);

        
        System.out.print("Enter the window title: ");
        String windowTitle = inputScanner.nextLine();

        System.out.print("Enter the width of the window: ");
        int windowWidth = inputScanner.nextInt();

        System.out.print("Enter the height of the window: ");
        int windowHeight = inputScanner.nextInt();

       
        inputScanner.close();

        
        JFrame windowFrame = new JFrame(windowTitle);
        windowFrame.setSize(windowWidth, windowHeight);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.setVisible(true);
    }
}
