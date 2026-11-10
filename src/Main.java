// getting the Scanner package from Java
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // Getting User Input with Java

        // The scanner object can now read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        // If you don't want spaces to get user input, you can use the class next() instead
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); // if I give an input of a double with nextInt class, it will give me an error

        System.out.println("How much money do you have left: ");
        double moneyLeft = scanner.nextDouble();

        System.out.println("Are you are student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You have £" + moneyLeft + " left");
        if (isStudent){
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are NOT a student");
        }

        // it is good practice to close, otherwise it could lead to unexpected behaviour
        scanner.close();
    }
}
