package week6.day3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author：陈林
 * @date：2020/9/10 8:54
 */
public class Test2 {
    /**
     * 判断；list中是否包含某个字符串
     * @param list
     * @param str
     * @return boolean
     */
    public static boolean myContains(ArrayList<String> list,String str){
        for (String string:list){
            if (str.equals(string)){
                return true;
            }
        }return false;
    }

    /**
     * 计算list中包含某个字符串的个数
     * @param list
     * @param str
     * @return count
     */
    public static int contains(ArrayList<String> list,String str){
        int count = 0;
        for (String string:list){
            if (str.equals(string)){
                count++;
            }
        }
        return count;
    }

    /**
     * 删除；list中指定字符串
     * @param list
     * @param str
     */
    public static void delString(ArrayList<String> list,String str){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (str.equals(iterator.next())){
                iterator.remove();
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("efg");
        list.add("abc");
        list.add("abc");
        list.add("qwe");
        String str = "abc";
        delString(list,str);
        for (String string:list){
            System.out.println(string);
        }
    }
}
