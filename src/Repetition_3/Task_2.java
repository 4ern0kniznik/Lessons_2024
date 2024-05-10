package Repetition_3;
/**
 * Реализовать программу, которая пока работает, принимает на вход от пользователя
 * два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
 * результат деления и выводит его в консоль. Программа останавливает свою работу
 * тогда, когда пользователь вводит 0 в качестве делителя.
 * (для этих вещественных чисел необходимо использовать тип ​double​ и метод
 * nextDouble() ​у ​Scanner’​а соответственно).
 */

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");

        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            // 1 2
            // 1 / 2 = 0.5

            if (b == 0)
                break;
            System.out.println("Результат деления: ");
            System.out.println(a/b);
            System.out.println("Введите два числа:");
        }
    }
}

