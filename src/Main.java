import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = "bum";

        // int length = name.length();
        // char letter = name.charAt(1);
        // int index = name.indexOf("b");
        // int lastIndex = name.lastIndexOf("b");

        // name = name.toUpperCase();
        //name = name.toLowerCase();
        // name = name.trim();
        //name = name.replace("M", "m");

        /*
        if (name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else {
            System.out.println("Hello " + name);
        }

         */

        /*
        if(name.contains(" ")){
            System.out.println("Your name contains space(s)");
        }
        else {
            System.out.print("Your name doesn't contain any space");
        }

         */

        if(name.equalsIgnoreCase("bum")){
            System.out.println("Your name can't be bum");
        }
        else {
            System.out.printf("Hello %s", name);
        }

    }
}
