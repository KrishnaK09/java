package oct12;

public class Findmaxmin {
    public static void main(String[] args) {
        int[] array = {10, 330, 230, 4220, 5120, 34223};

        int max = array[array.length-1];
        int min = array[array.length-1];

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
