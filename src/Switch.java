import java.net.SocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
//        int age = scanner.nextInt();
        String age = scanner.nextLine();

        //       if(age==10){
 //           System.out.println("Ты учишться в школе");
 //       } else if(age==18){
 //           System.out.println("Ты закончил школу");
 //       }
        if ("ноль".equals(age)) {
            System.out.println("Ты родился");
        } else if ("семь".equals(age)) {
            System.out.println("Ты пошел в школу");
        } else if ("Весемнадцать".equals(age)) {
            System.out.println("Ты закончил школу");
        } else {
            System.out.println("Ни одно условие не подошло");
        }
    }
}
