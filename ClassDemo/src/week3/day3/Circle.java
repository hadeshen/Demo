package week3.day3;

/**
 * @author：陈林
 * @date：2020/8/19 10:14
 */
public class Circle extends MyShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getLength(){
        System.out.println("圆的的周长为"+(2*3.14*radius));
    }
    @Override
    public void getArea(){
        System.out.println("圆的面积为："+(3.14*radius*radius));
    }

}

