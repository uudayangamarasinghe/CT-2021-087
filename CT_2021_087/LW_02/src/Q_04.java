import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter body weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        double dailyCalories = weightPounds * 19;

        System.out.println("Daily Calorie Requirement: " + dailyCalories);
        scanner.close();
    }
}
