package week3.day2;

/**
 * @author：陈林
 * @date：2020/8/18 14:48
 */
public class Dog extends Animal {
    @Override
    public void move(){
        System.out.println("大摇大摆的走");
    }
    @Override
    public void roar(){
        System.out.println("汪汪汪");
    }
}
