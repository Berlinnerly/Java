package com.Berlin.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Berlin
 * @Date 2021/1/13 11:14 星期三
 * @Description
 */
public class Server_duoxiancheng {
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

        while (true) {
            // 接受客户端请求
            Socket socket = server.accept();

            new Thread() {
                @Override
                public void run() {
                    // 将字节流包装成字符流
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    // PrintStream中有写出换行的方法
                    PrintStream ps = null;
                    try {
                        ps = new PrintStream(socket.getOutputStream());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    ps.println("欢迎");
                    try {
                        System.out.println(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
