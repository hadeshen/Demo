package week7.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author：陈林
 * @date：2020/9/15 8:49
 */
public class Test2 {
    public static void main(String[] args) {
        String[] str = new String[]{"AA","BB","EE","CC","GG","HH","FF","ZZ"};
        List<String> list = Arrays.asList(str);
        /**将list转换成ArrayList才能进行remove操作，
         * list继承AbstractList的子类，而AbstractList是不支持removeAll()和remove()操作
         * 不然会出现UnsupportedOperationException错误
         */
        ArrayList<String> arrayList = new ArrayList<>();
        for (String string:list){
            arrayList.add(string);
            System.out.print(string+" ");
        }

        arrayList.remove(arrayList.indexOf("ZZ"));
        System.out.println(arrayList);

    }

}
