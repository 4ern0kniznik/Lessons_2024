package Kata_examination;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите текст:");
        String text = scanner.nextLine();
        System.out.println("Введите символ:");
        String symbol = scanner.nextLine();
        System.out.println("Результат");
        result(text,symbol);


    }
    public static void result(String text, String symbol) {
        String[] words = text.split(" ");
        for (String word : words){
            if(word.contains(symbol)){
                System.out.println(word);
            }
        }
    }
}
