package week3.day1;

/**
 * @author：陈林
 * @date：2020/8/17 10:10
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
    @Override
    public void area(){
        this.length=3;
        this.width=2;
        area=length*width;
        System.out.println("长方形的面积为："+area);
    }

}
