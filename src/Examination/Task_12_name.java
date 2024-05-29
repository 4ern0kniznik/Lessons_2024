package Examination;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Ничего не возвращать, метод принимает текст с цифрой через пробел, вывести первое слово
 * в консоль столько раз, сколько цифра
 */
public class Task_12_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String a = scanner.nextLine();
        name(a);
    }
    public static void name(String text) {
        String[] a = text.split(" ");
        String word = a[0];
        int b = Integer.parseInt(a[1]);
        for (int i = 0; i < b; i++) {
            System.out.println(word);
        }
    }
}
