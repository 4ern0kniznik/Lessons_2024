import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);   // класс Scanner отвечает за вввод в консоли, требуется отдельного импорта. System.in - стандартный поток входных данных
        System.out.println("Введите с клавиатуры данные");
        //String string = s.nextLine();
        int x = s.nextInt();
        System.out.println("Вы ввели "+x);
    }
}
