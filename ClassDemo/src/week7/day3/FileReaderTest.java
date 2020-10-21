package week7.day3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author：陈林
 * @date：2020/9/16 14:19
 */
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        //实列化对象 提供文件路径
        File file = new File("D:\\文档\\hello.txt");
        //提供文件流
        FileReader fileReader = new FileReader(file);
        // read方法 读取文件中字符 达到文件末尾返回-1
        int read = fileReader.read();
        while (read != -1) {
            System.out.print((char) read);
            read = fileReader.read();
        }
        System.out.println();
        int data;
        while ((data = fileReader.read()) != -1) {
            System.out.print((char) data);
        }
        //关闭流
        fileReader.close();


    }
}
