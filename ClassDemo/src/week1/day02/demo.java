package week1.day02;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
    //创建一个Scanner类型的对象
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入：");
        int a=scanner.nextInt();
        int b=a%10;
        int c=(a%100)/10;
        int d=(a%1000)/100;
        int e=b*b*b+c*c*c+d*d*d;
        if(a==e){
            System.out.println(a+"为水仙花数");
        }else {
            System.out.println(a+"不是水仙花数");
        }

    }
}