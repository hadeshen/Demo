package model;

import java.io.Serializable;

/**
 * @author chenlin
 * @create 2020-09-25  15:30
 * 班级
 */
public class ClassRoom implements Serializable {
    //班级号
    private int classNum;

    public ClassRoom() {
    }

    public ClassRoom(int classNum) {
        this.classNum = classNum;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "班级： " + classNum + "班";
    }
}
