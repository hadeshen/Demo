package week7.day4;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author：陈林
 * @date：2020/9/18 8:58
 *
 * 创建歌曲 文件  并复制
 */
public class Test4 {
    @Test
    public void test()  {
        File music1 = new File("D:\\杂物间\\关于郑州的记忆.mp3");
        if (music1.exists()){
            try {
                music1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(music1));
            bos = new BufferedOutputStream(new FileOutputStream(new File("D:\\杂物间\\关于郑州的记忆1.mp3")));
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
