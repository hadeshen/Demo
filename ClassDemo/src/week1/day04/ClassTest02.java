package week1.day04;

public class ClassTest02 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int max=a[0];
        int min=a[0];
        int sum=a[0];
        int avg=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
            sum+=a[i];
        }System.out.println("最大："+max+" 最小："+min+" 和："+sum+" 平均数"+sum/6);
    }
}
