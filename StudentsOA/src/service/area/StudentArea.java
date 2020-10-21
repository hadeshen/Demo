package service.area;

import model.ClassRoom;
import model.Course;
import model.Student;
import service.impl.StudentDAOimpl;
import util.StreamUtil;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class StudentArea {


    public static void studentAreaINT() throws Exception {
        while (true) {
            String[] menus = {"1：学生列表", "2：新增学生", "3：删除学生", "4：查找学生", "5：修改学生信息", "6：退会到管理员区"};
            for (String item : menus) {
                System.out.print(item + "\n");
            }
            System.out.println("-----------------------------");
            System.out.println("请进行功能选择：");
            Scanner scanner = new Scanner(System.in);
            int menuID = scanner.nextInt();
            switch (menuID) {
                case 1:
                    getStudentList();
                    break;
                case 2:
                    System.out.println("请输入姓名：");
                    String name = scanner.next();
                    System.out.println("请输入密码：");
                    String password = scanner.next();
                    System.out.println("请输入性别：");
                    char sex = scanner.next().charAt(0);
                    int studentId1 = StudentDAOimpl.studentRegist(name, password, sex);
                    System.out.println("添加成功！");
                    System.out.println("学号为：" + studentId1 + "请使用学号登录！");
                    break;
                case 3:

                    deleteStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    changeStudent();
                    break;
                case 6:
                    return;
                default:
            }
        }
    }


    public static void getStudentList() throws Exception {
        System.out.println("=====查看学生列表=====");
        List<Student> student1 = StreamUtil.getStudent();
        for (Student student : student1) {
            System.out.println(student);
        }
        System.out.println("-----------------------------");
    }


    public static void deleteStudent() throws Exception {
        System.out.println("请输入删除学生的学号：");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        List<Student> list = StreamUtil.getStudent();
        try {
            Student student = list.get(id - 101);
            list.set(id - 101, null);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\studentList.txt"));
            oos.writeObject(list);
            oos.flush();
            oos.close();
            System.out.println(student.getName() + "删除成功！");
        } catch (Exception e) {
            System.out.println("删除失败！");
        }
        System.out.println("-----------------------------");

    }

    public static void searchStudent() throws Exception {
        System.out.println("=====查找学生=====");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找学生的ID：");
        int ss = scanner.nextInt();
        try {
            Student studentMethod = StreamUtil.getStudentMethod(ss);
            System.out.println(studentMethod);
        } catch (Exception e) {
            System.out.println("没有该学生！");
        }
        System.out.println("-----------------------------");
    }

    public static void changeStudent() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要修改学生的学号：");
        int studentId = input.nextInt();
        System.out.println("请输入姓名：");
        String name = input.next();
        System.out.println("请输入密码：");
        String password = input.next();
        System.out.println("请输入性别：");
        char sex = input.next().charAt(0);
        System.out.println("请输入课程：");
        String course = input.next();
        System.out.println("请输入成绩：");
        double score = input.nextDouble();
        System.out.println("请输入班级：");
        int classNum = input.nextInt();
        Student student = StreamUtil.getStudentMethod(studentId);
        student.setName(name);
        student.setPassword(password);
        student.setSex(sex);
        student.setScore(score);
        student.setClassRoom(new ClassRoom(classNum));
        student.setCourse(new Course(course));
        List<Student> list = StreamUtil.getStudent();
        list.set(studentId - 101, student);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\studentList.txt"));

        oos.writeObject(list);
        oos.flush();
        oos.close();
        System.out.println("修改成功！");
        System.out.println(list.get(studentId-101));
        System.out.println("-----------------------------");
    }
}