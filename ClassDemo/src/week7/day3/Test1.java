package week7.day3;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author：陈林
 * @date：2020/9/16 16:07
 */
public class Test1 {
    //创建文件夹
    @Test
    public void test1() {
        File file = new File("d:\\temp\\temp1\\temp2");
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    //创建文件 在文件中写入hello
    @Test
    public void test2() throws IOException {
        File file = new File("d:\\temp", "1.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("hello");
        File file1 = new File("d:\\temp", "Hello.java");
        if (!file1.exists()) {
            file1.createNewFile();
        }
    }

    public static void main(String[] args) {
        File file = new File("d:\\temp\\temp1","temp2");

    }
}
