package week2.day4;

/**
 * @author：陈林
 * @date：2020/8/13 10:40
 */
public class Gril {
    private String name;
    private int age;
    public boolean compareAge(String name1,int age1,String name2,int age2){
        if (age1>age2){
            System.out.println(name1+"的年龄大");
            return true;
        }else {
            System.out.println(name2+"的年龄大");
            return false;
        }
    }
}
