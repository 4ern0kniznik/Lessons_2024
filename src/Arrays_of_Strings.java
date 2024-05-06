public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // создали массив из целых чисел с объемом значений 5(ячеек)
        numbers[0] = 10;
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
        String[] strings = new String[3]; //3 ячейки
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Java";
//        System.out.println(strings[0]);
//        System.out.println(strings[2]);

        for(int i =0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string:strings){ //тип, строка, массив
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum =0;
        for (int x:numbers1){
            sum = sum+x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
//        String s = null; //null - пустота
        String s = "home";
        System.out.println(s);


    }
}
