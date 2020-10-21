package week1.day04;

import java.util.Scanner;

/**
 * @author ytt查找数组元素输出下标
 */
public class ClassTest04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入：");
        int num=input.nextInt();
        //静态初始化数组
        int[] a={1,2,3,4,5,6};
        //访问数组中的元素
        for (int i=0;i<a.length;i++){
            if (num==a[i]){
                System.out.println(i+1);
                return;
            }
        }
    }
}
