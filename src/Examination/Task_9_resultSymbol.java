package Examination;

import java.util.Scanner;

/**
 * Ничего не возвращать, два слова, один символ, вывести слово (или два) в котором есть этот символ.
 * - public static void result (String text, String symbol)
 */
public class Task_9_resultSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        System.out.println("Введите символ: ");
        String symbol = scanner.nextLine();
        System.out.println("Результат: ");
        result(text, symbol);

    }

    public static void result(String text, String symbol) {
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.contains(symbol)) {
                System.out.println(word);
            }
        }
    }
}
