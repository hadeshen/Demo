package week1.day03;

import java.util.Scanner;

/**
 * @author ytt  分支结构语句
 * if...else
 * switch...case
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入：");
        int age=scanner.nextInt();
        if(age<=18){
            System.out.println("你太小了，不配来网吧");
        }else {
            System.out.println("放飞吧！少年");
        }
    }
}
