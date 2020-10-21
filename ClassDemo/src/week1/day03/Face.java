package week1.day03;

import java.util.Scanner;

/**
 * @author ytt  婚恋判断器
 */
public class Face {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入你的身高：");
        int h=input.nextInt();
        System.out.println("输入你的钱包余额：");
        int money=input.nextInt();
        System.out.println("输入你的颜值（丑/帅）：");
        String face=input.next();
        String face1="帅";
        if (h>175&&money>100&&face.equals(face1)){
            System.out.println("我们在一起吧！");
        }else {
            if (h>175||money>100||face.equals(face1)){
                System.out.println("等我考虑一下吧！");
            }else {
                System.out.println("给爷爬！！！");
            }
        }
    }
}
