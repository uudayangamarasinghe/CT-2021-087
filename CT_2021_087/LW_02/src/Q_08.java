import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double sphereRadius = input.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);

        System.out.println("Volume of the sphere: " + volume);

        input.close();
    }
}
