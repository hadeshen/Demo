package week4.day1;

/**
 * @author：陈林
 * @date：2020/8/24
 */
public class Person implements Moveable, Jumpable {
    @Override
    public void move() {
        System.out.println("人类会唱跳rip");
    }

    @Override
    public void jump() {
        System.out.println("I jump;You jump");
    }

    public static void main(String[] args) {
        new Mountain().move();
        new Mountain().jump();
        new Person().move();
        new Person().jump();
        new Car().move();
        new Car().jump();
    }


}
