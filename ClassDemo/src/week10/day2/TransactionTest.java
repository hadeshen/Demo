package week10.day2;

import util.DatabaseConnection;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author chenlin
 * @create 2020-10-13  11:27
 * 事务处理
 */
public class TransactionTest {
    public void update(Connection connection, String sql, Object... objects) {
        try {
            //预编译sql
            PreparedStatement ps = connection.prepareStatement(sql);
            //填充sql占位符
            for (int i = 0; i < objects.length; i++) {
                ps.setObject(i + 1, objects[i]);
            }
            //执行
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test(){
        Connection connection = null;
        try {
            connection = DatabaseConnection.connection();
            //取消自动提交
            connection.setAutoCommit(false);
            String sql = "UPDATE account SET balance=balance-1000 WHERE name=?";
            update(connection, sql, "马云");
            //错误情况
//            System.out.println(10 / 0);
            String sql1 = "UPDATE account SET balance=balance+1000 WHERE name=?";
            update(connection, sql1, "马化腾");
            //提交
            connection.commit();
        } catch (Exception e) {
            try {
                //如果运行错误 事务回滚
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                //修改为自动提交事务  方便连接池使用
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DatabaseConnection.close(connection);
        }


    }
}
