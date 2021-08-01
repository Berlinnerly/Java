package com.Berlin.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

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
public class Send2_ {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        DatagramSocket socket = new DatagramSocket();       //创建Socket相当于创建码头

        while (true) {
            String line = sc.nextLine();                //获取键盘录入的对象
            if ("quit".equals(line)) {
                break;
            }
            DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length,
                    InetAddress.getByName("127.0.0.1"), 6666);  //创建packet，相当于创建集装箱
            socket.send(packet);                                        //发货，将数据发出去
        }

        socket.close();                                             //关闭码头


    }
}
