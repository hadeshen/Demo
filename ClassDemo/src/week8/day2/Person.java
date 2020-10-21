package week8.day2;

/**
 * @author chenlin
 * @create 2020-09-22  9:13
 */
public class Person {
    private String name;
    private int age;


    public Person(){

    }
    //私有构造器
     private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String show(String nation){
        System.out.println("我是"+nation+"人");
        return nation;
    }
    //私有方法
    private String getInfo() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //静态方法
    private static String say(String language){
        System.out.println("我会说："+language);
        return language;
    }
}
