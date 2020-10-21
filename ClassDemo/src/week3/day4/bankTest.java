package week3.day4;

import java.util.Random;

/**
 * @author：陈林
 * @date：2020/8/20 14:27
 */
public class bankTest {
    private int id;
    private String password;
    private double balance;
    private static double multiple;
    private static double minBalance;
    int tatol=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getMultiple() {
        return multiple;
    }

    public static void setMultiple(double multiple) {
        bankTest.multiple = multiple;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        bankTest.minBalance = minBalance;
    }


    public String getInfo() {
        return "账号：" + id +
                " 密码:" + password +
                " 余额：" + balance +
                " 利率：" + multiple +
                " 最小余额：" + minBalance;
    }

    public bankTest(String password, double balance) {
        this.password = password;
        this.balance = balance;
        tatol++;
        for (int i=0;i<=tatol;i++){
            setId(i);
        }
        bankTest.setMinBalance(0.0);
        bankTest.setMultiple(0.49);
    }

    public static void main(String[] args) {
        bankTest bankTest = new bankTest("123",100);
        System.out.println(bankTest.getInfo());

    }

}

