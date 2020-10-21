package week10.day1;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author chenlin
 * @create 2020-10-16  19:30
 */
public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("构造器");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init初始化方法");
        //可以解析xml配置文件信息
        System.out.println("HellServlet程序XML的别名是："+servletConfig.getServletName());
        //获取XML  init-param-value
        System.out.println("init-param-value"+servletConfig.getInitParameter("username"));
        //获取getServletContext对象
        System.out.println(servletConfig.getServletContext());

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 处理请求和相应
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("服务====访问");
        //类型转换 getMethod方法
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        //获取请求的方式
        String method = httpServletRequest.getMethod();

        if ("GET".equals(method)){
            System.out.println("get请求");
        }else if ("POST".equals(method)){
            System.out.println("post请求");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
