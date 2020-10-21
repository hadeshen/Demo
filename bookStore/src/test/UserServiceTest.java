package test;

import dao.impl.UserDaoImpl;
import entity.User;
import org.junit.jupiter.api.Test;
import service.UserService;
import service.impl.UserServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    UserService service = new UserServiceImpl();
    @Test
    void registUser() {
        service.registUser(new User(null,"马化腾","123","123@qq.com",null));
    }

    @Test
    void login() {
        System.out.println(service.login("马云", "123"));
    }

    @Test
    void existsUsername() {
    }
}