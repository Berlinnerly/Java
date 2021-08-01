package com.berlin.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求乱码问题
 *  乱码原因：
 *      由于在解析过程中默认使用的编码方式为ISO-8859-1(此编码不支持中文)
 *  解决方案：
 *      GET请求
 *          如果tomcat版本是8及以上，    不会乱码，不用处理
 *          如果tomcat版本是7及以下      会乱码，需要处理
 *                                      new String(req.getParameter("username").getBytes("ISO-8859-1"),"UTF-8");
 *
 *      POST请求
 *         不管什么版本的tomcat都会乱码，需要处理   req.setCharacterEncoding("UTF-8");
 */
@WebServlet("/ser05")
public class Servlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // POST请求乱码     只针对post请求有效
        req.setCharacterEncoding("UTF-8");

        // 获取参数
        String username =  req.getParameter("username");
        System.out.println(username);

        // GET请求   如果tomcat版本是7及以下
        String usernameGet = new String(username.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(usernameGet);
    }
}
