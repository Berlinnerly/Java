package com.berlin.servletcontext;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ServletContext对象
 */
@WebServlet("/servlet-context01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 通过request获取对象
        ServletContext servletContext = req.getServletContext();

        // 通过session获取对象
        ServletContext servletContext1 = req.getSession().getServletContext();

        // 通过servletConfig对象获取
        ServletContext servletContext2 = getServletConfig().getServletContext();

        // 直接获取
        ServletContext servletContext3 = getServletContext();

        // 常用方法
        // 获取服务器的版本信息
        String serverInfo = servletContext.getServerInfo();
        System.out.println("获取服务器的版本信息" + serverInfo);

        // 获取项目的真实路径
        String realPath = servletContext.getRealPath("/");
        System.out.println("获取项目的真实路径" + realPath);
    }
}
