package service.impl;

import data.AdminData;
import model.Admin;
import service.area.ClassRoomArea;
import service.area.CourseArea;
import service.area.StudentArea;
import service.area.TeacherArea;
import util.ScannerUtil;

import java.util.Scanner;

/**
 * @author JIAJUN KOU
 */
public class AdminService {
    private StudentArea studentArea;
    private CourseArea courseArea;
    private ClassRoomArea classRoomArea;
    private TeacherArea teacherArea;


    /**
        管理员登录方法
     */
    public void welcome(){
        System.out.println("             欢迎管理员进入管理系统");
        System.out.println("      *******************************");
        System.out.println("  *****************************************");
        System.out.println("                   请登录：");

    }

    public  boolean login() throws Exception{
        Admin admin = AdminData.getAdminMethod();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入管理员账号：");
        String name = input.next();
        System.out.println("请输入密码：");
        String password = input.next();
        if (name.equals(admin.getAdminId())&&password.equals(admin.getPassword())){
            System.out.println("登录成功！");

            return true;
        }else {
            System.out.println("登录失败！账号或者密码错误！");
            System.out.println("请重新登录");
            return false;
        }
    }

    public  void start() throws Exception {
        welcome();
        boolean flag = login();
        if (flag) {
            while (true) {
                String[] menus = {"1：学生管理区", "2：教师管理区", "3：班级管理区", "4：课程管理区", "5：退出"};
                for (String item : menus) {
                    System.out.print(item + "\n");
                }
                System.out.println("-----------------------------");
                System.out.println("请进行功能选择：");
                int menuID = ScannerUtil.scanner.nextInt();
                switch (menuID) {
                    case 1:
                        StudentArea.studentAreaINT();
                        break;

                    case 2:
                        TeacherArea.teacherAreaINT();
                        break;

                    case 3:
                        ClassRoomArea.ClassRoomAreaINT();
                        break;
                    case 4:
                        CourseArea.courseAreaINT();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("输入错误！");
                        continue;
                }
            }
        }
        else{
            System.out.println("即将退出系统！");
        }
    }

}
