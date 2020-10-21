package week7.day4;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

/**
 * @author：陈林
 * @date：2020/9/17 20:43
 */
public class Test2 {
    File file = new File("D:\\杂物间\\input.txt");

    //整数存入文件
    @Test
    public void write(String i) {
        Writer fw = null;
        try {
            fw = new FileWriter(file);
            fw.write(String.valueOf(i));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //顺序读出
    public void read() {
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            char[] c = new char[10];
            int l;
            while ((l = fr.read(c)) != -1) {
                System.out.print(new String(c, 0, l));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        while (count <= 10) {
            System.out.println("请输入第" + count + "个整数");
            Scanner input = new Scanner(System.in);
            sb.append(input.nextInt()).append(" ");
            count++;
        }
        test2.write(sb.toString());
        test2.read();
    }
}
