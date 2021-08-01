package com.Berlin.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @Author Berlin
 * @Date 2021/1/13 11:11 星期三
 * @Description
 */
public class Client_02 {
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
        // 将字节流包装成字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // PrintStream中有写出换行的方法
        PrintStream ps = new PrintStream(socket.getOutputStream());

        System.out.println(br.readLine());
        ps.println("你好呀");

        socket.close();
    }
}
