public class WhileLoops {
    public static void main(String[] args){
       // boolean t = 5==5; // == - операция сравнивания, = - зарезервированный символ присваивания
        int value = 0;
        //boolean t = value>5;
        //System.out.println(t);

        while(value<5){
            System.out.println("Hello "+value);
            value = value+1;
        }
    }
}
