package Repetition_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * С клавиатуры вводится число ​n​ - размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10 Затем вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int arrayLength = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[arrayLength];
// Заполнение массива случайными числами
        for (int i = 0; i < arrayLength; i++)
            array[i] = random.nextInt(10);

        System.out.print("Массив: ");
        System.out.println(Arrays.toString(array));

        // Длина массива
        System.out.println("Длина массива: ");
        System.out.println(array.length);

        // Кол-во чисел больше 8
        System.out.println("Кол-во чисел больше 8: ");
        int counter8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
            counter8++;
        }
        System.out.println(counter8);

        // Кол-во чисел равных 1
        System.out.println("Кол-во чисел равных 1: ");
        int counter1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                counter1++;
        }
        System.out.println(counter1);

        // Кол-во четных чисел
        System.out.println("Кол-во четных чисел : ");
        int counterEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                counterEven++;
        }
        System.out.println(counterEven);

        // Кол-во нечетных чисел
        System.out.println("Кол-во нечетных чисел : ");
        int counterOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                counterOdd++;
        }
        System.out.println(counterOdd);

        // Сумма всех элементов массива
        System.out.println("Сумма всех элементов массива : ");

        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
