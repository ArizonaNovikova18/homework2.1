import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void changeValue5(int value){
        value = 22;
    }
    public static void changeValue6(Integer value){
        value = 22;
    }
    public static void changeValue7(Integer[] value){
        value = new Integer[] {1, 2};
    }
    public static void changeValue8(Integer[] value){
        value = new Integer[2];
        value[0] = 99;
    }
    public static void changePerson(Person person){
        new Person("Ilya", "Lagutenko");
    }
    public static void task5(){
        int value = 33;
        changeValue5(value);
        System.out.println(value);
    }
    public static void changePerson10(Person person){
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
    public static void task6(){
        Integer value = 33;
        changeValue6(value);
        System.out.println(value);
    }
    public static void task7(){
        Integer[] value = new Integer[] {3, 4};
        changeValue7(value);
        for (Integer i = 0; i < value.length; i ++){
            System.out.println(Arrays.toString(value));
        }
    }
    public static void task8(){
        Integer[] value = new Integer[]{3, 4};
        changeValue8(value);
        for (Integer i = 0; i < value.length; i ++) {
            System.out.println(Arrays.toString(value));
        }
    }
    public static void task9(){
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
    }
    public static void task10(){
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson10(person);
        System.out.println(person);
    }


    }
