import java.util.Scanner;

public class dwhilexample {
    public static void main(String[] str) {

        //sum of natural numbers


        int x = 0;
        do {
            x = x + 1;
            System.out.println("sum  :   " + x);
        } while (x < 100);


        //print product table of 5 or any numbers

      /*  5 * 1 = 5
        5 * 2 = 10
        5 * 3 = 15
        */
        int a = 1;
        int b = 0;
        do {
            b = 5 * a;
            a++;
            System.out.println("table  :   " + b);

        } while (a <= 10);


        // factorial?

        long factorial = 1;
        int i = 20;
        do {
            factorial = factorial * i;
            i--;
            System.out.println("factorial number:   " + i);
        } while (i >= 1);

    }
}
