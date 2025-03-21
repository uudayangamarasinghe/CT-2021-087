import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // (a) The square root of B² + 4AC
        System.out.print("Enter values for B, A, and C: ");
        double varB = scanner.nextDouble();
        double varA = scanner.nextDouble();
        double varC = scanner.nextDouble();
        double resultA = Math.sqrt(Math.pow(varB, 2) + 4 * varA * varC);
        System.out.println("Result (a): " + resultA);

        // (b) The square root of X + 4Y³
        System.out.print("Enter values for X and Y: ");
        double varX = scanner.nextDouble();
        double varY = scanner.nextDouble();
        double resultB = Math.sqrt(varX + 4 * Math.pow(varY, 3));
        System.out.println("Result (b): " + resultB);

        // (c) The cube root of the product of X and Y
        double resultC = Math.cbrt(varX * varY);
        System.out.println("Result (c): " + resultC);

        // (d) The area of a circle (πr²)
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}
