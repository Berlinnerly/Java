package com.berlin.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 重定向与请求转发
 *      1. 请求转发的地址栏不发生改变，重定向发生改变
 *      2. 请求转发只有一次请求，重定向有两次请求
 *      3. 请求转发属于服务端行为，重定向是客户端行为
 *      4. 请求转发的request可以共享数据，重定向不可以
 *      5. 请求转发跳转的地址定位在资源目录下（当前项目中的资源），重定向可以到任意地址
 */
@WebServlet("/ser03")
public class Servelet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收参数
        String username = req.getParameter("username");
        System.out.println(username);

        // 重定向
//        resp.sendRedirect("index.jsp");

        // 重定向到servlet
//        resp.sendRedirect("ser04");

        // 请求转发
//        req.getRequestDispatcher("http://www.baidu.com").forward(req, resp);

        // 重定向
        resp.sendRedirect("http://www.baidu.com");
    }
}
