package week10.day3;

import util.DatabaseConnection;
import util.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.jupiter.api.Test;
import week10.day1.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author chenlin
 * @create 2020-10-14  14:38
 * 使用DButils包进行CRUD操作
 */
public class DBUtilsTest {
    /**
     * DBUtils修改操作
     */
    @Test
    public void test1() {
        try {
            //创建QueryRunner对象
            QueryRunner queryRunner = new QueryRunner();
            //获取连接
            Connection connection = JDBCUtils.getconnection();
            String sql = "update user set name=? where id=?";
            //调用update方法
            queryRunner.update(connection, sql, "马云", 1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * DBUtils查询一条信息
     */
    @Test
    public void test2() {
        Connection connection = null;
        try {
            QueryRunner queryRunner = new QueryRunner();
            connection = JDBCUtils.getconnection();
            String sql = "select * from user where id=?";
            //BeanHandler接口实现类，用户封装数据 返回对象数据
            BeanHandler<User> userBeanHandler = new BeanHandler<User>(User.class);
            User user = queryRunner.query(connection, sql, userBeanHandler, 1);
            System.out.println(user);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.close(connection);
        }
    }

    /**
     * 查询多条数据
     */
    @Test
    public void test3() {
        Connection connection = null;
        try {
            QueryRunner queryRunner = new QueryRunner();
            connection = JDBCUtils.getconnection();
            String sql = "select * from user";
            //BeanHandler接口实现类，用户封装数据 返回list
            BeanListHandler<User> listHandler = new BeanListHandler<>(User.class);
            List<User> userList = queryRunner.query(connection, sql, listHandler);
            userList.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.close(connection);
        }
    }

    @Test
    public void test4() {
        Connection connection = null;
        try {
            QueryRunner queryRunner = new QueryRunner();
            connection = JDBCUtils.getconnection();
            String sql = "select * from user where id=?";
            //Handler接口实现类，用户封装数据 返回map
            MapHandler mapHandler = new MapHandler();
            Map<String, Object> map = queryRunner.query(connection, sql, mapHandler, 2);
            System.out.println(map);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.close(connection);
        }
    }

    @Test
    public void test5() {
        Connection connection = null;
        try {
            QueryRunner queryRunner = new QueryRunner();
            connection = JDBCUtils.getconnection();
            String sql = "select * from user";
            //Handler接口实现类，用户封装数据 返回map List
            MapListHandler mapListHandler = new MapListHandler();
            List<Map<String, Object>> query = queryRunner.query(connection, sql, mapListHandler);
            query.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.close(connection);
        }
    }

    /**
     * 查询特殊值
     */
    @Test
    public void test6() {
        Connection connection = null;
        try {
            QueryRunner queryRunner = new QueryRunner();
            connection = JDBCUtils.getconnection();
            String sql = "select createDate from user where id=?";
            //ScalarHandler查询特殊值 
            ScalarHandler<Date> dateScalarHandler = new ScalarHandler<>();
            Date date = queryRunner.query(connection, sql, dateScalarHandler, 2);
            System.out.println(date);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.close(connection);
        }
    }
}
