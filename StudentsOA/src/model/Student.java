package model;

import java.io.Serializable;

/**
 * @author chenlin
 * @create 2020-09-25  11:28
 * 学生实体类
 */
public class Student implements Serializable {
    //学号
    private int studentId;
    //密码
    private String password;
    //姓名
    private String name;
    //性别
    private char sex;
    //成绩
    private double score;
    //班级号
    private ClassRoom classRoom;
    //课程
    private Course course;

    public Student() {
    }

    public Student(int studentId, String password, String name, char sex, double score, ClassRoom classRoom, Course course) {
        this.studentId = studentId;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.score = score;
        this.classRoom = classRoom;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号=" + studentId +
                ", 密码='" + password + '\'' +
                ", 姓名='" + name + '\'' +
                ", 性别=" + sex +
                ", 成绩=" + score +
                ", 班级=" + classRoom +
                ", 课程=" + course +
                '}';
    }
}
