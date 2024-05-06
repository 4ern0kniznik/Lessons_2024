public class Variables {
    public static void main(String[] args) {
        int myInt = 555;
        short myShort = 3266; // -32000 - +32000
        long myLong = 234234232; // для больших чисел
        float myFloat = 222.22f; // дробное, нужно в конце добавлять f чтоб компилятор не ругался
        double myDouble = 234.324; // по умолчанию дробное

        char c = 'a'; // символы

        boolean b = true; // логические данные (правда или ложь)

        byte myByte = 100; // -128 - 127

        System.out.println(myInt);
    }
}
