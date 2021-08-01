package com.berlin.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ser03")
public class Servlet03 extends HttpServlet {

    /**
     * 服务方法
     *      只有有请求访问当前servlet，该方法都会执行
     *          可以多次执行
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service...");
    }

    /**
     * 系统方法，销毁方法
     *      当servlet容器关闭时调用
     *      只会执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }

    /**
     * 系统方法，初始化方法
     *      当servlet类第一次被访问时，自动调用，只会调用一次
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        System.out.println("init...");
    }
}
