package week10.day1;

import util.DatabaseConnection;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenlin
 * @create 2020-10-12  15:12
 */
public class QueryUtil {
    /**
     * 对不同表的通用查询操作
     * @param clazz 实体类名
     * @param sql 查询语句
     * @param o sql占位符
     * @param <T>  实体类
     * @return 返回相应实体类对象
     */
    public <T> T queryObject(Class<T> clazz, String sql, Object... o) {
        Connection connection = null;
        try {
            connection = DatabaseConnection.connection();
            //预处理sql
            PreparedStatement ps = connection.prepareStatement(sql);
            //填充占位符
            for (int i = 0; i < o.length; i++) {
                ps.setObject(i + 1, o[i]);
            }
            //获取结果集
            ResultSet resultSet = ps.executeQuery();
            //获取结果元数据
            ResultSetMetaData metaData = resultSet.getMetaData();
            //获取结果个数
            int columnCount = metaData.getColumnCount();
            if (resultSet.next()) {
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //获取结果
                    Object value = resultSet.getObject(i + 1);
                    //获取数据库别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //反射 通过数据库名找到对应的属性
                    Field field = clazz.getDeclaredField(columnLabel);
                    //规范操作 保证属性可操作
                    field.setAccessible(true);
                    //对属性进行赋值
                    field.set(t, value);

                }
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            DatabaseConnection.close(connection);
        }
        return null;
    }

    @Test
    public void test() {
        String sql = "select id,name,createDate from user where id=?";
        User user = queryObject(User.class, sql, 2);
        System.out.println(user);
    }@Test
    public void test1(){
        String sql = "select * from user";
        List<User> userList = queryList(User.class, sql);

        userList.forEach(System.out::println);
    }

    /**
     * 查询多个数据信息
     * @param clazz
     * @param sql
     * @param o
     * @param <T>
     * @return list
     */
    public <T> List<T> queryList(Class<T> clazz,String sql,Object...o){
        Connection connection = null;
        try {
            connection = DatabaseConnection.connection();
            //预处理sql
            PreparedStatement ps = connection.prepareStatement(sql);
            //填充占位符
            for (int i = 0; i < o.length; i++) {
                ps.setObject(i + 1, o[i]);
            }
            //获取结果集
            ResultSet resultSet = ps.executeQuery();
            //获取结果元数据
            ResultSetMetaData metaData = resultSet.getMetaData();
            //获取结果个数
            int columnCount = metaData.getColumnCount();
            //创建集合存放数据
            ArrayList<T> list = new ArrayList<>();
            while (resultSet.next()) {
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //获取结果
                    Object value = resultSet.getObject(i + 1);
                    //获取数据库别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //反射 通过数据库名找到对应的属性
                    Field field = clazz.getDeclaredField(columnLabel);
                    //规范操作 保证属性可操作
                    field.setAccessible(true);
                    //对属性进行赋值
                    field.set(t, value);

                }
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.close(connection);
        }
        return null;
    }
}
