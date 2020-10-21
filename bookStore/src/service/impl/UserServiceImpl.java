package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;
import org.junit.jupiter.api.Test;
import service.UserService;

/**
 * @author chenlin
 * @create 2020-10-20  15:36
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(String username, String password) {
        return userDao.queryUserByUsernameAndPassword(username,password);
    }

    @Override
    public boolean existsUsername(String username) {
        User user = userDao.queryUserByUsername(username);
        if (user==null){
            return false;
        }
        return true;
    }

}
