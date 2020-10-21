package week1.day03;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入金字塔层数：");
        int n = input.nextInt();
        //外层循环控制层数
        for (int i = 1; i <= n; i++) {
            //根据外层行号，输出星号左边的空格
            for (int j = 1; j <= n - i; j++) {
                System.out.printf(" ");
            }
            //根据外层行号，输出星号个数
            for (int k = 1; k <= 2 * i - 1; k++) {

                System.out.print("*");
            }
            //一行结束，换行
            System.out.print("\n");
        }
    }
}
