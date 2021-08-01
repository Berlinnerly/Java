package com.berlin.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 获取cookie对象
 * 通过request.getCookies()获取cookie对象，返回的是cookie数组
 */
@WebServlet(value = {"/cookie02", "/test/cookie02"})
public class Servlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取cookie数组
        Cookie[] cookies = req.getCookies();

        // 判断cookie存在
        if (cookies != null && cookies.length > 0) {
            // 遍历cookie数组
            for (Cookie cookie :
                    cookies) {
                if ("name".equals(cookie.getName())) {
                    System.out.println(cookie.getValue());
                }
                String name = URLDecoder.decode(cookie.getName());
                String value = URLDecoder.decode(cookie.getValue());
                System.out.println(name + "," + value);
            }
        }
    }
}
