package week5.day1;

import java.util.Scanner;

/**
 * @author：陈林
 * @date：2020/9/1 20:06
 * 判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"
 * 是对称字符串
 * 使用(String和StringBuffer实现这个功能)
 */
public class StringTest2 {
    public void isString(){
        Scanner input = new Scanner(System.in);
        String str1=input.next();
        int x = 0;
        int y = str1.length()-1;
        char[] ch = str1.toCharArray();
        while(ch[x++] == ch[y--])
        {
            if(ch[x] != ch[y]){
                System.out.println("不对称");
                break;
            }
            if(x >= y )
            {
                System.out.println("对称");
                break;
            }
        }
    }

    public static void main(String[] args) {
        StringTest2 stringTest2 = new StringTest2();
        stringTest2.isString();
    }
}
