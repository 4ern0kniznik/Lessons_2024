public class Arrays {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных                      [10]
        char character = 'a'; // примитивный тип данных
//        String s = "hello"; //
//        String s1 = new String("Hello"); //
        int [] numbers = new int[5]; //массив               numbers ->[массив]  Ссылочный тип данных
//        System.out.println(numbers[0]);    //0 1 2 3 4
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3}; //знаем заранее какие числа хотим поместить
        for (int i=0; i<numbers1.length;i++){
            System.out.println(numbers1[i]);
        }
    }
}
