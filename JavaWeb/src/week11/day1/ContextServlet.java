package week11.day1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();
        //获取xml中context-param值
        System.out.println("context-param值:"+servletContext.getInitParameter("name"));
        //获取当前工程路径
        System.out.println("当前工程路径："+servletContext.getContextPath());
        //获取当前工程部署在服务器上硬盘路径
        System.out.println("工程的路径为："+servletContext.getRealPath("/"));
    }
}
