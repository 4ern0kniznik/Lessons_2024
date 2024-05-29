package Examination;

/**
 * Вернуть число встречающихся символов в слове
 * - public static int num (String text, char b)
 * or
 * - public static int num (String text, String b)
 */
public class Task_2_num {
    public static void main(String[] args) {
        String word = "Hello";
        //пишем символ для проверки на повторение
        char character ='l';
        //инициализируем переменную count, которая будет принимать в себя значение повторений символа, вычисляемого в методе num
        int count = num(word, character);
        System.out.println("Количество символов " + character + " повторяется " + count + " раз.");
    }
    //пишем метод, который принимает в себя строку word типа String и значение character типа char и проверяет на количество повторений
    public static int num(String word,char character ){
        int count = 0;
        //циклом перебираем значения индексов каждой буквы, а методом charAt возвращаем значение char по индексу и проверяем на равенство с переменной character
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character){
                count++;
            }
        }
        //возвращаем количество повторенний данного символа
        return count;

    }
}
