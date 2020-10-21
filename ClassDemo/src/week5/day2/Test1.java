package week5.day2;

import java.util.Arrays;

/**
 * @author：陈林
 * @date：2020/9/2 20:28
 *
 */
public class Test1 {
    public static void main(String[] args) {
        Dish[] arr = new Dish[4];
        arr[0] = new Dish("白菜",1.5);
        arr[1] = new Dish("玉米",4.5);
        arr[2] = new Dish("土豆",2.5);
        arr[3] = new Dish("萝卜",0.5);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
