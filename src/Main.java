public class Main {

    public static void main(String[] args) {

        // printf() = is a method used to format output

        // for precision
        // --------------

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in()
        // space = display a minus if negative, space if positive.

        // for width
        // ---------

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1); // width of the variable. pads it out.
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("\n% .2f", price1); // the 0.3f is for precision of the rounding up.
        System.out.printf("\n% .2f", price2);
        System.out.printf("\n% .2f", price3);

    }
}
