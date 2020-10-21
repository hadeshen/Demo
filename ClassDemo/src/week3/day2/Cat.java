package week3.day2;

/**
 * @author：陈林
 * @date：2020/8/18 14:44
 */
public class Cat extends Animal{

    @Override
    public void move(){
        System.out.println("静悄悄的走");
    }
    @Override
    public void roar(){
        System.out.println("喵喵喵");
    }
}
