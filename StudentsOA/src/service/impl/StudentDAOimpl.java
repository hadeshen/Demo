package service.impl;


import model.ClassRoom;
import model.Course;
import model.Student;
import util.StreamUtil;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenlin
 * @create 2020-09-25  17:37
 */
public class StudentDAOimpl {


    public static int studentRegist(String name, String password, char sex) throws Exception {
        Student student = new Student();
        student.setName(name);
        student.setPassword(password);
        student.setSex(sex);
        student.setStudentId(StreamUtil.getStudent().size() + 101);
        List<Student> list = StreamUtil.getStudent();
        list.add(student);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\studentList.txt"));

        oos.writeObject(list);
        oos.flush();
        oos.close();
        return student.getStudentId();
    }


    public static boolean studentLogin(int studentId, String password) throws Exception {
        List<Student> student = StreamUtil.getStudent();
        Student student1 = null;
        try {
            student1 = StreamUtil.getStudentMethod(studentId);
        } catch (Exception e) {
            return false;
        }

        if (studentId == student1.getStudentId() && password.equals(student1.getPassword())) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean changePassword(int studentId, String password) throws Exception {
        Student student = StreamUtil.getStudentMethod(studentId);
        student.setPassword(password);

        List<Student> list = StreamUtil.getStudent();
        list.set(studentId - 101, student);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\studentList.txt"));

        oos.writeObject(list);
        oos.flush();
        oos.close();
        return true;
    }


    public static List getInfo(int studentId) throws Exception {
        Student student = StreamUtil.getStudentMethod(studentId);
        //存放学生班级-课程信息
        List<Object> list = new ArrayList<>();
        ClassRoom classRoom = student.getClassRoom();
        Course course = student.getCourse();
        list.add(course);
        list.add(0, classRoom);
        return list;
    }


    public static List getScore(int studentId) throws Exception {
        Student student = StreamUtil.getStudentMethod(studentId);
        List<Object> list = new ArrayList<>();
        double score = student.getScore();
        Course course = student.getCourse();
        String str = "成绩：" + score;
        list.add(course);
        list.add(0, str);
        return list;
    }
}
