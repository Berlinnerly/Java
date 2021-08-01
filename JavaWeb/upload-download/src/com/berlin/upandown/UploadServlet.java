package com.berlin.upandown;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

/**
 * 文件上传
 * 如果是文件上传表单（二进制表单），对应的Servlet需要加注解@MultipartConfig
 * 使用注解@MultipartConfig将一个Servlet标识为支持文件上传
 * Servlet将multipart/form-data的POST请求封装成Part，通过Part对上传的文件进行操作
 */
@WebServlet("/uploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求的编码格式
        req.setCharacterEncoding("UTF-8");

        // 获取普通的表单项数据（获取参数）
        String username = req.getParameter("username"); //"username"指的是文本框中的name属性值
        System.out.println(username);

        // 获取上传的文件
        // 通过request.getPart(name)方法获取Part对象
        // name代表的是表单中的file文件域的name属性值
        Part part = req.getPart("myFile");

        // 获取上传文件的文件名
        String fileName = part.getSubmittedFileName();
        System.out.println(fileName);

        // 获取文件的存放路径（获取项目的真实路径）
        String realPath = req.getServletContext().getRealPath("/upload/");

        // 上传文件
        part.write(realPath + fileName);
    }
}
