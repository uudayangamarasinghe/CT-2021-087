import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double tempFahrenheit = input.nextDouble();

        double tempCelsius = (5.0 / 9.0) * (tempFahrenheit - 32);

        System.out.println("Temperature in Celsius: " + tempCelsius);
        input.close();
    }
}
