package com.Berlin.socket;

import java.io.IOException;
import java.net.*;

/**
 * @author Berlin
 * @Time 2020/11/10 10:06
 */

/*
    1.发送send
        创建DatagramSocket,随机端口
        创建DatagramPacket,指定数据，长度，地址，端口
        使用DatagramSocket发送DatagramPacket
        关闭DatagramSocket
 */
public class Send_ {
    public static void main(String[] args) throws IOException {
        String str = "你好";
        DatagramSocket socket = new DatagramSocket();       //创建Socket相当于创建码头
        DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length,
                InetAddress.getByName("127.0.0.1"), 6666);  //创建packet，相当于创建集装箱
        socket.send(packet);                                        //发货，将数据发出去
        socket.close();                                             //关闭码头


    }
}
