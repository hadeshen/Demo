package util;

import model.Student;
import model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenlin
 * @create 2020-09-26  9:11
 * 流工具类
 */
public class StreamUtil {

    /**
     * 将学生对象存入文件
     *
     * @throws Exception
     */
    public static void saveStudent(List<Student> student) throws Exception {
        File file = new File("StudentsOA\\src\\data\\studentList.txt");
        if (file.length() == 0){
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

            oos.writeObject(student);
            oos.flush();
            oos.close();
        }else {

            List<Student> list = getStudent();
            list.addAll(student);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\studentList.txt"));

            oos.writeObject(list);
            oos.flush();
            oos.close();
        }


    }

    /**
     * 从文件中获取学生对象列表
     *
     * @throws Exception
     */
    public static List<Student> getStudent() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StudentsOA\\src\\data\\studentList.txt"));
        List<Student> studentList = (ArrayList<Student>) ois.readObject();
        ois.close();
        return studentList;
    }

    /**
     * 通过学号获取学生实例对象
     *
     * @param studentId   学号
     * @return 返回学生实例对象
     * @throws Exception
     */
    public static Student getStudentMethod(int studentId) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StudentsOA\\src\\data\\studentList.txt"));
        List<Student> studentList = (ArrayList<Student>) ois.readObject();
        ois.close();
        Student student = studentList.get(studentId - 101);
        return student;
    }
    public static void saveTeacher(List<Teacher> teacher) throws Exception {
        File file = new File("StudentsOA\\src\\data\\teacherList.txt");
        if (file.length() == 0) {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

            oos.writeObject(teacher);
            oos.flush();
            oos.close();
        } else {

            List<Teacher> list = getTeacher();
            list.addAll(teacher);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentsOA\\src\\data\\teacherList.txt"));

            oos.writeObject(list);
            oos.flush();
            oos.close();
        }
    }

    public static List<Teacher> getTeacher() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StudentsOA\\src\\data\\teacherList.txt"));
        List<Teacher> teacherList = (ArrayList<Teacher>) ois.readObject();
        ois.close();
        return teacherList;
    }

    public static Teacher getTeacherMethod(int teacherId) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StudentsOA\\src\\data\\teacherList.txt"));
        List<Teacher> teacherList = (ArrayList<Teacher>) ois.readObject();
        ois.close();
        Teacher teacher = teacherList.get(teacherId - 101);
        return teacher;
    }
}
