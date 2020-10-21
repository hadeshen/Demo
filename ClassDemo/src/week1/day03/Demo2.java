package week1.day03;

public class Demo2 {
    public static void main(String[] args) {
        int a=0;
        int sum=0;
        /*while (a<=100){
            sum+=a;
            a++;
        }*/
      /*  do {
            sum+=a;
            a++;
        }while (a<=100);*/

      for(int i=1;i<=100;i++){
          sum+=i;
      }
        System.out.println(sum);
    }
}
