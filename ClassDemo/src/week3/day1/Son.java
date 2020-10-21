package week3.day1;

/**
 * @author：陈林
 * @date：2020/8/17 14:52
 */
public class Son extends Father{
    public String school;
    @Override
    public void getInfo(){
        age=11;
        name="小明";
        school="超神学院";
        System.out.println(age+"岁的"+name+"在"+school+"上学");
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.getInfo();
        Son son = new Son();
        son.getInfo();
    }
}
