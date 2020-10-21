package week6.day5;

import java.util.ArrayList;

/**
 * @author：陈林
 * @date：2020/9/11 14:46
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //增加
        list.add("giao");
        list.add("giao");
        list.add("giao");
        list.add("giao");
        //删除
        list.remove(1);
        //修改
        list.set(2, "bilibili");
        //查询
        list.get(1);


    }
}
