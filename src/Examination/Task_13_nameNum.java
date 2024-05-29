package Examination;

import java.util.Scanner;

/**
 * Ничего не возвращать, метод принимает текст и цифру, вывести в консоль слово
 * столько раз, сколько цифра
 * -public static void name (String text, int num)
 */
public class Task_13_nameNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        System.out.println("Введите цифру: ");
        int num = scanner.nextInt();
        name(text, num);
    }

    public static void name(String text, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(text);
        }
    }
}
