package week2.day1;

public class Demo {
    private int a;
    private int b;

    public void test(int a,int b){
        for (int i=0;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Demo ha = new Demo();
        ha.a=3;
        ha.b=5;
        ha.test(ha.a,ha.b);
    }
}
