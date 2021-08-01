package com.berlin.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cookie的创建与发送
 *      Cookie cookie = new Cookie("名称", "值");
 *      response.addCookie(cookie对象)
 */
@WebServlet("/cookie01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建cookie对象
        Cookie cookie = new Cookie("name", "zhangsan");

        // 发送cookie
        resp.addCookie(cookie);

        Cookie cookie1 = new Cookie("name1", "lisi");
        resp.addCookie(cookie1);
    }
}
