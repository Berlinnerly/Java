package com.berlin.response;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * 响应数据
 *      getWriter()     获取字符流（只能响应回字符）
 *      getOutputStream()   获取字节流（能响应一切数据）
 *      两种流不能同时使用！
 */
@WebServlet("/ser01")
public class Servelet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        /* getWriter()     获取字符流（只能响应回字符） */
//        // 得到字符输出流
//        PrintWriter writer = resp.getWriter();
////        writer.write("你好");
//        writer.write("<h2>hello</h2>");
//        writer.flush();
//        writer.close();

        /* getOutputStream()   获取字节流（能响应一切数据） */
        ServletOutputStream out = resp.getOutputStream();
        out.write("你好".getBytes());
        out.write("<h2>hello2</h2>".getBytes());
        out.flush();
        out.close();
    }
}
