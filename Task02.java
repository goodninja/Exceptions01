// 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Random;

public class Task02 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        printArray1(arr);
        int[] arr1 = randomArray(arr);
        printArray1(arr1);
        int[] arr2 = randomArray(arr);
        printArray1(arr2);
        mergeArrays(arr1, arr2);
        printArray2(mergeArrays(arr1, arr2));

    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] newArray = new int[Math.max(array1.length, array2.length)];

        if (array1.length != array2.length) {
            System.out.println("Не совпадает длина массивов");
        }

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array1[i] + array2[i];
        }
        return newArray;
    }

    private static int[] randomArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    public static void printArray1(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray2(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}