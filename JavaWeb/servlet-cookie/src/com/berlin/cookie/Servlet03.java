package com.berlin.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cookie的到期时间
 * 到期时间：用来指定该cookie何时失效，默认为当前浏览器关闭就失效
 * 我们可以手动设置cookie的有效时间（通过到期时间计算），通过setMaxAge(int time);方法设定cookie的最大有效时间，以秒为单位
 *
 * maxAge的取值：
 *      负整数：只在浏览器中存活，浏览器关闭即失效
 *      正整数：会存活指定秒数，浏览器关闭或服务器关闭也不会失效
 *      零：  表示删除cookie
 */
@WebServlet("/cookie03")
public class Servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建cookie对象
        Cookie cookie = new Cookie("aa", "AAA");

        // 负整数，表示浏览器关闭就失效
        //cookie.setMaxAge(-1);

        // 正整数，表示会存活的秒数
        //cookie.setMaxAge(15);

        // 零，表示删除cookie
        cookie.setMaxAge(0);

        // 响应cookie
        resp.addCookie(cookie);


        // 删除已有cookie
        Cookie cookie1 = new Cookie("name", null);
        cookie1.setMaxAge(0);
        resp.addCookie(cookie1);
    }
}
