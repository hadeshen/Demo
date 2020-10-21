package week1.day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 	ATM项目说明：
 * 	实现功能：
 * 		登录：登录成功后显示菜单，登录失败进行提示
 * 		功能菜单：
 * 				1.余额查询
 * 				2.存款
 * 				3.取款
 * 				4.修改密码（注意：必须验证原密码和两次输入的新密码）
 * 				5.退出
 * 		根据输入的菜单编号，进入相应的功能
 *
 * */
public class ATMTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		/*
		   ============第一部分=================
		   ============登录验证=================
		 */
        //登录账号和密码初始化，提示：String二维数组
        //将String 转化为double类型
        //double queryBalance = Double.parseDouble("123.5");
        //将String 转化为int
        //int money =Integer.parseInt("100");
        String accounts[][] = {{"123", "123", "100"}};
        //用户登录，输入用户名和密码，并验证是否正确
        System.out.println("------------------------------");
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        //登录成功标志位，默认为false;登录成功后，标志位为true
        boolean flag = false;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                if (accounts[i][j].equals(name)) {
                    System.out.println("用户名输出：");
                    for (int k = 0; k < accounts[i].length; k++) {
                        if (accounts[i][k].equals(password)) {
                            System.out.println("登录成功！");
                            flag = true;
                            break;
                        }
                    }
                }
            }
        }



        /*
         * 	================第二部分==============================
         * 	==登录成功后，提示登录成功，并显示登录时间=============
         * */

        //登录时间使用SimpleDateFormat,输出格式为2020-01-01 12：00：00
        //获取当前系统时间
        SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentTime = new Date();
        dateFormater.format(currentTime);
        System.out.println("登录时间为："+currentTime);

        /*
         * ================第三部分==============================
         * ================显示菜单并实现相应功能==============================
         *
         */
        if (flag) {
            System.out.println("######  欢迎来到实训银行    #####");
            System.out.println("##### 请按照功能菜单进行操作  #####");
            System.out.println("------------------------------");

            while (true) {
                //初始化并打印菜单 1:余额查询, 2：存款, 3：取款, 4：修改密码, 5:退出
                String[] menus = {"1:余额查询", "2：存款", "3：取款", "4：修改密码", "5:退出"};
                for (String item : menus) {
                    System.out.print(item + "\n");
                }
                //余额数
                int money = 100;
                //功能选择
                System.out.println("-----------------------------");
                System.out.println("请进行功能选择：");
                //输入菜单编号
                int menuID = sc.nextInt();
                switch (menuID) {
                    case 1:
                        //余额查询功能代码
                        System.out.println("您的余额为：" + money);
                        break;
                    case 2:
                        //存款功能代码
                        System.out.println("输入您的存款数：");
                        //输入存款数
                        //int money1 = sc.nextInt();
                        double money1=sc.nextDouble();
                        String money2=accounts[0][2];
                        double space=Double.parseDouble(money2);
                        if (money1 > 0 && money1 % 100 == 0 && money1 <= 1000) {
                            money += money1;
                            System.out.println("存款成功！您的余额为：" + money);
                        } else {
                            System.out.println("存款失败！！！");
                        }
                        break;
                    case 3:
                        //取款功能代码
                        System.out.println("输入您的取款数：");
                        //输入取款数
                        double money3=sc.nextDouble();
                        money -= money3;
                        System.out.println("取款成功！您的余额为：" + money);
                        break;
                    case 4:
                        //修改密码功能代码
                        break;
                    case 5:
                        //退出系统
                        System.out.println("系统退出成功！");
                        System.exit(0);
                        break;
                    default:
                        //非法操作
                        System.out.println("非法操作");
                        break;
                }
            }
        } else {//登录失败，提示用户名密码错误
        }
    }

}
