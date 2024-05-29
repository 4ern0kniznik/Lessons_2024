package Examination;

/**
 * * Вернуть отдельно сумму четных и нечетных массива / без возвращения вывести в консоль
 *  * - public static int [] sumOfEvenAndOdd (int [] array)
 *  * or
 *  * - public static void sumOfEvenAndOdd (int [] array)
 */
public class Task_7_sumOfEvenAndOdd_2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        sumOfEvenAndOdd(a);
    }
    public static void sumOfEvenAndOdd(int[] array) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i  : array) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Сумма четных чисел: " + evenSum);
        System.out.println("Сумма нечетных чисел: " + oddSum);
    }
}

