package com.berlin.response;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;


/**
 * 响应乱码问题
 *      服务器有服务器的编码，客户端有客户端的编码，两个不一样或不支持中文都会乱码
 *
 *      getWriter()
 *          一定会乱码，因为服务器默认的解析编码是ISO-8859-1，该编码不支持中文
 *          解决方案：
 *              1. 设置服务端的编码格式      resp.setCharacterEncoding("UTF-8");
 *              2. 设置客户端的编码格式      resp.setHeader("content-type", "text/html;charset=UTF-8);
 *      getOutputStream()
 *          可能乱码，当服务端的编码格式与客户端的编码不一致时，会乱码
 *          解决方案：
 *              1. 设置服务端的编码格式      resp.setCharacterEncoding("UTF-8");
 *              2. 设置客户端的编码格式      resp.setHeader("content-type", "text/html;charset=UTF-8);
 *
 *      总结：
 *          设置客户端和服务端的编码方式一致且支持中文
 *          响应json格式时，设置响应类型为application/json
 *
 *
 */
@WebServlet("/ser02")
public class Servelet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 同时设置客户端和服务端的编码
        resp.setContentType("text/html;charset=UTF-8");

//        // 设置服务端的编码格式
//        resp.setCharacterEncoding("UTF-8");
//        // 设置客户端的编码格式
//        resp.setHeader("content-type", "text/html;charset=UTF-8");
//
//        /* getWriter()     获取字符流（只能响应回字符） */
//        // 得到字符输出流
//        PrintWriter writer = resp.getWriter();
//        writer.write("你好");
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
