package com.berlin.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cookie的路径
 * 1. 在当前服务器中任意资源都可访问
 * 2. 当前项目下的资源可获取cookie对象（默认不设置cookie的path）
 * 3. 指定项目下的资源可获取cookie对象
 * 4. 指定目录下的资源可获取cookie对象
 *
 * 总结：
 *  只有请求的路径中包含cookie的path值，才能获取到该cookie对象
 */
@WebServlet("/cookie06")
public class Servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1. 当前项目下的资源可获取cookie对象（默认不设置cookie的path）
        Cookie cookie01 = new Cookie("a1", "A1");
        resp.addCookie(cookie01);

        // 2. 当前服务器中的任意资源都可访问
        Cookie cookie02 = new Cookie("a2", "A2");
        cookie02.setPath("/");
        resp.addCookie(cookie02);

        // 3. 指定目录下的资源可获取cookie对象
        Cookie cookie03 = new Cookie("a3", "A3");
        cookie03.setPath("/s03/test/cookie02");
        resp.addCookie(cookie03);

        // 4. 指定项目下的资源可获取cookie对象（指定站点名）
        Cookie cookie04 = new Cookie("a4", "A4");
        cookie04.setPath("/s04");   // 某一个项目的访问路径
        resp.addCookie(cookie04);
    }
}
