import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Sphere

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI + Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI + Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI + Math.pow(radius, 3);

        System.out.printf("\nCircumference is: %.1fcm", circumference);
        System.out.printf("\nArea is: %.1fcm^2", area);
        System.out.printf("\nVolume is: %.1fcm^3", volume);

        scanner.close();
    }
}
