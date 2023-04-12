// 1. Реализуйте метод checkArray(Integer[] arr), 
// принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

import java.util.Random;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        fillingArray(arr);
        checkingArray(arr);
    }

    private static void fillingArray(Integer[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }

    public static Integer[] randomArray() {
        Random rnd = new Random();
        int[] AI = new int[10];
        int min, max;
        Scanner input = new Scanner(System.in);
        System.out.print("min = ");
        min = input.nextInt();

        System.out.print("max = ");
        max = input.nextInt();

        input.close();
        
        for (int i = 0; i < AI.length; i++)
        AI[i] = min + Math.abs(rnd.nextInt()) % (max - min + 1);
        
        System.out.println("\nAI:");
        
        for (int i = 0; i < 10; i++)
        System.out.println(AI[i]);
        return new Integer[0];
    }

    public static void checkingArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("В массиве содержится следующее кол-во null-элементов:" + i);

            } else {
                System.out.println("Проверка выполнена успешно");
            }
        }
    }
}