package week8.day3;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author chenlin
 * @create 2020-09-23  9:07
 */
public class ClassLoaderTest {

    @Test
    public void test() throws Exception {
        Properties properties = new Properties();
//        //方式一：文件流加载Properties文件
//        //文件在当前moudule下
//        FileInputStream fis = new FileInputStream("jdbc.properties");
//        properties.load(fis);
        //方式二：类加载Properties文件
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        //文件在当前src下
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(is);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("user="+user+"  password="+password);


    }

}
