package Examination;

import java.util.Scanner;

/**
 * Вернуть число встречающихся символов в слове
 *  * - public static int num (String text, char b)
 *  * or
 *  * - public static int num (String text, String b)
 */
public class Task_2_3_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String a = scanner.nextLine();
        System.out.println("Введите символ:");
        char b = scanner.next().charAt(0);
        System.out.println(num(a,b));
    }
    public static int num(String text, char b) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == b) {
                count++;
            }
        }
        return count;
    }
}
