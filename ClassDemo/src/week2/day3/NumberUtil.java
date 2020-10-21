package week2.day3;

public class NumberUtil {
    public void add(int... a){
        int sum=0;
        for (int z:a){
            sum+=z;
        }
        System.out.println(sum);
    }

    public void add(double... a){
        double sum=0;
        for (double z:a){
            sum+=z;
        }
        System.out.println(sum);
    }

    public void minus(int a, int b) {
        int minus = a - b;
        System.out.println(minus);
    }

    public void minus(double a, double b) {
        double minus = a - b;
        System.out.println(minus);
    }

    public void multiply(int... a) {
        int product = 1;
        for (int z : a) {
            product *= z;
        }
    }

    public void multiply(double... a) {
        double product = 1;
        for (double z:a){
            product /=z;
        }
    }

    public static void main(String[] args) {
        NumberUtil a = new NumberUtil();
        a.add(1,2,3,4,5,6,7,8,9,10);
    }

}
