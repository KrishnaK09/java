import java.util.Scanner;

public class calculatorexample {
    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
        Calcumthd calcumthd = new Calcumthd();
        AddforCal addforcal = new AddforCal();
        SubforCal subforcal = new SubforCal();
        MulforCal mulforcal = new MulforCal();
        boolean is;
        do {

            System.out.println("*********");
            System.out.println("Welcome to my calculator");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            int num = sc.nextInt();

            if (num == 6) {
                System.out.print("Exit Calculator");
                break;
            }

            System.out.print("Enter Number1: ");

            int num1 = sc.nextInt();

            System.out.print("Enter Number2: ");

            int num2 = sc.nextInt();


            switch (num) {
                case 1:
                    System.out.println("Result (Addition): " +  addforcal.add(num1, num2));
                    break;

                case 2:
                    System.out.println("Result (Subtraction): " +subforcal.sub(num1, num2));
                    break;

                case 3:
                    System.out.println("Result (Multiplication): " + mulforcal.mul(num1, num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Result (Division): " + calcumthd.div(num1, num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    if (num2 != 0) {
                        System.out.println("Result (Modulus): " + calcumthd.modu(num1, num2));
                    } else {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
            System.out.println("Do You Want to Continue?");
            System.out.println("press Yes or No");
            String con = sc.next().toString();

            if (con.equalsIgnoreCase("no")) {
                is = false;
                System.out.println("Exit Calculator");
                break;
            } else {
                is = true;
            }

        }
        while (true);
        sc.close();
    }
}
