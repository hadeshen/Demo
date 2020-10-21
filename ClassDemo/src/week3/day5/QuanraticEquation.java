package week3.day5;

/**
 * @author：陈林
 * @date：2020/8/21 14:10
 * 一元二次方程组
 */
public class QuanraticEquation {
    private double a;
    private double b;
    private double c;

    public QuanraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        if ((b*b-4*a*c)<0){
            return 0;
        }else {
            return b*b-4*a*c;
        }

    }
    public double getRoot1(){
        if (getDiscriminant()==0){
            System.out.println("该方程无解");
            return 0;
        }else {
            return (((-1)*b)+(Math.sqrt(b*b-4*a*c)))/(2*a);
        }
    }
    public double getRoot2(){
        if (getDiscriminant()==0){
            System.out.println("该方程无解");
            return 0;
        }else {
            return (((-1)*b)-(Math.sqrt(b*b-4*a*c)))/(2*a);
        }
    }

    public static void main(String[] args) {
        QuanraticEquation quanraticEquation = new QuanraticEquation(4, 5, 1);
        System.out.println(quanraticEquation.getRoot1());
        System.out.println(quanraticEquation.getRoot2());

    }
}
