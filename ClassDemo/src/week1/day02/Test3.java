package week1.day02;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入销售额：");
        double a=scanner.nextInt();
        double salary=0;
        if(a<=10){
            salary=a*0.1;
        }else {
            if(a>10&&a<=20){
                salary=(a-10)*0.075+10*0.1;
            }else {
               if(a>20&&a<=40) {
                   salary=(a-20)*0.05+10*0.075+10*0.1;
               }else {
                   if(a>40&&a<=60){
                       salary=(a-40)*0.03+20*0.05+10*0.075+10*0.1;
                   }else {
                       if(a>60&&a<=100){
                           salary=(a-60)*0.015+20*0.03+20*0.05+10*0.075+10*0.1;
                       }else {
                           if(a>100){
                               salary=(a-100)*0.01+40*0.015+20*0.03+20*0.05+10*0.075+10*0.1;
                           }
                       }
                   }
               }
            }
        }
        System.out.println("提成为："+salary+"万");
    }
}
