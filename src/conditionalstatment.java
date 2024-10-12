public class conditionalstatment {
    public static void main(String[] args) {

// even or odd
        int num = 7;

        if (num % 2 == 0) {
            System.out.println("even num :" + num);
        } else {
            System.out.println("odd num :" + num);
        }

        // positive or negative

        int i = 2;
        if (i >0) {
            System.out.println("positive num :" + i);
        } else {
            System.out.println("negetive num :" + i);
        }

        //given year is leap or not ,2024
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }

        // age is eligible for drive

        int age = 17;
        if (age >= 18) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }

    }
}
