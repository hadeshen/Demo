package view;

import service.area.StudentArea;
import service.impl.StudentDAOimpl;
import service.impl.TeacherService;
import util.StreamUtil;

import java.util.Scanner;

/**
 * @author chenlin
 * @create 2020-09-29  14:27
 */
public class View {
    public static void main(String[] args) throws Exception {
        System.out.println("\t\t\t欢迎进入学生档案管理系统");
        System.out.println("\t\t****************************");
        System.out.println("\t************************************");
        System.out.println("********************请登录*******************");
        input1();
    }

    public static void input1() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("请选择您的身份：1.管理员 2.老师 3.学生");
        System.out.println("****************************");
        switch (sc.next()) {
            case "1":
                AdminLogin.adminLogin();
                break;
            case "2":
                teacherLogin();
                break;
            case "3":
                studentLogin();
                break;
            default:
                System.out.println("输入错误,请重新输入");
                input1();
        }
    }

    public static void studentLogin() throws Exception{
        System.out.println("****************************");
        System.out.println("请选择您要进行的操作:");
        System.out.println("1.注册 ");
        System.out.println("2.登陆 ");
        System.out.println("3.返回上一级界面 ");
        System.out.println("****************************");
        Scanner sc = new Scanner(System.in);
        switch (sc.next()) {
            case "1":

                StudentView.studentRegist();
                studentLogin();
                break;
            case "2":
                int i = StudentView.studentLoginView();
                studentMenu(i);
                break;
            case "3":
                input1();
                break;
            default:
                System.out.println("输入错误,请重新输入");
                studentLogin();
        }
    }
    public static void studentMenu(int studentId) throws Exception{
        System.out.println("***********学生端*************");
        System.out.println("请选择您要进行的操作:");
        System.out.println("1.查看信息 ");
        System.out.println("2.修改密码");
        System.out.println("3.查看课程");
        System.out.println("4.查看成绩");
        System.out.println("5.退出 ");
        System.out.println("****************************");
        Scanner sc = new Scanner(System.in);
        switch (sc.next()) {
            case "1":
                System.out.println(StreamUtil.getStudentMethod(studentId));
                studentMenu(studentId);
                break;
            case "2":
                StudentView.changePasswordView(studentId);
                studentMenu(studentId);
                break;
            case "3":
                System.out.println(StudentDAOimpl.getInfo(studentId));
                studentMenu(studentId);
                break;
            case "4":
                System.out.println(StudentDAOimpl.getScore(studentId));
                studentMenu(studentId);
                break;
            case "5":
                return;
            default:
                System.out.println("输入错误,请重新输入");
                studentMenu(studentId);
        }
    }
    public static void teacherLogin() throws Exception {
        System.out.println("****************************");
        System.out.println("请选择您要进行的操作:");
        System.out.println("1.注册 ");
        System.out.println("2.登陆 ");
        System.out.println("3.返回上一级界面 ");
        System.out.println("****************************");
        Scanner sc = new Scanner(System.in);
        switch (sc.next()) {
            case "1":
                TeacherView.teacherRegistView();
                teacherLogin();
                break;
            case "2":
                int teacherId = TeacherView.teacherLoginView();
                teacherMenu(teacherId);
                break;
            case "3":
                input1();
                break;
            default:
                System.out.println("输入错误,请重新输入");
                teacherLogin();
        }
    }

    public static void teacherMenu(int teacherId) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("***********教师端************");
        System.out.println("请选择您的操作:");
        System.out.println("1.个人信息修改");
        System.out.println("2.班级管理");
        System.out.println("3.学生管理");
        System.out.println("4.学生成绩管理");
        System.out.println("5.退出");
        System.out.println("****************************");
        switch (sc.next()) {
            case "1":
                TeacherView.changeTeacherView(teacherId);
                teacherMenu(teacherId);
                break;
            case "2":
                classManagement(teacherId);
                break;
            case "3":
                studentManagement(teacherId);
                break;
            case "4":
                classStudent(teacherId);
                break;
            case "5":
                return;
            default:
                System.out.println("输入错误,请重新输入");
                teacherMenu(teacherId);
        }
    }

    public static void classManagement(int teacherId) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("请选择您的操作:");
        System.out.println("1.查看班级");
        System.out.println("2.增加班级");
        System.out.println("3.删除班级，这个班太难教了，不教了");
        System.out.println("4.修改班级，这个班太难教了，换个班教");
        System.out.println("5.返回到上一级界面");
        System.out.println("****************************");
        switch (sc.next()) {
            case "1":
                TeacherService.showTeacherClass(teacherId);
                classManagement(teacherId);
                break;
            case "2":
                TeacherView.addTeacherClassView(teacherId);
                classManagement(teacherId);
                break;
            case "3":
                TeacherView.deleteTeacherClassView(teacherId);
                classManagement(teacherId);
                break;
            case "4":
                TeacherView.changeTeacherId(teacherId);
                classManagement(teacherId);
                break;
            case "5":
                teacherMenu(teacherId);
                break;
            default:
                System.out.println("输入错误，请重新输入：");
                classManagement(teacherId);
        }
    }
    public static void classStudent(int teacherId) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("请选择您的操作:");
        System.out.println("1.查看学生成绩列表");
        System.out.println("2.降序查看学生成绩（默认升序）");
        System.out.println("3.查看平均分");
        System.out.println("4.返回到上一级界面");
        System.out.println("****************************");
        switch (sc.next()) {
            case "1":
                TeacherService.getScore();
                classStudent(teacherId);
                break;
            case "2":
                TeacherService.getDownScore();
                classStudent(teacherId);
                break;
            case "3":
                TeacherService.getAverageScore();
                classStudent(teacherId);
                break;
            case "4":
                teacherMenu(teacherId);
                break;
            default:
                System.out.println("输入错误,请重新输入");
                classStudent(teacherId);
        }
    }
    public static void studentManagement(int teacherId) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("请选择您的操作:");
        System.out.println("1.查看学生列表");
        System.out.println("2.新增学生");
        System.out.println("3.删除学生");
        System.out.println("4.查找学生");
        System.out.println("5.修改学生信息");
        System.out.println("6.返回到上一级界面");
        System.out.println("****************************");
        switch (sc.next()) {
            case "1":
                StudentArea.getStudentList();
                studentManagement(teacherId);
                break;
            case "2":
                System.out.println("请输入姓名：");
                String name = sc.next();
                System.out.println("请输入密码：");
                String password = sc.next();
                System.out.println("请输入性别：");
                char sex = sc.next().charAt(0);
                int studentId1 = StudentDAOimpl.studentRegist(name, password, sex);
                System.out.println("添加成功！");
                System.out.println("学号为：" + studentId1 + "请使用学号登录！");
                studentManagement(teacherId);
                break;
            case "3":
                StudentArea.deleteStudent();
                studentManagement(teacherId);
                break;
            case "4":
                StudentArea.searchStudent();
                studentManagement(teacherId);
                break;
            case "5":
                StudentArea.changeStudent();
                studentManagement(teacherId);
                break;
            case "6":
                teacherMenu(teacherId);
                break;
            default:
                System.out.println("输入错误,请重新输入");
                studentManagement(teacherId);
        }
    }
}
