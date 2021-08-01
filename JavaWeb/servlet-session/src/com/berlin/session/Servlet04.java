package com.berlin.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Session的销毁
 * 1. 默认到期时间
 * Tomcat中默认到期时间是30分钟，单位分钟。
 * 可以在Tomcat的解压目录中的conf目录中的web.xml中修改session-config标签的值
 * 2. 手动设置失效时间
 * 单位是秒
 * 通过session.setMaxInactiveInterval(int)来设定失效时间。
 * 通过getMaxInactiveInterval()获取当前失效时间
 * 3. 手动销毁
 * session.invalidate()
 * 4. 关闭浏览器
 * session底层依赖cookie，cookie默认关闭浏览器失效
 * 5. 关闭服务器
 */
@WebServlet("/session04")
public class Servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取session对象
        HttpSession session = req.getSession();
        System.out.println(session.getId());

        // 1. 默认到期时间


        // 2. 手动设置失效时间
        // 获取当前最大不活动时间
        System.out.println("最大不活动时间" + session.getMaxInactiveInterval());
        // 设置最大不活动时间
        session.setMaxInactiveInterval(15);
        System.out.println("修改后最大不活动时间" + session.getMaxInactiveInterval());

        // 3. 手动销毁
        session.invalidate();

        // 4. 关闭浏览器

        // 5. 关闭服务器
    }
}
