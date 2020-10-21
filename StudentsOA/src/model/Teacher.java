package model;

import java.io.Serializable;

/**
 * @author chenlin
 * @create 2020-09-25  11:29
 * 老师实体类
 */
public class Teacher implements Serializable {
    //教师编号
    private int teacherId;
    //教师密码
    private String password;
    //教师姓名
    private String name;
    //授课课程
    private Course course;
    //授课班级
    private ClassRoom classRoom;
    private char sex;

    public Teacher() {

    }

    public Teacher(int teacherId, String password, String name, Course course, ClassRoom classRoom, char sex) {
        this.teacherId = teacherId;
        this.password = password;
        this.name = name;
        this.course = course;
        this.classRoom = classRoom;
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", course=" + course +
                ", classRoom=" + classRoom +
                '}';
    }
}