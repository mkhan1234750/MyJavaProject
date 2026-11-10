public class Main {

    public static void main(String[] args) {

        // printf() = is a method used to format output

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s", name); // %s for string
        System.out.printf("\nYour name starts with an %c", firstLetter); // %c for chars
        System.out.printf("\nYou are %d years old", age); // %d is kind of confusing but just gotta remember.
        System.out.printf("\nYou are %f cm tall", height); // %f for double
        System.out.printf("\nEmployed: %b", isEmployed); // %b for boolean

        System.out.printf("\n%s is %d years old", name, age); // you can combine variables aswell.
    }
}
