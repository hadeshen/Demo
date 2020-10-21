package week4.day1;

/**
 * @author：陈林
 * @date：2020/8/24
 */
public class Car implements Moveable,Jumpable {
    @Override
    public void move() {
        System.out.println("汽车会漂移");
    }

    @Override
    public void jump() {
        System.out.println("汽车不会跳");
    }
}
