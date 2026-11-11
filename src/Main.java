import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;


        int number = 4;

        // Checks whether the number is even or odd

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(evenOrOdd);
    }
}
