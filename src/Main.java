import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celcius or Farenheit? (C or F): ");
        unit = scanner.nextLine().toUpperCase();

        // (condition) ? true : false


        // If unit equals C, then it'll convert to farenheight
        // Otherwise, it'll convert to Celcius.
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.2f %s", newTemp, unit);

        scanner.close();

    }
}
