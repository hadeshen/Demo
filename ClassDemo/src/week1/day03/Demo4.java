package week1.day03;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] num =new int[5];
        int sum=0;
        int a=input.nextInt();
        for (int i=0;i<num.length;i++){
            System.out.print("请输入第"+(i+1)+"个数：");
            num[i]=input.nextInt();
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
