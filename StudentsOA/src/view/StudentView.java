package view;

import service.impl.StudentDAOimpl;

import java.util.List;
import java.util.Scanner;

/**
 * @author chenlin
 * @create 2020-09-29  13:11
 */
public class StudentView {
    public static int  studentLoginView() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学号：");
        int studentId = input.nextInt();
        System.out.println("请输入密码：");
        String password = input.next();
        boolean b = StudentDAOimpl.studentLogin(studentId, password);
        if (b == true){
            System.out.println("登录成功！");
        }else {
            System.out.println("账号或者密码错误！！！");
            System.out.println("请重新登录！");
            studentLoginView();
        }
        return studentId;
    }
    public static void studentRegist() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = input.next();
        System.out.println("请输入密码：");
        String password = input.next();
        System.out.println("请输入性别：");
        char sex = input.next().charAt(0);
        int studentId = StudentDAOimpl.studentRegist(name, password, sex);
        System.out.println("注册成功！");
        System.out.println("学号为："+studentId+",请使用学号登录！");
    }
    public static void changePasswordView(int studentId) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("请输入新密码：");
        String password = input.next();
        boolean b = StudentDAOimpl.changePassword(studentId, password);
        if (b == true){
            System.out.println("修改成功！！！");
        }else {
            System.out.println("修改失败！！！");
        }
    }
    public static void studentInfo(int studentId) throws Exception{
        List info = StudentDAOimpl.getInfo(studentId);
        System.out.println(info);
    }
    public static void studentScoreView(int studentId) throws Exception{
        List score = StudentDAOimpl.getScore(studentId);
        System.out.println(score);
    }
}
