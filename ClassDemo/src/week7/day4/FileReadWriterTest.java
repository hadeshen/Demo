package week7.day4;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author：陈林
 * @date：2020/9/17 10:02
 * 创建文件读写操作 将file1内容读取出来写入file2中  复制file1内容到file2中
 */
public class FileReadWriterTest {
    @Test
    public void test1() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //创建文件  file1读 file2写
            File file1 = new File("hello.txt");
            File file2 = new File("hello1.txt");
            //创建流
            fr = new FileReader(file1);
            fw = new FileWriter(file2);
            //数据读入写入操作
            char[] cbuf = new char[5];
            //len记录每次读入到到cbuf数组中的字符个数
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (fw != null) ;
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null) ;
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void test2() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("hello.txt")));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("hello1.txt")));

        //方式一
//        char[] buf = new char[1024];
//        int len;
//        while ((len = br.read(buf)) !=-1){
//            bw.write(buf,0,len);
//        }
        //方式二
        String data;
        while ((data = br.readLine()) != null){
            bw.write(data);
            bw.newLine();
        }
    }
}
