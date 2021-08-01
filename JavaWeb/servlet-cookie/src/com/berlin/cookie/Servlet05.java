package com.berlin.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cookie同名问题
 * 如果出现同名，后面的cookie会将前面的覆盖（在domain和path相同的情况下）
 *
 */
@WebServlet
public class Servlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 得到cookie对象（前面设置过同名的）
        Cookie cookie = new Cookie("name1", "wangwu");

        // 设置失效时间
        cookie.setMaxAge(1000);

        resp.addCookie(cookie);
    }
}
