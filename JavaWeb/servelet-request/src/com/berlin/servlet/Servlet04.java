package com.berlin.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;


/**
 * HttpServletRequest对象
 * 获取请求数据
 * 获取请求参数
 */
@WebServlet("/ser04")
public class Servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取客户端请求的完整URL（从http://开始，到？前结束）
        String url = req.getRequestURL().toString();
        System.out.println("获取客户端请求的完整URL" + url);

        //获取客户端请求的部分URL（从站点名开始，到？结束）
        String uri = req.getRequestURI();
        System.out.println("获取客户端请求的部分URL" + uri);

        // 获取请求⾏中的参数部分（从？开始，到最后）
        String queryString = req.getQueryString();
        System.out.println("获取请求⾏中的参数部分：" + queryString);

        // 获取客户端的请求⽅式
        String method = req.getMethod();
        System.out.println("获取客户端的请求⽅式：" + method);

        // 获取HTTP版本号
        String protocol = req.getProtocol();
        System.out.println("获取HTTP版本号：" + protocol);

        // 获取webapp名字 （站点名）
        String webapp = req.getContextPath();
        System.out.println("获取webapp名字：" + webapp);



        // 获取指定名称的参数，返回字符串
        String username = req.getParameter("username");
        System.out.println("uname的参数值：" + username);

        // 获取指定名称参数的所有参数值，返回数组
        String[] hobbys = req.getParameterValues("hobby");
        System.out.println("获取指定名称参数的所有参数值：" + Arrays.toString(hobbys));
    }
}
