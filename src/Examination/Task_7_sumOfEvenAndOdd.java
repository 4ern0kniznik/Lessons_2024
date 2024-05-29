package Examination;

/**
 * Вернуть отдельно сумму четных и нечетных массива / без возвращения вывести в консоль
 * - public static int [] sumOfEvenAndOdd (int [] array)
 * or
 * - public static void sumOfEvenAndOdd (int [] array)
 */
public class Task_7_sumOfEvenAndOdd {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] result = sumOfEvenAndOdd(a);
        System.out.println("Сумма четных чисел: " + result[0]);
        System.out.println("Сумма нечетных чисел: " + result[1]);
    }
    public static int[] sumOfEvenAndOdd(int[] array) {
        int[] result = new int[2];
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenSum += array[i];
            } else {
                oddSum += array[i];
            }
        }
        result[0] = evenSum;
        result[1] = oddSum;
        return result;
    }
}
