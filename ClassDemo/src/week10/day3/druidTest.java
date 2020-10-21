package week10.day3;

import org.junit.Test;
import util.JDBCUtils;
import com.alibaba.druid.pool.DruidDataSourceFactory;


import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author chenlin
 * @create 2020-10-14  11:13
 */
public class druidTest {
    @Test
    public void test() throws Exception {
        Properties properties = new Properties();
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
    @Test
    public void test2() throws SQLException {
        Connection connection = JDBCUtils.getconnection();
        String sql = "insert into user(id,name) values (?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setObject(1,4);
        ps.setObject(2,"王思聪");
        ps.execute();

    }
    @Test
    public void test3(){
        try {
            String sql = "update user set createDate=? where id=?";
            Connection connection = JDBCUtils.getconnection();

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setObject(1,new Date(new java.util.Date().getTime()));
            ps.setObject(2,4);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
