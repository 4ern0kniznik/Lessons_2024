package Repetition_2;

import java.util.Scanner;

/**
 * Реализовать программу №2, используя цикл ​while​.
 */
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа a и b:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int t = a+1;
        while (t < b) {
            if (t % 5 == 0 && t % 10 != 0) {
                System.out.println(t);
            }
            t++;
        }
    }
}
