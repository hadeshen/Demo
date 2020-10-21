package week1.day02;

/**
 * @author ytt 第二题
 */
public class Test2 {
    public static void main(String[] args) {
        double h=100;
        double sum=0;
        for(int i=0;i<=10;i++){
            sum=h+sum;
            h=h/2;
        }
        System.out.println("经过了："+sum+"米     "+"反弹高度："+h);
    }
}
