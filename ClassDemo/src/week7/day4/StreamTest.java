package week7.day4;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author：陈林
 * @date：2020/9/17 16:47
 * 从键盘输入字符串 转换为大写 遇见e或者exit退出
 */
public class StreamTest {
    @Test
    public void test(){
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            while (true){
                System.out.println("请输入：");
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data)||"exit".equalsIgnoreCase(data)){
                    System.out.println("退出");
                    break;
                }
                System.out.println(data.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (br !=null){

                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
