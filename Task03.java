// 3*. Реализуйте метод, принимающий в качестве аргументов двумерный массив.
// Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
// детализировать какие строки со столбцами не требуется.

import java.util.Random;

public class Task03 {

    public static void main(String[] args) {
        createRandomArray();
        printArray(createRandomArray());
        checkMatrixLength(createRandomArray());

    }

    private static int[][] createRandomArray() {
        Random rnd = new Random();
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(2);
            }
        }

        return matrix;
    }

    public static boolean checkMatrixLength(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                System.out.println("Длина строк и столбцов с одинаковым индексом не одинакова");
                return false;
            }
        }
        System.out.println("Длина строк и столбцов с одинаковым индексом одинакова");
        return true;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}