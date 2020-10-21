package week1.day03;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入：");
        boolean isPrime = true;
        int num=input.nextInt();
        if (num > 0) {
            int k = (int) Math.sqrt(num);
            for (int i = 2; i <= k; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }


    }
}
