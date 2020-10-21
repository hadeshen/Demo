package week5.day5;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author：陈林
 * @date：2020/9/4 9:20
 * 查找指定字符串出现的次数
 */
public class Test1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("abaccdeff");
        int count = 0;
    }
    @Test
    public void test(){
        String str = "hijavahehejavahejava";
        Scanner input = new Scanner(System.in);
        System.out.println("输入想要查找的字符串：");
        String index=input.next();
        int count = 0;
        while (str.indexOf(index)>=0){
            str=str.substring(str.indexOf(index)+index.length());
            count++;
        }
        System.out.println(index+"出现的次数为："+count);
    }
}
