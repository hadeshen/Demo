package week7.day4;

import java.io.File;

/**
 * @author：陈林
 * @date：2020/9/17 19:36
 */
public class Test1 {
    public void printName(File file) {
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                printName(files[i]);
            }
            System.out.println(files[i].getName());
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        File file = new File("D:\\杂物间");
        test1.printName(file);
    }
}
