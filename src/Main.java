public class Main {

    public static void main(String[] args){

        // Variables = a reusable container for a value
        //             a variable behaves as if it was the value it contains

        // Primitive = simple value stored directly in memory
        // Reference = memory address (stack) that points to the (heap)

        // Primitive vs Reference
        // ---------    ---------
        // int       |  string
        // double    |  array
        // char      |  object
        // boolean   |

        // 2 steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        int age = 18;
        int birthYear = 2008;
        int quantity = 24;

        double temperature = 8.5;
        double price = 5.99;

        char currency = '£';
        char grade = 'A';

        boolean isAdult = true;
        boolean isOnline = false;

        String name = "Mehtaab";
        String email = "meetmak9@gmail.com";

        System.out.println("My age is " + age);
        System.out.println("Your birth year is " + birthYear);
        System.out.println("We only have " + quantity + " left!");

        if (isOnline){
            System.out.println("You are online!");
        }
        else {
            System.out.println("You are NOT online!");
        }

    }
}
