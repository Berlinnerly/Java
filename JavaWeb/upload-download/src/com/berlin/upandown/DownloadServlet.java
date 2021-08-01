package com.berlin.upandown;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件下载
 */
@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求的编码格式
        req.setCharacterEncoding("UTF-8");

        // 得到要下载的文件名
        String fileName = req.getParameter("fileName");

        // 得到文件所存放的路径
        String path = req.getServletContext().getRealPath("/");

        // 通过路径得到file对象
        File file = new File(path + "/" + fileName);

        // 判断文件是否存在，且是一个标准文件
        if (file.exists() && file.isFile()) {
            // 如果文件存在，下载
            // 设置响应类型（浏览器无法使用某种方式或激活某个程序来处理的类型）
            resp.setContentType("application/x-msdownload");

            // 设置头信息
            resp.setHeader("Content-Disposition", "attachment;filename=" + fileName);

            // 得到文件的输入流
            InputStream inputStream = new FileInputStream(file);

            // 得到字节输出流
            ServletOutputStream outputStream = resp.getOutputStream();

            byte[] ch = new byte[1024];
            int len = 0;

            while ((inputStream.read(ch)) != -1) {
                outputStream.write(ch, 0, len);
            }

            outputStream.close();
            inputStream.close();

        } else {
            resp.setContentType("text/html;charset=UTF-8");
            resp.getWriter().write("<h2>要下载的内容不存在，请重试!</>");
            resp.getWriter().close();
        }
    }
}
