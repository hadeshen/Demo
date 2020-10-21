package week1.day02;

import java.util.Scanner;

/**
 * @author ytt 输入任意小时 输出多少天
 */
public class Time {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入：");
        int a=scanner.nextInt();
        int b=a/24;
        int c=a%24;
        System.out.println(b+"天"+c+"小时");
    }
}
