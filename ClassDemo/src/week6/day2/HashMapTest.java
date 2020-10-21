package week6.day2;

import java.util.*;

/**
 * @author：陈林
 * @date：2020/9/8 14:27
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        //添加
        hashMap.put(123,123);
        hashMap.put("add",123);
        hashMap.put("daa","adf");
//        //修改
//        hashMap.put(123,"qwer");
//        //删除
//        hashMap.remove(123);
//        //清空
//        hashMap.clear();
//        System.out.println(hashMap);
        //遍历map中所用key值
        Set<Object> keySet = hashMap.keySet();
        Iterator<Object> iterator = keySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历map中value值
        Collection<Object> values = hashMap.values();
        for (Object obj : values){
            System.out.println(obj);
        }
        //方式一：获取map中key-value
        Set<Map.Entry<Object, Object>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Object next = iterator1.next();
            Map.Entry entry = (Map.Entry)next;
            System.out.println(entry.getKey()+"------>"+entry.getValue());

        }
        System.out.println();
        //方式二：遍历map中kay-value
        Set<Object> keySet1 = hashMap.keySet();
        Iterator<Object> iterator2 = keySet1.iterator();
        while (iterator2.hasNext()){
            Object mapKey = iterator2.next();
            Object mapValue = hashMap.get(mapKey);
            System.out.println(mapKey+"----->"+mapValue);
        }
    }
}
