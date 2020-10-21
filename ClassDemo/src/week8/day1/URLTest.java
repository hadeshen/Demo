package week8.day1;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author chenlin
 * @create 2020-09-21  16:26
 */
public class URLTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.bilibili.com:8888/video/BV1Kb411W75N?p=629");
            //获取URL的协议名
            System.out.println(url.getProtocol());
            //获取URL的主机名
            System.out.println(url.getHost());
            //获取URL的端口号
            System.out.println(url.getPort());
            //URL文件路径
            System.out.println(url.getPath());
            //URL文件名
            System.out.println(url.getFile());
            //查询名
            System.out.println(url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
