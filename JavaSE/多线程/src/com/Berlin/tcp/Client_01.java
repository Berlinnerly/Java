package com.Berlin.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author Berlin
 * @Date 2021/1/13 11:11 星期三
 * @Description
 */
public class Client_01 {
    /**
     * @param args
     * 1. 客户端
     * 创建Socket连接服务端（指定IP，端口）通过IP找到对应的服务器
     * 调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
     * 输入流可以读取服务端输出流写入的数据
     * 输出流可以写出数据到服务端的输入流
     */
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.00.0.1", 12345);

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        byte[] arr = new byte[1024];
        int len = is.read(arr);
        System.out.println(new String(arr, 0, len));

        os.write("你好".getBytes());

        socket.close();
    }
}
