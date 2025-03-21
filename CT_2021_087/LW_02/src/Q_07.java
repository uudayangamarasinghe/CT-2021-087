import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weightKg = scanner.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double heightCm = scanner.nextDouble();

        double bmi = weightKg / Math.pow(heightCm / 100.0, 2);

        System.out.println("Your BMI is: " + bmi);

        scanner.close();
    }
}
