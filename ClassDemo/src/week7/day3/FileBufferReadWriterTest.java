package week7.day3;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author：陈林
 * @date：2020/9/17 14:15
 * 通过io流复制文件
 */
public class FileBufferReadWriterTest {
    @Test
    public void test(){
        long start = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //创建文件 file1为读取文件 file2为写入文件
            File file1 = new File("D:\\文档\\Java笔记\\1_课件\\第2部分：Java高级编程\\尚硅谷_宋红康_第8章_多线程\\哪样.jpg");
            File file2 = new File("D:\\文档\\Java笔记\\1_课件\\第2部分：Java高级编程\\尚硅谷_宋红康_第8章_多线程\\闹哪样2.jpg");

            //创建字节处理流
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);

            //创建缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buf = new byte[1024];
            int len;
            while ((len = bis.read(buf)) != -1){
                bos.write(buf,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流 先关闭外层的流
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //关闭外层的流内层的流回自动关闭 可以省略内层的流关闭操作
//        fos.close();
//        fis.close();

        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间"+(end-start));
    }
}
