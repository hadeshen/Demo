package week3.day3;

/**
 * @author：陈林
 * @date：2020/8/19 10:19
 */
public class Test1 {
    public void print(MyShape myShape){
        myShape.getArea();
        myShape.getLength();
    }

    public static void main(String[] args) {
        MyShape rect = new Rect(2,3);
        MyShape circlr = new Circle(3);
        Test1 test1 = new Test1();
        test1.print(rect);
        test1.print(circlr);
    }
}
