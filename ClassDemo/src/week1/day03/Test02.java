package week1.day03;

public class Test02 {
    public static void main(String[] args) {
        int a,b,c;
        int sum=0;
        for (int i=100;i<=999;i++){
            a=i%10;
            b=(i%100)/10;
            c=(i%1000)/100;
            sum=a*a*a+b*b*b+c*c*c;
            if (sum==i){
                System.out.println(i);
            }
        }
    }
}
