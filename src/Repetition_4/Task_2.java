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
        int [] array = new int[100];

        // Заполнение массива случайными числами
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        // Выводим наибольший элемент массива
        int max = 0;
        for(int element : array){
            if(element > max)
                max = element;
        }
        System.out.println("Наибольший элемент массива: " + max);

        // Выводим наименьший элемент массива
        int min = 10000;
        for(int element : array){
            if(element < min)
                min = element;
        }
        System.out.println("Наименьший элемент массива: " + min);

        // Выводим количество элементов массива, оканчивающихся на 0
        int counter = 0;
        for(int element : array){
            if(element % 10 == 0)
                counter++;
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + counter);

        // Выводим сумму элементов массива, оканчивающихся на 0
        int sum = 0;
        for(int element : array){
            if(element % 10 == 0)
                sum += element;
        }
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);


    }
}
