import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double lengthCm = scanner.nextDouble();

        double totalInches = lengthCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Equivalent Length: " + feet + " feet " + inches + " inches");

        scanner.close();
    }
}
