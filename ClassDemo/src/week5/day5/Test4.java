package week5.day5;

/**
 * @author：陈林
 * @date：2020/9/4 10:54
 * 创建color枚举值
 */

enum Color{
    /**
     * 颜色枚举
     */
    RED(1,"红色"),
    BLUE(2,"蓝色"),
    BLACK(3,"黑色"),
    YELLOW(4,"黄色"),
    GREEN(4,"绿色");
    private Integer serial;
    private String description;

    Color(Integer serial, String description) {
        this.serial = serial;
        this.description = description;
    }

}
interface Works{
    void reflectColor();
}
public class Test4 {
}
