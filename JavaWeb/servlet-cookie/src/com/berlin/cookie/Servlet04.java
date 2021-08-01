package com.berlin.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * cookie存中文
 * cookie不支持中文
 * 如果需要存中文，需要URLEncoder.encoder(name)进行编码，获取时使用URLDecoder.decoder(name)进行解码
 */
@WebServlet("/cookie04")
public class Servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "姓名";
        String value = "张三";

        // 将中文通过URLEncoder.encode(name)进行编码
        name = URLEncoder.encode(name);
        value = URLEncoder.encode(value);

        Cookie cookie = new Cookie(name, value);

        resp.addCookie(cookie);
    }
}
