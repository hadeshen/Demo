package week2.day2;

public class Person {
    private int age;

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age>=0&&age<=130){
            System.out.println("合法年纪");
        }else {
            System.out.println("非法年纪");
        }
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                '}';
    }
}
