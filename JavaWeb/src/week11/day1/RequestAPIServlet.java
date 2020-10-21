package week11.day1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestAPIServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求资源的路径
        System.out.println("URI===>"+request.getRequestURI());
        //获取请求的统一资源定位器URL
        System.out.println("URL===>"+request.getRequestURL());
        //获取客户端ip
        System.out.println("ip===>"+request.getRemoteHost());
        //获取请求头 客户端浏览器信息
        System.out.println("User-Agent  浏览器："+request.getHeader("User-Agent"));
        //获取请求方式
        System.out.println("请求方式："+request.getMethod());
    }
}
