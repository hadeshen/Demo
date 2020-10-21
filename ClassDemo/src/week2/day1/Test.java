package week2.day1;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("马云");
        teacher.setAge(40);
        teacher.setTeacherAge(10);
        teacher.setCourse("对钱不感兴趣");
        System.out.println(teacher.toString());
    }
}
