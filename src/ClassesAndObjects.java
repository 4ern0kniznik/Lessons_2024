import java.sql.SQLOutput;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = "Рома";
        person1.setName("Роман");
        person1.age = 50;
        String s1 = "Вова";
        person1.sayHello();
        person1.speak();
        System.out.println();
//        System.out.println("Меня зовут "+ person1.name+", " + "мне " + person1.age+ " лет");
        Person person2 = new Person();
        person2.setName(s1);
//        person2.name = "Василий";
        person2.age = 20;
        person2.sayHello();
        person2.speak();
        System.out.println();
        int year1 = person2.calculateYearsToRetirement();
        int year2 = person1.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: "+ year1+ " лет");
        System.out.println("Второму человеку до пенсии: "+ year2+ " лет");
//        System.out.println("Меня зовут "+ person2.name+", " + "мне " + person2.age+ " лет");
    }
}

class Person{
    String name;
    int age;

    void setName(String username){
        name = username;
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
      //  System.out.println("Кол-во лет до пенсии: "+ years);
        return years;
    }

    void speak(){   //void - возвращаемый метод, не отдает данные в main
        for(int i = 0; i<1; i++){
        System.out.println("Меня зовут "+ name + ",мне "+age+" лет");}
        }
    void sayHello(){
            System.out.println("Привет!");
        }
    }
