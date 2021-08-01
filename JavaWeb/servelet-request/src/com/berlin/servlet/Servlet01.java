package com.berlin.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 创建Servlet
 *      1. 创建普通Java类；
 *      2. 继承HttpServlet；
 *      3. 重写service方法
 *      4. 设置访问路径（通过添加注解@WebServlet）
 *          路径前一定要有“/”
 */

@WebServlet("/ser01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet被访问了...");
    }
}
