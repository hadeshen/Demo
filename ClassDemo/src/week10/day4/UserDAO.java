package week10.day4;

import week10.day1.User;

import java.sql.Connection;
import java.util.List;

/**
 * @author chenlin
 * @create 2020-10-15  17:09
 */
public interface UserDAO {
    /**
     * 查找所有用户
     * @param conn
     * @return
     */
    List<User> findAll(Connection conn);

    /**
     * 通过id查找用户
     * @param conn
     * @param id
     * @return
     */
    User findById(Connection conn, int id);

    /**
     * 修改用户信息
     * @param conn
     * @param id
     * @return
     */
    boolean update(Connection conn, int id);

    /**
     * 添加用户
     * @param
     * @return
     */
    boolean add(Connection conn, String name);

    /**
     * 通过id删除用户
     * @param conn
     * @param id
     * @return
     */
    boolean delete(Connection conn, int id);
}
