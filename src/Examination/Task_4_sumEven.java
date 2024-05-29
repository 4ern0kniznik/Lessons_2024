package Examination;

/**
 * Вернуть сумму четных массива
 * - public static int sumEven (int [] array)
 */
public class Task_4_sumEven {
    public static void main(String[] args) {
        System.out.println("Сумма четных элементов: ");
        int[] a = {1,2,3,4};
        System.out.println(sumEven(a));
    }
    public static int sumEven(int[] array){
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a += array[i];
            }
        }
        return a;
    }
}
