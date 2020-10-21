package dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import utils.JdbcUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author chenlin
 * @create 2020-10-20  11:20
 * 对数据库的修改、增加、删除、查询的通用操作
 */
public abstract class BaseDao {
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * 更新数据通用操作
     *
     * @param sql
     * @param args
     * @return 操作成功返回影响行数
     */
    public int update(String sql, Object... args) {
        Connection connection = null;
        try {
            connection = JdbcUtil.getConnection();
            return queryRunner.update(connection, sql, args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(connection);
        }
        return -1;

    }

    /**
     * 查询一个JavaBean信息 返回一个Bean对象
     * @param type
     * @param sql
     * @param args
     * @param <T> Bean对象
     * @return Bean对象
     */
    public <T> T queryForOne(Class<T> type, String sql, Object... args) {
        Connection connection = null;
        try {
            connection = JdbcUtil.getConnection();
            BeanHandler<T> handler = new BeanHandler<>(type);
            T query = queryRunner.query(connection, sql, handler, args);
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(connection);
        }
        return null;
    }

    /**
     * 查询多个JavaBean对象
     * @param type
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public <T>List<T> queryForList(Class<T> type, String sql, Object... args){
        Connection connection = null;
        try {
            connection = JdbcUtil.getConnection();
            BeanListHandler<T> handler = new BeanListHandler<T>(type);
            List<T> query = queryRunner.query(connection, sql, handler, args);
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(connection);
        }
        return null;
    }

    /**
     * 查询单个特殊值
     * @param sql
     * @param args
     * @return
     */
    public Object queryForScalar(String sql,Object...args){
        Connection connection = null;
        try {
            connection = JdbcUtil.getConnection();
            ScalarHandler<Object> scalarHandler = new ScalarHandler<>();
            Object query = queryRunner.query(connection, sql, scalarHandler, args);
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(connection);
        }
        return null;
    }
}
