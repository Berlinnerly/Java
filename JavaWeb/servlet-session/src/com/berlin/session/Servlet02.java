package com.berlin.session;

import com.berlin.po.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * session域对象的设置
 */
@WebServlet("/session02")
public class Servlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取session对象（如果session对象不存在，则新建session对象，如果session存在，则获取session对象）
        HttpSession session = req.getSession();

        // 设置session域对象（一次会话有效）
        session.setAttribute("username", "admin");

        // 设置request作用域（一次请求有效）
        req.setAttribute("name", "zhangsan");

        // 获取User对象
        User user = new User(1, "张三", "123456");
        // 将用户对象存到session作用域中
        session.setAttribute("user", user);

        // 请求转发（一次请求）
        //req.getRequestDispatcher("session03").forward(req, resp);

        // 重定向（两次请求）
        resp.sendRedirect("session03");
    }
}
