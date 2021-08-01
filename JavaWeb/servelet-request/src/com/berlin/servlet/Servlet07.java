package com.berlin.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * request作用域
 * 在request对象中设置作用域，该作用域在一次请求中有效，即服务器端跳转有效
 * <p>
 * 一般用于前后台交互，后台响应数据给客户端（设置域对象），客户端获取对象显示数据（获取域对象）
 * <p>
 * 设置域对象
 * request.setAttribute("限域变量名", "值");
 * <p>
 * 获取域对象
 * request.getAttribute("限域变量名");
 * <p>
 * 移除域对象
 * request.removeAttribute("限域变量名")
 */

@WebServlet("/ser07")
public class Servlet07 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收参数
        String username = req.getParameter("username");
        System.out.println(username);

        // 简单判断     假设用户名不是admin则提示用户失败
        if (!"admin".equals(username)) {
            // 设置request作用域
            req.setAttribute("msg", "用户名不正确");

            // 请求转发跳转到login.jsp
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("index.html").forward(req, resp);
        }
    }
}
