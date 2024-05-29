package Examination;

/**
 * Вернуть сумму нечетных массива
 * - public static int sumOdd (int [] array)
 */
public class Task_5_sumOdd {
    public static void main(String[] args) {
        System.out.println("Сумма нечетных элементов: ");
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumOdd(a));
    }
    public static int sumOdd(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                sum += a[i];
            }
        }
        return sum;
    }
}
