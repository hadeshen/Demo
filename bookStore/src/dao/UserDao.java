package dao;

import entity.User;

/**
 * @author chenlin
 * @create 2020-10-20  14:32
 */
public interface UserDao {
    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return 存在该用户返回用户对象，不存在返回null
     */
    User queryUserByUsername(String username);

    /**
     * 根据用户名和密码查找用户
     * @param username 用户名
     * @param password 密码
     * @return 若不存在该用户则返回null
     */
    User queryUserByUsernameAndPassword(String username,String password);

    /**
     *保存用户
     * @param user user
     * @return 若返回值为-1则保存失败
     */
    int saveUser(User user);
}
