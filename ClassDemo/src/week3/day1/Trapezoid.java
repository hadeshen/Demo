package week3.day1;

/**
 * @author：陈林
 * @date：2020/8/17 10:47
 * 梯形的面积
 */
public class Trapezoid extends Shape{
    private double upLength;
    private double downLength;
    private double high;
    @Override
    public void area(){
        this.upLength=3;
        this.downLength=5;
        this.high=5;
        area=(upLength+downLength)*high/2;
        System.out.println("梯形的面积为："+area);
    }
}
