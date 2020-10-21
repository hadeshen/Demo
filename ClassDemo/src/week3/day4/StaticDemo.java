package week3.day4;

/**
 * @author：陈林
 * @date：2020/8/20 11:17
 */
public class StaticDemo {
    private String name;
    public static String country;
    public StaticDemo(String name){
        this.name=name;
    }
    public String getInfo(){
        return "姓名："+this.name+" 国家：";
    }
}
