package week6.day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author：陈林
 * @date：2020/9/11 8:55
 */
public class Test1 {
    /**
     * 判断map中是否包含指定的key值
     * @param map
     * @param object
     * @return
     */
    public static boolean isKey(Map map,Object object){
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(object)){
                return true;
            }
        }return false;
    }

    /**
     * 根据key值查找value
     * @param map
     * @param object
     * @return
     */
    public static Object findValue(Map map, Object object){
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(object)){
                return map.get(object);
            }
        }return "未找到value";
    }
    public static void delMap(Map map,Object object){
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(object)){
                map.remove(object);
            }
        }
    }
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1,"风清扬");
        map.put(2,"逍遥子");
        Map map1 = new HashMap<>();
        map1.put(3,"铁木真");
        map1.put(4,"郭靖");
        map.putAll(map1);
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"=====>"+map.get(iterator.next()));
        }
    }
}
