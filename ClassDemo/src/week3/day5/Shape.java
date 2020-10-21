package week3.day5;

/**
 * @author：陈林
 * @date：2020/8/21 14:54
 */
public abstract class Shape {
    private double Area;
    public void getArea(){
        System.out.println("图形都有面积");
    }
}
class Rectangle extends Shape{
    private double length;
    private double hight;

    public Rectangle(double length, double hight) {
        this.length = length;
        this.hight = hight;
    }
    @Override
    public void getArea(){
        System.out.println("面积为："+length*hight);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.getArea();
    }
}