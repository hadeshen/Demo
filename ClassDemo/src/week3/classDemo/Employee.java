package week3.classDemo;

import java.util.Date;

/**
 * @author：陈林
 * @date：2020/8/21 16:32
 * 员工类
 */
public abstract class Employee {
    private String name;
    private int number;
    private String birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return 打印出员工信息
     */
    @Override
    public String toString() {
        return "员工{" +
                "姓名='" + name + '\'' +
                ", 号码=" + number +
                ", 生日=" + birthday +
                '}';
    }

    /**
     * 抽象方法 收益
     */
    public abstract void earnings();
}
