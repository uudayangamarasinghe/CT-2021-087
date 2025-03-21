import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial investment (P): ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (R) in %: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter number of years (N): ");
        int years = scanner.nextInt();

        double finalAmount = principalAmount * Math.pow((1 + interestRate / 100), years);

        System.out.println("Amount after " + years + " years: " + finalAmount);

        scanner.close();
    }
}
