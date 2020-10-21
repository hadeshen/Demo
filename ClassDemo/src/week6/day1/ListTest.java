package week6.day1;

import java.util.ArrayList;

/**
 * @author：陈林
 * @date：2020/9/7 15:03
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        //增加
        list.add(123);
        list.add(456);
        list.add(789);
        list.add("ABC");
        System.out.println(list);
        //删除
        list.remove(0);
        System.out.println(list);
        System.out.println("*****************");
        //修改
        list.set(2, "Bili");
        System.out.println(list);
        System.out.println("*****************");
        //查询
        Object o = list.get(2);
        System.out.println(o);
        System.out.println("*****************");
        //插入
        list.add(2, "giao");
        System.out.println(list);
        System.out.println("*****************");
        //长度
        System.out.println(list.size());
        System.out.println("*****************");
        //遍历
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
