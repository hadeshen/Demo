package controller;

import entity.User;
import org.junit.jupiter.api.Test;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenlin
 * @create 2020-10-21  10:21
 */
public class UserRegistServlet extends HttpServlet {
    UserService service = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        System.out.println(name+password+email);
        if (service.existsUsername(name)){
            System.out.println("用户名已存在");
        }else {
            service.registUser(new User(null,name,password,email,null));
            System.out.println("注册成功");
        }
    }
    @Test
    void test(){
        String name = "123";
        String password = "123";
        String email = "123@qq.com";
        if (service.existsUsername(name)){
            System.out.println("用户名已存在");
        }else {
            service.registUser(new User(null,name,password,email,null));
            System.out.println("注册成功");
        }
    }
}
