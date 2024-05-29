package Examination;

import java.util.Scanner;

/**
 * Вернуть сумму двух чисел
 * - public static int result (int sum1, int sum2)
 */
public class Task_8_resultSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int sum1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int sum2 = scanner.nextInt();
        System.out.println("Результат: ");
        System.out.println(result(sum1, sum2));
    }
    public static int result(int sum1, int sum2) {
        return sum1 + sum2;
    }
}
