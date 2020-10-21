package week9.day1;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author chenlin
 * @create 2020-10-09  15:16
 */
public class ConnetionTest1 {
    @Test
    public void test1() throws Exception {
        //创建Driver对象
        Driver driver = new com.mysql.cj.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8";
        Properties info = new Properties();
        info.setProperty("user","test");
        info.setProperty("password","123");
        //获取连接
        Connection connect = driver.connect(url, info);
        System.out.println(connect);
    }
    @Test
    public void test2() throws Exception{
        //获取实例对象 反射
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();
        //提供连接的数据库
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8";
        Properties info = new Properties();
        info.setProperty("user","test");
        info.setProperty("password","123");
        //获取连接
        Connection connect = driver.connect(url, info);
        System.out.println(connect);
    }
    //使用DriverManager替换Driver
    @Test
    public void test3() throws Exception{
        //获取实例对象 反射
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();
        //提供连接的数据库
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8";
        Properties info = new Properties();
        info.setProperty("user","test");
        info.setProperty("password","123");
        //注册驱动
        DriverManager.registerDriver(driver);
        //获取连接
        Connection connection = DriverManager.getConnection(url, info);
        System.out.println(connection);
    }
    @Test
    public void test4() throws Exception{
        //提供连接信息
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8";
        String user = "test";
        String password = "123";
        //加载Driver 驱动 创建Driver对象时自动注册驱动
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
    @Test
    public void test5() throws Exception{
        Properties properties = new Properties();
        //类加载Properties文件
        InputStream is = ConnetionTest1.class.getClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(is);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("Driver");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);

    }
}
