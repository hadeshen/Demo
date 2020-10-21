package week7.day3;

import java.util.Comparator;

/**
 * @author：陈林
 * @date：2020/9/16 17:34
 */
public class Student implements Comparator<Student>{
    private String name;
    private int age;
    private float score;

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }

}
