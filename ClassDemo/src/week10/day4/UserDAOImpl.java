package week10.day4;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.jupiter.api.Test;
import util.DatabaseConnection;
import util.JDBCUtils;
import week10.day1.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 * @author chenlin
 * @create 2020-10-15  17:17
 */
public class UserDAOImpl implements UserDAO {
    QueryRunner queryRunner = new QueryRunner();

    @Override
    public List<User> findAll(Connection conn) {
        try {
            String sql = "select * from user";
            QueryRunner queryRunner = new QueryRunner();
            //BeanHandler接口实现类，用户封装数据 返回list
            BeanListHandler<User> listHandler = new BeanListHandler<>(User.class);
            List<User> userList = queryRunner.query(conn, sql, listHandler);
            return userList;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            DatabaseConnection.close(conn);
        }
        return null;
    }

    @Override
    public User findById(Connection conn, int id) {
        try {
            String sql = "select * from user where id=?";
            QueryRunner queryRunner = new QueryRunner();
            BeanHandler<User> userBeanHandler = new BeanHandler<User>(User.class);
            User user = queryRunner.query(conn, sql, userBeanHandler, id);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.close(conn);
        }
        return null;
    }

    @Override
    public boolean update(Connection conn, int id) {
        return false;
    }

    @Override
    public boolean add(Connection conn, String name) {
        try {
            String sql = "insert into user(name,createDate) values(?,?)";
            int update = queryRunner.update(conn, sql, name, new Date(new java.util.Date().getTime()));
            if (update > 0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.close(conn);
        }
        return false;
    }

    @Test
    public void test(){
        Connection conn = JDBCUtils.getconnection();
        boolean b = add(conn, "孙笑川");
        System.out.println(b);
    }
    @Override
    public boolean delete(Connection conn, int id) {
        try {
            String sql = "delete from user where id=?";
            int update = queryRunner.update(conn, sql, id);
            if (update > 0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Test
    public void test1(){
        Connection conn = JDBCUtils.getconnection();
        System.out.println(delete(conn, 8));
    }
}
