package com.Berlin.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Berlin
 * @Date 2021/1/13 11:14 星期三
 * @Description
 */
public class Server_01 {
    /**
     * @param args
     * 2. 服务端
     * 创建 serverSocket(需要指定端口号）
     * 调用 ServerSocket的 accept()方法接收ー个客户端请求,得到一个 Socket
     * 周用 Socket的 getInputStream()和 getOutputStream()方法获取和客户端相连的工O流
     * 輸入流可以读取客户端输出流写出的数据出流可以写出数据到客户端的输入流
     */
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);

        // 接受客户端请求
        Socket socket = server.accept();
        // 获取客户端输入流
        InputStream is = socket.getInputStream();
        // 获取客户端输出流
        OutputStream os = socket.getOutputStream();

        // 服务端向客户端写入数据
        os.write("百度一下你就知道".getBytes());

        byte[] arr = new byte[1024];
        int len = is.read(arr);
        System.out.println(new String(arr, 0, len));
    }
}
