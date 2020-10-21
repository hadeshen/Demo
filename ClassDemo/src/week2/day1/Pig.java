package week2.day1;

/**
 * @author：陈林
 * @date：2020/8/15 10:26
 */
public class Pig extends Animal {
    public Pig(String name){
        super();
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name="猪";
        animal.eat();
    }
}
