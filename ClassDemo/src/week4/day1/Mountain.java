package week4.day1;

/**
 * @author：陈林
 * @date：2020/8/24
 */
public class Mountain implements Moveable,Jumpable{
    @Override
    public void move() {
        System.out.println("山不会移动");
    }

    @Override
    public void jump() {
        System.out.println("山不能跳");
    }
}
