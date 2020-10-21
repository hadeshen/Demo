package week10.day2;

import util.DatabaseConnection;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author chenlin
 * @create 2020-10-13  9:48
 */
public class InsertTest {
    /**
     * 批量插入数据
     * mysql不支持批处理操作 需要在url后面添加rewriteBatchedStatements=true
     * 3325
     */
    @Test
    public void test1() {
        Connection connection = null;
        try {
            long start = System.currentTimeMillis();
            connection = DatabaseConnection.connection();
            //执行前不允许事务的提交
            connection.setAutoCommit(false);
            String sql = "insert into goods(goods_name) values(?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            for (int i = 0; i <= 20000; i++) {
                ps.setObject(1, "可乐" + i);

                //ps.execute();不用每次都执行
                //积攒sql
                ps.addBatch();
                if (i % 1000 == 0) {
                    //执行
                    ps.executeBatch();
                    //清空sql
                    ps.clearBatch();
                }
            }
            //执行完成在提交事务
            connection.commit();
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            DatabaseConnection.close(connection);
        }
    }
}
