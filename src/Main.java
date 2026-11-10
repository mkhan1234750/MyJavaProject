import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // HYPOTENUSE OF TRIABLE = Math.sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);

        // Sides of triangle

        double a;
        double b;
        double c;

        System.out.print("Enter side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse of triangle (Side C) is: " + c);

        scanner.close();
    }
}
