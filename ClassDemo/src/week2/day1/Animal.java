package week2.day1;

/*
 *   Animal类设计
 *   属性：
 *       种类
 *       体重
 *       性别
 *   方法：
 *       吃
 *       睡
 *       叫
 * */
public class Animal {
    //种类
    public String name;
    //体重
    protected int weight;
    //性别
    private String sex;

    //==================
    //方法1
    public void eat(){
        System.out.println(name + "正在吃");
    }

    //方法2
    public void sleep(){
        System.out.println(name + "正在睡");
    }

    //方法3
    public void roar(){
        System.out.println(name + "正在叫");
    }


}