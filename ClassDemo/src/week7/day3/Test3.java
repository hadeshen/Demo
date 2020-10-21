package week7.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author：陈林
 * @date：2020/9/16 19:05
 */
public class Test3 {
    public static String isChampion(Map<String,String> map){
        System.out.println("请输入国家：");
        Scanner input = new Scanner(System.in);
        String year = map.get(input.next());
        if (year != null){
            return year;
        }
        return "该国家没有获得冠军";
    }

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("乌拉圭","1930 1950");
        hashMap.put("意大利","1934 1938 1982 2006");
        hashMap.put("西德","1954 1974 1990");
        hashMap.put("巴西","1958 1962 1970 1994 2002");
        hashMap.put("英格兰","1966");
        hashMap.put("阿根廷","1986 1986");
        hashMap.put("法国","1998");
        System.out.println(isChampion(hashMap));
    }
}
