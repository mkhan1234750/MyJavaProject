import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // COMMOM ISSUES WITH SCANNER
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // gets rid of the input buffer that causes the problem

        System.out.println("Enter your favourite colour");
        String colour = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the colour " + colour);

        scanner.close();
    }
}
