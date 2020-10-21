package week6.day1;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * @author：陈林
 * @date：2020/9/7 20:16
 */
public class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();
        list.add(4312);
        list.add("asdf");
        list.add("mfsa");
        list.add(new Person("小王",new  Random().nextInt(200)+1));
        list.add("fjd");
        for (Object o:list){
            if (o instanceof Person){
                Person person = (Person)o;
                if (person.getAge()<1||person.getAge()>120){
                    throw new RuntimeException(person.getAge()+"非法年纪");
                }else {
                    System.out.println(o);
                }
            }
        }
    }
}
