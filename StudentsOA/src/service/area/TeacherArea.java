package service.area;

import model.Teacher;
import service.impl.TeacherService;
import util.StreamUtil;

import java.util.List;
import java.util.Scanner;


public class TeacherArea {

    public static void teacherAreaINT() throws Exception {
        while (true) {
            String[] menus = {"1：老师列表", "2：新增老师", "3：删除老师", "4：查找老师", "5：退会到管理员区"};
            for (String item : menus) {
                System.out.print(item + "\n");
            }
            System.out.println("-----------------------------");
            System.out.println("请进行功能选择：");
            Scanner scanner = new Scanner(System.in);
            int menuID = scanner.nextInt();
            switch (menuID) {
                case 1:
                    getTeacherList();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    deleteTeacher();
                    break;
                case 4:
                    searchTeacher();
                    break;
                case 5:
                    return ;
                    default:
            }
        }
    }

    public static void getTeacherList() throws Exception {
        System.out.println("=====查看老师列表=====");
        List<Teacher> teacher = StreamUtil.getTeacher();
        for (Teacher teacher1:teacher){
            System.out.println(teacher1);
        }
        System.out.println("-----------------------------");
    }

    public static void addTeacher() throws Exception {
        System.out.println("=====新增老师=====");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        System.out.println("请输入性别：");
        char sex = scanner.next().charAt(0);
        System.out.println("请输入所授课程：");
        String courseName = scanner.next();
        System.out.println("请输入所教班级：");
        int classNum = scanner.nextInt();
        int id = TeacherService.teacherRegist(name, password, sex, courseName, classNum);
        System.out.println("新增成功！教师号为："+id+", 请使用教师号登录。");
    }

    public static void deleteTeacher() throws Exception{
        System.out.println("请输入要删除的教师号：");
        Scanner input = new Scanner(System.in);
        int teacherId = input.nextInt();

        List<Teacher> list = StreamUtil.getTeacher();

        try {
            list.set(teacherId-101,null);
            StreamUtil.saveTeacher(list);
            System.out.println(list.get(teacherId-101).getName()+"删除成功！");
        } catch (Exception e) {
            System.out.println("删除错误！");
        }

    }

    public static void searchTeacher() throws Exception {

        System.out.println("=====查找老师=====");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找老师的ID：");
        int ss= scanner.nextInt();
        try {
            Teacher teacherMethod = StreamUtil.getTeacherMethod(ss);
            System.out.println(teacherMethod);
        } catch (Exception e) {
            System.out.println("该老师不存在！");
        }

    }


}
