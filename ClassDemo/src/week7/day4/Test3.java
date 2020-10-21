package week7.day4;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author：陈林
 * @date：2020/9/18 9:47
 */
public class Test3 {
    @Test
    public void myself() {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            File file = new File("myself.txt");
            fw = new FileWriter(file);
            fw.write("姓名：孙笑川 性别：男 年龄：18 班级：三年级二班");
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //输入流
            fr = new FileReader(file);
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
            file.delete();
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
}
