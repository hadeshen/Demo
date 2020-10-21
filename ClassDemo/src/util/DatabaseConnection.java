package util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author chenlin
 * @create 2020-10-10  9:59
 * 数据库连接工具类
 */
public class DatabaseConnection {
    /**
     * 创建数据库连接
     * @return 连接实例对象
     */
    public static Connection connection() {
        Connection conn = null;
        try {
            //加载配置文件信息
            Properties properties = new Properties();
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(is);
            String user = properties.getProperty("user");
            String url = properties.getProperty("url");
            String password = properties.getProperty("password");
            String driver = properties.getProperty("Driver");
            //加载驱动
            Class.forName(driver);
            //获取连接
             conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


    /**
     * 连接关闭
     * @param connection
     */
    public static void close(Connection connection) {
        try {
            if (connection !=null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
