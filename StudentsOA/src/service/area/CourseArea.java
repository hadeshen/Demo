package service.area;

import data.CourseData;
import model.Course;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class CourseArea {

    public static void courseAreaINT() throws Exception {
        while (true) {
            String[] menus = {"1：课程列表", "2：新增课程", "3：删除课程", "4：查找课程", "5：退会到管理员区"};
            for (String item : menus) {
                System.out.print(item + "\n");
            }
            System.out.println("-----------------------------");
            System.out.println("请进行功能选择：");
            Scanner scanner = new Scanner(System.in);
            int menuID = scanner.nextInt();
            switch (menuID) {
                case 1:
                    getCourseList();
                    break;
                case 2:
                    addCourse();
                    break;
                case 3:
                    deleteCourse();
                    break;
                case 4:
                    searchCourse();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("输入错误！");
                    break;
            }
        }
    }


    public static void getCourseList() throws Exception {
        System.out.println("=====查看课程列表=====");

        List<Course> course = CourseData.getCourse();
        for (Course c:course){
            System.out.println(c);
        }
        System.out.println("-----------------------------");
    }


    public static void addCourse() throws Exception {
        Course course = new Course();
        List<Course> course1 = CourseData.getCourse();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入课程名：");
        String s = input.next();
        course.setCourseName(s);
        course.setCourseId(course1.size()+1);
        course1.add(course);
        CourseData.saveCourse(course1);
        System.out.println(s+"添加成功！");
    }

    public static void deleteCourse() throws Exception{
        Scanner input = new Scanner(System.in);
        List<Course> course = CourseData.getCourse();
        System.out.println("请输入删除的课程编号：");
        int i = input.nextInt();
        Course course1 = course.get(i - 1);
        course.set(i-1,null);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\courseList.txt"));

        oos.writeObject(course);
        oos.flush();
        oos.close();
        System.out.println(course1.getCourseName()+"删除成功！");

    }

    public static void searchCourse() throws Exception {

        System.out.println("=====查找课程=====");
        Scanner input = new Scanner(System.in);
        List<Course> course = CourseData.getCourse();
        System.out.println("请输入的课程编号：");
        int i = input.nextInt();
        Course course1 = course.get(i - 1);
        System.out.println(course1.getCourseName());

    }


}
