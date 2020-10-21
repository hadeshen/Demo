package week2.day2;

import java.util.Scanner;

public class Account {
    private String cid;
    private double balance;

    //取款操作
    public boolean withdraw(String cid) {
        System.out.println("请输入取款数：");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        //a取款变量
        if (a <= balance) {
            balance -= a;
            System.out.println("取款成功！您的余额为：" + balance);
            return true;
        } else {
            System.out.println("取款失败！！！");
            return false;
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
//        account.banlance=100.00;
        account.withdraw("666");

    }
}
