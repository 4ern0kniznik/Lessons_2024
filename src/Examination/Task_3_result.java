package Examination;

import java.util.Scanner;

/**
 * Вернуть слово без цифр
 * - public static String result (String text)
 */
public class Task_3_result {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Результат: ");
        System.out.println(result(text));
    }

    public static String result(String text) {
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < text.length(); i++) {
           if (!Character.isDigit(text.charAt(i))) {
               sb.append(text.charAt(i));
           }
       }
       return sb.toString();
    }
}

