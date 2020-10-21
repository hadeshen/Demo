package week3.day3;

/**
 * @author：陈林
 * @date：2020/8/19 10:08
 */
public class Rect extends MyShape {
    private double width;
    private double height;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void getLength(){
        System.out.println("矩形的周长为:"+(width+height)*2);
    }
    @Override
    public void getArea(){
        System.out.println("矩形的面积为"+(width*height));
    }
}
