import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // if statements

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        // name verification

        System.out.println("What is your name?");
        name = scanner.nextLine();

        if (name.isEmpty()){
            System.out.println("You have not entered your name");
        }
        else {
            System.out.println("Hello " + name);
        }

        // Age verification

        System.out.println("What is your age: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult!");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else {
            System.out.println("You are a child!");
        }

        scanner.close();
    }
}
