import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double tempCelsius = input.nextDouble();

        double tempFahrenheit = (1.8 * tempCelsius) + 32;

        System.out.println("Temperature in Fahrenheit: " + tempFahrenheit);
        input.close();
    }
}
