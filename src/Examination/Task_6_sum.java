package Examination;

/**
 * Вернуть сумму массива
 * - public static int sum (int [] array)
 */
public class Task_6_sum {
    public static void main(String[] args) {
        System.out.println("Сумма элементов массива: ");
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(a));
    }
    public static int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }
}
