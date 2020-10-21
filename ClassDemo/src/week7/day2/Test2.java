package week7.day2;

import java.util.HashMap;

/**
 * @author：陈林
 * @date：2020/9/15 15:56
 * 有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
 * 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，将第一个数组元素作为key，
 * 第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}
 */
public class Test2 {
    public static void main(String[] args) {
        String[] province = new String[]{"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] city = new String[]{"哈尔滨","杭州","南昌","广州","福州"};
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < province.length; i++) {
            map.put(province[i],city[i]);
        }
        System.out.println(map.toString());
//        Set<String> keySet1 = map.keySet();
//        Iterator<String> iterator2 = keySet1.iterator();
//        while (iterator2.hasNext()){
//            Object mapKey = iterator2.next();
//            Object mapValue = map.get(mapKey);
//            System.out.println(mapKey+"----->"+mapValue);
//        }
    }
}
