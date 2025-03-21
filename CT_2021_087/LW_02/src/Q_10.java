import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanPrincipal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter loan period (years): ");
        int loanYears = scanner.nextInt();

        final int MONTHS_IN_YEAR = 12;
        double monthlyInterestRate = annualRate / 100.0 / MONTHS_IN_YEAR;
        int totalPayments = loanYears * MONTHS_IN_YEAR;

        double monthlyPayment = (loanPrincipal * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -totalPayments));
        double totalPayment = monthlyPayment * totalPayments;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);

        scanner.close();
    }
}
