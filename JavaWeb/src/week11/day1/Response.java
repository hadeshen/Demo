package week11.day1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenlin
 * @create 2020-10-19  19:27
 * 请求重定向
 */
public class Response extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// 重定向方式一：
// 设置相应状态码302
//        resp.setStatus(302);
//        //设置响应头
//        resp.setHeader("Location","http://wwww.baidu.com");
        //重定向方式二：
        //设置响应头 告诉浏览器相应重定向新地址在哪里
        resp.sendRedirect("http://wwww.baidu.com");
    }
}
