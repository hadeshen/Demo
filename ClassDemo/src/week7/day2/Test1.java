package week7.day2;

import java.util.*;

/**
 * @author：陈林
 * @date：2020/9/15 14:33
 * 1.	定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
 * 例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class Test1 {
    public static void countChar(List<String> list){
        String str="";
        //将list转换为字符串
        for (String string : list) {
            str +=string;
        }
        //将字符作为map的key，出现的次数为value
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        //将字符串转换为char数组
        //遍历数组
        for (char c:chars){
            //判断map中是否存在
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                map.put(c,1);
            }
        }
        Set<Character> keyset1 = map.keySet();
        for (Character key : keyset1) {
            System.out.println(key + "=" + map.get(key));
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        countChar(list);

    }
}
