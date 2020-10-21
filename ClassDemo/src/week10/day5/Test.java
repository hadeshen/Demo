package week10.day5;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author chenlin
 * @create 2020-10-17  9:56
 */
public class Test {
    private Connection conn;

    public Connection getConnection() {
        return this.conn ;
    }
}
