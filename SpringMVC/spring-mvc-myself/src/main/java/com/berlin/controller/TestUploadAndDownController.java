package com.berlin.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.*;

/**
 * @author Berlin
 * @date 2021/2/22 9:42
 * @description
 */

@Controller
public class TestUploadAndDownController {

//    @RequestMapping("down")
    public ResponseEntity<byte[]> down(HttpSession session) throws IOException {

        // 获取下载文件的路径
        String realPath = session.getServletContext().getRealPath("static/img");
//        System.out.println(realPath);

        String finalPath = realPath + File.separator + "18111.jpg";

        InputStream is = new FileInputStream(finalPath);

        // available：获取输入流所读取的文件的最大字节数
        byte[] b = new byte[is.available()];
        is.read(b);

        // 设置请求头
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=zzz.jpg");

        // 设置响应状态
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(b, headers, statusCode);
        return entity;
    }
}
