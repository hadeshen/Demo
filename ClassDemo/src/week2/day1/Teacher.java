package week2.day1;

public class Teacher {
    private String name;
    private int age;
    private int teacherAge;
    private String course;

//    public void Say() {
//        System.out.println("姓名：" + name);
//        System.out.println("年龄：" + age);
//        System.out.println("教龄：" + teacherAge);
//        System.out.println("课程名：" + course);
//    }

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

    public int getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(int teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teacherAge=" + teacherAge +
                ", course='" + course + '\'' +
                '}';
    }
}
