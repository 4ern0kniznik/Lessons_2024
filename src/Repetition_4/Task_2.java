package Repetition_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000
 * Затем, используя циклы ​for each​ вывести:
 * - наибольший элемент массива
 * - наименьший элемент массива
 * - количество элементов массива, оканчивающихся на 0
 * - сумму элементов массива, оканчивающихся на 0
 * Использовать сортировку запрещено.
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int arrayLength = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[arrayLength];
        // Заполнение массива случайными числами
        for (int i = 0; i < arrayLength; i++)
            array[i] = random.nextInt(10000);

        System.out.print("Массив: ");
        System.out.println(Arrays.toString(array));
    }
}
