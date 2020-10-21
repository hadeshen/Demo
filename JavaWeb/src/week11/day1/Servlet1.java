package week11.day1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenlin
 * @create 2020-10-19  17:02
 *
 * 请求转发
 */
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数
        String username = req.getParameter("username");

        req.setAttribute("key","servlet1设置的属性");
        //请求转发路径
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");
        //转发请求
        requestDispatcher.forward(req,resp);
        //设置响应字符集编码
        resp.setCharacterEncoding("UTF-8");
        //通过设置浏览器响应头，让浏览器也是用utf-8编码
        resp.setHeader("Content-Type","text/html;charset=UTF-8");
        //同时设置响应编码跟响应头编码UTF-8 要在流创建之前设置才会有用
        resp.setContentType("text/html;charset=UTF-8");
    }
}
