package model;

import java.io.Serializable;

/**
 * @author chenlin
 * @create 2020-09-25  15:23
 * 课程
 */
public class Course implements Serializable {
    //课程编号
    private int courseId;
    //课程名
    private String courseName;
    public Course() {
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "课程： " + courseName;
    }
}
