package week7.day5;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author：陈林
 * @date：2020/9/18 10:46
 */
public class ObjectOutputStreamTest {
    /**
     * 对象序列化 将对象中的内容存入到磁盘中
     * 类对象序列化需要实现serializable接口，提供一个全局常量serialVersionUID
     */
    @Test
    public void test1() throws Exception {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("giao.txt"));
        oos.writeObject(new String("一给我哩giao"));
        //刷新
        oos.flush();
        oos.close();

    }

    /**
     * 反序列化 将磁盘中的内容转换为内存中的对象
     */
    @Test
    public void test2() throws Exception {


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("giao.txt"));
        Object object = ois.readObject();
        String str = (String) object;
        System.out.println(str);
        ois.close();

    }
}


