package service;

import entity.User;

/**
 * @author chenlin
 * @create 2020-10-20  15:36
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     */
    void registUser(User user);

    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return
     */
    User login(String username,String password);

    /**
     * 检查用户是否存在
     * @param username 用户名
     * @return 返回true表示用户存在
     */
    boolean existsUsername(String username);
}
