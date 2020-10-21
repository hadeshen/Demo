package week6.day3;

import java.util.*;

/**
 * @author：陈林
 * @date：2020/9/9 15:18
 * 1.生成10个随机数，值在100到200之间；
 * 2.将这十个数存入HashSet集合中。
 * 3.将这个HashSet集合转换成ArrayList集合
 * 4.重新为ArrayList集合排序，按照从小到大的顺序；
 * 5.使用foreach遍历集合；
 */
public class Test1 {
    public static void main(String[] args) {
        Set set = new HashSet();
        for (int i = 0; i < 10; i++) {
            int number = (new Random().nextInt(100)) + 100;
            set.add(number);
        }
        List list = new ArrayList();
        for (Object o : set) {
            list.add(o);
        }
        Collections.sort(list);
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
