package week10.day3;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author chenlin
 * @create 2020-10-14  9:20
 */
public class C3P0Test {
    @Test
    public void test() throws PropertyVetoException, SQLException {
        //方式一：
        //获取数据库连接池
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&rewriteBatchedStatements=true");
        cpds.setUser("test");
        cpds.setPassword("123");
        //设置相关参数，对数据库连接池进行管理
        //设置初始数据库连接池连接数
        cpds.setInitialPoolSize(10);
        Connection connection = cpds.getConnection();
        System.out.println(connection);
        //销毁C3P0连接池
//        DataSources.destroy(cpds);
    }
    @Test
    public void test1() throws SQLException {
        ComboPooledDataSource helloC3P0 = new ComboPooledDataSource("helloC3P0");
        Connection connection = helloC3P0.getConnection();
        System.out.println(connection);
    }
}
