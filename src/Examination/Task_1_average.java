package Examination;

/**
 * Вернуть число среднее арифметическое всех элементов массива / вернуть в дабл
 * - public static int average (int [] array)
 * or
 * - public static double average (int [] array)
 */
public class Task_1_average {
    public static void main(String[] args) {
        System.out.println("Среднее арифметическое: ");
        int[] a = {1,2,3,4};
    //    int[] b = {5,6,7,8};
        System.out.println(average(a) /*+ " " + average(b)*/);
    }
    public static double average(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;


        /**
         *   // Сумма всех элементов массива
         *         System.out.println("Сумма всех элементов массива : ");
         *
         *         int sum = 0;
         *         for (int i = 0; i < arrayLength; i++) {
         *             sum += array[i];
         *         }
         *         System.out.println(sum);
         */

    }
}
