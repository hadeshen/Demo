package week9.day1;

import util.DatabaseConnection;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author chenlin
 * @create 2020-10-09  20:01
 */
public class PreparedStatementTest {
    @Test
    public void test() throws Exception {
        Properties properties = new Properties();
        //加载配置文件信息
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(is);

        String user = properties.getProperty("user");
        String url = properties.getProperty("url");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("Driver");
        //加载驱动
        Class.forName(driver);
        //获取连接
        Connection connection = DriverManager.getConnection(url, user, password);
        //预编译sql语句
        String sql = "insert into user(id,name) values(?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,"1");
        ps.setString(2,"孙笑川");
        //执行操作
        ps.execute();
        //资源关闭
        connection.close();
        ps.close();
    }
    @Test
    public void test2() throws SQLException {
        Connection connection = DatabaseConnection.connection();
        String sql = "update user set name=? where id=2";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,"逍遥子");
        //执行操作
        ps.execute();
        connection.close();
    }
    @Test
    public void updateTest(){
        String sql = "delete from user where id=?";
        update(sql,2);
        
    }
    public void update(String sql,Object... objects){
        Connection connection = null;
        try {
            //获取数据库连接
            connection = DatabaseConnection.connection();
            //预编译sql
            PreparedStatement ps = connection.prepareStatement(sql);
            //填充sql占位符
            for (int i = 0; i < objects.length; i++) {
                ps.setObject(i+1,objects[i]);
            }
            //执行
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //资源关闭
            DatabaseConnection.close(connection);
        }
    }
    @Test
    public void test3() throws SQLException {
        Connection connection = DatabaseConnection.connection();
        String sql = "insert into user(id,name,createDate) values(?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,2);
        ps.setString(2,"逍遥子");
        ps.setDate(3,new Date(new java.util.Date().getTime()));
        ps.execute();
        DatabaseConnection.close(connection);
    }
}
