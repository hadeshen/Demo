package week1.day04;

public class ArrayTest01 {
    public static void main(String[] args) {
        double[] doubles = new double[]{12.0,23.4,100.25,11123.0,34.33,45.45,76.3,25.5,32.1,99.99};
        double[] a={12.0,23.4,100.25,11123.0,34.33,45.45,76.3,25.5,32.1,99.99};
        double sum=0.0;
        for (int i=0;i<a.length;i++){
            sum+=doubles[i];
        }
        System.out.println(sum);
        double  max=a[0];
        int temp=0;
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                temp=i+1;
            }
        }
        System.out.println("max: "+max+" "+temp);
    }
}
