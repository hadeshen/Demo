package view;

import model.ClassRoom;
import model.Student;
import service.impl.TeacherService;
import util.StreamUtil;

import java.util.Scanner;

/**
 * @author chenlin
 * @create 2020-09-29  13:39
 */
public class TeacherView {
    public static int teacherLoginView() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("请输入教师编号：");
        int teacherId = input.nextInt();
        System.out.println("请输入密码：");
        String password = input.next();
        boolean b = TeacherService.teacherLogin(teacherId, password);
        if (b == true){
            System.out.println("登录成功！");
        }else {
            System.out.println("账号或者密码错误！！！");
            System.out.println("请重新登录！");
            teacherLoginView();
        }
        return teacherId;
    }
    public static void teacherRegistView() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = input.next();
        System.out.println("请输入密码：");
        String password = input.next();
        System.out.println("请输入性别：");
        char sex = input.next().charAt(0);
        System.out.println("请输入所授课程：");
        String courseName = input.next();
        System.out.println("请输入所教班级：");
        int classNum = input.nextInt();
        int i = TeacherService.teacherRegist(name, password, sex, courseName, classNum);
        System.out.println("注册成功！！！");
        System.out.println("教师号为："+i+",请使用教师号登录。");
    }
    public static void changeTeacherView(int teacherId) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = input.next();
        System.out.println("请输入密码：");
        String password = input.next();
        System.out.println("请输入性别：");
        char sex = input.next().charAt(0);
        System.out.println("请输入所授课程：");
        String courseName = input.next();
        System.out.println("请输入所教班级：");
        int classNum = input.nextInt();
        boolean b = TeacherService.changeTeacher(teacherId, name, password, sex, classNum, courseName);
        if (b == true){
            System.out.println("修改成功！！！");
        }else {
            System.out.println("修改失败！！！");
        }
    }

    public static void changeTeacherId(int teacherId) throws Exception{
        Student student = StreamUtil.getStudentMethod(teacherId);
        Scanner input = new Scanner(System.in);
        System.out.println("输入班级号！");
        int i = input.nextInt();
        student.setClassRoom(new ClassRoom(i));
        System.out.println("修改成功");
        System.out.println("以后您就是"+i+"班的班主任了！！！");
    }
    public static void addTeacherClassView(int teacherId) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("请输入班级号：");
        int i = input.nextInt();
        boolean b = TeacherService.addTeacherClass(teacherId, i);
        if (b == true){
            System.out.println("添加成功！！！");
        }else {
            System.out.println("添加失败！！！");
        }
    }
    public static void deleteTeacherClassView(int teacherId) throws Exception{
        boolean b = TeacherService.deleteTeacherClass(teacherId);
        if (b == true){
            System.out.println("删除成功！！！");
        }else {
            System.out.println("删除失败！！！");
        }
    }
}
