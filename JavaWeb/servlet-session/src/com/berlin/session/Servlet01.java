package com.berlin.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;

/**
 * session对象的获取
 */
@WebServlet("/session01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取session对象（如果session对象不存在，则新建session对象，如果session存在，则获取session对象）
        HttpSession session = req.getSession();

        // 获取session的标识符
        System.out.println(session.getId());

        // 获取第一次访问时间
        System.out.println(session.getCreationTime());

        // 获取最后一次访问时间
        System.out.println(session.getLastAccessedTime());

        // 是否是新的session
        System.out.println(session.isNew());
    }
}
