package week11.day1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenlin
 * @create 2020-10-19  17:02
 */
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查看接收请求信息
        String username = req.getParameter("username");
        //查看转发请求处理信息
        Object attribute = req.getAttribute("key");
        System.out.println("转发请求处理信息"+attribute);

    }
}
