package Repetition_2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 1 Реализовать программу, которая принимает на вход через консоль с помощью
 * класса ​Scanner,​ число, соответствующее количеству этажей в здании. Используя
 * условный оператор ​if​, необходимо вывести в консоль сообщение о типе такого дома.
 * Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более
 * - “Многоэтажный дом”. Так же, необходимо учесть что может быть введено
 * отрицательное значение, в таком случае сообщить “Ошибка ввода”.
 */
public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите колличество этажей в здании: ");
        Scanner scanner = new Scanner(System.in);
        int floorCount = scanner.nextInt();

        if (floorCount >=1 && floorCount <=4){
            System.out.println("Малоэтажный дом");
        } else  if (floorCount >=5 && floorCount <= 8){
            System.out.println("Среднеэтажный дом");
        } else if (floorCount >=9 && floorCount <= 50){
            System.out.println("Многоэтажный дом");
        } else if (floorCount >=51){
            System.out.println("Небоскреб");
        } else {
            System.out.println("Некорректный ввод");
        }
    }

}
