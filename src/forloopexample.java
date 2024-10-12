public class forloopexample {
    public static void main(String[] str) {

        for (int i = 0; i <= 100; i++) {
            int result = i % 7;
            if (result == 0) {
                System.out.println("Krishna");
            } else {
                System.out.println(i);

            }

        }


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" " +i*j);
            }
            System.out.println();
        }


        /*

        Niagra falls casino
        1-100
        ENter lucky number
        number of attempts 3

        */
    }
}
