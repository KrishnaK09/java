package oct12;

public class Matrixaddition {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int[][] result = add(array1, array2);
        printresult(result);
    }

    public static int[][] add(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];

            }

        }
        return result;
    }

    public static void printresult(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }
}
