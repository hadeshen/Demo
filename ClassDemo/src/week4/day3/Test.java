package week4.day3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author：陈林
 * @date：2020/8/27 11:35
 */
public class Test {

    public Boolean isEmail() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入邮箱：");
        String str = input.next();
        String pattern = "\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        return m.matches();
    }

    public static void main(String[] args) {
        Test test = new Test();
        if (test.isEmail() == true) {
            System.out.println("输入正确");
        } else {
            System.out.println("输入错误");
        }
    }
}
