package week10.day1;

import util.DatabaseConnection;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * @author chenlin
 * @create 2020-10-12  10:03
 */
public class QueryTest {
    @Test
    public void test() {
        Connection connection = DatabaseConnection.connection();
        String sql = "select id,name,createDate from user where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, 2);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                Date date = resultSet.getDate(3);
                User user = new User(id, name, date);
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DatabaseConnection.close(connection);
    }

    public static User userQuery(String sql, Object...o) {
        Connection connection = null;
        try {
            connection = DatabaseConnection.connection();

            PreparedStatement ps = connection.prepareStatement(sql);
            //填充sql占位符
            for (int i = 0; i < o.length; i++) {
                ps.setObject(i+1,o[i]);
            }

            //获取结果集
            ResultSet resultSet = ps.executeQuery();
            //结果集元数据
            ResultSetMetaData metaData = resultSet.getMetaData();
            //获取结果集中元素的个数
            int columnCount = metaData.getColumnCount();
            if (resultSet.next()) {
                User user = new User();
                for (int i = 0; i < columnCount; i++) {
                    //获取的结果值
                    Object value = resultSet.getObject(i + 1);
//                    //获取数据库中字段名  数据库中字段名与类中属性名不同 采用取别名方式
//                    String columnName = metaData.getColumnName(i + 1);
                    //获取数据库的别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //反射 通过数据库中字段名找到类中属性
                    Field field = User.class.getDeclaredField(columnLabel);
                    //规范操作 设置属性可访问
                    field.setAccessible(true);
                    //对属性进行赋值
                    field.set(user, value);
                }
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            DatabaseConnection.close(connection);
        }

        return null;
    }
    @Test
    public void test1(){
        String sql = "select id,name,createDate from user where id=?";
        int id = 1;
        User user = userQuery(sql, id);
        System.out.println(user);
        sql = "select id,name,createDate from user where name=?";
        System.out.println(userQuery(sql, "逍遥子"));
    }
}
