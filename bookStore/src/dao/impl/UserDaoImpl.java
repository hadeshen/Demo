package dao.impl;

import dao.BaseDao;
import dao.UserDao;
import entity.User;

import java.sql.Date;

/**
 * @author chenlin
 * @create 2020-10-20  14:47
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) {

        String sql = "select id,user_name name,password,email,createDate from book.user where user_name=?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select id,user_name username,password,email,createDate from book.user where user_name=? and password=?";
        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into book.user(user_name, password, email, createDate) VALUES (?,?,?,?)";
        return update(sql,user.getName(),user.getPassword(),user.getEmail(),new Date(new java.util.Date().getTime()));
    }
}
