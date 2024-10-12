import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int attempt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter YOUR NUMBER HERE");
        int usernumber = sc.nextInt();
        while (attempt <=2 && attempt >= 0) {
            if (usernumber == 22) {
                System.out.println("CONGRATULATIONS YOU WIN");
                break;
            } else {
                System.out.println("OOPS TRY AGAIN");
                usernumber = sc.nextInt();
                attempt++;

            }

        }
    }

}