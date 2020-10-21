package week7.day4;

import java.util.*;

/**
 * @author：陈林
 * @date：2020/9/17 17:43
 */
public class Test5 {
    /**
     * 判断是否为上车点
     *
     * @param map
     * @param start
     * @return
     */
    public static boolean isStart(HashMap<String, Integer> map, String start) {
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String startStation = iterator.next();
            if (startStation.equals(start)) {
                return true;
            }
        }
        return false;

    }

    /**
     * 判断是否为下车点
     *
     * @param map
     * @param end
     * @return
     */
    public static boolean isEnd(HashMap<String, Integer> map, String end) {
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String endStation = iterator.next();
            if (endStation.equals(end)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 计算车费 三个站以内3元；三个站以上五个站以内4元；五个站以上每个站加2元，10元封顶
     *
     * @param map
     * @param start
     * @param end
     */
    public static int fare(HashMap<String, Integer> map, String start, String end) {
        Integer startNum = map.get(start);
        Integer endNum = map.get(end);
        int stationCount = Math.abs(endNum - startNum);
        int fare;
        if (stationCount <= 3 && stationCount > 0) {
            return fare = 3;
        } else if (stationCount > 3 && stationCount <= 5) {
            return fare = 4;
        } else if (stationCount > 5) {
            fare = 4 + (stationCount - 5) * 2;
            if (fare >= 10) {
                return fare = 10;
            }
            return fare;
        }
        return 0;


    }

    /**
     * 计算乘坐时间
     * @param map
     * @param start
     * @param end
     * @return
     */
    public static int time(HashMap<String, Integer> map, String start, String end) {
        Integer startNum = map.get(start);
        Integer endNum = map.get(end);
        int time = Math.abs(endNum - startNum) * 2;
        return time;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("昆明", 1);
        map.put("贵阳", 2);
        map.put("长沙", 3);
        map.put("武汉", 4);
        map.put("郑州", 5);
        map.put("石家庄", 6);
        map.put("天津", 7);
        map.put("北京", 8);
        map.put("沈阳", 9);
        map.put("长春", 10);
        map.put("哈尔滨", 11);

        Scanner input = new Scanner(System.in);
        System.out.println("欢迎乘坐和谐号！");
        System.out.println("请输入上车点：");

        while (true) {
            String start = input.next();
            if (isStart(map, start)) {
                System.out.println("请输入下车点：");
                while (true) {
                    String end = input.next();
                    if (isEnd(map, end)) {
                        int fare = fare(map, start, end);
                        int time = time(map, start, end);
                        System.out.println("从"+start+"到"+end+"车费为" + fare+"元,时间大约为："+time+"分钟。");
                        return;
                    } else {
                        System.out.println("没有" + end + "站点，请重新输入下车点：");
                    }
                }
            } else {
                System.out.println("没有" + start + "站点，请重新输入上车点：");
            }
        }

    }

}
