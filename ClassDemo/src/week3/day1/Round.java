package week3.day1;

/**
 * @author：陈林
 * @date：2020/8/17 10:39
 */
public class Round extends Shape {
    private double radius;

    /**
     * 圆形的面积
     */
    @Override
    public void area() {
        this.radius = 3;
        area = 3.14 * radius * radius;
        System.out.println("圆的面积为：" + area);
    }
}
