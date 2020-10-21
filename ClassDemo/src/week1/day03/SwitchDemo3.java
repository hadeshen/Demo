package week1.day03;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入月份：");
        int month=input.nextInt();
        System.out.println("请输入号数：");
        int day=input.nextInt();
        int sum=0;
        switch (month){

            case 12:
                sum+=30;
            case 11:
                sum+=31;
            case 10:
                sum+=30;
            case 9:
                sum+=31;
            case 8:
                sum+=31;
            case 7:
                sum+=30;
            case 6:
                sum+=31;
            case 5:
                sum+=30;
            case 4:
                sum+=31;
            case 3:
                sum+=28;
            case 2:
                sum+=31;
            case 1:
                sum+=day;
                break;
            default:
        }
        System.out.println(sum);

    }
}
