package com.berlin.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求转发
 *      req.getRequestDispatcher(“路径”).forward(req, resp);
 *      服务端的跳转
 *      URL地址栏不会发生改变
 *      从始至终只有一个请求
 *      数据可以共享
 */
@WebServlet("/ser06")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收参数
        String username = req.getParameter("username");
        System.out.println(username);

        // 请求转发跳转到index.html
        // 也可以跳转到其他的资源
        req.getRequestDispatcher("index.html").forward(req, resp);
    }
}
