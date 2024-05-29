package Examination;

/**
 * Вернуть слово без цифр
 * - public static String result (String text)
 */
public class Task_3_result {
    public static void main(String[] args) {
        System.out.println("Как прекрасен этот мир в 2024 году!");
        String text = "Как прекрасен этот мир в 2024 году!";
        System.out.println(result(text));
    }

    public static String result(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                result += text.charAt(i);
            }
        }
        return result;
    }
}

