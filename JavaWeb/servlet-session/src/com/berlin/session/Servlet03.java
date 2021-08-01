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
 * 获取session域对象
 */
@WebServlet("/session03")
public class Servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取session对象（如果session对象不存在，则新建session对象，如果session存在，则获取session对象）
        HttpSession session = req.getSession();

        // 获取session作用域
        String username = (String) session.getAttribute("username");
        System.out.println(username);

        // 获取request作用域
        String name = (String) req.getAttribute("name");
        System.out.println(name);

        // 获取session作用域中的User对象
        User user = (User) session.getAttribute("user");
        System.out.println(user);

    }
}
