package week1.day03;

import java.util.Scanner;

/**
 * @author ytt 判断输入数值是否为奇偶数
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入：");
        int a=scanner.nextInt();
        if(a%2==0){
            System.out.println("该数为偶数");
        }else {
            System.out.println("该数为奇数");
        }
    }
}
